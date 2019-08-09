package com.shangcheng.shangcheng.bean;

import java.math.BigDecimal;
import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/15
 */
public class ExItem extends Item{
    private Details details;
    private List<PingJia> pingjias;
    public ExItem(){}
    public ExItem(Details details, List<PingJia> pingjias) {
        this.details = details;
        this.pingjias = pingjias;
    }

    public ExItem(Integer id, String iname, BigDecimal inprice, BigDecimal outprice, String paddress, String beiyonga, String beiyongb, String beiyongc, Integer cid, Details details, List<PingJia> pingjias) {
        super(id, iname, inprice, outprice, paddress, beiyonga, beiyongb, beiyongc, cid);
        this.details = details;
        this.pingjias = pingjias;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public List<PingJia> getPingjias() {
        return pingjias;
    }

    public void setPingjias(List<PingJia> pingjias) {
        this.pingjias = pingjias;
    }

    @Override
    public String toString() {
        return "ExItem{" +
                "details=" + details +
                ", pingjias=" + pingjias +
                '}';
    }
}
