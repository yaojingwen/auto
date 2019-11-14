package com.auto.service;

import com.auto.components.exception.CustomException;
import com.auto.entity.WebAdmin;
import com.auto.entity.WebAdminExample;
import com.auto.param.WebAdminParam;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface LoginService {

     List<WebAdmin> selectByExample(WebAdminExample example)throws CustomException;

     WebAdmin selectByName(String userAdmin)throws Exception, CustomException;

     int deleteByExample(WebAdminExample example)throws Exception, CustomException;

     int deleteByPrimaryKey(Integer operatorId)throws Exception, CustomException;

     int insert(WebAdmin record)throws Exception, CustomException;

     int insertSelective(WebAdmin record)throws Exception, CustomException;

     WebAdmin selectByPrimaryKey(Integer operatorId)throws Exception, CustomException;

     WebAdminParam selectByPrimaryKey2(Integer operatorId)throws Exception, CustomException;

     int updateByExampleSelective(@Param("record") WebAdmin record, @Param("example") WebAdminExample example)throws Exception, CustomException;

     int updateByExample(@Param("record") WebAdmin record, @Param("example") WebAdminExample example)throws Exception, CustomException;

     int updateByPrimaryKeySelective(WebAdmin record)throws Exception, CustomException;

     int updateByPrimaryKey(WebAdmin record)throws Exception, CustomException;
     /**
      * 用户集合查询-接口
      * @return
      * @param page
      * @param size
      */
     PageInfo<WebAdmin> list(int page, int size)throws Exception, CustomException;

     /***
      * 增加用户-接口
      * @param user
      * @return
      */


}
