package com.westos.saasmarketing.marketingprogram.controller;

import com.westos.saasmarketing.marketingprogram.dto.UploadMarketingDTO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class UserManageControllerTest {

    @Autowired
    private UserManageController userManageController;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        // 初始化数据


        this.mockMvc= MockMvcBuilders.standaloneSetup(userManageController).build();
    }

    @Test
    public void testSaveUser() throws Exception {

        String url = "/user/saveUser";
    }

    @Test
    public void index() throws Exception {
        String url = "/usermanage/uploadmarketing";

        UploadMarketingDTO uploadmarketingDTO=new UploadMarketingDTO();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        uploadmarketingDTO.setName("方案一");
        uploadmarketingDTO.setAuthor("chen");
        uploadmarketingDTO.setProgramImage("1.png");
        uploadmarketingDTO.setParentId(0);
        uploadmarketingDTO.setIndustryId(1);
        uploadmarketingDTO.setList(list);
        uploadmarketingDTO.setPrice(666.66);
        uploadmarketingDTO.setProgramFile("1.file");
        uploadmarketingDTO.setDescribtion("describtion");

        MvcResult result1=this.mockMvc.perform(post(url)
                .param("name",uploadmarketingDTO.getName())
                .param("author",uploadmarketingDTO.getAuthor())
                .param("programImage",uploadmarketingDTO.getProgramImage())
                .param("parentId", String.valueOf(uploadmarketingDTO.getParentId()))
                .param("industryId", String.valueOf(uploadmarketingDTO.getIndustryId()))
                .param("price", String.valueOf(uploadmarketingDTO.getPrice()))
                .param("programFile",uploadmarketingDTO.getProgramFile())
                .param("describtion",uploadmarketingDTO.getDescribtion())
        ).andExpect(status().isOk()).andDo(print()).andReturn();

        ModelAndView mv = result1.getModelAndView();

        assertEquals("hello",mv.getViewName());
        assertEquals("hello",mv.getModel().get("msg"));






    }
}