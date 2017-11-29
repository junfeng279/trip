package com.wantrip.dto;

/**
 * 前台分页参数类
 * Created by junfeng on 17-11-29.
 */
public class PagesDto {
    private Integer page; //当前页
    private Integer limit; //每页文章数
    private String keyword; //搜索关键字

    public void PagesDto(){

    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
