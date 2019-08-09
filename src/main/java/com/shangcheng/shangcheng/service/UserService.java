package com.shangcheng.shangcheng.service;

import com.shangcheng.shangcheng.bean.User;
import com.shangcheng.shangcheng.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int saveUser(User user){
        return userMapper.saveUser(user);
    }
    public User getUserByOpenId(String openid){
        return userMapper.getUserByOpenId(openid);
    }
    public User getUserById(Integer id){
        return userMapper.getUserById(id);
    }
    public int updateUser(User user){
        return userMapper.updateUser(user);
    }
    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }
    public int delUser(Integer id){
        return userMapper.delUser(id);
    }
}
