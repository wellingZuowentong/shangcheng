package com.shangcheng.shangcheng.service;

import com.shangcheng.shangcheng.bean.PingJia;
import com.shangcheng.shangcheng.mapper.PingJiaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/8/2
 */
@Service
public class PingJiaService {
    @Autowired
    private PingJiaMapper pingJiaMapper;
    public int savePingJia(PingJia pingjia){
        return pingJiaMapper.savePingJia(pingjia);
    }
    public List<PingJia> getAllPingJiaByUid(Integer uid){
        return pingJiaMapper.getAllPingJiaByUid(uid);
    }
    public List<PingJia> getAllPingJiaByiid(Integer iid){
        return pingJiaMapper.getAllPingJiaByiid(iid);
    }
    public List<PingJia> getAllPingJiaByiidAndUid(Integer iid,Integer uid){
        return pingJiaMapper.getAllPingJiaByiidAndUid(iid,uid);
    }
    public int updatePingJia(PingJia pingjia){
        return pingJiaMapper.updatePingJia(pingjia);
    }
    public int delPingJiaById(Integer id){
        return pingJiaMapper.delPingJiaById(id);
    }
}
