package com.asiainfo.mapper;

import com.asiainfo.entity.WebConfig;
import com.asiainfo.entity.WebConfigExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebConfigMapper {
    int countByExample(WebConfigExample example);

    int deleteByExample(WebConfigExample example);

    int insert(WebConfig record);

    int insertSelective(WebConfig record);

    List<WebConfig> selectByExample(WebConfigExample example);

    int updateByExampleSelective(@Param("record") WebConfig record, @Param("example") WebConfigExample example);

    int updateByExample(@Param("record") WebConfig record, @Param("example") WebConfigExample example);
}