package com.svalero.mvc_netflix1.model;

import com.svalero.mvc_netflix1.model.Pojo.Student;
import com.svalero.mvc_netflix1.model.Pojo.User;

public class UserWS {
    private User user;

    public User getStudent() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }

    public User getUserWS() {
        user = new User();
        user.setName("PEPE@PEPE.COM");
        user.setPass("Palotes");
        return user;

    }

    public User update(String email, String pass) {
        user.setName(email);
        user.setPass(pass);
        return user;
    }
}
