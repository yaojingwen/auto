package com.auto.mapper;

import com.auto.entity.WebAdminRoleExample;
import com.auto.entity.WebAdminRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebAdminRoleMapper {
    int countByExample(WebAdminRoleExample example);

    int deleteByExample(WebAdminRoleExample example);

    int deleteByPrimaryKey(WebAdminRoleKey key);

    int insert(WebAdminRoleKey record);

    int insertSelective(WebAdminRoleKey record);

    List<WebAdminRoleKey> selectByExample(WebAdminRoleExample example);

    int updateByExampleSelective(@Param("record") WebAdminRoleKey record, @Param("example") WebAdminRoleExample example);

    int updateByExample(@Param("record") WebAdminRoleKey record, @Param("example") WebAdminRoleExample example);
}