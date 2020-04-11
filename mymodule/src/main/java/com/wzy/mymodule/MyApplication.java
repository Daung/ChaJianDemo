package com.wzy.mymodule;

import android.app.Application;

import com.wzy.baselib.BaseApplication;
import com.wzy.baselib.ServiceFactory;

public class MyApplication extends Application implements BaseApplication {
    private static Application application;


    public static Application getInstance() {
        return application;
    }

    @Override
    public void initialize(Application app) {
        application = app;
        ServiceFactory.getInstance().setMyService(new MyService());
    }

}
