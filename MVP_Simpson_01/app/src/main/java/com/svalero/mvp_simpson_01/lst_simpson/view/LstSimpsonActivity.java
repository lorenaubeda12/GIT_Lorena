package com.svalero.mvp_simpson_01.lst_simpson.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.svalero.mvp_simpson_01.R;
import com.svalero.mvp_simpson_01.lst_simpson.LstSimpsonContract;
import com.svalero.mvp_simpson_01.lst_simpson.model.pojo.simpson;
import com.svalero.mvp_simpson_01.lst_simpson.presenter.LstSimpsonPresenter;

import java.util.ArrayList;

public class LstSimpsonActivity extends AppCompatActivity implements LstSimpsonContract.view {
    private LstSimpsonPresenter lstSimpsonPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_simpson);

        initComponent();
        initPresenter();
        initData();
        lstSimpsonPresenter.LstSimpson(null);
    }


    public void initData() {
        lstSimpsonPresenter.LstSimpson(null); //SELECT * FROM Simpson;
    }

    public void initComponent() {
    }

    public void initPresenter() {
        lstSimpsonPresenter = new LstSimpsonPresenter();
    }

    @Override
    public void successLstSimpson(ArrayList<simpson> lstsimpson) {
        //Adapter notify set data changed
        //Los datos son lo que vienen de la base de datos
        //Los datos son lo que vienen de la base de datos
    }

    @Override
    public void errorLstSimpson(String error) {
        Toast.makeText(this, "Los datos no han podido ser cargados", Toast.LENGTH_SHORT).show();
    }
}