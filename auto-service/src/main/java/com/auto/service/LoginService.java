package com.auto.service;

import com.auto.entity.WebAdmin;
import com.auto.entity.WebAdminExample;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface LoginService {

     List<WebAdmin> selectByExample(WebAdminExample example);

     int deleteByExample(WebAdminExample example);

     int deleteByPrimaryKey(Integer operatorId);

     int insert(WebAdmin record);

     int insertSelective(WebAdmin record);

     WebAdmin selectByPrimaryKey(Integer operatorId);

     int updateByExampleSelective(@Param("record") WebAdmin record, @Param("example") WebAdminExample example);

     int updateByExample(@Param("record") WebAdmin record, @Param("example") WebAdminExample example);

     int updateByPrimaryKeySelective(WebAdmin record);

     int updateByPrimaryKey(WebAdmin record);
     /**
      * 用户集合查询-接口
      * @return
      * @param page
      * @param size
      */
     PageInfo<WebAdmin> list(int page, int size);

     /***
      * 增加用户-接口
      * @param user
      * @return
      */


}
