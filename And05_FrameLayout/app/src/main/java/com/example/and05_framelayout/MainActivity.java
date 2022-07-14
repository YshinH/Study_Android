package com.example.and05_framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn_img;
    ImageView imgv1, imgv2, imgv3;
    String var;
    int count = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_img = findViewById(R.id.btn_img);
        imgv1 = findViewById(R.id.imgv1);
        imgv2 = findViewById(R.id.imgv2);
        imgv3 = findViewById(R.id.imgv3);

        var = "setContentView 디자인 연결 되고나서 값 줌";


        btn_img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                imgv3.setVisibility(View.GONE);
                imgv2.setVisibility(View.GONE);
                imgv1.setVisibility(View.GONE);
                count++;
                if (count == 1) {
                    imgv1.setVisibility(View.VISIBLE);

                } else if (count == 2) {
                    imgv2.setVisibility(View.VISIBLE);

                } else if (count == 3) {
                    imgv3.setVisibility(View.VISIBLE);
                    count = 0;
                }


                }


        });

    }


}



