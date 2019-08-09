/*
package com.shangcheng.shangcheng.controller;

import com.shangcheng.shangcheng.bean.Car;
import com.shangcheng.shangcheng.bean.ExOrder;
import com.shangcheng.shangcheng.bean.Item;
import com.shangcheng.shangcheng.service.CarService;
import com.shangcheng.shangcheng.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

*/
/**
 * 作者：王怀朋
 * 日期：2019/7/16
 *//*

@Controller
public class CarController {
    @Autowired
    private CarService carService;
    @Autowired
    private ItemService itemService;
   */
/* @RequestMapping("getCarByUid")
    @ResponseBody
    public Car getCarByUid(Integer uid){
        Car car = carService.getCarByUid(uid);
        List<ExOrder> list = car.getOrders();
        for(ExOrder ex:list) {
            Integer iid = ex.getIid();
            Item item = itemService.getItem(iid);
            ex.setItme(item);
        }
        return car;
    }*//*

}
*/
