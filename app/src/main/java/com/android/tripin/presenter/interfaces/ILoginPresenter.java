package com.android.tripin.presenter.interfaces;

public interface ILoginPresenter {
    public final static String TAG = ILoginPresenter.class.getSimpleName();

    /**
     * 处理用户点击登陆按钮后的逻辑
     */
    void login();

    /**
     * 处理用户点击注册账户之后的逻辑
     */
    void createAccount();
}
