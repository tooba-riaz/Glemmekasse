package com.example.glemmekasse.Model;

import java.util.UUID;

public class Posts {
    private String school_name,post_description;
    //private int post_image;


    public Posts()
    {

    }

    public Posts(String school_name, String post_description) {
        this.school_name = school_name;
        this.post_description = post_description;
      //  this.post_image = post_image;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getPost_description() {
        return post_description;
    }

    public void setPost_description(String post_description) {
        this.post_description = post_description;
    }
//
//    public int getPost_image() {
//        return post_image;
//    }
//
//    public void setPost_image(int post_image) {
//        this.post_image = post_image;
//    }
}
