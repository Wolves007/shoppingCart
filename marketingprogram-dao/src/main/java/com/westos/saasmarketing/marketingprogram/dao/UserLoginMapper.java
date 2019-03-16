package com.westos.saasmarketing.marketingprogram.dao;

import com.westos.saasmarketing.marketingprogram.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserLoginMapper {
    @Select("select * from saas_qiye where username = #{username}")
    User selectByName(String username);

}
