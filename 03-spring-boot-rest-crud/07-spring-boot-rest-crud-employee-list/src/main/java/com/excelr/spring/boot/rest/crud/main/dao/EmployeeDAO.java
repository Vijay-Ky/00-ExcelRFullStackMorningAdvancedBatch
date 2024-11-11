package com.excelr.spring.boot.rest.crud.main.dao;

import com.excelr.spring.boot.rest.crud.main.entity.Employee;

import java.util.List;

public interface EmployeeDAO
{
    List<Employee> findAll();
}
