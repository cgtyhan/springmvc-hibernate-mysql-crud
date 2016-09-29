package com.cagatayhan.mvc.service;

/**
 * Created by Çağatay Han on 28.09.2016.
 */
public interface RegisterService {
    void tryRegister(String userName, String userPassword, String name, String surname, String address);
}
