package com.auto.mapper;

import com.auto.entity.WebAdmin;
import com.auto.entity.WebAdminExample;
import org.apache.ibatis.annotations.*;

import java.math.BigDecimal;
import java.util.List;

public interface WebAdminMapper {
    int countByExample(WebAdminExample example);

    int deleteByExample(WebAdminExample example);


    /***
     * 增加用户
     * @param
     * @return
     */
    @SelectKey(statement = "select WEB_ADMIN_SEQUENCE.nextval from dual",resultType = BigDecimal.class,before = true,keyProperty = "operatorId")
    @Insert("insert into web_admin(operatorId,userAdmin,userPass," +
            "userName,userMobile,userStaff,userEmail,isUsed,ip)" +
            "values(#{operatorId},#{userAdmin},#{userPass},#{userName},#{userMobile},#{userStaff},#{userEmail},#{isUsed},#{ip})")
    @Results(
            @Result(property = "operatorId",column = "OPERATOR_ID"),
            @Result(property = "userAdmin",column = "USER_ADMIN"),
            @Result(property = "USER_PASS",column = "userPass"),
            @Result(property = "USER_NAME",column = "userName"),
            @Result(property = "USER_MOBILE",column = "userMobile"),
            @Result(property = "USER_STAFF",column = "userStaff"),
            @Result(property = "USER_EMAIL",column = "userEmail"),
            @Result(property = "IS_USED",column = "isUsed")

    )

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