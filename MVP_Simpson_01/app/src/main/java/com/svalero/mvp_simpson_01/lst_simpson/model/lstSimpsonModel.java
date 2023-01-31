package com.svalero.mvp_simpson_01.lst_simpson.model;

import com.svalero.mvp_simpson_01.lst_simpson.LstSimpsonContract;
import com.svalero.mvp_simpson_01.lst_simpson.model.pojo.simpson;

public class lstSimpsonModel implements LstSimpsonContract.model {

    @Override
    public void LstSimpsonWS(simpson simpson, OnLstSimpsonListener onLstSimpsonListener) {
        //Si ha ido bien
        onLstSimpsonListener.onSuccess(null);
        //Si ha ido mal
        onLstSimpsonListener.onFailure("Error!!!!!!!!");

    }
}
