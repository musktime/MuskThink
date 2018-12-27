package com.musk.test;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

/**
 * 透明Activity在8.0上出现问题
 * 1.奔溃
 * 2.黑边
 */
public class TranslucentActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*if(Build.VERSION.SDK_INT>=28){
            setTheme(R.style.translucent_style_28);
        }*/
        Toast.makeText(this, "--TranslucentActivity--", Toast.LENGTH_SHORT).show();
    }
}
