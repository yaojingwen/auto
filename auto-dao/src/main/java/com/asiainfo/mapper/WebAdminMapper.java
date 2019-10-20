package com.asiainfo.mapper;

import com.asiainfo.entity.WebAdmin;
import com.asiainfo.entity.WebAdminExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WebAdminMapper {
    int countByExample(WebAdminExample example);

    int deleteByExample(WebAdminExample example);

    int insert(WebAdmin record);

    int insertSelective(WebAdmin record);

    List<WebAdmin> selectByExample(WebAdminExample example);

    int updateByExampleSelective(@Param("record") WebAdmin record, @Param("example") WebAdminExample example);

    int updateByExample(@Param("record") WebAdmin record, @Param("example") WebAdminExample example);

    @Select("select * from WEB_ADMIN where userAdmin=#{userAdmin}")
    WebAdmin getByUserName(String userAdmin);
}