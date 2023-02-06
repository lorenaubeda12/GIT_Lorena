package com.svalero.mvp_simpson_01.lst_simpsonUpdate.Model;

import com.svalero.mvp_simpson_01.Entity.pojo.Simpson;
import com.svalero.mvp_simpson_01.lst_simpsonUpdate.UpdateSimpson_Contract;

public class UpdateSimpson_Model implements UpdateSimpson_Contract.Model {
    @Override
    public void updateSimpsonWS(Simpson simpson, OnUpdateSimpsonListener onUpdateSimpsonListener) {
        //Si ha ido bien !!!!!!!!!!!
        onUpdateSimpsonListener.onSuccess(simpson);
        //Si ha ido mal !!!!!!!!!!!
        onUpdateSimpsonListener.onFailure("ERRRRRORRRRRR!!!!!!!!!!!!");
    }
}


