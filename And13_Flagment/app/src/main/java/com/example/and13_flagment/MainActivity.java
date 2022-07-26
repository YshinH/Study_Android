package com.example.and13_flagment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    // 메인액티비티 안에 어떤곳에 붙였을까?
    // View : 위젯 (xml에서 디자인할 수 있는 모든 것들)전체
    // ViewGroup : 안에 묶어서 넣을 수 있는 구조를 가진 위젯 //위젯들의 모임 즉, 레이아웃

    // LayoutInflate.inflate ( R.layout.내가만든xml , ViewGroup, true );

    NewFragment newFragment = new NewFragment(this);
    TestFragment testfragment = new TestFragment();
    ToastDAO toastDAO = new ToastDAO();
    static Button btn_change;
    static FragmentManager fragmentManager;
    int cnt = 0;

    //static 키워드를 이용해서 멤버를 static멤버로 만들기
    // 두가지 멤버가 있음 : static 멤버, 인스턴스 멤버

    //static은 항상 메모리에 먼저 가있어야함.
    //인스턴스멤버는 new를 두고 인스턴스화 과정을 실행해야 메모리에 올라감.

    //static메소드를 안드로이드에서 사용했을때  불편한점
    //대부분의 안드로이드에서 사용되는 멤버들은(Context, FragmentManager등) 인스턴스 멤버임.
    //static에서 구현을 하려면 하나씩 static으로 만들거나 해야하는 불편한 점이 많음.(메모리용량많이 씀)
    //MainActivity activity = new MainActivity(); (X)
    //↓ 방식은 사용을 자제하자!(안된다고 무조건 static 사용 자제)
/*    public static void mainMethod(){
        Log.d("메인메소드", "mainMethod: ");
        btn_change.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int btnTag = Integer.parseInt(btn_change.getTag().toString());//Object
                if(btnTag == 0){
                    fragmentManager.beginTransaction().replace(R.id.container, new TestFragment()).commit();
                    //toastDAO.showToast(MainActivity.this, "뜹니까?");
                    btn_change.setTag(1);
                }else {
                    fragmentManager.beginTransaction().replace(R.id.container, new NewFragment(v.getContext())).commit();
                    btn_change.setTag(0);
                }

            }
        });

    }*/

    public void mainMethodI(View v){

                int btnTag = Integer.parseInt(btn_change.getTag().toString());//Object
                if(btnTag == 0){
                    fragmentManager.beginTransaction().replace(R.id.container, new TestFragment()).commit();
                    //toastDAO.showToast(MainActivity.this, "뜹니까?");
                    btn_change.setTag(1);
                }else {
                    fragmentManager.beginTransaction().replace(R.id.container, new NewFragment(v.getContext())).commit();
                    btn_change.setTag(0);
                }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_change = findViewById(R.id.btn_change);

        toastDAO.showToast(this, "new 밖에서 문자열보여주기");

        fragmentManager = getSupportFragmentManager();

        btn_change.setTag(0);
        //위젯에 어떤 상태정보를 넣어두고 사용하기위한것(Object형태여서 뭐든지 넣을 수 있다.)


        //FragmentManager <-이게 필요함(프래그먼트를 붙이는 처리를 한다.
        //액티비티 기준으로 FragmentManager를 초기화하는 방법(사용준비)

        // Transaction (DB) : INSERT, UPDATE, DELETE => COMMIT, ROLLBACK을 해줘야만 작업이 확정이 됨.
        //getSupportFragmentManager().beginTransaction().replace(R.id.container, testfragment).commit();





    }



    @Override
    protected void onStart() {
        super.onStart();
        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int btnTag = Integer.parseInt(btn_change.getTag().toString());//Object
                if(btnTag == 0){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, testfragment).commit();
                    toastDAO.showToast(MainActivity.this, "뜹니까?");
                    btn_change.setTag(1);
                }else {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, newFragment).commit();
                    btn_change.setTag(0);
                }

            }
        });


    }


    /*        findViewById(R.id.btn_change).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cnt == 0) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, newFragment).commit();


                    cnt++;
                }else {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
                    cnt = 0;
                }
            }
        });*/





}