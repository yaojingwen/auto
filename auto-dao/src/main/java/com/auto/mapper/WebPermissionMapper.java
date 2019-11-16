package com.auto.mapper;

import com.auto.entity.WebPermission;
import com.auto.entity.WebPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface WebPermissionMapper {
    int countByExample(WebPermissionExample example);

    int deleteByExample(WebPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebPermission record);

    int insertSelective(WebPermission record);

    List<WebPermission> selectByExample(WebPermissionExample example);

    WebPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebPermission record, @Param("example") WebPermissionExample example);

    int updateByExample(@Param("record") WebPermission record, @Param("example") WebPermissionExample example);

    int updateByPrimaryKeySelective(WebPermission record);

    int updateByPrimaryKey(WebPermission record);

    /***
     * 查询角色的所有权限
     * @param id
     * @return
     */
    @Select("select  wp.*\n" +
            "  from web_permission wp, web_role_permission wrp\n" +
            " where wp.id = wrp.permissionid\n" +
            "   and wrp.roleid =#{roleId}")
    List<WebPermission> rolePermissionList(Integer id);
}