package com.example.glemmekasse.Model;

public class GroupsDiscover {
    private String group_name,group_discription;


    public GroupsDiscover()
    {

    }

    public GroupsDiscover(String group_name, String group_discription) {
        this.group_name = group_name;
        this.group_discription = group_discription;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getGroup_discription() {
        return group_discription;
    }

    public void setGroup_discription(String group_discription) {
        this.group_discription = group_discription;
    }
}
