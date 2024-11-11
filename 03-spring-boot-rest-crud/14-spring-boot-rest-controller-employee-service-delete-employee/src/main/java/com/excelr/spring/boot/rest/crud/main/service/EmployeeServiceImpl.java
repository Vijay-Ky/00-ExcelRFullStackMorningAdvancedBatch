package com.excelr.spring.boot.rest.crud.main.service;

import com.excelr.spring.boot.rest.crud.main.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    private EntityManager entityManager;

    public EmployeeServiceImpl(EntityManager theEntityManager)
    {
        this.entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll()
    {

        //create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);

        //execute query
        List<Employee> employees = theQuery.getResultList();

        //return result
        return employees;
    }

    @Override
    public Employee findById(int employeeId)
    {
        Employee theEmployee = entityManager.find(Employee.class, employeeId);

        return theEmployee;
    }

    @Transactional
    @Override
    public Employee save(Employee theEmployee)
    {
        Employee dbEmployee = entityManager.merge(theEmployee);

        return dbEmployee;
    }

    @Transactional
    @Override
    public void deleteById(int employeeId)
    {
        Employee theEmployee = entityManager.find(Employee.class, employeeId);

        entityManager.remove(theEmployee);
    }
}
