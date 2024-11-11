package com.excelr.spring.boot.rest.crud.main.dao;

import com.excelr.spring.boot.rest.crud.main.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO
{

    //field for entity manager
    private EntityManager entityManager;

    //constructor injection
    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager)
    {
        this.entityManager = entityManager;
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

    @Override
    public Employee save(Employee theEmployee)
    {
        Employee dbEmployee = entityManager.merge(theEmployee);

        return dbEmployee;
    }

    @Override
    public void deleteById(int employeeId)
    {
        Employee theEmployee = entityManager.find(Employee.class, employeeId);

        entityManager.remove(theEmployee);
    }
}
