package com.shangcheng.shangcheng.service;

import com.shangcheng.shangcheng.bean.BackOrder;
import com.shangcheng.shangcheng.bean.Order;
import com.shangcheng.shangcheng.mapper.BackOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/8/7
 */
@Service
public class BackOrderService {
    @Autowired
    private BackOrderMapper backOrderMapper;
    public int saveBackOrder(BackOrder backOrder){
        return backOrderMapper.saveBackOrder(backOrder);
    }
    public List<Order> getAllBackOrder(Integer uid){
        return backOrderMapper.getAllBackOrder(uid);
    }
    public Order getBackOrder(Integer id){
        return backOrderMapper.getBackOrder(id);
    }
    public int delBackOrder(Integer id){
        return backOrderMapper.delBackOrder(id);
    }
    public int updateBackOrder(Order order){
        return backOrderMapper.updateBackOrder(order);
    }
    public List<Order> getBackOrderAll(){
        return backOrderMapper.getBackOrderAll();
    }
}
