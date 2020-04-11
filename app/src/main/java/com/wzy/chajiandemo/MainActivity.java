package com.wzy.chajiandemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.wzy.baselib.ILoginService;
import com.wzy.baselib.IMyService;
import com.wzy.baselib.ServiceFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_login).setOnClickListener(this);
        findViewById(R.id.tv_my).setOnClickListener(this);
        findViewById(R.id.tv_content).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_login:
                ILoginService loginService = ServiceFactory.getInstance().getLoginService();
                loginService.launch(this);
                break;
            case R.id.tv_my:
                IMyService myService = ServiceFactory.getInstance().getMyService();
                myService.launch(this);
                break;
            case R.id.tv_content:
                ILoginService loginService1 = ServiceFactory.getInstance().getLoginService();
                loginService1.getFragment(getSupportFragmentManager(),R.id.fl_content, new Bundle());
                break;
        }

    }
}
