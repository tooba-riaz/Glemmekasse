package com.example.glemmekasse.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.glemmekasse.Model.Groups;
import com.example.glemmekasse.Model.Notifications;
import com.example.glemmekasse.R;

import java.util.List;

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.MyViewHolder> {

private List<Groups> mDataList;
private Context context;
public static final String ITEM_KEY="Item_key";

public GroupAdapter(List<Groups> mDataList, Context context) {
        this.mDataList = mDataList;
        this.context = context;
        }

@NonNull
@Override
public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.custom_group_layout,parent,false);
        return new MyViewHolder(view);
        }

@Override
public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

final Groups NotiModelClass =mDataList.get(position);

        holder.group_name.setText(NotiModelClass.getGroup_name());

        }

@Override
public int getItemCount() {
        return mDataList.size();
        }

public static class MyViewHolder extends RecyclerView.ViewHolder{

    TextView group_name;
    View view;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        group_name=itemView.findViewById(R.id.group_name);

        view=itemView;
    }
}
}

