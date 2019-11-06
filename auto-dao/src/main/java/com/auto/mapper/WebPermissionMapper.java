package com.auto.mapper;

import com.auto.entity.WebPermission;
import com.auto.entity.WebPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}