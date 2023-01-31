package com.svalero.mvp_simpson_01.lst_simpson.presenter;

import com.svalero.mvp_simpson_01.lst_simpson.LstSimpsonContract;
import com.svalero.mvp_simpson_01.lst_simpson.model.lstSimpsonModel;
import com.svalero.mvp_simpson_01.lst_simpson.model.pojo.simpson;

import java.util.ArrayList;

public class LstSimpsonPresenter implements LstSimpsonContract.presenter {
    private com.svalero.mvp_simpson_01.lst_simpson.model.lstSimpsonModel lstSimpsonModel;

    public LstSimpsonPresenter() {
        this.lstSimpsonModel = new lstSimpsonModel();
    }

    @Override
    public void LstSimpson(simpson simpson) {
        lstSimpsonModel.LstSimpsonWS(null, new LstSimpsonContract.model.OnLstSimpsonListener() {
            @Override
            public void onSuccess(ArrayList<com.svalero.mvp_simpson_01.lst_simpson.model.pojo.simpson> lstsimpson) {

            }

            @Override
            public void onFailure(String error) {

            }
        });

    }
}
