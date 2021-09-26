package com.example.materialdesigndaniellarin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.materialdesigndaniellarin.adapters.EmployeesAdapter;
import com.example.materialdesigndaniellarin.models.EmployeeModel;

import java.util.ArrayList;
import java.util.List;

public class ListEmployeesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    EmployeesAdapter employeesAdapter;

    public List<EmployeeModel> lstEmployees;
    LinearLayoutManager linearLayoutManager;
    ArrayList<EmployeeModel> lst = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_employees);

        if(AddEmployeeActivity.employee != null){
            for (EmployeeModel item: AddEmployeeActivity.employee){
                EmployeeModel emplo = new EmployeeModel(R.drawable.android_kotlin, item.getName(), item.getLastName());
                lst.add(emplo);
            }
        }
        setRecyclerView(lst);
    }



    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        recyclerView.clearOnScrollListeners();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    private void setRecyclerView(ArrayList<EmployeeModel> lstEmployees) {
        recyclerView = findViewById(R.id.rvEmployees);
        linearLayoutManager = new LinearLayoutManager(ListEmployeesActivity.this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        employeesAdapter = new EmployeesAdapter(lstEmployees);
        recyclerView.setAdapter(employeesAdapter);
    }
}
