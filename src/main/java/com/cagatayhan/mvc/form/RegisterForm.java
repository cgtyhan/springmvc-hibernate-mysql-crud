package com.cagatayhan.mvc.form;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by Çağatay Han on 28.09.2016.
 */
public class RegisterForm {
    @NotEmpty
    @Size(min = 1, max = 50)
    private String userName;

    @NotEmpty
    @Size(min = 1, max = 20)
    private String password;

    @NotEmpty
    @Size(min = 1, max = 20)
    private String name;

    @NotEmpty
    @Size(min = 1, max = 20)
    private String surname;

    @NotEmpty
    @Size(min = 1, max = 20)
    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
