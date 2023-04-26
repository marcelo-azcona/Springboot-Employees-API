package com.mazcona.springboot.employeescrud.dao;

import com.mazcona.springboot.employeescrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
