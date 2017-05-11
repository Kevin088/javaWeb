package com.demo.film.model;

public class Sysuser {
    private Integer id;

    private String username;

    private String password;

    private Integer roleId;

    private Integer districtId;

    private Boolean sex;

    private String birthday;

    private String marryinfo;

    private String school;

    private String xueli;

    private String zzmm;

    private String telephone;

    private String telephoneDianxin;

    private String webnet;

    private String chengbaopianqu;

    private String worktimestart;

    private String worktimeend;

    private String doorcode;

    private String cashpledge;

    private Boolean isdelete;

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
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getMarryinfo() {
        return marryinfo;
    }

    public void setMarryinfo(String marryinfo) {
        this.marryinfo = marryinfo == null ? null : marryinfo.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli == null ? null : xueli.trim();
    }

    public String getZzmm() {
        return zzmm;
    }

    public void setZzmm(String zzmm) {
        this.zzmm = zzmm == null ? null : zzmm.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getTelephoneDianxin() {
        return telephoneDianxin;
    }

    public void setTelephoneDianxin(String telephoneDianxin) {
        this.telephoneDianxin = telephoneDianxin == null ? null : telephoneDianxin.trim();
    }

    public String getWebnet() {
        return webnet;
    }

    public void setWebnet(String webnet) {
        this.webnet = webnet == null ? null : webnet.trim();
    }

    public String getChengbaopianqu() {
        return chengbaopianqu;
    }

    public void setChengbaopianqu(String chengbaopianqu) {
        this.chengbaopianqu = chengbaopianqu == null ? null : chengbaopianqu.trim();
    }

    public String getWorktimestart() {
        return worktimestart;
    }

    public void setWorktimestart(String worktimestart) {
        this.worktimestart = worktimestart == null ? null : worktimestart.trim();
    }

    public String getWorktimeend() {
        return worktimeend;
    }

    public void setWorktimeend(String worktimeend) {
        this.worktimeend = worktimeend == null ? null : worktimeend.trim();
    }

    public String getDoorcode() {
        return doorcode;
    }

    public void setDoorcode(String doorcode) {
        this.doorcode = doorcode == null ? null : doorcode.trim();
    }

    public String getCashpledge() {
        return cashpledge;
    }

    public void setCashpledge(String cashpledge) {
        this.cashpledge = cashpledge == null ? null : cashpledge.trim();
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }
}