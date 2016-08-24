package com.example.markzhang.markimgjni_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView)findViewById(R.id.tv01);
        tv.setText(stringFromJNI());
    }

    static {
        System.loadLibrary("hellojni");
    }

    private native String stringFromJNI();
}
