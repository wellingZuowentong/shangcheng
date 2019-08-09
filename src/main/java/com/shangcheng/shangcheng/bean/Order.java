package com.shangcheng.shangcheng.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/15
 */

public class Order{
    private Integer id;
    private String ordernum;
    private BigDecimal allprice;
    private Integer uid;
    private Date date;
    private String nicheng;
    private Integer code;
    private String address;
    private String phone;
    private String yuliua;
    private String yuliub;
    private String yuliuc;
    private List<ItemOrder> itemOrders;
    public Order(){}

    public Order(Integer id, String ordernum, BigDecimal allprice, Integer uid, Date date, String nicheng, Integer code, String address, String phone, String yuliua, String yuliub, String yuliuc, List<ItemOrder> itemOrders) {
        this.id = id;
        this.ordernum = ordernum;
        this.allprice = allprice;
        this.uid = uid;
        this.date = date;
        this.nicheng = nicheng;
        this.code = code;
        this.address = address;
        this.phone = phone;
        this.yuliua = yuliua;
        this.yuliub = yuliub;
        this.yuliuc = yuliuc;
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

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNicheng() {
        return nicheng;
    }

    public void setNicheng(String nicheng) {
        this.nicheng = nicheng;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getYuliua() {
        return yuliua;
    }

    public void setYuliua(String yuliua) {
        this.yuliua = yuliua;
    }

    public String getYuliub() {
        return yuliub;
    }

    public void setYuliub(String yuliub) {
        this.yuliub = yuliub;
    }

    public String getYuliuc() {
        return yuliuc;
    }

    public void setYuliuc(String yuliuc) {
        this.yuliuc = yuliuc;
    }

    public List<ItemOrder> getItemOrders() {
        return itemOrders;
    }

    public void setItemOrders(List<ItemOrder> itemOrders) {
        this.itemOrders = itemOrders;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordernum='" + ordernum + '\'' +
                ", allprice=" + allprice +
                ", uid=" + uid +
                ", date=" + date +
                ", nicheng='" + nicheng + '\'' +
                ", code=" + code +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", yuliua='" + yuliua + '\'' +
                ", yuliub='" + yuliub + '\'' +
                ", yuliuc='" + yuliuc + '\'' +
                ", itemOrders=" + itemOrders +
                '}';
    }
}
