package com.ayush.employeeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnShowEmployee, btnRegisterEmployee,btnSearchEmployee, btnUpdateDeleteEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowEmployee = findViewById(R.id.btnShowEmployee);
        btnRegisterEmployee = findViewById(R.id.btnRegisterEmployee);
        btnSearchEmployee = findViewById(R.id.btnSearchEmployee);
        btnUpdateDeleteEmployee = findViewById(R.id.btnUpdateEmployee);

        btnRegisterEmployee.setOnClickListener(this);
        btnSearchEmployee.setOnClickListener(this);
        btnShowEmployee.setOnClickListener(this);
        btnUpdateDeleteEmployee.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnRegisterEmployee)
        {
            Intent intent = new Intent(getApplicationContext(),RegisterEmployeeActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.btnSearchEmployee)
        {
            Intent intent = new Intent(getApplicationContext(),SearchEmployeeActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.btnShowEmployee)
        {
            Intent intent = new Intent(getApplicationContext(),ShowEmployeeActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.btnUpdateEmployee)
        {
            Intent intent = new Intent(getApplicationContext(),UpdateDeleteEmployeeActivity.class);
            startActivity(intent);
        }
    }
}

