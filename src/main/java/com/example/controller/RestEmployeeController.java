package com.example.controller;

import java.util.List;


import com.example.model.Employee;
import com.example.model.UpdateEmployeeRequest;
import com.example.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/list")
    public List<Employee> getAllEmployeeList(){
        employeeService.getAllEmployeeList();
        return employeeService.getAllEmployeeList();
    }
@GetMapping(path = "/list/{id}")
    public Employee getEmployeeById(@PathVariable(name="id",required=true) String id){
        return employeeService.getEmployeeById(id);
    }
    @GetMapping(path="/with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name="firstName",required =false) String firstName
    ,@RequestParam(name="lastName",required =false) String lastName){

        return employeeService.getEmployeeWithParams(firstName,lastName);
    }
  @PostMapping (path ="/save-employee")
    public Employee saveEmployee(@RequestBody Employee newEmployee){
        return  employeeService.saveEmployee(newEmployee)   ;
  }

  @DeleteMapping(path="/delete-employee/{id}")
  public boolean deleteEmployee(@PathVariable(name="id")String id){

       return employeeService.deleteEmployee(id);

   }

   @PutMapping(path = "/update-employee/{id}")
   public Employee updateEmployee(@PathVariable (name="id")String id, @RequestBody UpdateEmployeeRequest  request){
        return employeeService.updateEmployee(id, request);

   }


}
