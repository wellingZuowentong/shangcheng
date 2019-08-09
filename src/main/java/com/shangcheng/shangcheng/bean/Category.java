package com.shangcheng.shangcheng.bean;

/**
 * 作者：王怀朋
 * 日期：2019/7/15
 */
public class Category {
    private Integer id;
    private String cname;
    private String ishaveChild;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", ishaveChild='" + ishaveChild + '\'' +
                '}';
    }

    public String getIshaveChild() {
        return ishaveChild;
    }

    public void setIshaveChild(String ishaveChild) {
        this.ishaveChild = ishaveChild;
    }

    public Category(){}

    public Category(Integer id, String cname) {
        this.id = id;
        this.cname = cname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

}
