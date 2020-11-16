package com.example.glemmekasse.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.glemmekasse.Model.GroupNotifications;
import com.example.glemmekasse.Model.Notifications;
import com.example.glemmekasse.R;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.MyViewHolder> {

private List<Notifications> mDataList;
private Context context;
public static final String ITEM_KEY="Item_key";

public NotificationAdapter(List<Notifications> mDataList, Context context) {
        this.mDataList = mDataList;
        this.context = context;
        }

@NonNull
@Override
public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.custom_notifi_layout,parent,false);
        return new MyViewHolder(view);
        }

@Override
public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

final Notifications NotiModelClass =mDataList.get(position);

        holder.user_name.setText(NotiModelClass.getNotification());

        }

@Override
public int getItemCount() {
        return mDataList.size();
        }

public static class MyViewHolder extends RecyclerView.ViewHolder{

    TextView user_name;
    View view;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        user_name=itemView.findViewById(R.id.notification_text);

        view=itemView;
    }
}
}

