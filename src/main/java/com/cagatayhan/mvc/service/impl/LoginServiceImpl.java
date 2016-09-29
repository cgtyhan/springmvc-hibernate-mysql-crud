package com.cagatayhan.mvc.service.impl;

import com.cagatayhan.mvc.dao.LoginDAO;
import com.cagatayhan.mvc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Çağatay Han on 16.09.2016.
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDAO loginDAO;

    public void setLoginDAO(LoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }

    @Override
    public boolean checkLogin(String userName, String userPassword) {
        return loginDAO.checkLogin(userName, userPassword);
    }
}
