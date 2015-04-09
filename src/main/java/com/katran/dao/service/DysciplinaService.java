package com.katran.dao.service;

import com.katran.model.Dysciplina;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by astratii on 4/8/2015.
 */
@Service("dysciplinaService")
@Transactional
public class DysciplinaService {
    private static Logger logger = Logger.getLogger(StudentService.class);

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public List<Dysciplina> getAll(){
        logger.debug("Retrieving all");

        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Dysciplina");

        return query.list();
    }

    public Dysciplina get(Integer id){
        Session session = sessionFactory.getCurrentSession();

        return (Dysciplina) session.get(Dysciplina.class, id);
    }

    public void add(Dysciplina student){
        Session session = sessionFactory.getCurrentSession();

        session.save(student);
    }

    public void delete(Integer id){
        Session session = sessionFactory.getCurrentSession();

        session.delete((Dysciplina) session.get(Dysciplina.class, id));
    }
}