package com.done.model;

import java.util.Date;

/**
 * Pub generated by MyEclipse Persistence Tools
 */

public class Pub implements java.io.Serializable {

    // Fields

    private Integer id;

    private String title;

    private String msg;

    private Date date;

    private String userId;

    private String userName;

    // Constructors

    /** default constructor */
    public Pub() {
    }

    /** minimal constructor */
    public Pub(Integer id, String title, String msg, Date date, String userId) {
        this.id = id;
        this.title = title;
        this.msg = msg;
        this.date = date;
        this.userId = userId;
    }

    /** full constructor */
    public Pub(Integer id, String title, String msg, Date date, String userId, String userName) {
        this.id = id;
        this.title = title;
        this.msg = msg;
        this.date = date;
        this.userId = userId;
        this.userName = userName;
    }

    // Property accessors

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}