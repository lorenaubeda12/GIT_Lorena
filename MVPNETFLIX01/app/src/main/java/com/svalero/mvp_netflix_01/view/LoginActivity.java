package com.svalero.mvp_netflix_01.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.svalero.mvp_netflix_01.R;

public class LoginActivity extends AppCompatActivity {
    private EditText edtUserLogin;
    private EditText edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initComponents();
        initPresenter();

    }


    private void initComponents() {
        this.edtUserLogin = findViewById(R.id.edtUserLogin);
        this.edtPassword = findViewById(R.id.edtPassword);
        this.btnLogin = findViewById(R.id.buttonLogin);
    }

    private void initPresenter() {

    }
}