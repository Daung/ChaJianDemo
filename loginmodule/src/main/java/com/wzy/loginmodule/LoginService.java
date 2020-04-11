package com.wzy.loginmodule;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.wzy.baselib.ILoginService;

public class LoginService implements ILoginService {
    @Override
    public void launch(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, LoginActivity.class);
        context.startActivity(intent);
    }

    @Override
    public Fragment getFragment(FragmentManager manager, int layoutId, Bundle bundle) {
        LoginFragment fragment = new LoginFragment();
        fragment.setArguments(bundle);
        manager.beginTransaction().replace(layoutId, fragment).commit();
        return fragment;
    }
}
