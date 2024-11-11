package com.excelr.spring.boot.rest.crud.main.service;

import com.excelr.spring.boot.rest.crud.main.entity.Employee;

import java.util.List;

public interface EmployeeService
{
    List<Employee> findAll();

    Employee findById(int employeeId);

    Employee save(Employee theEmployee);

    void deleteById(int employeeId);
}
