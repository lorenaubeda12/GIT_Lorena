package com.svalero.mvc_netflix1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.svalero.mvc_netflix1.controller.Student_Controller;
import com.svalero.mvc_netflix1.controller.User_Controller;
import com.svalero.mvc_netflix1.model.Pojo.Student;
import com.svalero.mvc_netflix1.model.Pojo.User;
import com.svalero.mvc_netflix1.model.StudentWS;
import com.svalero.mvc_netflix1.model.UserWS;

public class MainActivity extends AppCompatActivity {
    private Student_Controller controller;
    private User_Controller controllerUser;
    private MainActivity view;
    private StudentWS model;
    private UserWS user;

    Button button = findViewById(R.id.button);
    EditText editText_Email = findViewById(R.id.text2);
    EditText editText_Pass = findViewById(R.id.text1);

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cargar view
        view = this;
        //Cargar modelo

        //Model + view
        controller = new Student_Controller(model, view);
        controllerUser =new User_Controller(user,view);
        //Caso de uso -> Obtener estudiante
        controller.getStudent();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editText_Email.getText().toString();
                String pass = editText_Pass.getText().toString();
                model.update(email, pass);
                printStudentDetails(model.getStudent());
            }
        });

    }

    public void printStudentDetails(Student Student) {
        Log.d("MainActivity - NAME ", Student.getName());
        Log.d("MainActivity - NAME ", Student.getSurname());
    }

    public void printUserDetails(User user) {
        Log.d("MainActivity - NAME ", user.getName());
        Log.d("MainActivity - NAME ", user.getSPass());
    }
}