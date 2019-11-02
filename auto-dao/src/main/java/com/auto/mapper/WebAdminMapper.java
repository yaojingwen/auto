package com.auto.mapper;

import com.auto.entity.WebAdmin;
import com.auto.entity.WebAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface WebAdminMapper {
    int countByExample(WebAdminExample example);

    int deleteByExample(WebAdminExample example);

    int deleteByPrimaryKey(Integer operatorId);

    int insert(WebAdmin record);

    int insertSelective(WebAdmin record);

    List<WebAdmin> selectByExample(WebAdminExample example);

    WebAdmin selectByPrimaryKey(Integer operatorId);

    int updateByExampleSelective(@Param("record") WebAdmin record, @Param("example") WebAdminExample example);

    int updateByExample(@Param("record") WebAdmin record, @Param("example") WebAdminExample example);

    int updateByPrimaryKeySelective(WebAdmin record);

    int updateByPrimaryKey(WebAdmin record);


  /*  *//***
     * 用户登录
     * @return
     *//*
    @Select("select user_Admin as useradmin,user_pass as userpass from WEB_ADMIN where user_Admin=#{user_Admin}")
    WebAdmin getByUserName(String user_admin);*/
}