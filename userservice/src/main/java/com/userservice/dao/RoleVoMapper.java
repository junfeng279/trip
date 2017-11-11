package com.userservice.dao;

import com.userservice.modal.vo.RoleVo;
import com.userservice.modal.vo.RoleVoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleVoMapper {
    long countByExample(RoleVoExample example);

    int deleteByExample(RoleVoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleVo record);

    int insertSelective(RoleVo record);

    List<RoleVo> selectByExample(RoleVoExample example);

    RoleVo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleVo record, @Param("example") RoleVoExample example);

    int updateByExample(@Param("record") RoleVo record, @Param("example") RoleVoExample example);

    int updateByPrimaryKeySelective(RoleVo record);

    int updateByPrimaryKey(RoleVo record);

    List<RoleVo> getAllRole();
}