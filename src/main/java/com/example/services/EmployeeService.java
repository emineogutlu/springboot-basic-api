package com.example.services;


import com.example.model.Employee;
import com.example.model.UpdateEmployeeRequest;
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

    public  Employee getEmployeeById(String id) {
        return employeeRepository.getEmployeeById(id);
    }
   public List<Employee> getEmployeeWithParams(String firstName,String lastName){
        return employeeRepository.getEmployeeWithParams(firstName,lastName);
   }
   public Employee saveEmployee(Employee newEmployee){
        return employeeRepository.saveEmployee(newEmployee);
   }
    public boolean deleteEmployee(String id ) {
        return employeeRepository.deleteEmployee(id);
    }

    public Employee updateEmployee(String id, UpdateEmployeeRequest request) {
        return employeeRepository.updateEmployee(id, request);
    }
}
