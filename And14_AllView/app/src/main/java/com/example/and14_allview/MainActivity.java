package com.example.and14_allview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.and14_allview.bteam_listview.CyaFragment;
import com.example.and14_allview.gridview.GridFragment;
import com.example.and14_allview.listview.ListFragment;
import com.example.and14_allview.recyclerview.RecyclerFragment;
import com.google.android.material.button.MaterialButtonToggleGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //ListView, GridView, RycyclerView(*)
    //Adapter(사용자가 구현하려는 모양이 저마다 다르기때문에 각각의 위젯들을 어댑터라는 규칙을 통해서 구현)
    ArrayList<Button> btn_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_list.add(findViewById(R.id.btn_listview));
        btn_list.add(findViewById(R.id.btn_gridview));
        btn_list.add(findViewById(R.id.btn_rcyview));
        btn_list.add(findViewById(R.id.btn_pj));

        //btn_list에 우리가 추가한 버튼들을 전체를 넣고 온클릭 리스너 연결하기
        //implements 이용

        for (int i = 0; i < btn_list.size(); i++){
            btn_list.get(i).setOnClickListener(this);

        }

        //1. ViewGroup <- Layout종류를 준비 : 프래그먼트가 붙을 공간을 마련한다. -0
        //2. Fragment <- : 붙일 프래그먼트를 준비함. - 0
        //3. FramentManager :  붙임(코딩) == 두가지 1번, 2번을 통해서 replace기능을 사용. commit
       // getSupportFragmentManager().beginTransaction().replace(R.id.container, new ListFragment()).commit();


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_listview) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new ListFragment()).commit();
        } else if (v.getId() == R.id.btn_gridview) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new GridFragment()).commit();
        } else if (v.getId() == R.id.btn_pj) {
           getSupportFragmentManager().beginTransaction().replace(R.id.container, new CyaFragment()).commit();

        } else if (v.getId() == R.id.btn_rcyview) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new RecyclerFragment()).commit();
        }

    }
}