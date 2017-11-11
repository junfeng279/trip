package com.userservice.service;

import com.userservice.modal.vo.RoleVo;

import java.util.List;

/**
 * 角色服务
 * Created by junfeng on 17-11-11.
 */
public interface RoleService {
    /**
     * 获取所有角色信息
     * @return
     */
    List<RoleVo> getAllRole();

    /**
     * 添加角色信息
     * @param roleVo
     * @return
     */
    Integer addRole(RoleVo roleVo) throws Exception;

    /**
     * 更新角色信息
     * @param roleVo
     * @return
     */
    Integer updateRole(RoleVo roleVo) throws Exception;

    /**
     * 删除角色信息
     * @param rid
     * @return
     */
    Integer deleteRole(Integer rid) throws Exception;

    /**
     * 根据角色id查找角色
     * @param rid
     * @return
     */
    RoleVo selectById(Integer rid) throws Exception;
}
