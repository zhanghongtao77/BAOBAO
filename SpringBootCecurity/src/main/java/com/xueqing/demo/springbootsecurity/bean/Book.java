package com.xueqing.demo.springbootsecurity.bean;

import cn.afterturn.easypoi.excel.annotation.Excel;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "t_brand")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name="ID",orderNum = "0")
    private int id;

    @Column(name = "brand_id")
    @Excel(name="品牌编码",orderNum = "1")
    private int brand_id;

    @Column(name = "productionunit_id")
    @Excel(name="电梯生产单位编码",orderNum = "2")
    private int productionunit_id;

    @Column(name = "brand_name")
    @Excel(name="品牌名称",orderNum = "3")
    private String brand_name;

    @Column(name = "brand_describe")
    @Excel(name="品牌描述",orderNum = "4")
    private String brand_describe;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public int getProductionunit_id() {
        return productionunit_id;
    }

    public void setProductionunit_id(int productionunit_id) {
        this.productionunit_id = productionunit_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getBrand_describe() {
        return brand_describe;
    }

    public void setBrand_describe(String brand_describe) {
        this.brand_describe = brand_describe;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", brand_id=" + brand_id +
                ", productionunit_id=" + productionunit_id +
                ", brand_name='" + brand_name + '\'' +
                ", brand_describe='" + brand_describe + '\'' +
                '}';
    }
}
