package com.mmall.vo;

import java.math.BigDecimal;


public class ProductListVo {

    private Integer id;
    private Integer categoryId;
    private String name;
    private String subtitle;
    private String mainImage;
    private BigDecimal price;
    private Integer status;
    private String imageHost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductListVo{");
        sb.append("id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", subtitle='").append(subtitle).append('\'');
        sb.append(", mainImage='").append(mainImage).append('\'');
        sb.append(", price=").append(price);
        sb.append(", status=").append(status);
        sb.append(", imageHost='").append(imageHost).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
