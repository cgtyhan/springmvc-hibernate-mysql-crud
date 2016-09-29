package com.cagatayhan.mvc.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Çağatay Han on 16.09.2016.
 */

@Entity
@Table(name = "users")
public class Users implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", length = 11)
    private Long id;

    @Column(name = "username")
    String userName;

    @Column(name = "name")
    String name;

    @Column(name = "surname")
    String surname;

    @Column(name = "password")
    String userPassword;

    @Column(name = "address")
    String address;

    public Users() {

    }

    public Users(String userName, String userPassword, String name, String surname, String address) {
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.userPassword = userPassword;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
