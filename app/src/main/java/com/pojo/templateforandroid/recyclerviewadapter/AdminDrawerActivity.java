package com.pojo.templateforandroid.recyclerviewadapter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;
import com.pojo.dmiie.model.AdminDashBoardCountDTO;
import com.pojo.templateforandroid.R;

import java.util.ArrayList;
import java.util.List;

public class AdminDrawerActivity extends AppCompatActivity  {

    RecyclerView recyclerViewAdminDashboard;
    AdminDashBoardAdapter adminDashBoardAdapter;
    
    List<AdminDashBoardCountDTO> adminDashBoardCountDTOList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_drawer);


        recyclerViewAdminDashboard=(RecyclerView)findViewById(R.id.adminRecyclerView);
        recyclerViewAdminDashboard.setHasFixedSize(true);
        recyclerViewAdminDashboard.setLayoutManager(new LinearLayoutManager(AdminDrawerActivity.this));
        
        adminDashBoardCountDTOList=new ArrayList<>();
        
        adminDashBoardAdapter=new AdminDashBoardAdapter(AdminDrawerActivity.this,adminDashBoardCountDTOList);
        recyclerViewAdminDashboard.setAdapter(adminDashBoardAdapter);
        
        getDashBoardCount();
        
    }

    private void getDashBoardCount() {


        adminDashBoardAdapter.setData(adminDashBoardCountDTOList);

    }


    private void clearAllData() {
    }




}