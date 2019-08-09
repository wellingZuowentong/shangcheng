package com.shangcheng.shangcheng.bean;

import java.math.BigDecimal;

/**
 * 作者：王怀朋
 * 日期：2019/8/2
 */
public class ItemOrder{
    private Integer id;
    private Integer num;
    private BigDecimal price;
    private Integer iid;
    private Integer uid;
    private Integer oid;
    private Item item;
    private Details details;
    private Integer boid;
    public ItemOrder(){}

    public ItemOrder(Integer id, Integer num, BigDecimal price, Integer iid, Integer uid, Integer oid, Item item, Details details, Integer boid) {
        this.id = id;
        this.num = num;
        this.price = price;
        this.iid = iid;
        this.uid = uid;
        this.oid = oid;
        this.item = item;
        this.details = details;
        this.boid = boid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public Integer getBoid() {
        return boid;
    }

    public void setBoid(Integer boid) {
        this.boid = boid;
    }

    @Override
    public String toString() {
        return "ItemOrder{" +
                "id=" + id +
                ", num=" + num +
                ", price=" + price +
                ", iid=" + iid +
                ", uid=" + uid +
                ", oid=" + oid +
                ", item=" + item +
                ", details=" + details +
                ", boid=" + boid +
                '}';
    }
}
