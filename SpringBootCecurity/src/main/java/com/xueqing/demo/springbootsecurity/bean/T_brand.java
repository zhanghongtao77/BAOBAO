package com.xueqing.demo.springbootsecurity.bean;

public class T_brand {

    private int id;
    private int brand_id;
    private int productionunit_id;
    private String brand_name;
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
        return "T_brand{" +
                "id=" + id +
                ", brand_id=" + brand_id +
                ", productionunit_id=" + productionunit_id +
                ", brand_name='" + brand_name + '\'' +
                ", brand_describe='" + brand_describe + '\'' +
                '}';
    }
}
