package com.example.and10_intentresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {


    Button btn_reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = getIntent();//이전 액티비티에서 Intent로 새로운 창을 띄울때 사용한 Intent를 가지고옴.
        String test = intent.getStringExtra("test");
        int num = intent.getIntExtra("num",-1);
        int num1 = intent.getIntExtra("num1",-1);
        LoginDTO dto = (LoginDTO) intent.getSerializableExtra("dto");
        ArrayList<LoginDTO> list = (ArrayList<LoginDTO>) intent.getSerializableExtra("list");


        //int 타입은 참조형 데이터타입이 아니기때문에
        //null인 상태가 있을수가 없음

/*      Log.d("메인 액티비티에서 가져온값 ", test);
        Log.d("메인 액티비티에서 가져온값 ", num+ "");
        Log.d("메인 액티비티에서 가져온값 ", num1+"");
        Log.d("메인 액티비티에서 가져온값 ", num1+"");*/
        Log.d("메인 액티비티에서 가져온 아이디 ", dto.getId()+"");
        Log.d("메인 액티비티에서 가져온 패스워드 ", dto.getPw());

        for(int i = 0; i < list.size(); i++) {
            Log.d("메인 액티비티에서 가져온 리스트 ", list.get(i).getId() + "");
            Log.d("메인 액티비티에서 가져온 리스트 ", list.get(i).getPw());
        }


        btn_reset = findViewById(R.id.btn_reset);

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}