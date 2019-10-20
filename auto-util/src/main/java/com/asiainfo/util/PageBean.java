package com.asiainfo.util;

import java.io.Serializable;
import java.util.List;

/***
 *
 * @Author:wangdawei
 * @Description:
 * @date: 2018/04/13 14:52
 *  分页封装
 *      基本分页信息：当前页、每页显示多少条、总页数、总记录数
 *      结果集列表封装：List<T>
 ****/
public class PageBean<T> implements Serializable {

    //当前页、
    private Integer currentPage;

    // 每页显示多少条、
    private Integer size;

    // 总页数、
    private Integer totalPage;

    // 总记录数
    private Long total;

    //存储集合数据
    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
