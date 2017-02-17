package com.example.xhb.myapplication_25;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by XHB on 2017/1/19.
 */

public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d("ThirdActivity","Task id is"+getTaskId());
        setContentView(R.layout.third_layout);
    }
}
