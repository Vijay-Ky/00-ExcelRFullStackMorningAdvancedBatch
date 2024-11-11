package com.excelr.spring.data.jpa.main.dao;

import com.excelr.spring.data.jpa.main.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO
{
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }


    @Override
    public List<Student> findByLastName(String theLastName)
    {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);

        //set query parameters
        theQuery.setParameter("theData", theLastName);

        return theQuery.getResultList();
    }
}
