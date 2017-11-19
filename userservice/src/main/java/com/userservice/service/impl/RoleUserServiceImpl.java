package com.userservice.service.impl;

import com.userservice.dao.RoleUserVoMapper;
import com.userservice.modal.vo.RoleUserVo;
import com.userservice.service.RoleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * Created by junfeng on 17-11-19.
 */
@Service
public class RoleUserServiceImpl implements RoleUserService{
    @Autowired
    private RoleUserVoMapper roleUserDao;

    @Override
    public void insertRoleUser(Integer userid, Integer roleId) throws Exception {
        if(userid==null){
            throw new Exception("用户id不能为空");
        }
        if(roleId==null){
            throw new Exception("角色id不能为空");
        }
        RoleUserVo roleUser = new RoleUserVo();
        roleUser.setSysUserId(userid);
        roleUser.setSysRoleId(roleId);
        roleUserDao.insertSelective(roleUser);
    }
}
