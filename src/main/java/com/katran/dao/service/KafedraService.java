package com.katran.dao.service;

import com.katran.model.Kafedra;
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
@Service("kafedraService")
@Transactional
public class KafedraService {
    private static Logger logger = Logger.getLogger(StudentService.class);

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public List<Kafedra> getAll(){
        logger.debug("Retrieving all");

        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Kafedra");

        return query.list();
    }

    public Kafedra get(Integer id){
        Session session = sessionFactory.getCurrentSession();

        return (Kafedra) session.get(Kafedra.class, id);
    }

    public void add(Kafedra student){
        Session session = sessionFactory.getCurrentSession();

        session.save(student);
    }

    public void delete(Integer id){
        Session session = sessionFactory.getCurrentSession();

        session.delete((Kafedra) session.get(Kafedra.class, id));
    }
}
