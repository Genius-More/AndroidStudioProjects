package com.example.xhb.myapplication_26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BasicActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity","Task id is"+getTaskId());
        Log.d("MainActivity","onCreate()");
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondActivity.actionStart(MainActivity.this,"data1","data2");
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("MainActivity","onStart()");
    }

    @Override
    protected void  onResume(){
        super.onResume();
        Log.d("MainActivity","onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("MainActivity","onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("MainActivity","onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("MainActivity","onDestroy()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("MainActivity","onRestart()");
    }

}
