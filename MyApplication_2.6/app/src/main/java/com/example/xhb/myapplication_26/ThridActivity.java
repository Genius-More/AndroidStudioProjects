package com.example.xhb.myapplication_26;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by XHB on 2017/1/19.
 */

public class ThridActivity extends BasicActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ThirdActivity","Task id is"+getTaskId());
        Log.d("ThirdActivity","onCreate()");
        setContentView(R.layout.third_layout);
        Button button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ActivityCollector.finishAll();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("ThirdActivity","onRsume()");
    }

    @Override
    protected void  onResume(){
        super.onResume();
        Log.d("ThirdActivity","onRsume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("ThirdActivity","onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("ThirdActivity","onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("ThirdActivity","onDestroy()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("ThirdActivity","onRestart()");
    }
}
