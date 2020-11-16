package com.example.glemmekasse.views;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.glemmekasse.Adapter.GroupNotificationAdapter;
import com.example.glemmekasse.Adapter.NotificationAdapter;
import com.example.glemmekasse.Data.GroupNotificationsData;
import com.example.glemmekasse.Data.NotificationsData;
import com.example.glemmekasse.Model.GroupNotifications;
import com.example.glemmekasse.Model.Notifications;
import com.example.glemmekasse.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NotificationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NotificationFragment extends Fragment {

    private RecyclerView mRecyclerView,mRecyclerViewGroup;
    private List<Notifications> mDataList;
    private List<GroupNotifications> mDataList_group;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NotificationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NotificationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NotificationFragment newInstance(String param1, String param2) {
        NotificationFragment fragment = new NotificationFragment();
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

        View view= inflater.inflate(R.layout.fragment_notification, container, false);

        mRecyclerView=view.findViewById(R.id.notifications);
        mRecyclerViewGroup=view.findViewById(R.id.group_notifications);

        mDataList= NotificationsData.NotiModelClassList;
        mDataList_group= GroupNotificationsData.NotiModelClassList;

        LinearLayoutManager manager=new LinearLayoutManager(view.getContext());
        mRecyclerView.setLayoutManager(manager);

        LinearLayoutManager manager2=new LinearLayoutManager(view.getContext());
        mRecyclerViewGroup.setLayoutManager(manager2);

        NotificationAdapter adapter=new NotificationAdapter(mDataList,view.getContext());
        mRecyclerView.setAdapter(adapter);

        GroupNotificationAdapter adapter2=new GroupNotificationAdapter(mDataList_group,view.getContext());
        mRecyclerViewGroup.setAdapter(adapter2);

        return view;
    }
}