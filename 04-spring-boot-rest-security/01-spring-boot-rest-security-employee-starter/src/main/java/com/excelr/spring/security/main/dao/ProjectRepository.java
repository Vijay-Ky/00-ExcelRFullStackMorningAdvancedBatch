package com.excelr.spring.security.main.dao;

import com.excelr.spring.security.main.entities.Employee;
import com.excelr.spring.security.main.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="member1")
interface StudentRepository extends JpaRepository<Student, Integer>
{
}

@RepositoryRestResource(path="member2")
interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
}

