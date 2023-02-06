package com.svalero.mvp_simpson_01.lst_simpson;

import com.svalero.mvp_simpson_01.lst_simpson.model.pojo.simpson;

import java.util.ArrayList;

public interface LstSimpsonContract {

    public interface view {
        void successLstSimpson(ArrayList<simpson> lstsimpson);

        void errorLstSimpson(String error);
    }

    public interface presenter {
        //Caso de uso
        void LstSimpson(simpson simpson);
    }

    public interface model {
        interface OnLstSimpsonListener {
            void onSuccess(ArrayList<simpson> lstsimpson);

            void onFailure(String error);
        }

        void LstSimpsonWS(simpson simpson, OnLstSimpsonListener onLstSimpsonListener);
    }
}
