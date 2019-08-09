package com.shangcheng.shangcheng.mapper;

import com.shangcheng.shangcheng.bean.PingJia;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/8/2
 */
@Mapper
public interface PingJiaMapper {
    public int savePingJia(PingJia pingJia);
    public List<PingJia> getAllPingJiaByUid(Integer uid);
    public List<PingJia> getAllPingJiaByiid(Integer iid);
    public List<PingJia> getAllPingJiaByiidAndUid(@Param("iid") Integer iid,@Param("uid") Integer uid);
    public int updatePingJia(PingJia pingJia);
    public int delPingJiaById(Integer id);
}
