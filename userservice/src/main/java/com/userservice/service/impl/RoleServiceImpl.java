package com.userservice.service.impl;

import com.userservice.dao.RoleVoMapper;
import com.userservice.modal.vo.RoleVo;
import com.userservice.service.RoleService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * Created by junfeng on 17-11-11.
 */
@Service
public class RoleServiceImpl implements RoleService{
    @Resource
    private RoleVoMapper roleDao;

    @Override
    public List<RoleVo> getAllRole() {
        return roleDao.getAllRole();
    }

    @Override
    public Integer addRole(RoleVo roleVo) throws Exception {
        if(roleVo==null){
            throw new Exception("角色对象不能为空");
        }
        if(StringUtils.isBlank(roleVo.getName())){
            throw new Exception("角色名称不能为空");
        }
        return roleDao.insertSelective(roleVo);
    }

    @Override
    public Integer updateRole(RoleVo roleVo) throws Exception {
        if(roleVo==null){
            throw new Exception("角色对象不能为空");
        }
        if(roleVo.getId()==null){
            throw new Exception("角色主键id不能为空");
        }
        if(StringUtils.isBlank(roleVo.getName())){
            throw new Exception("角色名称不能为空");
        }
        return roleDao.updateByPrimaryKeySelective(roleVo);
    }

    @Override
    public Integer deleteRole(Integer rid) throws Exception {
        if(rid==null){
            throw new Exception("角色主键id不能为空");
        }
        return roleDao.deleteByPrimaryKey(rid);
    }

    @Override
    public RoleVo selectById(Integer rid) throws Exception {
        if(rid==null){
            throw new Exception("角色主键id不能为空");
        }
        return roleDao.selectByPrimaryKey(rid);
    }
}
