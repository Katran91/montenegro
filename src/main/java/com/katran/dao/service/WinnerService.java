package com.katran.dao.service;

import com.katran.model.Teacher;
import com.katran.model.Winner;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by astratii on 6/15/2015.
 */
@Service("winnerService")
@Transactional
public class WinnerService {
    private static Logger logger = Logger.getLogger(StudentService.class);

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public List<Winner> getAll(){
        logger.debug("Retrieving all");

        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Winner");

        return query.list();
    }

    public Winner get(Integer id){
        Session session = sessionFactory.getCurrentSession();

        return (Winner) session.get(Winner.class, id);
    }

    public void add(Winner winner){
        Session session = sessionFactory.getCurrentSession();

        session.save(winner);
    }

    public void delete(Integer id){
        Session session = sessionFactory.getCurrentSession();

        session.delete((Winner) session.get(Winner.class, id));
    }
}
