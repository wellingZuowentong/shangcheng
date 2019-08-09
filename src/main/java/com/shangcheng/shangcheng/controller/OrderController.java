package com.shangcheng.shangcheng.controller;

import com.shangcheng.shangcheng.bean.*;
import com.shangcheng.shangcheng.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.*;

/**
 * 作者：王怀朋
 * 日期：2019/7/16
 */
@Controller
public class OrderController {
    @Autowired
    public OrderService orderService;
    @Autowired
    private ItemService itemService;
    @Autowired
    private DetailsService detailsService;
    @Autowired
    private ItemOrderService itemOrderService;
    @Autowired
    private BackOrderService backOrderService;



   /* @RequestMapping("/login")
    @ResponseBody
    public Map login(String code){
        System.out.println("code====>"+code);
        Map map= new HashMap<>();
        return map;
    }*/



    /*
    * 新增订单
    * */
    @RequestMapping(value="saveOrder",method = RequestMethod.POST)
    @ResponseBody
    public int saveOrder(@RequestBody List<Map<String,Object>> list){
        Random rand = new Random();

        String ordernum =((rand.nextInt(1000000000) + 1)+""+System.currentTimeMillis()+"").substring(0,20);

   Order order1 = new Order();
    order1.setOrdernum(ordernum);
    orderService.saveOrder(order1);
    Integer oid=order1.getId();
        Integer iid=null;
        Integer num=null;
        Integer uid=null;
        String phone="";
        String address="";
        String shname="";
        BigDecimal allPrice = new BigDecimal(0);
       for(Map<String,Object> map:list){
           Iterator<Map.Entry<String,Object>> entries = map.entrySet().iterator();
           while(entries.hasNext()){
               Map.Entry<String, Object> entry = entries.next();
               if(entry.getKey().equals("iid")){
                   iid =(Integer)entry.getValue();
               }
               if(entry.getKey().equals("num")){
                   num =Integer.parseInt(entry.getValue()+"");
               }
               if(entry.getKey().equals("uid")){
                   uid =(Integer)entry.getValue();
               }
               if(entry.getKey().equals("address")){
                   address = entry.getValue()+"";
               }
               if(entry.getKey().equals("phone")){
                   phone = entry.getValue()+"";
               }
               if(entry.getKey().equals("shName")){
                   shname = entry.getValue()+"";
               }
               if(entry.getKey().equals("allPrice")){
                   allPrice = new BigDecimal(entry.getValue()+"");
               }

           }
           System.out.println(+iid+"<---->"+num+"<---->"+uid+"<---->"+address+"<---->"+phone);
           ItemOrder itemOrder = new ItemOrder();
           itemOrder.setIid(iid);
           itemOrder.setNum(num);
           itemOrder.setUid(uid);
           itemOrder.setOid(oid);
           itemOrder.setPj(0);
           itemOrderService.saveItemOrder(itemOrder);
           Details details = detailsService.getDetailsByIid(iid);
           details.setKucun(details.getKucun()-num);
           detailsService.updateDetails(details);
      }
       Order order = orderService.getOrder(oid);
       System.out.println(order+"!!!!!!!!!!!!!!");
       order.setUid(uid);
       order.setPhone(phone);
       order.setDate(new Date());
       order.setAddress(address);
       order.setAllprice(allPrice);
       order.setNicheng(shname);
       order.setCode(3);
       orderService.updateOrder(order);
        return 1;
    }
    /*
     * 根据uid查询所有订单
     * */
    @RequestMapping(value="getAllOrder")
    @ResponseBody
    public List<Order> getAllOrder(Integer uid){
        System.out.println("ceshi:"+uid);
        return orderService.getAllOrder(uid);
    }
/*
* 根据订单id查询订单
* */
    @RequestMapping("getOrder")
    @ResponseBody
    public Order getOrder(Integer id){
        return orderService.getOrder(id);
    }

    /*
     * 删除订单
     * */

    @RequestMapping("delOrder")
    @ResponseBody
    public int delOrder(Integer id){
        Order order = orderService.getOrder(id);
        List<ItemOrder> ioo=itemOrderService.getItemOrderByOid(id);
        for(ItemOrder io:ioo){
            Details details = detailsService.getDetailsByIid(io.getIid());
            details.setKucun(details.getKucun()+io.getNum());
            System.out.println(details);
            detailsService.updateDetails(details);
            itemOrderService.delItemOrder(io.getId());
        }
        itemOrderService.delItemOrder(id);
        return orderService.delOrder(id);
    }
    /*
    * 修改订单
    * */
    @RequestMapping("updateOrder")
    @ResponseBody
    public int updateOrder(Order order){
        return orderService.updateOrder(order);
    }
    /*
     * 发货
     * */
    @RequestMapping("outitem")
    @ResponseBody
    public int outitem(Integer id,String kdgs,String kddh){
        Order order = orderService.getOrder(id);
        order.setYuliub(kdgs);
        order.setYuliuc(kddh);
        order.setCode(2);
        orderService.updateOrder(order);
        return 1;
    }


    /*
    * 退货
    *
    * */
    @RequestMapping("backOrder")
    @ResponseBody
    public int backOrder(Integer id){
        Order order = orderService.getOrder(id);
        BackOrder backOrder = new BackOrder();
        backOrder.setAllprice(order.getAllprice());
        backOrder.setBackprice(order.getAllprice());
        backOrder.setOrdernum(order.getOrdernum());
        backOrder.setDate(new Date());
        backOrder.setUid(order.getUid());
        if(order.getCode()==1){
            backOrder.setCode(1);
        }else if(order.getCode()>1){
            backOrder.setCode(5);
        }
        backOrderService.saveBackOrder(backOrder);
        itemOrderService.updateItemOrder(id,backOrder.getId());
        order.setCode(6);
        for(ItemOrder io:itemOrderService.getItemOrderByOid(order.getId())){
            Details details = detailsService.getDetailsByIid(io.getIid());
            details.setKucun(details.getKucun()+io.getNum());
            detailsService.updateDetails(details);
        }

        return 1;
    }

}
