package com.svalero.mvc_netflix1.controller;

import com.svalero.mvc_netflix1.MainActivity;
import com.svalero.mvc_netflix1.model.Pojo.Student;
import com.svalero.mvc_netflix1.model.StudentWS;

public class Student_Controller {
    private StudentWS model;
    private MainActivity view;

    public Student_Controller(StudentWS model, MainActivity view) {
        this.model = model;
        this.view = view;
    }

    public void getStudent() {
        Student student = model.getStudent();
        view.printStudentDetails(student);
    }

}
