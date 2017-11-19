package com.userservice.service.impl;

import com.userservice.dao.UserVoMapper;
import com.userservice.modal.vo.UserVo;
import com.userservice.modal.vo.UserVoExample;
import com.userservice.service.UserService;
import com.userservice.utils.DateKit;
import com.userservice.utils.TaleUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户服务
 * Created by junfeng on 17-11-11.
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserVoMapper userDao;
    @Override
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
        return userDao.insertSelective(user);
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
