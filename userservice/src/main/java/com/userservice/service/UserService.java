package com.userservice.service;

import com.userservice.modal.vo.UserVo;

import java.util.List;

/**
 * 用户服务
 * Created by junfeng on 17-11-11.
 */
public interface UserService {
    /**
     * 根据用户名称查找用户信息
     * @param username
     * @return
     */
    public UserVo findByUserName(String username);

    /**
     * 添加用户
     * @param user
     * @return
     */
    public Integer addUser(UserVo user) throws Exception;

    /**
     * 跟新用户信息
     * @param user
     * @return
     */
    public Integer updateUser(UserVo user) throws Exception;

    /**
     * 根据用户对象删除用户信息
     * @param user
     * @return
     */
    public Integer delete(UserVo user);

    /**
     * 根据用户主键id删除用户信息
     * @param id
     * @return
     */
    public Integer deleteById(Integer id);

    /**
     * 查询所有用户信息
     * @return
     */
    public List<UserVo> findAllUsers();

}
