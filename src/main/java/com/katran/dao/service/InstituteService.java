package com.katran.dao.service;

import com.katran.model.Institute;
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
@Service("instituteService")
@Transactional
public class InstituteService {
    private static Logger logger = Logger.getLogger(StudentService.class);

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public List<Institute> getAll(){
        logger.debug("Retrieving all");

        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Institute");

        return query.list();
    }

    public Institute get(Integer id){
        Session session = sessionFactory.getCurrentSession();

        return (Institute) session.get(Institute.class, id);
    }

    public void add(Institute student){
        Session session = sessionFactory.getCurrentSession();

        session.save(student);
    }

    public void delete(Integer id){
        Session session = sessionFactory.getCurrentSession();

        session.delete((Institute) session.get(Institute.class, id));
    }
}
