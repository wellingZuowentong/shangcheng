package com.shangcheng.shangcheng.service;

import com.shangcheng.shangcheng.bean.ItemOrder;
import com.shangcheng.shangcheng.mapper.ItemOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/8/4
 */
@Service
public class ItemOrderService {
    @Autowired
    private ItemOrderMapper itemOrderMapper;
    public int saveItemOrder(ItemOrder itemOrder){
        return itemOrderMapper.saveItemOrder(itemOrder);
    }
    public int updateItemOrder(Integer ooid,Integer oid){
        return  itemOrderMapper.updateItemOrder(ooid,oid);
    }
    public int delItemOrder(Integer oid){
        return itemOrderMapper.delItemOrder(oid);
    }
    public List<ItemOrder> getItemOrderByOid(Integer oid){
        return itemOrderMapper.getItemOrderByOid(oid);
    }
}
