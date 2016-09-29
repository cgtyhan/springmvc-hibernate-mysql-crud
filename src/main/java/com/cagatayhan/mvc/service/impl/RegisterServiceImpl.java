package com.cagatayhan.mvc.service.impl;

import com.cagatayhan.mvc.dao.RegisterDAO;
import com.cagatayhan.mvc.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Çağatay Han on 28.09.2016.
 */
@Service("registerService")
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterDAO registerDAO;

    public void setRegisterDAO(RegisterDAO registerDAO) {
        this.registerDAO = registerDAO;
    }

    @Override
    public void tryRegister(String userName, String userPassword, String name, String surname, String address) {
        registerDAO.tryRegister(userName, userPassword, name, surname, address);
    }
}
