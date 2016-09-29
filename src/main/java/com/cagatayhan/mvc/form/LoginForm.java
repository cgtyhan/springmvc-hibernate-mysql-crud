package com.cagatayhan.mvc.form;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by Çağatay Han on 16.09.2016.
 */
public class LoginForm {
    @NotEmpty
    @Size(min = 1, max = 50)
    private String userName;

    @NotEmpty
    @Size(min = 1, max = 20)
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
