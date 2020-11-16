package com.example.glemmekasse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.glemmekasse.views.GroupFragment;
import com.example.glemmekasse.views.HomeFragment;
import com.example.glemmekasse.views.LoginActivity;
import com.example.glemmekasse.views.NotificationFragment;
import com.example.glemmekasse.views.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeFragment homeFragment=new HomeFragment();
        FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
        transaction3.replace(R.id.container, homeFragment);
//        transaction3.addToBackStack(null);
        transaction3.commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationView);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.action_home:
                    HomeFragment homeFragment=new HomeFragment();
                    FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                    transaction3.replace(R.id.container, homeFragment);
                    transaction3.addToBackStack(null);
                    transaction3.commit();
                    return true;
                case R.id.action_notification:
                    NotificationFragment notificationFragment=new NotificationFragment();
                    FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                    transaction2.replace(R.id.container, notificationFragment);
                    transaction2.addToBackStack(null);
                    transaction2.commit();
                    return true;
                case R.id.action_group:
                    GroupFragment groupFragment=new GroupFragment();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.container, groupFragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                    return true;
                case R.id.action_profile:
                    ProfileFragment profileFragment=new ProfileFragment();
                    FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                    transaction1.replace(R.id.container, profileFragment);
                    transaction1.addToBackStack(null);
                    transaction1.commit();
                    return true;
                case R.id.action_logout:
                    Intent loginIntent=new Intent(MainActivity.this, LoginActivity.class);
                    loginIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(loginIntent);
                    return true;
            }
            return false;
        }
    };


}