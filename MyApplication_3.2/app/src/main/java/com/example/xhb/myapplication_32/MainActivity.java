package com.example.xhb.myapplication_32;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Process;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;
    private ProgressBar progressBar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button_1);
        button2 = (Button) findViewById(R.id.button_2);
        button3 = (Button) findViewById(R.id.button_3);
        button4 = (Button) findViewById(R.id.button_4);
        button5 = (Button) findViewById(R.id.button_5);
        editText = (EditText) findViewById(R.id.edit_text) ;
        imageView = (ImageView) findViewById(R.id.image_view);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        progressBar1 = (ProgressBar) findViewById(R.id.progress_bar_1);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                String inputText = editText.getText().toString();
                Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_1:
                imageView.setImageResource(R.mipmap.xiniu);
                break;
            case R.id.button_2:
                if(progressBar.getVisibility() == View.GONE){
                    progressBar.setVisibility(View.VISIBLE);
                }
                else{
                    progressBar.setVisibility(View.GONE);
                }
                break;
            case R.id.button_3:
                int progress = progressBar1.getProgress();
                progress = progress + 10;
                progressBar1.setProgress(progress);
                break;
            case R.id.button_4:
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("this is Dialog");
                dialog.setMessage("something important");
                dialog.setCancelable(true);
                dialog.setPositiveButton("OK",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog,int which){

                    }
                });
                dialog.setNegativeButton("CANCEL",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog,int which){

                    }
                });
                dialog.show();
                break;
            case R.id.button_5:
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is ProgressDialog");
                progressDialog.setMessage("Loading");
                progressDialog.setCancelable(true);
                progressDialog.show();
                break;
            default:
                break;
        }
    }
}
