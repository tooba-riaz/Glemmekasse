package com.example.glemmekasse.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.glemmekasse.Adapter.GroupAdapter;
import com.example.glemmekasse.Adapter.NotificationAdapter;
import com.example.glemmekasse.Data.GroupData;
import com.example.glemmekasse.Data.NotificationsData;
import com.example.glemmekasse.Model.GroupNotifications;
import com.example.glemmekasse.Model.Groups;
import com.example.glemmekasse.Model.Notifications;
import com.example.glemmekasse.R;

import java.util.List;

public class YourGroup extends AppCompatActivity {

    private ImageView back_button;
    private RecyclerView groupRecyclerView;
    private List<Groups> groupDataList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_group);

        back_button=findViewById(R.id.back_button);

        groupRecyclerView=findViewById(R.id.groups);
        groupDataList= GroupData.GroupsModelClassList;

        LinearLayoutManager manager2=new LinearLayoutManager(YourGroup.this);
        groupRecyclerView.setLayoutManager(manager2);

        GroupAdapter adapter=new GroupAdapter(groupDataList,YourGroup.this);
        groupRecyclerView.setAdapter(adapter);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}