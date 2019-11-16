package com.auto.mapper;

import com.auto.entity.WebRole;
import com.auto.entity.WebRoleExample;
import java.util.List;

import com.auto.param.WebRoleParam;
import org.apache.ibatis.annotations.Param;

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
}