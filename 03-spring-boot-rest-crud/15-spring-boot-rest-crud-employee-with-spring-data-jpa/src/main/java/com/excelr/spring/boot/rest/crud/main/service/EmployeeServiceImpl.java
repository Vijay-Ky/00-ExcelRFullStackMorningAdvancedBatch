package com.excelr.spring.boot.rest.crud.main.service;

import com.excelr.spring.boot.rest.crud.main.dao.EmployeeRepository;
import com.excelr.spring.boot.rest.crud.main.entity.Employee;
import com.fasterxml.jackson.annotation.OptBoolean;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll()
    {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int employeeId)
    {
        Optional<Employee> result = employeeRepository.findById(employeeId);

        Employee theEmployee = null;

        if(result.isPresent())
        {
            theEmployee = result.get();
        }
        else
        {
            throw new RuntimeException("Did not find employee id: " + employeeId);
        }
        return theEmployee;
    }

   // @Transactional
    @Override
    public Employee save(Employee theEmployee)
    {
        return employeeRepository.save(theEmployee);
    }

   // @Transactional
    @Override
    public void deleteById(int employeeId)
    {
        employeeRepository.deleteById(employeeId);
    }
}
