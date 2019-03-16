package com.westos.saasmarketing.marketingprogram.controller;

import com.westos.saasmarketing.marketingprogram.dto.UserLoginDTO;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ContextConfiguration(locations = {"classpath:spring.xml"})
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class UserLoginControllerTest {
    @Autowired
    private UserLoginController userLoginController;

    private MockMvc mockMvc;

    @Before
    public void setup(){

        this.mockMvc= MockMvcBuilders.standaloneSetup(userLoginController).build();

    }


    public void test() throws Exception {
        String url = "/userLogin/login";

        UserLoginDTO userLoginDTO = new UserLoginDTO();
        userLoginDTO.setUsername("张三");

        userLoginDTO.setPassword("abc");

        userLoginDTO.setCaptcha("12");


        MvcResult result1 = this.mockMvc.perform(post(url)
        .param("username",userLoginDTO.getUsername())
        .param("password",userLoginDTO.getPassword())
        .param("captcha",userLoginDTO.getCaptcha())
        ).andExpect(status().isOk()).andDo(print()).andReturn();


        ModelAndView mv = result1.getModelAndView();
        assertEquals(mv.getModel().get("username"),userLoginDTO.getUsername());
        assertEquals(mv.getModel().get("password"),userLoginDTO.getPassword());



    }

}
