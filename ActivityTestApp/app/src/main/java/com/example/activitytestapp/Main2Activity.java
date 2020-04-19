package com.example.activitytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.util.PersonInfo;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "Main2Activity";
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        textView = (TextView)findViewById(R.id.textView);
//        Intent it = getIntent();
//        Log.e(TAG, "normal data");
//        Log.e(TAG, "name: " + it.getStringExtra("name"));
//        Log.e(TAG, "age: " + it.getIntExtra("age", 0));
//        PersonInfo pi = (PersonInfo)it.getSerializableExtra("yuan");
//        Log.e(TAG, "object data");
//        Log.e(TAG, "object name: " + pi.getName());
//        Log.e(TAG, "object age: " + pi.getAge());
//        Log.e(TAG, "object sex: " + pi.isSex());
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.putExtra("key","you click textView.");
//                setResult(RESULT_OK, intent);
//                finish();
//            }
//        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: ");
        Intent intent = new Intent();
        intent.putExtra("key","onPause");
        setResult(RESULT_OK, intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: ");
        Intent intent = new Intent();
        intent.putExtra("key","onStop");
        setResult(RESULT_OK, intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: ");
        Intent intent = new Intent();
        intent.putExtra("key","onDestroy");
        setResult(RESULT_OK, intent);
    }


}
