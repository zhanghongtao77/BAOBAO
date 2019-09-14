package com.xueqing.demo.springbootsecurity.bean;

public class T_productionunit {

    private int id;
    private int productionunit_id;
    private String productionunit_name;
    private String productionunit_permit;
    private String productionunit_address;
    private String contact;
    private String duty;
    private String duty_name;
    private String factory_upper;
    private String factory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductionunit_id() {
        return productionunit_id;
    }

    public void setProductionunit_id(int productionunit_id) {
        this.productionunit_id = productionunit_id;
    }

    public String getProductionunit_name() {
        return productionunit_name;
    }

    public void setProductionunit_name(String productionunit_name) {
        this.productionunit_name = productionunit_name;
    }

    public String getProductionunit_permit() {
        return productionunit_permit;
    }

    public void setProductionunit_permit(String productionunit_permit) {
        this.productionunit_permit = productionunit_permit;
    }

    public String getProductionunit_address() {
        return productionunit_address;
    }

    public void setProductionunit_address(String productionunit_address) {
        this.productionunit_address = productionunit_address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getDuty_name() {
        return duty_name;
    }

    public void setDuty_name(String duty_name) {
        this.duty_name = duty_name;
    }

    public String getFactory_upper() {
        return factory_upper;
    }

    public void setFactory_upper(String factory_upper) {
        this.factory_upper = factory_upper;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    @Override
    public String toString() {
        return "T_productionunit{" +
                "id=" + id +
                ", productionunit_id=" + productionunit_id +
                ", productionunit_name='" + productionunit_name + '\'' +
                ", productionunit_permit='" + productionunit_permit + '\'' +
                ", productionunit_address='" + productionunit_address + '\'' +
                ", contact='" + contact + '\'' +
                ", duty='" + duty + '\'' +
                ", duty_name='" + duty_name + '\'' +
                ", factory_upper='" + factory_upper + '\'' +
                ", factory='" + factory + '\'' +
                '}';
    }
}
