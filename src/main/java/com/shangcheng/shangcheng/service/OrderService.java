package com.shangcheng.shangcheng.service;

import com.shangcheng.shangcheng.bean.Order;
import com.shangcheng.shangcheng.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/16
 */
@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public int saveOrder(Order order){
        return orderMapper.saveOrder(order);
    }
    public List<Order> getAllOrder(Integer uid){
        return orderMapper.getAllOrder(uid);
    }
    public List<Order> getOrderAll(){
        return orderMapper.getOrderAll();
    }
    public Order getOrder(Integer id){
        return orderMapper.getOrder(id);
    }
    public int delOrder(Integer id){
        return orderMapper.delOrder(id);
    }
    public int updateOrder(Order order){
        return orderMapper.updateOrder(order);
    }























}
