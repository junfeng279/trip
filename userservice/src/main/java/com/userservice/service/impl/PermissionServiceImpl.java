package com.userservice.service.impl;

import com.userservice.dao.PermissionVoMapper;
import com.userservice.modal.vo.PermissionVo;
import com.userservice.service.PermissionService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 权限服务
 * Created by junfeng on 17-11-11.
 */
@Service
public class PermissionServiceImpl implements PermissionService{
    @Resource
    private PermissionVoMapper permissionDao;

    @Override
    public List<PermissionVo> findAllPermission() {
        return permissionDao.findAllPermission();
    }

    @Override
    public Integer addPermission(PermissionVo permissionVo) throws Exception {
        if(permissionVo==null){
            throw new Exception("权限对象不能为空");
        }
        if(StringUtils.isBlank(permissionVo.getName())){
            throw new Exception("权限名称不能为空");
        }
        if(StringUtils.isBlank(permissionVo.getUrl())){
            throw new Exception("权限地址不能为空");
        }

        return permissionDao.insertSelective(permissionVo);
    }

    @Override
    public Integer updatePermission(PermissionVo permissionVo) throws Exception {
        if(permissionVo==null){
            throw new Exception("权限对象不能为空");
        }
        if(StringUtils.isBlank(permissionVo.getName())){
            throw new Exception("权限名称不能为空");
        }
        if(StringUtils.isBlank(permissionVo.getUrl())){
            throw new Exception("权限地址不能为空");
        }
        return permissionDao.updateByPrimaryKeySelective(permissionVo);
    }

    @Override
    public Integer deletePermission(Integer pid) throws Exception {
        if(pid==null){
            throw new Exception("权限主键id不能为空");
        }
        return permissionDao.deleteByPrimaryKey(pid);
    }
}
