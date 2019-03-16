package com.westos.saasmarketing.marketingprogram.controller;

import com.westos.saasmarketing.marketingprogram.dto.UploadMarketingDTO;
import com.westos.saasmarketing.marketingprogram.service.UserManageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/userLogin")
public class UserManageController {

   @Autowired
   private UserManageService userManageService;

    @RequestMapping("/uploadmarketing")
    public ModelAndView index(UploadMarketingDTO uploadmarketingDTO) {

        ModelAndView modelAndView = new ModelAndView();

        userManageService.addProgram(uploadmarketingDTO);
        modelAndView.setViewName("hello");
        modelAndView.addObject("msg","hello");
        return modelAndView;
    }
}
