package com.shangcheng.shangcheng.bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/8/7
 */
public class BackOrder {
    private Integer id;
    private String ordernum;
    private BigDecimal allprice;
    private Date date;
    private Integer uid;
    private Integer code;
    private BigDecimal backprice;
    private String yla;
    private String ylb;
    private String ylc;
    private List<ItemOrder> itemOrders;
    public BackOrder(){}

    public BackOrder(Integer id, String ordernum, BigDecimal allprice, Date date, Integer uid, Integer code, BigDecimal backprice, String yla, String ylb, String ylc, List<ItemOrder> itemOrders) {
        this.id = id;
        this.ordernum = ordernum;
        this.allprice = allprice;
        this.date = date;
        this.uid = uid;
        this.code = code;
        this.backprice = backprice;
        this.yla = yla;
        this.ylb = ylb;
        this.ylc = ylc;
        this.itemOrders = itemOrders;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getAllprice() {
        return allprice;
    }

    public void setAllprice(BigDecimal allprice) {
        this.allprice = allprice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BigDecimal getBackprice() {
        return backprice;
    }

    public void setBackprice(BigDecimal backprice) {
        this.backprice = backprice;
    }

    public String getYla() {
        return yla;
    }

    public void setYla(String yla) {
        this.yla = yla;
    }

    public String getYlb() {
        return ylb;
    }

    public void setYlb(String ylb) {
        this.ylb = ylb;
    }

    public String getYlc() {
        return ylc;
    }

    public void setYlc(String ylc) {
        this.ylc = ylc;
    }

    public List<ItemOrder> getItemOrders() {
        return itemOrders;
    }

    public void setItemOrders(List<ItemOrder> itemOrders) {
        this.itemOrders = itemOrders;
    }

    @Override
    public String toString() {
        return "BackOrder{" +
                "id=" + id +
                ", ordernum='" + ordernum + '\'' +
                ", allprice=" + allprice +
                ", date=" + date +
                ", uid=" + uid +
                ", code=" + code +
                ", backprice=" + backprice +
                ", yla='" + yla + '\'' +
                ", ylb='" + ylb + '\'' +
                ", ylc='" + ylc + '\'' +
                ", itemOrders=" + itemOrders +
                '}';
    }
}
