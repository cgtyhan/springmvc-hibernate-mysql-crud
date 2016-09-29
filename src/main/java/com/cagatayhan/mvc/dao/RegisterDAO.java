package com.cagatayhan.mvc.dao;

/**
 * Created by Çağatay Han on 28.09.2016.
 */
public interface RegisterDAO {
    void tryRegister(String userName, String userPassword, String name, String surname, String address);
}
