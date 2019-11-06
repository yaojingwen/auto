package com.auto.mapper;

import com.auto.entity.WebRolePermissionExample;
import com.auto.entity.WebRolePermissionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebRolePermissionMapper {
    int countByExample(WebRolePermissionExample example);

    int deleteByExample(WebRolePermissionExample example);

    int deleteByPrimaryKey(WebRolePermissionKey key);

    int insert(WebRolePermissionKey record);

    int insertSelective(WebRolePermissionKey record);

    List<WebRolePermissionKey> selectByExample(WebRolePermissionExample example);

    int updateByExampleSelective(@Param("record") WebRolePermissionKey record, @Param("example") WebRolePermissionExample example);

    int updateByExample(@Param("record") WebRolePermissionKey record, @Param("example") WebRolePermissionExample example);
}