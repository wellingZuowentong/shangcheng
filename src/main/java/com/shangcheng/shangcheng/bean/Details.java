package com.shangcheng.shangcheng.bean;

import java.math.BigDecimal;

/**
 * 作者：王怀朋
 * 日期：2019/7/15
 */
public class Details {
    private Integer id;
    private String guige;
    private String canshu;
    private String daddress;
    private String huodong;
    private Integer xiaoliang;
    private Integer kucun;
    private BigDecimal kuaidi;
    private Integer iid;
    public Details(){}
    public Details(Integer id, String guige, String canshu, String daddress, String huodong, Integer xiaoliang, Integer kucun, BigDecimal kuaidi, Integer iid) {
        this.id = id;
        this.guige = guige;
        this.canshu = canshu;
        this.daddress = daddress;
        this.huodong = huodong;
        this.xiaoliang = xiaoliang;
        this.kucun = kucun;
        this.kuaidi = kuaidi;
        this.iid = iid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGuige() {
        return guige;
    }

    public void setGuige(String guige) {
        this.guige = guige;
    }

    public String getCanshu() {
        return canshu;
    }

    public void setCanshu(String canshu) {
        this.canshu = canshu;
    }

    public String getDaddress() {
        return daddress;
    }

    public void setDaddress(String daddress) {
        this.daddress = daddress;
    }

    public String getHuodong() {
        return huodong;
    }

    public void setHuodong(String huodong) {
        this.huodong = huodong;
    }

    public Integer getXiaoliang() {
        return xiaoliang;
    }

    public void setXiaoliang(Integer xiaoliang) {
        this.xiaoliang = xiaoliang;
    }

    public Integer getKucun() {
        return kucun;
    }

    public void setKucun(Integer kucun) {
        this.kucun = kucun;
    }

    public BigDecimal getKuaidi() {
        return kuaidi;
    }

    public void setKuaidi(BigDecimal kuaidi) {
        this.kuaidi = kuaidi;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", guige='" + guige + '\'' +
                ", canshu='" + canshu + '\'' +
                ", daddress='" + daddress + '\'' +
                ", huodong='" + huodong + '\'' +
                ", xiaoliang=" + xiaoliang +
                ", kucun=" + kucun +
                ", kuaidi=" + kuaidi +
                ", iid=" + iid +
                '}';
    }
}
