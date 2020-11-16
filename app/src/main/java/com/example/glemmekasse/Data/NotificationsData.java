package com.example.glemmekasse.Data;

import com.example.glemmekasse.Model.GroupNotifications;
import com.example.glemmekasse.Model.Notifications;
import com.example.glemmekasse.Model.Posts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationsData {
    public static List<Notifications> NotiModelClassList;
    public static Map<String,Notifications> dataItemMap;

    static {
        NotiModelClassList=new ArrayList<>();
        dataItemMap=new HashMap<>();

        addItem(new Notifications(
                "Tahir posted in Gosford Hill School"
        ));
        addItem(new Notifications(
                "Tahir posted in Gosford Hill School"
        ));
        addItem(new Notifications(
                "Tahir posted in Gosford Hill School"
        ));
        addItem(new Notifications(
                "Tahir posted in Gosford Hill School"
        ));
        addItem(new Notifications(
                "Tahir posted in Gosford Hill School"
        ));
        addItem(new Notifications(
                "Tahir posted in Gosford Hill School"
        ));



    }

    private static void addItem(Notifications notifications)
    {
        NotiModelClassList.add(notifications);
//        dataItemMap.put(posts.getFruitID(),posts);
    }
}
