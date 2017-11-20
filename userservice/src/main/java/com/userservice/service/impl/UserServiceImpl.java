package com.userservice.service.impl;

import com.userservice.controller.UserController;
import com.userservice.dao.UserVoMapper;
import com.userservice.modal.vo.RoleUserVo;
import com.userservice.modal.vo.UserVo;
import com.userservice.modal.vo.UserVoExample;
import com.userservice.service.RoleUserService;
import com.userservice.service.UserService;
import com.userservice.utils.DateKit;
import com.userservice.utils.TaleUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.beans.Transient;
import java.util.List;

/**
 * 用户服务
 * Created by junfeng on 17-11-11.
 */
@Service
public class UserServiceImpl implements UserService{
    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Resource
    private UserVoMapper userDao;
    @Autowired
    private RoleUserService roleUserService;

    @Override
    @Transient
    public Integer addUser(UserVo user) throws Exception {
        if(user==null){
            return null;
        }
        if(StringUtils.isBlank(user.getUsername())){
            throw new Exception("用户名不能为空");
        }
        if(StringUtils.isBlank(user.getPassword())){
            throw new Exception("密码不能为空");
        }
        //用户密码加密
        //  String encodePwd = TaleUtils.MD5encode(user.getPassword());
        user.setPassword(user.getPassword());
        int time = DateKit.getCurrentUnixTime();
        user.setLastLoginTime(time);
        user.setRegTime(time);
        Integer uid = userDao.insertSelective(user);
        logger.info(">>>>>>>>>>>>>>>>>>>>uid:"+uid);
        if(uid!=null){
            //为用户插入默认角色
            logger.info(">>>>>>>>>>>>>>>>>>>>>uid:"+user.getId());
            roleUserService.insertRoleUser(user.getId(), 1);
        }
        return uid;
    }

    @Override
    public Integer updateUser(UserVo user) throws Exception {
        if(user==null){
            return null;
        }
        if(StringUtils.isBlank(user.getUsername())){
            throw new Exception("用户名不能为空");
        }
        if(StringUtils.isBlank(user.getPassword())){
            throw new Exception("密码不能为空");
        }
        //用户密码加密
        String encodePwd = TaleUtils.MD5encode(user.getPassword());
        user.setPassword(encodePwd);
        int time = DateKit.getCurrentUnixTime();
        user.setLastLoginTime(time);
        return userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public Integer delete(UserVo user) {
        UserVoExample userVoExample = new UserVoExample();
        userVoExample.createCriteria().andIdEqualTo(user.getId());
        return userDao.deleteByExample(userVoExample);
    }

    @Override
    public Integer deleteById(Integer id) {
        return userDao.deleteByPrimaryKey(id);
    }

    @Override
    public List<UserVo> findAllUsers() {
        return userDao.findAllUser();
    }

    @Override
    public UserVo findByUserName(String username) {
        return userDao.findByUserName(username);
    }
}
