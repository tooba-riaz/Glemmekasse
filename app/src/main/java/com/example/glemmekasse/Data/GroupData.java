package com.example.glemmekasse.Data;

import com.example.glemmekasse.Model.Groups;
import com.example.glemmekasse.Model.Notifications;
import com.example.glemmekasse.Model.Posts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupData {
    public static List<Groups> GroupsModelClassList;
    public static Map<String,Groups> dataItemMap;

    static {
        GroupsModelClassList=new ArrayList<>();
        dataItemMap=new HashMap<>();

        addItem(new Groups(
                "Khaadi","Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum"
        ));

        addItem(new Groups(
                "Khaadi","Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum"
        ));
        addItem(new Groups(
                "Khaadi","Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum"
        ));
        addItem(new Groups(
                "Khaadi","Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum"
        ));
        addItem(new Groups(
                "Khaadi","Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum Lorum Ipsum"
        ));


    }

    private static void addItem(Groups groups)
    {
        GroupsModelClassList.add(groups);
//        dataItemMap.put(posts.getFruitID(),posts);
    }
}
