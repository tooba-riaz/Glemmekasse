package com.example.glemmekasse.views;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.glemmekasse.Adapter.GroupDiscoverAdapter;
import com.example.glemmekasse.Adapter.PostsAdapter;
import com.example.glemmekasse.Data.GroupDiscoverData;
import com.example.glemmekasse.Data.PostsData;
import com.example.glemmekasse.Model.GroupsDiscover;
import com.example.glemmekasse.Model.Posts;
import com.example.glemmekasse.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GroupFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GroupFragment extends Fragment {

    private View view;
    private RelativeLayout create_group,your_groups;

    private List<GroupsDiscover> mDataList;

    private RecyclerView mRecyclerView;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public GroupFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GroupFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GroupFragment newInstance(String param1, String param2) {
        GroupFragment fragment = new GroupFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view=inflater.inflate(R.layout.fragment_group, container, false);
        create_group=view.findViewById(R.id.create_group);
        your_groups=view.findViewById(R.id.groups);

        mRecyclerView=view.findViewById(R.id.discover_groups);
        mDataList= GroupDiscoverData.GroupsDiscoverModelClassList;

        LinearLayoutManager manager=new LinearLayoutManager(view.getContext());
        mRecyclerView.setLayoutManager(manager);

        GroupDiscoverAdapter adapter=new GroupDiscoverAdapter(mDataList,view.getContext());
        mRecyclerView.setAdapter(adapter);

        create_group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent create_group_intent=new Intent(view.getContext(), CreateGroup.class);
                startActivity(create_group_intent);
            }
        });

        your_groups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent your_group=new Intent(view.getContext(), YourGroup.class);
                startActivity(your_group);
            }
        });
        return view;
    }
}