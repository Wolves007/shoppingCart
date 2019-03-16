package com.westos.saasmarketing.marketingprogram.controller;

import com.westos.saasmarketing.marketingprogram.domain.User;
import com.westos.saasmarketing.marketingprogram.dto.UserLoginDTO;
import com.westos.saasmarketing.marketingprogram.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@RequestMapping("/userLogin")
@Controller
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;


    /**
     *
     * @param userLoginDTO
     * @param session
     * @return ModelAndView mv
     */
    @RequestMapping("/login")
    public ModelAndView index(UserLoginDTO userLoginDTO, HttpSession session) {
        ModelAndView mv = new ModelAndView();
        User user = new User();



        //1.登录时输入的密码,验证码值
        String textCaptcha = userLoginDTO.getCaptcha();
        String actualPassword = userLoginDTO.getPassword();
        Object imageCaptcha = session.getAttribute("captcha");
        session.removeAttribute("captcha");


        //2.计算验证码的值
        String[] split = imageCaptcha.toString().split("");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[2]);
        int count = 0;
        if (split[1].equals("+")) {
            count = x + y;
        }
        if (split[1].equals("*")) {
            count = x * y;
        }
        if (split[1].equals("-")) {
            count = x - y;
        }

        //int count =12;



        //3.数据库查询结果
        user = userLoginService.selectByName(userLoginDTO.getUsername());

        //登录验证
        //1)用户名是否存在
        if (user != null) {
            String flag = user.getFlag();
            long qiyeid = user.getQiyeid();
            session.setAttribute("qiyeid", qiyeid);
            String expectedPassword = user.getPassword();
            //2)用户状态
            if (Integer.parseInt(flag) == 1) {
                //3)密码正确
                if (actualPassword.equals(expectedPassword)) {
                    mv.addObject("username", userLoginDTO.getUsername());
                    mv.addObject("password",expectedPassword);
                    mv.setViewName("hello");

                    //4)验证码正确
                    if (textCaptcha != null && Integer.parseInt(textCaptcha) == count) {


                    } else {
                        mv.setViewName("userLogin/loginindex");
                        mv.addObject("captchaMsg", "验证码错误");

                    }

                } else {
                    mv.setViewName("userLogin/loginindex");
                    mv.addObject("passwordMsg", "密码不匹配");

                }

            } else {
                mv.setViewName("userLogin/loginindex");
                mv.addObject("usernameMsg", "该用户名正审核中,请稍等");

            }

        } else {
            mv.setViewName("userLogin/login");
            mv.addObject("usernameMsg", "用户名不存在");

        }


        return mv;
    }


}
