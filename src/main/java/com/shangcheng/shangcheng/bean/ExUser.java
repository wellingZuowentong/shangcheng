package com.shangcheng.shangcheng.bean;

/**
 * 作者：王怀朋
 * 日期：2019/8/1
 */
public class ExUser {
    private Integer id;
    private String phone;
    private String address;
    private Integer uid;
    private Integer code;
    private String name;
    private String beizhu;
    public ExUser(){}

    public ExUser(Integer id, String phone, String address, Integer uid, Integer code, String name, String beizhu) {
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.uid = uid;
        this.code = code;
        this.name = name;
        this.beizhu = beizhu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    @Override
    public String toString() {
        return "ExUser{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", uid=" + uid +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", beizhu='" + beizhu + '\'' +
                '}';
    }
}
