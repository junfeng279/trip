package com.userservice.dao;

import com.userservice.modal.vo.PermissionRoleVo;
import com.userservice.modal.vo.PermissionRoleVoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionRoleVoMapper {
    long countByExample(PermissionRoleVoExample example);

    int deleteByExample(PermissionRoleVoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PermissionRoleVo record);

    int insertSelective(PermissionRoleVo record);

    List<PermissionRoleVo> selectByExample(PermissionRoleVoExample example);

    PermissionRoleVo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PermissionRoleVo record, @Param("example") PermissionRoleVoExample example);

    int updateByExample(@Param("record") PermissionRoleVo record, @Param("example") PermissionRoleVoExample example);

    int updateByPrimaryKeySelective(PermissionRoleVo record);

    int updateByPrimaryKey(PermissionRoleVo record);
}