package com.westos.saasmarketing.marketingprogram.controller;

import com.westos.saasmarketing.marketingprogram.service.UtilsImageCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/utils")
public class UtilsController {

    @Autowired
    public UtilsImageCheck utilsImageCheck;

    @RequestMapping("/imagecheck")
    public void captcha(HttpServletResponse response, HttpSession session){
            response.setContentType("image/png");
        String captcha = utilsImageCheck.captcha();
        //model.addAttribute("captcha",captcha);
        session.setAttribute("captcha",captcha);


        try {
            utilsImageCheck.outputimage(captcha,response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
