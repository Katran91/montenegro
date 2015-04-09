package com.katran.dao.service;

import com.katran.model.Teacher;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by astratii on 4/9/2015.
 */
@Service("teacherService")
@Transactional
public class TeacherService {
    private static Logger logger = Logger.getLogger(StudentService.class);

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public List<Teacher> getAll(){
        logger.debug("Retrieving all");

        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Teacher");

        return query.list();
    }

    public Teacher get(Integer id){
        Session session = sessionFactory.getCurrentSession();

        return (Teacher) session.get(Teacher.class, id);
    }

    public void add(Teacher student){
        Session session = sessionFactory.getCurrentSession();

        session.save(student);
    }

    public void delete(Integer id){
        Session session = sessionFactory.getCurrentSession();

        session.delete((Teacher) session.get(Teacher.class, id));
    }
}

