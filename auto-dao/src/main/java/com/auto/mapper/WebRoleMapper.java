package com.auto.mapper;

import com.auto.entity.WebRole;
import com.auto.entity.WebRoleExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface WebRoleMapper {
    int countByExample(WebRoleExample example);

    int deleteByExample(WebRoleExample example);

    int deleteByPrimaryKey(BigDecimal roleid);

    int insert(WebRole record);

    int insertSelective(WebRole record);

    List<WebRole> selectByExample(WebRoleExample example);

    WebRole selectByPrimaryKey(BigDecimal roleid);

    int updateByExampleSelective(@Param("record") WebRole record, @Param("example") WebRoleExample example);

    int updateByExample(@Param("record") WebRole record, @Param("example") WebRoleExample example);

    int updateByPrimaryKeySelective(WebRole record);

    int updateByPrimaryKey(WebRole record);
}