package com.example.and12_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //모든 수명주기에 관련 된 메소드는 부모 클래스로부터 재정의 하여 사용한다.


    // Override == 재정의( 기존 기능 + 기능, 형태는 같으나 내부를 완전히 바꿈, 수정)
    // OverLoading == 메소드의 중복 된 이름을 사용하는 방법(파라메터 갯수, 순서를 바꿔서 같은 이름의 메소드를 여러개 만들 수 있는 것
    @Override   //Override , OverLoading의 차이점 : Override는 상속받은 메소드를 재정의하는 것이고 OverLoading은 중복된 메소드의 이름을 사용하되 파라메터갯수나 순서, 타입을 다르게 사용한다
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("수명주기", "onCreate: 1번");
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("간다", "간다");
                startActivity(intent);
            }
        });

    }// 1번

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("수명주기", "onStart: 2번");


    }// 2번

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("수명주기", "onResume: 3번");
    }//3번

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("수명주기", "onPause: 4번");
    }//4번

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("수명주기", "onStop: 5번");
    }//5번

    @Override
    protected void onDestroy() {    //☆☆☆☆☆☆☆☆☆☆☆
        super.onDestroy();
        //어떤 작업을 하고있다면 작업을 종료하거나 또는 작업내용을 저장시키거나 하는 작업을 할때 많이 씀.
        Log.d("수명주기", "onDestroy: 6번");
    }//6qjs

    @Override
    protected void onRestart() {    //☆☆☆☆☆☆☆☆☆☆☆
        super.onRestart();
        //데이터베이스를 연동해서 다른 액티비티에서 데이터 인서트나 업데이트 등의 과정이 일어났을때
        //해당 된 변경하상을 바로 적용하기 위해서 시점을 사용할 수 가 있다.
        Log.d("수명주기", "onRestart: 0번");
    }//0번






}