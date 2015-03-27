package com.katran.dao.services;

import com.katran.model.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by astratii on 3/27/2015.
 */
@Service("studentService")
@Transactional
public class StudentService {
    private static Logger logger = Logger.getLogger(StudentService.class);

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public List<Student> getAll(){
        logger.debug("Retrieving all students");

        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM STUDENT");

        return query.list();
    }

    public Student get(Integer id){
        Session session = sessionFactory.getCurrentSession();

        return (Student) session.get(Student.class, id);
    }

    public void add(Student student){
        Session session = sessionFactory.getCurrentSession();

        session.save(student);
    }

    public void delete(Integer id){
        Session session = sessionFactory.getCurrentSession();

        session.delete((Student) session.get(Student.class, id));
    }

    public void edit(Student student){
        Session session = sessionFactory.getCurrentSession();

        Student existingStudent = (Student) session.get(Student.class, student.getId());

        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setGivenName(student.getGivenName());
        existingStudent.setBirthDate(student.getBirthDate());
        existingStudent.setKurs(student.getKurs());
    }
}
