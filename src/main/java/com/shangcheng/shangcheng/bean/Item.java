package com.shangcheng.shangcheng.bean;

import java.math.BigDecimal;

/**
 * 作者：王怀朋
 * 日期：b0a9/7/aa
 */
public class Item {
    private Integer id;
    private String iname;
    private BigDecimal inprice;
    private BigDecimal outprice;
    private String paddress;
    private String beiyonga;
    private String beiyongb;
    private String beiyongc;
    private Integer cid;
    public Item(){}

    public Item(Integer id, String iname, BigDecimal inprice, BigDecimal outprice, String paddress, String beiyonga, String beiyongb, String beiyongc, Integer cid) {
        this.id = id;
        this.iname = iname;
        this.inprice = inprice;
        this.outprice = outprice;
        this.paddress = paddress;
        this.beiyonga = beiyonga;
        this.beiyongb = beiyongb;
        this.beiyongc = beiyongc;
        this.cid = cid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public BigDecimal getInprice() {
        return inprice;
    }

    public void setInprice(BigDecimal inprice) {
        this.inprice = inprice;
    }

    public BigDecimal getOutprice() {
        return outprice;
    }

    public void setOutprice(BigDecimal outprice) {
        this.outprice = outprice;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }

    public String getBeiyonga() {
        return beiyonga;
    }

    public void setBeiyonga(String beiyonga) {
        this.beiyonga = beiyonga;
    }

    public String getBeiyongb() {
        return beiyongb;
    }

    public void setBeiyongb(String beiyongb) {
        this.beiyongb = beiyongb;
    }

    public String getBeiyongc() {
        return beiyongc;
    }

    public void setBeiyongc(String beiyongc) {
        this.beiyongc = beiyongc;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", iname='" + iname + '\'' +
                ", inprice=" + inprice +
                ", outprice=" + outprice +
                ", paddress='" + paddress + '\'' +
                ", beiyonga='" + beiyonga + '\'' +
                ", beiyongb='" + beiyongb + '\'' +
                ", beiyongc='" + beiyongc + '\'' +
                ", cid=" + cid +
                '}';
    }
}


