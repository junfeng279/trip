package com.wantrip.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.wantrip.dto.Types;
import com.wantrip.exception.TipException;
import com.wantrip.modal.bo.RestResponseBo;
import com.wantrip.modal.vo.ContentVo;
import com.wantrip.service.IContentService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 文章相关接口
 * Created by junfeng on 17-11-27.
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);
    @Autowired
    private IContentService contentService;

    /**
     * 分页查询文章
     * @param params
     * @return
     */
    @RequestMapping(value = "/pages", method = RequestMethod.POST)
    public RestResponseBo searchArticle(@RequestBody String params){
        if(params==null || StringUtils.isBlank(params)){
            return RestResponseBo.fail("参数不能为空");
        }
        JSONObject obj = JSONObject.parseObject(params);
        Integer p = obj.getInteger("page");
        Integer limit = obj.getInteger("limit");
        if(p==null || limit==null){
            return RestResponseBo.fail("当前页和每页条数都不能为空");
        }
        PageInfo<ContentVo> result = contentService.getContents(p, limit);
        return RestResponseBo.ok(result);
    }

    /**
     * 发布文章信息
     * @param contentVo
     * @return
     */
    @RequestMapping(value="/publish", method = RequestMethod.POST)
    public RestResponseBo publish(@RequestBody ContentVo contentVo){
        if(contentVo==null){
            return RestResponseBo.fail("文章内容不能为空");
        }
        contentVo.setType(Types.ARTICLE.getType());
        if (StringUtils.isBlank(contentVo.getCategories())) {
            contentVo.setCategories("default");
        }
        try {
            contentService.publish(contentVo);
        } catch (Exception e) {
            String msg = "文章发布失败";
            if (e instanceof TipException) {
                msg = e.getMessage();
            } else {
                logger.error(msg, e);
            }
            return RestResponseBo.fail(msg);
        }
        return RestResponseBo.ok();
    }

    /**
     * 根据文章id查找文章详细信息
     * @param cid
     * @return
     */
    @RequestMapping(value = "/{cid}", method = RequestMethod.GET)
    public RestResponseBo article(@PathVariable(value = "cid")Integer cid){
        if(cid==null){
            return RestResponseBo.fail("文章id不存在请查证");
        }
        ContentVo content = contentService.getArticleById(cid);
        return RestResponseBo.ok(content);
    }

    /**
     * 编辑文章
     * @param contentVo
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public RestResponseBo modify(@RequestBody ContentVo contentVo){
        if(contentVo==null || contentVo.getCid()==null){
            return RestResponseBo.fail("文章不能为空");
        }
        try {
            contentVo.setType(Types.ARTICLE.getType());
            contentService.updateArticle(contentVo);
        }catch (Exception e) {
            String msg = "文章编辑失败";
            if (e instanceof TipException) {
                msg = e.getMessage();
            } else {
                logger.error(msg, e);
            }
            return RestResponseBo.fail(msg);
        }
        return RestResponseBo.ok();
    }

    /**
     * 根据文章id删除文章
     * @param cid
     * @return
     */
    @RequestMapping(value = "/{cid}", method = RequestMethod.DELETE)
    public RestResponseBo delete(@PathVariable(value = "cid")Integer cid){
        if(cid==null){
            return RestResponseBo.fail("文章id不存在请查证");
        }
        try{
            contentService.deleteByCid(cid);
        }catch (Exception e){
            String msg = "文章删除失败";
            logger.error(msg, e);
            return RestResponseBo.fail(msg);
        }
        return RestResponseBo.ok();
    }
}
