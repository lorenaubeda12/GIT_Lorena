package com.svalero.mvp_simpson_01.lst_simpsonUpdate.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.mvp_simpson_01.Entities.Simpson;
import com.svalero.mvp_simpson_01.R;
import com.svalero.mvp_simpson_01.lst_simpsonUpdate.UpdateSimpson_Contract;
import com.svalero.mvp_simpson_01.lst_simpsonUpdate.presenter.UpdateSimpson_Presenter;

public class UpdateSimpson_Activity extends AppCompatActivity implements UpdateSimpson_Contract.View {
    private UpdateSimpson_Presenter updateSimpson_presenter;
    private Simpson simpson;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upload_simpson);

        initComponents();
        initPresenter();
        initData();
    }

    private void initComponents() {
    }

    private void initPresenter() {
        updateSimpson_presenter = new UpdateSimpson_Presenter(this);

    }

    public void initData() {
        updateSimpson_presenter.updateSimpson(simpson);
    }

    @Override
    public void successUpdateSimpson(Simpson simpson) {

    }

    @Override
    public void failureUpdateSimpson(String error) {
        Toast.makeText(this, "Los datos no han podido " +
                "ser cargados", Toast.LENGTH_SHORT).show();
    }
}
