package com.demo.film.model;

import java.util.Date;

public class CustomerInfo {
    private Long id;

    private String name;

    private String telephone;

    private String address;

    private Boolean iscompute;

    private Boolean broadband;

    private Boolean broadbandsatisfy;

    private Boolean isbroadbandfusion;

    private Float broadbandprice;

    private String broadbandendtime;

    private Boolean tv;

    private Boolean tvsatisfy;

    private Float tvprice;

    private String tvendtime;

    private Long districtId;

    private Long usernameId;

    private Date datetime;

    private Boolean isdelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Boolean getIscompute() {
        return iscompute;
    }

    public void setIscompute(Boolean iscompute) {
        this.iscompute = iscompute;
    }

    public Boolean getBroadband() {
        return broadband;
    }

    public void setBroadband(Boolean broadband) {
        this.broadband = broadband;
    }

    public Boolean getBroadbandsatisfy() {
        return broadbandsatisfy;
    }

    public void setBroadbandsatisfy(Boolean broadbandsatisfy) {
        this.broadbandsatisfy = broadbandsatisfy;
    }

    public Boolean getIsbroadbandfusion() {
        return isbroadbandfusion;
    }

    public void setIsbroadbandfusion(Boolean isbroadbandfusion) {
        this.isbroadbandfusion = isbroadbandfusion;
    }

    public Float getBroadbandprice() {
        return broadbandprice;
    }

    public void setBroadbandprice(Float broadbandprice) {
        this.broadbandprice = broadbandprice;
    }

    public String getBroadbandendtime() {
        return broadbandendtime;
    }

    public void setBroadbandendtime(String broadbandendtime) {
        this.broadbandendtime = broadbandendtime == null ? null : broadbandendtime.trim();
    }

    public Boolean getTv() {
        return tv;
    }

    public void setTv(Boolean tv) {
        this.tv = tv;
    }

    public Boolean getTvsatisfy() {
        return tvsatisfy;
    }

    public void setTvsatisfy(Boolean tvsatisfy) {
        this.tvsatisfy = tvsatisfy;
    }

    public Float getTvprice() {
        return tvprice;
    }

    public void setTvprice(Float tvprice) {
        this.tvprice = tvprice;
    }

    public String getTvendtime() {
        return tvendtime;
    }

    public void setTvendtime(String tvendtime) {
        this.tvendtime = tvendtime == null ? null : tvendtime.trim();
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getUsernameId() {
        return usernameId;
    }

    public void setUsernameId(Long usernameId) {
        this.usernameId = usernameId;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }
}