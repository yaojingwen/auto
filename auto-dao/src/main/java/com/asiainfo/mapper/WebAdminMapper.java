package com.asiainfo.mapper;

import com.asiainfo.entity.WebAdmin;
import com.asiainfo.entity.WebAdminExample;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WebAdminMapper {
    int countByExample(WebAdminExample example);

    int deleteByExample(WebAdminExample example);

    @Insert("")
    int insert(WebAdmin record);

    int insertSelective(WebAdmin record);

    List<WebAdmin> selectByExample(WebAdminExample example);

    int updateByExampleSelective(@Param("record") WebAdmin record, @Param("example") WebAdminExample example);

    int updateByExample(@Param("record") WebAdmin record, @Param("example") WebAdminExample example);

    /***
     * 用户登录
     * @return
     */
    @Select("select user_Admin as useradmin,user_pass as userpass from WEB_ADMIN where user_Admin=#{user_Admin}")
    WebAdmin getByUserName(String user_Admin);

    /***
     * 列表查询
     * @return
     */
    @Select("select user_Admin as useradmin,OPERATOR_ID as operatorId,USER_NAME as username,USER_MOBILE as USERmobile,IS_USED as isused,USER_EMAIL as useremail  from system.WEB_Admin")
    List<WebAdmin> list();
}