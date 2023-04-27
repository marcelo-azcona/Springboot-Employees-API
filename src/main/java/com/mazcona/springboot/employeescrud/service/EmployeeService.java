package com.mazcona.springboot.employeescrud.service;

import com.mazcona.springboot.employeescrud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}

