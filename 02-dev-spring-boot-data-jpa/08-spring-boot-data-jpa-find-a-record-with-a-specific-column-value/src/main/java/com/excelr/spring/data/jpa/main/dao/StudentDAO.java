package com.excelr.spring.data.jpa.main.dao;

import com.excelr.spring.data.jpa.main.entity.Student;

import java.util.List;

public interface StudentDAO
{
    List<Student> findByLastName(String theLastName);
}
