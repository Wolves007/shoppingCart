package com.westos.saasmarketing.marketingprogram.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class UtilsControllerTest {

    @Autowired
    private UtilsController utilsController;

    MockMvc mockMvc;

    @Before
    public void setup(){
        // 初始化数据


        this.mockMvc= MockMvcBuilders.standaloneSetup(utilsController).build();
    }

    @Test
    public void captchatest() throws Exception {
        String url = "/utils/imagecheck";
        MvcResult result =this.mockMvc.perform(post(url))


        .andExpect(status().isOk()).andDo(print()).andReturn();

        ModelAndView mv = result.getModelAndView();


    }


}
