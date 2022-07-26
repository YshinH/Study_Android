package com.example.and13_flagment;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class TestFragment extends Fragment {
    Button btn_fragment, btn_goNew;
    //기본적으로 프래그먼트 파일을 추가하게 되면 불필요한 코드가 많음.
    //우리가 필요한 것은 onCreateView!만 있으면 됨.
    //onCreateView라는 메소드는 항상 View타입이 리턴되어야한다.
    NewFragment newFragment = new NewFragment(getContext());

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_test, container, false);//붙이는 기능, + 붙인 뷰를 리턴해줌.
        btn_fragment = v.findViewById(R.id.btn_fragment);
        btn_goNew = v.findViewById(R.id.btn_goNew);

        btn_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_fragment.setText("버튼눌림");
            }
        });

        btn_goNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MainActivity.mainMethod(); //static을 사용한거라 자제하자
                MainActivity activity = (MainActivity) getActivity();
                activity.mainMethodI(v);

            }
        });



        return v;
    }








}