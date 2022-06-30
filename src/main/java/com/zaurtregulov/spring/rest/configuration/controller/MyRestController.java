package com.zaurtregulov.spring.rest.configuration.controller;

import com.zaurtregulov.spring.rest.configuration.entity.Employee;
import com.zaurtregulov.spring.rest.configuration.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class MyRestController {
    @Autowired
    private EmployeeService employeeService;
@GetMapping("/employees")
    public List <Employee> showAllEmployees(){
  List<Employee> allEmployees = employeeService.getAllEmployees();
  return allEmployees;
    }

}
