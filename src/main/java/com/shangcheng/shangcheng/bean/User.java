package com.shangcheng.shangcheng.bean;

/**
 * 作者：王怀朋
 * 日期：2019/7/15
 */
public class User {
    private Integer id;
    private String username;
    private String touxiang;
    private String weizhi;
    private String openid;
    public User(){}
    public User(Integer id, String username, String touxiang, String weizhi, String openid) {
        this.id = id;
        this.username = username;
        this.touxiang = touxiang;
        this.weizhi = weizhi;
        this.openid = openid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTouxiang() {
        return touxiang;
    }

    public void setTouxiang(String touxiang) {
        this.touxiang = touxiang;
    }

    public String getWeizhi() {
        return weizhi;
    }

    public void setWeizhi(String weizhi) {
        this.weizhi = weizhi;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", touxiang='" + touxiang + '\'' +
                ", weizhi='" + weizhi + '\'' +
                ", openid='" + openid + '\'' +
                '}';
    }
}
