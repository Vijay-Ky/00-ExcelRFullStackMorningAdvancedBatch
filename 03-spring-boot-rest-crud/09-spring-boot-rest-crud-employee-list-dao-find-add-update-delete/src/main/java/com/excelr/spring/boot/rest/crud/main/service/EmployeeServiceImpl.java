package com.excelr.spring.boot.rest.crud.main.service;

import com.excelr.spring.boot.rest.crud.main.dao.EmployeeDAO;
import com.excelr.spring.boot.rest.crud.main.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO)
    {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll()
    {
        return employeeDAO.findAll();
    }
}
