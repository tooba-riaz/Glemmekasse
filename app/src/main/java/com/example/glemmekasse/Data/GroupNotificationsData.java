package com.example.glemmekasse.Data;

import com.example.glemmekasse.Model.GroupNotifications;
import com.example.glemmekasse.Model.Posts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupNotificationsData {
    public static List<GroupNotifications> NotiModelClassList;
    public static Map<String,GroupNotifications> dataItemMap;

    static {
        NotiModelClassList=new ArrayList<>();
        dataItemMap=new HashMap<>();

        addItem(new GroupNotifications(
                "Paul Walker"
        ));
        addItem(new GroupNotifications(
                "Paul Walker"
        ));




    }

    private static void addItem(GroupNotifications notifications)
    {
        NotiModelClassList.add(notifications);
//        dataItemMap.put(posts.getFruitID(),posts);
    }
}
