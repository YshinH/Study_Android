package com.example.and10_intentresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn_login, btn_reset;

    //안드로이드의 4대 컴포넌트 : (현) 액티비티
    // 4가지의 컴포넌트들간의 통신을 담당 : Intent(전달)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                
//            }
//        }); 이렇게도 사용가능하나 가독성이 떨어짐
        
        btn1 = findViewById(R.id.btn1);
        LayoutInflater inflater = getLayoutInflater();


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //현재위치=>이동할위치 두개를 파라메터로 지정을 해둠.
                //직접 LoginActivity라는 액티비티를 하나 만들고
                //메인액티비티의 버튼을 클랙했을때 ↑ 새로 띄워지게 처리해보기.

                //Intent intent = new Intent(MainActivity.this, SubActivity.class);
                //startActivity(intent);

                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                intent.putExtra("test","넘길값");
                intent.putExtra("num",100);
                //id : 11, pw : admin

                LoginDTO dto = new LoginDTO(11, "admin");
                //LoginDTO타입을 요소로 가지는 ArrayList를 만들기
                //size == 10이어야 한다.
                ArrayList<LoginDTO> list = new ArrayList<>();

                for(int i = 0; i < 10; i++){
                    list.add(new LoginDTO(i, "pw" + i));
                }

                intent.putExtra("dto", dto);    //직렬화 Serializable????DTO클래스에서 인터페이스 상속받음
                intent.putExtra("list", list);

                startActivity(intent);


            }
        });


    }


}