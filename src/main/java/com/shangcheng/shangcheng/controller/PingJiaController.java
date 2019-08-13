package com.shangcheng.shangcheng.controller;

import com.shangcheng.shangcheng.bean.ItemOrder;
import com.shangcheng.shangcheng.bean.PingJia;
import com.shangcheng.shangcheng.bean.User;
import com.shangcheng.shangcheng.service.ItemOrderService;
import com.shangcheng.shangcheng.service.PingJiaService;
import com.shangcheng.shangcheng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/8/2
 */
@Controller
public class PingJiaController {
    @Autowired
    private PingJiaService pingJiaService;
    @Autowired
    private ItemOrderService itemOrderService;
    @Autowired
    private UserService userService;
    /*
    * 添加商品评价
    * */
    @RequestMapping(value="savePingJia")
    @ResponseBody
    public int savePingJia(Integer ioid,PingJia pingjia){
        System.out.println(ioid);
        System.out.println("========================");
        System.out.println(pingjia);
        ItemOrder itemOrder = itemOrderService.getItemOrderById(ioid);
        User user = userService.getUserById(pingjia.getUid());
        pingjia.setIid(itemOrder.getIid());
        pingjia.setDate(new Date());
        pingjia.setPname(user.getUsername());
        itemOrderService.updateItemOrderPj(ioid,1);
        return pingJiaService.savePingJia(pingjia);
    }

    @RequestMapping(value="savePing")
    @ResponseBody
    public void savePing(HttpServletRequest request){
        String ioid= request.getParameter("ioid");
        String uid = request.getParameter("uid");
        String neirong = request.getParameter("neirong");
        String gb = request.getParameter("gb");
        System.out.println("ioid:===>"+ioid+"uid:===>"+uid+"neirong:===>"+neirong+"gb:===>"+gb);
    }
    /*
    * 根据用户id查询所有评价
    * */
    @RequestMapping(value="getAllPingJiaByUid")
    @ResponseBody
    public List<PingJia> getAllPingJiaByUid(Integer uid){
        return pingJiaService.getAllPingJiaByUid(uid);
    }

    /*
    * 根据商品id查询所有商品评价
    * */
    @RequestMapping(value="getAllPingJiaByiid")
    @ResponseBody
    public List<PingJia> getAllPingJiaByiid(Integer iid){
        return pingJiaService.getAllPingJiaByiid(iid);
    }
    /*
    * 根据用户id和商品id查询商品评价
    * */
    @RequestMapping(value="getAllPingJiaByiidAndUid")
    @ResponseBody
    public List<PingJia> getAllPingJiaByiidAndUid(Integer iid,Integer uid){
        return pingJiaService.getAllPingJiaByiidAndUid(iid,uid);
    }
    /*
    * 修改商品评价
    * */
    @RequestMapping(value="updatePingJia")
    @ResponseBody
    public int updatePingJia(PingJia pingjia){
        return pingJiaService.updatePingJia(pingjia);
    }
    /*
    * 删除商品评价
    * */
    @RequestMapping(value="delPingJiaById")
    @ResponseBody
    public int delPingJiaById(Integer id){
        return pingJiaService.delPingJiaById(id);
    }
}
