package com.westos.saasmarketing.marketingprogram.service;

import com.westos.saasmarketing.marketingprogram.domain.User;
import com.westos.saasmarketing.marketingprogram.dto.UserLoginDTO;
import org.springframework.stereotype.Service;

public interface UserLoginService {

    User selectByName(String username);

}
