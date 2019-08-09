package com.shangcheng.shangcheng.mapper;

import com.shangcheng.shangcheng.bean.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/16
 */
@Mapper
public interface OrderMapper {
    public int saveOrder(Order order);
    public List<Order> getAllOrder(Integer uid);
    public Order getOrder(Integer id);
    public int delOrder(Integer id);
    public int updateOrder(Order order);
    public List<Order> getOrderAll();
}
