package com.svalero.mvp_netflix_01.contract;

import com.svalero.mvp_netflix_01.model.pojo.Film;
import com.svalero.mvp_netflix_01.model.pojo.User;

public interface LoginContract {


    public interface View {
        void successLogin(User user, String message);

        void failureLogin(String err);
    }

    public interface Presenter {
        void login(User user);
        void lstFilms(Film films);
    }

    public interface Model {
        //Patron observer
        interface OnLoginUserListener {
            void onFinished(User user);

            void onFailure(String err);
        }

        void findUserWS(User user, OnLoginUserListener onLoginUserListener);
    }
}
