package com.svalero.mvp_simpson_01.lst_simpsonUpdate.presenter;

import com.svalero.mvp_simpson_01.Entity.pojo.Simpson;
import com.svalero.mvp_simpson_01.lst_simpsonUpdate.Model.UpdateSimpson_Model;
import com.svalero.mvp_simpson_01.lst_simpsonUpdate.UpdateSimpson_Contract;

public class UpdateSimpson_Presenter implements UpdateSimpson_Contract.Presenter {
    private UpdateSimpson_Model updateSimpson_model;
    private UpdateSimpson_Contract.View view;

    public UpdateSimpson_Presenter(UpdateSimpson_Contract.View view) {
        this.view = view;
        updateSimpson_model = new UpdateSimpson_Model();
    }

    @Override
    public void updateSimpson(Simpson simpson) {
        updateSimpson_model.updateSimpsonWS(simpson, new UpdateSimpson_Contract.Model.OnUpdateSimpsonListener() {
            @Override
            public void onSuccess(Simpson simpson) {
                view.successUpdateSimpson(simpson);
            }

            @Override
            public void onFailure(String error) {
                view.failureUpdateSimpson(error);
            }
        });
    }
}

