package com.shangcheng.shangcheng.controller;

import com.shangcheng.shangcheng.bean.ExUser;
import com.shangcheng.shangcheng.service.ExUserService;
import com.shangcheng.shangcheng.util.UtilKuaiDi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/8/1
 */
@Controller
public class ExUserController {
    @Autowired
    private ExUserService exUserService;

    @RequestMapping(value="saveExUser")
    @ResponseBody
    public int saveExUser(ExUser exUser){
        System.out.println("code===========》："+exUser.getUid());
        if(exUser.getCode()==1){
            List<ExUser> list= exUserService.getExUserByUid(exUser.getUid());
            for(ExUser e:list){
                if(e.getCode()==1){
                    e.setCode(0);
                    exUserService.updateExUser(e);
                }
            }
        }
        exUserService.saveExUser(exUser);
        return exUser.getId() ;
    }
    @RequestMapping(value="deleteExUser")
    @ResponseBody
    public int deleteExUser(Integer id){
        return exUserService.deleteExUser(id);
    }
    @RequestMapping(value="updateExUser")
    @ResponseBody
    public int updateExUser(ExUser exuser){
        return exUserService.updateExUser(exuser);
    }
    @RequestMapping(value="getExUserById")
    @ResponseBody
    public ExUser getExUserById(Integer id){
        return exUserService.getExUserById(id);
    }
    @RequestMapping(value="getExUserByUid")
    @ResponseBody
    public List<ExUser> getExUserByUid(Integer uid){
        return exUserService.getExUserByUid(uid);
    }
    @RequestMapping(value="getAllExUser")
    @ResponseBody
    public List<ExUser> getAllExUser(){
        return exUserService.getAllExUser();
    }


    @RequestMapping("getkuaidi")
    @ResponseBody
    public String getKuaiDi(String kdgs,String kddh) throws Exception {
        return UtilKuaiDi.getOrderTracesByJson(kdgs,kddh);
    }



}
