package com.westos.saasmarketing.marketingprogram.domain;

import java.util.Date;

public class User {

    private long qiyeid;
    private long industryid;
    private long areaid;
    private String company_name;
    private String name;
    private String telephone;
    private String licence_image;
    private String flag;
    private java.sql.Date register_time;
    private java.sql.Date end_time;
    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getQiyeid() {
        return qiyeid;
    }

    public void setQiyeid(long qiyeid) {
        this.qiyeid = qiyeid;
    }

    public long getIndustryid() {
        return industryid;
    }

    public void setIndustryid(long industryid) {
        this.industryid = industryid;
    }

    public long getAreaid() {
        return areaid;
    }

    public void setAreaid(long areaid) {
        this.areaid = areaid;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLicence_image() {
        return licence_image;
    }

    public void setLicence_image(String licence_image) {
        this.licence_image = licence_image;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public java.sql.Date getRegister_time() {
        return register_time;
    }

    public void setRegister_time(java.sql.Date register_time) {
        this.register_time = register_time;
    }

    public java.sql.Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(java.sql.Date end_time) {
        this.end_time = end_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "qiyeid=" + qiyeid +
                ", industryid=" + industryid +
                ", areaid=" + areaid +
                ", company_name='" + company_name + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", licence_image='" + licence_image + '\'' +
                ", flag='" + flag + '\'' +
                ", register_time=" + register_time +
                ", end_time=" + end_time +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
