package com.userservice.service;

import com.userservice.modal.vo.PermissionVo;

import java.util.List;

/**
 * 权限服务
 * Created by junfeng on 17-11-11.
 */
public interface PermissionService {
    /**
     * 查询所有的权限信息
     * @return
     */
    public List<PermissionVo> findAllPermission();

    /**
     * 添加权限
     * @param permissionVo
     * @return
     */
    public Integer addPermission(PermissionVo permissionVo) throws Exception;

    /**
     * 更新权限信息
     * @param permissionVo
     * @return
     */
    public Integer updatePermission(PermissionVo permissionVo) throws Exception;

    /**
     * 根据主键删除权限
     * @param pid
     * @return
     */
    public Integer deletePermission(Integer pid) throws Exception;
}
