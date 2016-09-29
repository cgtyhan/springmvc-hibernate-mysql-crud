package com.cagatayhan.mvc.dao.impl;

import com.cagatayhan.mvc.dao.RegisterDAO;
import com.cagatayhan.mvc.form.LoginForm;
import com.cagatayhan.mvc.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Çağatay Han on 28.09.2016.
 */
@Repository("registerDAO")
public class RegisterDAOImpl implements RegisterDAO {
    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.openSession();
    }

    @Override
    public void tryRegister(String userName, String userPassword, String name, String surname, String address) {
        Session session = sessionFactory.openSession();
        Users newUser = new Users();
        session.save(new Users(userName, userPassword, name, surname, address));
        //session.persist(new Users(userName, userPassword, name, surname, address));
        session.close();
    }
}
