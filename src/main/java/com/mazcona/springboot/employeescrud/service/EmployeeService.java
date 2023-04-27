package com.mazcona.springboot.employeescrud.service;

import com.mazcona.springboot.employeescrud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}

