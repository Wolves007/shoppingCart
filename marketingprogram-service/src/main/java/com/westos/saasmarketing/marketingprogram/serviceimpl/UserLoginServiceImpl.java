package com.westos.saasmarketing.marketingprogram.serviceimpl;

import com.westos.saasmarketing.marketingprogram.dao.UserLoginMapper;
import com.westos.saasmarketing.marketingprogram.domain.User;
import com.westos.saasmarketing.marketingprogram.dto.UserLoginDTO;
import com.westos.saasmarketing.marketingprogram.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImpl implements UserLoginService{
    @Autowired
    private UserLoginMapper userLoginMapper;

    public User selectByName(String username) {


        return userLoginMapper.selectByName(username);
    }



}
