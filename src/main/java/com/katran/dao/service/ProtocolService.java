package com.katran.dao.service;

import com.katran.model.Kafedra;
import com.katran.model.Protocol;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Katran on 13.06.2015.
 */

@Service("protocolService")
@Transactional
public class ProtocolService {
    private static Logger logger = Logger.getLogger(StudentService.class);

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public List<Protocol> getAll(){
        logger.debug("Retrieving all");

        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Protocol");

        return query.list();
    }

    public Protocol get(Integer id){
        Session session = sessionFactory.getCurrentSession();

        return (Protocol) session.get(Protocol.class, id);
    }

    public void add(Protocol protocol){
        Session session = sessionFactory.getCurrentSession();

        session.save(protocol);
    }

    public void delete(Integer id){
        Session session = sessionFactory.getCurrentSession();

        session.delete((Protocol) session.get(Protocol.class, id));
    }
}
