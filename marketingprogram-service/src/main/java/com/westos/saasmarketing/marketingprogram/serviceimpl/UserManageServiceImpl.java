package com.westos.saasmarketing.marketingprogram.serviceimpl;

import com.westos.saasmarketing.marketingprogram.dao.UserManageMapper;
import com.westos.saasmarketing.marketingprogram.dto.UploadMarketingDTO;
import com.westos.saasmarketing.marketingprogram.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserManageServiceImpl implements UserManageService {

    @Autowired
    private UserManageMapper userManageMapper;


    public void addProgram(UploadMarketingDTO uploadMarketingDTO) {
        userManageMapper.addProgram(uploadMarketingDTO);
    }
}
