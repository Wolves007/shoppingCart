package com.westos.saasmarketing.marketingprogram.dto;

import java.util.List;

/**
 * 文件上传提交的表单数据
 * @author chen
 */
public class UploadMarketingDTO {

    /**
     * 对应表单提交的数据
     * */
    private String name;
    private String author;
    private String programImage;
    private int parentId;
    private int industryId;
    private List<Integer> list;
    private Double price;
    private String programFile;
    private String describtion;

    public UploadMarketingDTO() {
    }

    public UploadMarketingDTO(String name, String author, String programImage, int parentId, int industryId, List<Integer> list, Double price, String programFile, String describtion) {
        this.name = name;
        this.author = author;
        this.programImage = programImage;
        this.parentId = parentId;
        this.industryId = industryId;
        this.list = list;
        this.price = price;
        this.programFile = programFile;
        this.describtion = describtion;
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

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getIndustryId() {
        return industryId;
    }

    public void setIndustryId(int industryId) {
        this.industryId = industryId;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
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

    @Override
    public String toString() {
        return "UploadMarketingDTO{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", programImage='" + programImage + '\'' +
                ", parentId=" + parentId +
                ", industryId=" + industryId +
                ", list=" + list +
                ", price=" + price +
                ", programFile='" + programFile + '\'' +
                ", describtion='" + describtion + '\'' +
                '}';
    }
}
