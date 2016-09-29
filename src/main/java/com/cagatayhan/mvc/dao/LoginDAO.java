package com.cagatayhan.mvc.dao;

/**
 * Created by Çağatay Han on 16.09.2016.
 */
public interface LoginDAO {
    boolean checkLogin(String userName, String userPassword);
}
