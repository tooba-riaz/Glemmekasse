package com.example.glemmekasse.Data;

import com.example.glemmekasse.Model.Posts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostsData{

    public static List<Posts> postsModelClassList;
    public static Map<String,Posts> dataItemMap;

    static {
        postsModelClassList=new ArrayList<>();
        dataItemMap=new HashMap<>();

        addItem(new Posts(
                "Gosford Hill School","I found this on desk in 9th class"
        ));

        addItem(new Posts(
                "Gosford Hill School","I found this on desk in 9th class"
        ));
        addItem(new Posts(
               "Gosford Hill School","I found this on desk in 9th class"
        ));
        addItem(new Posts(
                "Gosford Hill School","I found this on desk in 9th class"
        ));
        addItem(new Posts(
                "Gosford Hill School","I found this on desk in 9th class"
        ));

        addItem(new Posts(
               "Gosford Hill School","I found this on desk in 9th class"
        ));
        addItem(new Posts(
                "Gosford Hill School","I found this on desk in 9th class"
        ));

        addItem(new Posts(
               "Gosford Hill School","I found this on desk in 9th class"
        ));

    }

    private static void addItem(Posts posts)
    {
        postsModelClassList.add(posts);
//        dataItemMap.put(posts.getFruitID(),posts);
    }
}
