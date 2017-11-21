package com.wantrip.service;

import com.github.pagehelper.PageInfo;
import com.wantrip.modal.vo.ContentVo;
import com.wantrip.modal.vo.ContentVoExample;

import java.util.List;

/**
 * 文章服务
 * Created by junfeng on 17-11-21.
 */
public interface IContentService {
    /**
     * 保存文章
     * @param contentVo
     * @return
     */
    Integer save(ContentVo contentVo);

    /**
     * 更新文章
     * @param contentVo
     * @return
     */
    Integer update(ContentVo contentVo);

    /**
     * 删除文章
     * @param contentVo
     * @return
     */
    Integer delete(ContentVo contentVo);

    /**
     * 根据主键删除文章
     * @param id
     * @return
     */
    Integer deleteById(Integer id);

    /**
     * 查找所有文章
     * @return
     */
    List<ContentVo> getAll();

    /**
     * 根据文章主键查找文章
     * @param id
     * @return
     */
    ContentVo getContentById(Integer id);
    /**
     * 查询分类/标签下的文章归档
     * @param mid mid
     * @param page page
     * @param limit limit
     * @return ContentVo
     */
    PageInfo<ContentVo> getArticles(Integer mid, int page, int limit);
    /**
     * 搜索、分页
     * @param keyword keyword
     * @param page page
     * @param limit limit
     * @return ContentVo
     */
    PageInfo<ContentVo> getArticles(String keyword,Integer page,Integer limit);

    /**
     * @param commentVoExample
     * @param page
     * @param limit
     * @return
     */
    PageInfo<ContentVo> getArticlesWithpage(ContentVoExample commentVoExample, Integer page, Integer limit);
    /**
     * 更新原有文章的category
     * @param ordinal
     * @param newCatefory
     */
    void updateCategory(String ordinal,String newCatefory);

    /**
     *查询文章返回多条数据
     * @param p 当前页
     * @param limit 每页条数
     * @return ContentVo
     */
    PageInfo<ContentVo> getContents(Integer p, Integer limit);
}
