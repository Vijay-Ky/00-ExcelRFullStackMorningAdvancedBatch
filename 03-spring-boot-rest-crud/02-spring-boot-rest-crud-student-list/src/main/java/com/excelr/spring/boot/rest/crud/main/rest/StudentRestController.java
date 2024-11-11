package com.excelr.spring.boot.rest.crud.main.rest;

import com.excelr.spring.boot.rest.crud.main.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController
{
    @GetMapping("/students")
    public List<Student> getStudents()
    {
        List<Student> theStudents = new ArrayList<Student>();

        theStudents.add(new Student("poornima", "patel"));
        theStudents.add(new Student("john", "doe"));
        theStudents.add(new Student("jane", "doe"));
        theStudents.add(new Student());

        return theStudents;
    }
}
