package com.userservice.dao;

import com.userservice.modal.vo.PermissionVo;
import com.userservice.modal.vo.PermissionVoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionVoMapper {
    long countByExample(PermissionVoExample example);

    int deleteByExample(PermissionVoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PermissionVo record);

    int insertSelective(PermissionVo record);

    List<PermissionVo> selectByExample(PermissionVoExample example);

    PermissionVo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PermissionVo record, @Param("example") PermissionVoExample example);

    int updateByExample(@Param("record") PermissionVo record, @Param("example") PermissionVoExample example);

    int updateByPrimaryKeySelective(PermissionVo record);

    int updateByPrimaryKey(PermissionVo record);

    List<PermissionVo> findAllPermission();

    public List<PermissionVo> findByAdminUserId(Integer uid);
}