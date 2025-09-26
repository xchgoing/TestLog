package com.xch.testlog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String TAG = MainActivity.class.toString();
    private TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.info);
        String info = BuildConfig.BUILD_TYPE+"   "+BuildConfig.FLAVOR;
        textView.setText(info);


    }
}