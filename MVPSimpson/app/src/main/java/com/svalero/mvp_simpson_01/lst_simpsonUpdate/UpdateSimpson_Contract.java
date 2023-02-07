package com.svalero.mvp_simpson_01.lst_simpsonUpdate;

import com.svalero.mvp_simpson_01.Entities.Simpson;

public interface UpdateSimpson_Contract {
    public interface View {

        void successUpdateSimpson(Simpson simpson);

        void failureUpdateSimpson(String error);
    }

    public interface Presenter {
        // CASO DE USO
        void updateSimpson(Simpson simpson);
    }

    public interface Model {
        interface OnUpdateSimpsonListener {
            void onSuccess(Simpson simpson);

            void onFailure(String error);
        }

        void updateSimpsonWS(Simpson simpson,
                             OnUpdateSimpsonListener onUpdateSimpsonListener);
    }
}
