package com.shangcheng.shangcheng.bean;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/15
 */
public class ExCategory extends Category {
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ExCategory{" +
                "items=" + items +
                '}';
    }
}
