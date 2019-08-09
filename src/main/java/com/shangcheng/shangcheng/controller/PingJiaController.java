package com.shangcheng.shangcheng.controller;
import com.shangcheng.shangcheng.bean.PingJia;
import com.shangcheng.shangcheng.service.PingJiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/8/2
 */
@Controller
public class PingJiaController {
    @Autowired
    private PingJiaService pingJiaService;

    @RequestMapping(value="savePingJia")
    @ResponseBody
    public int savePingJia(PingJia pingjia){
        return pingJiaService.savePingJia(pingjia);
    }

    @RequestMapping(value="getAllPingJiaByUid")
    @ResponseBody
    public List<PingJia> getAllPingJiaByUid(Integer uid){
        return pingJiaService.getAllPingJiaByUid(uid);
    }

    @RequestMapping(value="getAllPingJiaByiid")
    @ResponseBody
    public List<PingJia> getAllPingJiaByiid(Integer iid){
        return pingJiaService.getAllPingJiaByiid(iid);
    }

    @RequestMapping(value="getAllPingJiaByiidAndUid")
    @ResponseBody
    public List<PingJia> getAllPingJiaByiidAndUid(Integer iid,Integer uid){
        return pingJiaService.getAllPingJiaByiidAndUid(iid,uid);
    }

    @RequestMapping(value="updatePingJia")
    @ResponseBody
    public int updatePingJia(PingJia pingjia){
        return pingJiaService.updatePingJia(pingjia);
    }

    @RequestMapping(value="delPingJiaById")
    @ResponseBody
    public int delPingJiaById(Integer id){
        return pingJiaService.delPingJiaById(id);
    }
}
