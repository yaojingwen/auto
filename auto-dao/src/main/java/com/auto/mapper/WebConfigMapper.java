package com.auto.mapper;

import com.auto.entity.WebConfig;
import com.auto.entity.WebConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebConfigMapper {
    int countByExample(WebConfigExample example);

    int deleteByExample(WebConfigExample example);

    int insert(WebConfig record);

    int insertSelective(WebConfig record);

    List<WebConfig> selectByExample(WebConfigExample example);

    int updateByExampleSelective(@Param("record") WebConfig record, @Param("example") WebConfigExample example);

    int updateByExample(@Param("record") WebConfig record, @Param("example") WebConfigExample example);
}