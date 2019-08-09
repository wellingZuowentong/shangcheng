package com.shangcheng.shangcheng.controller;

import com.shangcheng.shangcheng.bean.ExUser;
import com.shangcheng.shangcheng.bean.Order;
import com.shangcheng.shangcheng.service.ExUserService;
import com.shangcheng.shangcheng.service.OrderService;
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
    @Autowired
    private OrderService orderService;
    /*
    * 用户添加及登陆
    * */
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

    /*
    * 删除用户
    * */
    @RequestMapping(value="deleteExUser")
    @ResponseBody
    public int deleteExUser(Integer id){
        return exUserService.deleteExUser(id);
    }

    /*
    *
    * 修改用户收货信息
    * */
    @RequestMapping(value="updateExUser")
    @ResponseBody
    public int updateExUser(ExUser exuser){
        return exUserService.updateExUser(exuser);
    }
    /*
    * 根据id查询收货信息
    * */
    @RequestMapping(value="getExUserById")
    @ResponseBody
    public ExUser getExUserById(Integer id){
        return exUserService.getExUserById(id);
    }

    /*
    * 根据uid查询用户收货信息
    * */
    @RequestMapping(value="getExUserByUid")
    @ResponseBody
    public List<ExUser> getExUserByUid(Integer uid){
        return exUserService.getExUserByUid(uid);
    }

    /*
    * 查询所有用户收货地址
    * */
    @RequestMapping(value="getAllExUser")
    @ResponseBody
    public List<ExUser> getAllExUser(){
        return exUserService.getAllExUser();
    }

    /*
    * 查询快递在途信息
    * */
    @RequestMapping("getkuaidi")
    @ResponseBody
    public String getKuaiDi(Integer id) throws Exception {
        Order order = orderService.getOrder(id);
        String result = UtilKuaiDi.getOrderTracesByJson(order.getYuliub(),order.getYuliuc());
        return result;
    }



}
