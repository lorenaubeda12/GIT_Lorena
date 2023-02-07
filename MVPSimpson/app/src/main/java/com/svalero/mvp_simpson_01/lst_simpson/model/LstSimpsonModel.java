package com.svalero.mvp_simpson_01.lst_simpson.model;

import com.svalero.mvp_simpson_01.lst_simpson.LstSimpsonContract;
import com.svalero.mvp_simpson_01.Entities.Simpson;
import com.svalero.mvp_simpson_01.utils.ApiClient;
import com.svalero.mvp_simpson_01.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LstSimpsonModel implements LstSimpsonContract.Model {

    @Override
    public void lstSimpsonWS(Simpson simpson,
                             OnLstSimpsonListener onLstSimpsonListener) {
        //Si ha ido bien !!!!!!!!!!!
        onLstSimpsonListener.onSuccess(null);
        //Si ha ido mal !!!!!!!!!!!
        onLstSimpsonListener.onFailure("ERRRRRORRRRRR!!!!!!!!!!!!");
    }

    public void getSimpsonService(final OnLstSimpsonListener onLstSimpsonListener) {
        /*Ejecuto Webservice con retrofit Asistente para consumir api*/
        ApiInterface apiService = ApiClient.getClient()
                .create(ApiInterface.class);
        Call<ArrayList<Simpson>> call = apiService.getPopularSimpson(2);
        call.enqueue(new Callback<ArrayList<Simpson>>() {
            @Override
            public void onResponse(Call<ArrayList<Simpson>> call,
                                   Response<ArrayList<Simpson>> response) {
                ArrayList<Simpson> lstSimpson = response.body();
                onLstSimpsonListener.onSuccess(lstSimpson);
            }

            @Override
            public void onFailure(Call<ArrayList<Simpson>> call, Throwable t) {
                onLstSimpsonListener.onFailure(t.getMessage());
            }
        });
    }
}
