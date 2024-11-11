package com.excelr.spring.boot.rest.crud.main.rest;

import com.excelr.spring.boot.rest.crud.main.entity.Employee;
import com.excelr.spring.boot.rest.crud.main.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController
{
    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService theEmployeeService)
    {
        this.employeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll()
    {
        return employeeService.findAll();
    }

    @GetMapping("employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId)
    {
        Employee theEmployee = employeeService.findById(employeeId);

        if(theEmployee == null)
        {
            throw new RuntimeException("Employee id not found: " + employeeId);
        }

        return theEmployee;
    }
}
