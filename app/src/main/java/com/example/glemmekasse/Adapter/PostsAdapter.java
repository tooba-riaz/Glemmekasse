package com.example.glemmekasse.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.glemmekasse.Model.Posts;
import com.example.glemmekasse.R;
import com.example.glemmekasse.views.EditPostFragment;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.MyViewHolder> {

private List<Posts> mDataList;
private Context context;
public static final String ITEM_KEY="Item_key";

public PostsAdapter(List<Posts> mDataList, Context context) {
        this.mDataList = mDataList;
        this.context = context;
        }

@NonNull
@Override
public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.custom_post_layout,parent,false);
        return new MyViewHolder(view);
        }

@Override
public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

final Posts postsModelClass=mDataList.get(position);

        holder.school_name.setText(postsModelClass.getSchool_name());
        holder.description.setText(postsModelClass.getPost_description());

        holder.option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditPostFragment editPostFragment=new EditPostFragment();
                editPostFragment.show(((FragmentActivity)context).getSupportFragmentManager(),editPostFragment.getTag());
            }
        });

        }

@Override
public int getItemCount() {
        return mDataList.size();
        }

public static class MyViewHolder extends RecyclerView.ViewHolder{

    TextView school_name,description;
    ImageView image,option;
    View view;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        school_name=itemView.findViewById(R.id.school_name);
        description=itemView.findViewById(R.id.description);
        image=itemView.findViewById(R.id.image);
        option=itemView.findViewById(R.id.option_button);
        view=itemView;
    }
}
}

