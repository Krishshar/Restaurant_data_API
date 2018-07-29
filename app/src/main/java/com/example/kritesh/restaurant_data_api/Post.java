package com.example.kritesh.restaurant_data_api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kritesh on 29/7/18.
 */

public class Post {
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getResname() {
        return resname;
    }

    public void setResname(String resname) {
        this.resname = resname;
    }

    public String getRestype() {
        return restype;
    }

    public void setRestype(String restype) {
        this.restype = restype;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @SerializedName("fname")
    @Expose
    private String fname;
    @SerializedName("lname")
    @Expose
    private String lname;
    @SerializedName("phno")
    @Expose
    private String phno;
    @SerializedName("add")
    @Expose
    private String add;
    @SerializedName("resname")
    @Expose
    private String resname;
    @SerializedName("restype")
    @Expose
    private String restype;
    private Integer userId;
    @SerializedName("id")
    @Expose
    private Integer id;

    @Override
    public String toString() {
        return "com.example.kritesh.restaurant_data_api.Post{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", phno='" + phno + '\'' +
                ", add='" + add + '\'' +
                ", resname='" + resname + '\'' +
                ", restype='" + restype + '\'' +
                ", userId=" + userId +
                ", id=" + id +
                '}';
    }
}
