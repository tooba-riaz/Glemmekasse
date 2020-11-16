package com.example.glemmekasse.Model;

public class GroupNotifications {

    private String group_name;
    //private int group_profile_image;


    public GroupNotifications()
    {

    }

    public GroupNotifications(String group_name) {
        this.group_name = group_name;
       // this.group_profile_image = group_profile_image;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

   // public int getGroup_profile_image() {
       // return group_profile_image;
    //}

//    public void setGroup_profile_image(int group_profile_image) {
//        this.group_profile_image = group_profile_image;
//    }
}
