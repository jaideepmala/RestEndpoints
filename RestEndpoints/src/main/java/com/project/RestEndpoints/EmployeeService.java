package com.project.RestEndpoints;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//@Service
public class EmployeeService {
    List<Employee> employeeList = new ArrayList<>();

    public EmployeeService(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
