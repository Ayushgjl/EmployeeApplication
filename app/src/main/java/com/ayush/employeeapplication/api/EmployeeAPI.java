package com.ayush.employeeapplication.api;

import com.ayush.employeeapplication.model.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EmployeeAPI {

    @GET("employees")
    Call<List<Employee>> getAllEmployees ();
}
