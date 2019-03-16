package com.westos.saasmarketing.marketingprogram.dao;

import com.westos.saasmarketing.marketingprogram.dto.UploadMarketingDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserManageMapper {

    @Insert("insert into saas_marketing_program (programid,name,author,program_image,price,program_file,describtion, publish_time, status, count, pay,checkstatus) " +
            "values('29',#{name},#{author},#{programImage},#{price},#{programFile},#{describtion},'2018-9-9','1','0','yes','oncheck')")
    public void addProgram(UploadMarketingDTO uploadMarketingDTO);
}
