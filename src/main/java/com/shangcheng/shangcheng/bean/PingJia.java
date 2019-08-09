package com.shangcheng.shangcheng.bean;

import java.util.Date;

/**
 * 作者：王怀朋
 * 日期：2019/8/1
 */
public class PingJia {
    private Integer id;
    private String neirong;
    private String pname;
    private Integer iid;
    private Integer uid;
    private Date date;
    private Integer gb;
    public PingJia(){}

    public PingJia(Integer id, String neirong, String pname, Integer iid, Integer uid, Date date, Integer gb) {
        this.id = id;
        this.neirong = neirong;
        this.pname = pname;
        this.iid = iid;
        this.uid = uid;
        this.date = date;
        this.gb = gb;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getGb() {
        return gb;
    }

    public void setGb(Integer gb) {
        this.gb = gb;
    }

    @Override
    public String toString() {
        return "PingJia{" +
                "id=" + id +
                ", neirong='" + neirong + '\'' +
                ", pname='" + pname + '\'' +
                ", iid=" + iid +
                ", uid=" + uid +
                ", date=" + date +
                ", gb=" + gb +
                '}';
    }
}
