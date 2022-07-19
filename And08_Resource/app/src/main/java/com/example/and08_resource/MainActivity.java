package com.example.and08_resource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrot_main);

        Log.d("리소스 값 ", " " + R.string.string_ysh);
        Log.d("리소스값 ", "" + getString(R.string.string_YYY));

    }
}