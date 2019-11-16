package com.auto.mapper;

import com.auto.entity.WebRole;
import com.auto.entity.WebRoleExample;
import java.util.List;

import com.auto.param.WebRoleParam;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface WebRoleMapper {
    int countByExample(WebRoleExample example);

    int deleteByExample(WebRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebRole record);

    int insertSelective(WebRole record);

    /**
     * 集合查询
     * @return
     */
    List<WebRole> selectByExample(WebRoleExample example);

    WebRole selectByPrimaryKey(Integer id);

    WebRoleParam selectByPrimaryKey2(Integer id);

    int updateByExampleSelective(@Param("record") WebRole record, @Param("example") WebRoleExample example);

    int updateByExample(@Param("record") WebRole record, @Param("example") WebRoleExample example);

    int updateByPrimaryKeySelective(WebRole record);

    int updateByPrimaryKey(WebRole record);

    /***
     * 删除指定角色的权限
     * @param roleId
     * @return
     */
    @Delete("delete from web_role_permission where roleId=#{roleId}")
    int deleteRolePermission(Integer roleId);

    /**
     * 增加操作
     * @param id        权限资源ID
     * @param roleId    角色ID
     * @return
     */
    @Insert("insert into web_role_permission(permissionId,roleId)values(#{permissionId},#{roleId})")
    int addRolePermission(@Param("permissionId") Integer id, @Param("roleId")Integer roleId);

    /***
     * 查询用户的角色信息
     */
    @Select(" select wr.* from web_admin_role war , web_role wr where war.roleid=wr.id and war.userid=#{userId}")
    List<WebRole> userRoleList(Integer userId);

}