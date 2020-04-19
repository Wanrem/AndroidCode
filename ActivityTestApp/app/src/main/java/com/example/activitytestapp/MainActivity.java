package com.example.activitytestapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.util.PersonInfo;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button btn_one, btn_two, btn_three, btn_four, btn_five, btn_six;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_one = (Button)findViewById(R.id.btn_one);//打开第二个界面，并传递数据
        btn_two = (Button)findViewById(R.id.btn_two);//打开对话框
        btn_three = (Button)findViewById(R.id.btn_three);//打开界面对话框
        btn_four = (Button)findViewById(R.id.btn_four);//隐式启动系统Activity
        btn_five = (Button)findViewById(R.id.btn_five);//隐式启动普通隐式启动系统Activity
        btn_six = (Button)findViewById(R.id.btn_six);//带结果返回的隐式启动系统Activity

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                //传递简单数据
//                intent.putExtra("name", "王凯旋");
//                intent.putExtra("age", 27);
//
//                //传递对象
//                PersonInfo pInfo = new PersonInfo("媛媛", 25, false);
//                intent.putExtra("yuan", pInfo);
//                startActivity(intent);
            }
        });

        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:18745039313"));
                startActivity(intent);
            }
        });

        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("wangkx");
                startActivity(intent);
            }
        });

        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                startActivityForResult(intent, 101);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }


    //重写onActivityResult接受处理完的数据
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == -1){
            switch (requestCode){
                case 101:
                    String str = data.getStringExtra("key");
                    Log.e(TAG, "onActivityResult:" + str);
                    break;
            }
        }
    }
}
