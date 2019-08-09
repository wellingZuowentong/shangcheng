package com.shangcheng.shangcheng.service;

import com.shangcheng.shangcheng.bean.ExCategory;
import com.shangcheng.shangcheng.bean.ExItem;
import com.shangcheng.shangcheng.bean.Item;
import com.shangcheng.shangcheng.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/11
 */
@Service
public class ItemService {
    @Autowired
    private ItemMapper itemMapper;
    public List<Item> getAllItems(){
      return itemMapper.getAllItems();
    };
    public Item getItem(Integer id){
        return itemMapper.getItem(id);
    }
    public List<Item> getAllItemsByName(String name){
        return itemMapper.getAllItemsByName(name);
    }
    public int saveItem(Item item){
        return itemMapper.saveItem(item);
    }
    public int updateItem(Item item){
        return itemMapper.updateItem(item);
    }
    public int delItem(Integer id){
        return itemMapper.delItem(id);
    }
    public List<ExCategory> getAllExCategory(){
        return itemMapper.getAllExCategory();
    }
    public ExItem getExItem(Integer id){
        return itemMapper.getExItem(id);
    }
}
