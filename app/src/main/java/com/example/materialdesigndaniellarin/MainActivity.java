package com.example.materialdesigndaniellarin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnAddEmployee, btnLsEmployees;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddEmployee = findViewById(R.id.btnAddEmployee);
        btnLsEmployees = findViewById(R.id.btnLstEmployees);


        }

    @Override
    protected void onStart() {
        super.onStart();
        btnAddEmployee.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AddEmployeeActivity.class));
        });

        btnLsEmployees.setOnClickListener(v -> {
            if(AddEmployeeActivity.employee==null){
                Toast.makeText(this, "Lista Vacía", Toast.LENGTH_LONG).show();
            }else {
                startActivity(new Intent(MainActivity.this, ListEmployeesActivity.class));
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();

    }
}
