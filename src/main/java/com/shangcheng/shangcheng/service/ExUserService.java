package com.shangcheng.shangcheng.service;

import com.shangcheng.shangcheng.bean.ExUser;
import com.shangcheng.shangcheng.mapper.ExUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/8/1
 */
@Service
public class ExUserService {
    @Autowired
    private ExUserMapper exUserMapper;


    public int saveExUser(ExUser exUser){
        return exUserMapper.saveExUser(exUser);
    }


    public int deleteExUser(Integer id){
        return exUserMapper.deleteExUser(id);
    }


    public int updateExUser(ExUser exuser){
        return exUserMapper.updateExUser(exuser);
    }


    public ExUser getExUserById(Integer id){
        return exUserMapper.getExUserById(id);
    }


    public List<ExUser> getExUserByUid(Integer uid){
        return exUserMapper.getExUserByUid(uid);
    }


    public List<ExUser> getAllExUser(){
        return exUserMapper.getAllExUser();
    }
}
