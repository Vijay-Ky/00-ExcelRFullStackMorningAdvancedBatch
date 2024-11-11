package com.excelr.spring.data.jpa.main.dao;

import com.excelr.spring.data.jpa.main.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
