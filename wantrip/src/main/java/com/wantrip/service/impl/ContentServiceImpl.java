package com.wantrip.service.impl;

import com.github.pagehelper.PageInfo;
import com.wantrip.dao.ContentVoMapper;
import com.wantrip.modal.vo.ContentVo;
import com.wantrip.modal.vo.ContentVoExample;
import com.wantrip.service.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by junfeng on 17-11-21.
 */
@Service
public class ContentServiceImpl implements IContentService{
    @Autowired
    private ContentVoMapper contentDao;

    @Override
    public Integer save(ContentVo contentVo) {
        return null;
    }

    @Override
    public Integer update(ContentVo contentVo) {
        return null;
    }

    @Override
    public Integer delete(ContentVo contentVo) {
        return null;
    }

    @Override
    public Integer deleteById(Integer id) {
        return null;
    }

    @Override
    public List<ContentVo> getAll() {
        return null;
    }

    @Override
    public ContentVo getContentById(Integer id) {
        return null;
    }

    @Override
    public PageInfo<ContentVo> getArticles(Integer mid, int page, int limit) {
        return null;
    }

    @Override
    public PageInfo<ContentVo> getArticles(String keyword, Integer page, Integer limit) {
        return null;
    }

    @Override
    public PageInfo<ContentVo> getArticlesWithpage(ContentVoExample commentVoExample, Integer page, Integer limit) {
        return null;
    }

    @Override
    public void updateCategory(String ordinal, String newCatefory) {

    }

    @Override
    public PageInfo<ContentVo> getContents(Integer p, Integer limit) {
        return null;
    }
}
