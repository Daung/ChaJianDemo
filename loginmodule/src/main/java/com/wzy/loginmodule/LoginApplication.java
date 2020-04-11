package com.wzy.loginmodule;

import android.app.Application;

import com.wzy.baselib.BaseApplication;
import com.wzy.baselib.ServiceFactory;

public class LoginApplication extends Application implements BaseApplication {


    private static Application application;


    public static   Application getInstance() {
        return application;
    }

    @Override
    public void initialize(Application app) {
       application = app;
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }
}
