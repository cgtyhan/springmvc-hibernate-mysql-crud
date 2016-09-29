package com.cagatayhan.mvc.dao.impl;

import com.cagatayhan.mvc.dao.LoginDAO;
import com.cagatayhan.mvc.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Where;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Çağatay Han on 16.09.2016.
 */

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.openSession();
    }

    @Override
    public boolean checkLogin(String userName, String userPassword) {
        Session session = sessionFactory.openSession();
        boolean userFound = false;
        String SQL_QUERY = "from Users as o where o.userName=? and o.userPassword=?";
        Query query = session.createQuery(SQL_QUERY);
        query.setParameter(0, userName);
        query.setParameter(1, userPassword);

        if((query.list() != null) && (query.list().size() > 0)) {
            userFound = true;
        }

        session.close();
        return userFound;
    }
}
