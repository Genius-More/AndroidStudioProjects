package com.example.xhb.firstapplication_23;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by XHB on 2017/2/17.
 */

public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        Button button = (Button) findViewById(R.id.button_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data_return","Hello SecondActivity");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent();
        intent.putExtra("data_return","Hello SecondActivity by Back");
        setResult(RESULT_OK,intent);
        finish();
    }
}
