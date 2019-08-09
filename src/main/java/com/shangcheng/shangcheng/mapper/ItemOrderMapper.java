package com.shangcheng.shangcheng.mapper;

import com.shangcheng.shangcheng.bean.ItemOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/8/4
 */
@Mapper
public interface ItemOrderMapper {
    public int saveItemOrder(ItemOrder itemOrder);
    public int updateItemOrder(@Param("oid") Integer oid,@Param("boid") Integer boid);
    public int delItemOrder(Integer oid);
    public List<ItemOrder> getItemOrderByOid(Integer oid);
    public int updateItemOrderPj(@Param("id")Integer id,@Param("pj")Integer pj);
    public ItemOrder getItemOrderById(Integer id);
}
