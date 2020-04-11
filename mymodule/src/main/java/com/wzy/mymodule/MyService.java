package com.wzy.mymodule;

import android.content.Context;
import android.content.Intent;

import com.wzy.baselib.IMyService;

public class MyService implements IMyService {

    @Override
    public void launch(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, MyActivity.class);
        context.startActivity(intent);
    }
}
