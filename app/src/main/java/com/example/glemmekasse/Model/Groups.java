package com.example.glemmekasse.Model;

public class Groups {
    private String Group_name,Group_description;
   // private int group_profile_image;


    public Groups()
    {

    }

    public Groups(String group_name, String group_description) {
        Group_name = group_name;
        Group_description = group_description;
        //this.group_profile_image = group_profile_image;
    }

    public String getGroup_name() {
        return Group_name;
    }

    public void setGroup_name(String group_name) {
        Group_name = group_name;
    }

    public String getGroup_description() {
        return Group_description;
    }

    public void setGroup_description(String group_description) {
        Group_description = group_description;
    }

//    public int getGroup_profile_image() {
//        return group_profile_image;
//    }
//
//    public void setGroup_profile_image(int group_profile_image) {
//        this.group_profile_image = group_profile_image;
//    }
}
