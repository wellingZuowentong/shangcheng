package com.shangcheng.shangcheng.mapper;

import com.shangcheng.shangcheng.bean.ExCategory;
import com.shangcheng.shangcheng.bean.ExItem;
import com.shangcheng.shangcheng.bean.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/11
 */
@Mapper
public interface ItemMapper {
    public int saveItem(Item item);
    public List<Item> getAllItems();
    public List<Item> getAllItemsByName(String name);
    public Item getItem(Integer id);
    public int updateItem(Item item);
    public int delItem(Integer id);
    public List<ExCategory> getAllExCategory();
    public ExItem getExItem(Integer id);
    public List<Item> getItemByName(String name);
}
