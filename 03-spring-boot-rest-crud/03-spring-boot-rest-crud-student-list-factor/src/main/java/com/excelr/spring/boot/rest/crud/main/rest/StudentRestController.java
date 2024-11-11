package com.excelr.spring.boot.rest.crud.main.rest;

import com.excelr.spring.boot.rest.crud.main.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController
{

    private List<Student> theStudents;

    //to load the student data .. only once!
    //each and every time when we access this end point, students data will not loaded again and again. subsequent calls to the /students endpoint will return the pre-loaded list of students without needing to reload the data each time the endpoint is accessed.
    @PostConstruct
    public void loadData()
    {
       theStudents = new ArrayList<Student>();

        theStudents.add(new Student("poornima", "patel"));
        theStudents.add(new Student("john", "doe"));
        theStudents.add(new Student("jane", "doe"));
        theStudents.add(new Student());
    }

    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return theStudents;
    }
}
