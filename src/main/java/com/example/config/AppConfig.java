package com.example.config;

import com.example.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "Ayla", "Kaya"));
        employeeList.add(new Employee("2", "Aylin", "Kayacık"));
        employeeList.add(new Employee("3", "Aslı", "Demir"));
        employeeList.add(new Employee("4", "Aslıhan", "Duru"));
        employeeList.add(new Employee("5", "Aslı", "Durmaz"));
        return employeeList;
    }
}
