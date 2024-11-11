package com.excelr.spring.boot.rest.crud.main.dao;

import com.excelr.spring.boot.rest.crud.main.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
    //no need to write any code, it will be taken care by the JPARepository
}
