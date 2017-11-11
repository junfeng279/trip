package com.userservice.dao;

import com.userservice.modal.vo.RoleUserVo;
import com.userservice.modal.vo.RoleUserVoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleUserVoMapper {
    long countByExample(RoleUserVoExample example);

    int deleteByExample(RoleUserVoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RoleUserVo record);

    int insertSelective(RoleUserVo record);

    List<RoleUserVo> selectByExample(RoleUserVoExample example);

    RoleUserVo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RoleUserVo record, @Param("example") RoleUserVoExample example);

    int updateByExample(@Param("record") RoleUserVo record, @Param("example") RoleUserVoExample example);

    int updateByPrimaryKeySelective(RoleUserVo record);

    int updateByPrimaryKey(RoleUserVo record);
}