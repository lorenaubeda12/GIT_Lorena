package com.svalero.mvc_netflix1.controller;

import com.svalero.mvc_netflix1.MainActivity;
import com.svalero.mvc_netflix1.model.Pojo.Student;
import com.svalero.mvc_netflix1.model.Pojo.User;
import com.svalero.mvc_netflix1.model.StudentWS;
import com.svalero.mvc_netflix1.model.UserWS;

public class User_Controller {
    private UserWS user;
    private MainActivity view;

    public User_Controller(UserWS model, MainActivity view) {
        this.user = model;
        this.view = view;
    }


    public void getUser() {
        User userrs = this.user.getUserWS();
        view.printUserDetails(userrs);
    }

}
