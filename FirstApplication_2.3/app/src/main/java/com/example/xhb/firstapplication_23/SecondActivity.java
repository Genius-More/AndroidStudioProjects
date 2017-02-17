package com.example.xhb.firstapplication_23;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by XHB on 2017/1/11.
 */

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        final Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d("Log_SecondActivity",data);

        Button button = (Button) findViewById(R.id.button_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivityForResult(intent1,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        switch (requestCode){
            case 1:
                if(resultCode == RESULT_OK){
                    String returneddata = data.getStringExtra("data_return");
                    Log.d("Log_SecondActivity",returneddata);
                }
                break;
            default:
        }
    }
}
