package com.shangcheng.shangcheng.mapper;

import com.shangcheng.shangcheng.bean.BackOrder;
import com.shangcheng.shangcheng.bean.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/16
 */
@Mapper
public interface BackOrderMapper {
    public int saveBackOrder(BackOrder backOrder);
    public List<Order> getAllBackOrder(Integer uid);
    public Order getBackOrder(Integer id);
    public int delBackOrder(Integer id);
    public int updateBackOrder(Order order);
    public List<Order> getBackOrderAll();
}
