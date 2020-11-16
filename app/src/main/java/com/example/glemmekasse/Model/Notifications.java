package com.example.glemmekasse.Model;

import java.sql.Time;
import java.util.Date;

public class Notifications {

    private String notification;
//    private int profile_image;
//    private Date date;
//    private Time time;


    public Notifications()
    {

    }

    public Notifications(String notification) {
        this.notification = notification;
//        this.profile_image = profile_image;
//        this.date = date;
//        this.time = time;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

//    public int getProfile_image() {
//        return profile_image;
//    }
//
//    public void setProfile_image(int profile_image) {
//        this.profile_image = profile_image;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public Time getTime() {
//        return time;
//    }
//
//    public void setTime(Time time) {
//        this.time = time;
//    }
}
