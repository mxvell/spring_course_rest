package com.zaurtregulov.spring.rest.configuration.service;

import com.zaurtregulov.spring.rest.configuration.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List <Employee> getAllEmployees();

    public  void saveEmployee (Employee employee);
    public Employee getEmployee (int id);
    public void deleteEmployee(int id);
}
