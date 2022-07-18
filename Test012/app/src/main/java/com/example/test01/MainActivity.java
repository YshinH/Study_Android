package com.example.test01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image1, image2;
    Button btn_img;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        btn_img = findViewById(R.id.btn_img);

        btn_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image1.setVisibility(View.GONE);
                image2.setVisibility(View.GONE);
                ++flag;
                if(flag == 1){
                    image1.setVisibility(View.VISIBLE);

                }else if(flag ==2) {
                    image2.setVisibility(View.VISIBLE);
                    flag = 0;
                }

            }
        });


    }
}