package com.example.glemmekasse.Data;

import com.example.glemmekasse.Model.Groups;
import com.example.glemmekasse.Model.GroupsDiscover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupDiscoverData {
    public static List<GroupsDiscover> GroupsDiscoverModelClassList;
    public static Map<String,GroupsDiscover> dataItemMap;

    static {
        GroupsDiscoverModelClassList=new ArrayList<>();
        dataItemMap=new HashMap<>();

        addItem(new GroupsDiscover(
                "Khaadi","Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum"
        ));
        addItem(new GroupsDiscover(
                "Charcoal","Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum"
        ));
        addItem(new GroupsDiscover(
                "Khaadi","Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum"
        ));
        addItem(new GroupsDiscover(
                "Cougar","Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum"
        ));
        addItem(new GroupsDiscover(
                "Khaadi","Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum"
        ));
        addItem(new GroupsDiscover(
                "Outfitters","Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum"
        ));
        addItem(new GroupsDiscover(
                "Khaadi","Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum"
        ));
        addItem(new GroupsDiscover(
                "Royal Tag","Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum"
        ));




    }

    private static void addItem(GroupsDiscover groupsDiscover)
    {
        GroupsDiscoverModelClassList.add(groupsDiscover);
//        dataItemMap.put(posts.getFruitID(),posts);
    }
}
