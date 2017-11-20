package com.userservice.service;

/**
 * 角色用户关联服务
 * Created by junfeng on 17-11-19.
 */
public interface RoleUserService {
    /**
     * 添加用户角色服务
     * @param userid
     * @param roleId
     */
    void insertRoleUser(Integer userid, Integer roleId) throws Exception;
}
