package com.svalero.mvp_netflix_01.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.svalero.mvp_netflix_01.R;
import com.svalero.mvp_netflix_01.contract.LoginContract;
import com.svalero.mvp_netflix_01.model.pojo.User;
import com.svalero.mvp_netflix_01.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {
    private EditText edtUserLogin;
    private EditText edtPassword;
    private Button btnLogin;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Importante inicializar simpre el components y el presenter
        initComponents();
        initPresenter();


    }


    private void initComponents() {
        this.edtUserLogin = findViewById(R.id.edtUserLogin);
        this.edtPassword = findViewById(R.id.edtPassword);
        this.btnLogin = findViewById(R.id.buttonLogin);
    }

    private void initPresenter() {
        loginPresenter = new LoginPresenter();
        loginPresenter.lstFilms(null); //para listar todos los films
    }

    @Override
    public void successLogin(User user, String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void failureLogin(String err) {
        Toast.makeText(this, err, Toast.LENGTH_SHORT).show();
    }
}