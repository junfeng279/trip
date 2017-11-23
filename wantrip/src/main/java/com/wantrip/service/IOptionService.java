package com.wantrip.service;

import com.wantrip.modal.vo.OptionVo;

import java.util.List;
import java.util.Map;

/**
 * 配置服务
 * Created by junfeng on 17-11-21.
 */
public interface IOptionService {

    void insertOption(OptionVo optionVo);

    void insertOption(String name, String value);

    List<OptionVo> getOptions();


    /**
     * 保存一组配置
     *
     * @param options
     */
    void saveOptions(Map<String, String> options);

    OptionVo getOptionByName(String name);
}
