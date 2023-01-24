package com.svalero.mvp_netflix_01.contract;

public interface LoginContract {

    
    public interface View {
        void successLogin(User user, String message);

        void failureLogin(String err);
    }

    public interface Presenter {
        void login(User user);
    }

    public interface Model {
        interface OnLoginUserListener {
            onFinished(User user);

            onFailure(String err);
        }

        void findUserWS(User user, OnLoginUserListener onLoginUserListener);
    }
}
