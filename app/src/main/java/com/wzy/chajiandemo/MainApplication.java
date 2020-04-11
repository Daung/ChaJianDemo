package com.wzy.chajiandemo;

import android.app.Application;

import com.wzy.baselib.AppConfig;
import com.wzy.baselib.BaseApplication;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        for (String component : AppConfig.components) {
            try {
                Class<?> mClass = Class.forName(component);
                BaseApplication application = (BaseApplication) mClass.newInstance();
                application.initialize(this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
