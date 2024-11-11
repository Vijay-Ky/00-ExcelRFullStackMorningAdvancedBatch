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

    @Transactional
    @Override
    public void save(Student theStudent)
    {
        entityManager.persist(theStudent);
    }

    @Override
    public List<Student> findAll()
    {
        //create query
        TypedQuery<Student> theQuery = entityManager.createQuery("from Student", Student.class);

        //return query reslults
        return theQuery.getResultList();
    }
}
