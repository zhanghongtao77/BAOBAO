package com.xueqing.demo.springbootsecurity.bean;

public class T_weibaopersonunit {

    private int id;
    private int wbdwPersonnel_Code;
    private int wbdwcode;
    private String wbdwryname;
    private String wbdwryphone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWbdwPersonnel_Code() {
        return wbdwPersonnel_Code;
    }

    public void setWbdwPersonnel_Code(int wbdwPersonnel_Code) {
        this.wbdwPersonnel_Code = wbdwPersonnel_Code;
    }

    public int getWbdwcode() {
        return wbdwcode;
    }

    public void setWbdwcode(int wbdwcode) {
        this.wbdwcode = wbdwcode;
    }

    public String getWbdwryname() {
        return wbdwryname;
    }

    public void setWbdwryname(String wbdwryname) {
        this.wbdwryname = wbdwryname;
    }

    public String getWbdwryphone() {
        return wbdwryphone;
    }

    public void setWbdwryphone(String wbdwryphone) {
        this.wbdwryphone = wbdwryphone;
    }

    @Override
    public String toString() {
        return "T_weibaopersonunit{" +
                "id=" + id +
                ", wbdwPersonnel_Code=" + wbdwPersonnel_Code +
                ", wbdwcode=" + wbdwcode +
                ", wbdwryname='" + wbdwryname + '\'' +
                ", wbdwryphone='" + wbdwryphone + '\'' +
                '}';
    }
}
