package com.wantrip.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.wantrip.dto.PagesDto;
import com.wantrip.dto.Types;
import com.wantrip.modal.vo.ContentVo;
import com.wantrip.modal.vo.ContentVoExample;
import com.wantrip.modal.vo.MetaVo;
import com.wantrip.service.IContentService;
import com.wantrip.service.IMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 前台文章显示 不需要权限
 * Created by junfeng on 17-11-27.
 */
@RestController
@RequestMapping("/page")
public class PageController {
    @Autowired
    private IContentService contentService;
    @Autowired
    private IMetaService metaService;

    /**
     * 分页查询文章
     * @param pagesDto
     * @return
     */
    @RequestMapping(value = "/articles", method= RequestMethod.POST)
    public JSONObject articles(@RequestBody PagesDto pagesDto){
        ContentVoExample contentVoExample = new ContentVoExample();
        contentVoExample.setOrderByClause("created desc");
        contentVoExample.createCriteria().andTypeEqualTo(Types.ARTICLE.getType());
        PageInfo<ContentVo> contentsPaginator = contentService.getArticlesWithpage(contentVoExample,pagesDto.getPage(),pagesDto.getLimit());
        return (JSONObject) JSONObject.toJSON(contentsPaginator);
    }

    /**
     * 查询所有的分类信息
     * @return
     */
    @RequestMapping(value = "/categories", method=RequestMethod.GET)
    public JSONArray categories(){
        List<MetaVo> categories = metaService.getMetas(Types.CATEGORY.getType());
        return (JSONArray) JSONArray.toJSON(categories);
    }

    /**
     * 根据id查找文章信息
     * @param cid
     * @return
     */
    public JSONObject article(@PathVariable(value = "cid")Integer cid){
        JSONObject result = new JSONObject();
        if(cid==null){
            result.put("msg", "id不能为空");
        }
        ContentVo content = contentService.getArticleById(cid);
        return (JSONObject) JSONObject.toJSON(content);
    }

}
