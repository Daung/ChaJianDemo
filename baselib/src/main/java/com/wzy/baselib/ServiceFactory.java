package com.wzy.baselib;

public class ServiceFactory {
    private static final ServiceFactory factory = new ServiceFactory();

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        return factory;
    }

    private ILoginService mLoginService;
    private IMyService mMyService;

    public ILoginService getLoginService() {
        return mLoginService;
    }

    public void setLoginService(ILoginService mLoginService) {
        this.mLoginService = mLoginService;
    }

    public IMyService getMyService() {
        return mMyService;
    }

    public void setMyService(IMyService mMyService) {
        this.mMyService = mMyService;
    }
}
