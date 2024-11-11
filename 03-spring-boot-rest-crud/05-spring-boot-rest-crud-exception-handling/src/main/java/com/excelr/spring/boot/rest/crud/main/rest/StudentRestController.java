package com.excelr.spring.boot.rest.crud.main.rest;

import com.excelr.spring.boot.rest.crud.main.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId)
    {
        return theStudents.get(studentId);
    }

    @ExceptionHandler
    //Add an exception handler using @ExceptionHandler
    public ResponseEntity<StudentErrorRespose> handleException(StudentNotFoundException ex)
    {
        //create a student error response
        StudentErrorRespose error = new StudentErrorRespose();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(ex.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        //return response entity
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    //add another exception handler to catch any exception(catch all)

    @ExceptionHandler
    public ResponseEntity<StudentErrorRespose> handleException (Exception ex)
    {
        StudentErrorRespose error = new StudentErrorRespose();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(ex.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
