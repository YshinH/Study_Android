package com.example.test01_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;
    ImageView img1, img2;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(count == 1){
                    img1.setVisibility(View.GONE);
                    img2.setVisibility(View.VISIBLE);
                    count = 2;
                }else(count == 2){
                    img2.setVisibility(View.GONE);
                    img1.setVisibility(View.VISIBLE);
                    count = 0;
                }
            }
        });



    }
}