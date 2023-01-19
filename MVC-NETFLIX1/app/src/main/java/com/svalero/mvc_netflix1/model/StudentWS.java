package com.svalero.mvc_netflix1.model;

import com.svalero.mvc_netflix1.model.Pojo.Student;

public class StudentWS {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudentWS() {
        student = new Student();
        student.setName("Pepe");
        student.setSurname("Palotes");
        return student;

    }

    public Student update(String email, String pass) {
        student.setName(email);
        student.setSurname(pass);
        return student;
    }
}
