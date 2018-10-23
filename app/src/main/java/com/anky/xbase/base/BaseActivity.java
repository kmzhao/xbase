package com.anky.xbase.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * @author: Anky
 * @time: 2018
 * @desc:
 */

public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    protected abstract void initView();

    protected void show(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
