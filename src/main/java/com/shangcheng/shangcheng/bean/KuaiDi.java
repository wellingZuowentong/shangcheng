package com.shangcheng.shangcheng.bean;

/**
 * 作者：王怀朋
 * 日期：2019/8/9
 */
public class KuaiDi {
    private Integer id;
    private String name;
    private String mark;
    public KuaiDi(){}
    public KuaiDi(Integer id, String name, String mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "KuaiDi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
