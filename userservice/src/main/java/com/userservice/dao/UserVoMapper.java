package com.userservice.dao;

import com.userservice.modal.vo.UserVo;
import com.userservice.modal.vo.UserVoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserVoMapper {
    long countByExample(UserVoExample example);

    int deleteByExample(UserVoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserVo record);

    int insertSelective(UserVo record);

    List<UserVo> selectByExample(UserVoExample example);

    UserVo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserVo record, @Param("example") UserVoExample example);

    int updateByExample(@Param("record") UserVo record, @Param("example") UserVoExample example);

    int updateByPrimaryKeySelective(UserVo record);

    int updateByPrimaryKey(UserVo record);

    public UserVo findByUserName(String username);

    public List<UserVo> findAllUser();
}