package com.westos.saasmarketing.marketingprogram.domain;

import java.sql.Date;
import java.util.List;

/**
 * 营销方案表
 */
public class MarketingProgram {

    private int programid;
    private String name;
    private String author;
    private String programImage;
    private Double price;
    private String programFile;
    private String describtion;
    private Date publishTime;
    private String status;
    private int count;
    private String pay;
    private String checkStatus;

    public MarketingProgram() {
    }

    public MarketingProgram(int programid, String name, String author, String programImage, Double price, String programFile, String describtion, Date publishTime, String status, int count, String pay, String checkStatus) {
        this.programid = programid;
        this.name = name;
        this.author = author;
        this.programImage = programImage;
        this.price = price;
        this.programFile = programFile;
        this.describtion = describtion;
        this.publishTime = publishTime;
        this.status = status;
        this.count = count;
        this.pay = pay;
        this.checkStatus = checkStatus;
    }

    public int getProgramid() {
        return programid;
    }

    public void setProgramid(int programid) {
        this.programid = programid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getProgramImage() {
        return programImage;
    }

    public void setProgramImage(String programImage) {
        this.programImage = programImage;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProgramFile() {
        return programFile;
    }

    public void setProgramFile(String programFile) {
        this.programFile = programFile;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    @Override
    public String toString() {
        return "MarketingProgram{" +
                "programid=" + programid +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", programImage='" + programImage + '\'' +
                ", price=" + price +
                ", programFile='" + programFile + '\'' +
                ", describtion='" + describtion + '\'' +
                ", publishTime=" + publishTime +
                ", status='" + status + '\'' +
                ", count=" + count +
                ", pay='" + pay + '\'' +
                ", checkStatus='" + checkStatus + '\'' +
                '}';
    }
}
