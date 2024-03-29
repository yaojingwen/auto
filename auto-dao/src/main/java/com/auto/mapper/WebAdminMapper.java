package com.auto.mapper;

import com.auto.entity.WebAdmin;
import com.auto.entity.WebAdminExample;
import java.util.List;

import com.auto.entity.WebRole;
import com.auto.param.WebAdminParam;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

public interface WebAdminMapper {
    int countByExample(WebAdminExample example);

    int deleteByExample(WebAdminExample example);

    int deleteByPrimaryKey(Integer operatorId);

    int insert(WebAdmin record);

    int insertSelective(WebAdmin record);

    List<WebAdmin> selectByExample(WebAdminExample example);

    WebAdmin selectByName( @Param("userAdmin")String userAdmin);

    /***
     * 查询用户信息
     * @param operatorId
     * @return
     */
  /*  @Select("select * from web_admin where operator_Id=#{operatorId}")
    @Results(value = {
            @Result(property = "operatorId",column = "operatorId",id = true),
            @Result(property = "webRoles",column = "operatorId",many = @Many(select = "com.auto.mapper.WebRoleMapper.userRoleList"))
    })*/
    WebAdmin selectByPrimaryKey(Integer operatorId);

    WebAdminParam selectByPrimaryKey2(Integer operatorId);

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



    /***
     * 删除用户对应的角色记录
     * @param operatorId
     * @return
     */
    @Delete(" delete from web_admin_role where operator_Id=#{operatorId}")
    int deleteUserRole(Integer operatorId);

    /***
     * 增加用户角色
     * @param operatorId
     * @param roleId
     * @return
     */
    @Insert("insert into web_admin_role(operator_Id,roleId)values(#{operatorId},#{roleId})")
    int addUserRole(@Param("operatorId")Integer operatorId, @Param("roleId")Integer roleId);

}