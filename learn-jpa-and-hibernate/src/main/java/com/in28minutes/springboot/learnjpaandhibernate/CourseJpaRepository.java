package com.in28minutes.springboot.learnjpaandhibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext //autowired 대신 더 명확
    private EntityManager entityManager;


    @Transactional
    public void insert(Course course){ //쿼리작성이 필요 없음
        entityManager.merge(course);
    }
    public Course findById(long id){
       return entityManager.find(Course.class, id);
    }

    @Transactional
    public void deleteById(long id){
        Course course = entityManager.find(Course.class,id);
        entityManager.remove(course);
    }
}
