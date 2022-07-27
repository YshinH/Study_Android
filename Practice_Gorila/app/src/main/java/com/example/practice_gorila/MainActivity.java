package com.example.practice_gorila;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.practice_gorila.listview.Gorila1Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.container1, new Gorila1Fragment()).commit();
        //getSupportFragmentManager().beginTransaction().replace(R.id.container2,)

    }
}