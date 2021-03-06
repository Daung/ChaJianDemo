package com.wzy.baselib;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public interface ILoginService {
    void launch(Context context);
    Fragment getFragment(FragmentManager manager, int layoutId, Bundle bundle);
}
