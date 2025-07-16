package com.example.services;


import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository; //if use not  @Autowired  --> null pointer error

    public List<Employee> getAllEmployeeList() {

        employeeRepository.getAllEmployeeList();
        return employeeRepository.getAllEmployeeList();
    }

}
