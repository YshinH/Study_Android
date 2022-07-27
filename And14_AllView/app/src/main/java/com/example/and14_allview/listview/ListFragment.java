package com.example.and14_allview.listview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.and14_allview.R;

import java.util.ArrayList;


public class ListFragment extends Fragment {
    ListView listview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_list, container, false);
        listview = v.findViewById(R.id.listview);

        ArrayList<YshDTO> list = new ArrayList<>();
        //5건 추가하기.
        list.add(0, new YshDTO(1, R.drawable.img1, "북금곰", "백구"));
        list.add(1, new YshDTO(2, R.drawable.img2, "고양이", "나비"));
        list.add(2, new YshDTO(3, R.drawable.img3, "새", "짹짹이"));
        list.add(3, new YshDTO(4, R.drawable.img4, "강아지", "귀요미" ));
        list.add(4, new YshDTO(5, R.drawable.img5, "고양이", "야옹이"));

        List_Adapter adapter = new List_Adapter(list, inflater);
        listview.setAdapter(adapter);


        /*1. 목록을 가지는 모든 뷰는 Adaper가 필요함.
            -1-1.한칸마다 보여질 데이터를 묶어놓은 객체 == DTO(ArrayList)
            -1-2.한칸마다 보여질 데이터를 디자인해놓은 파일 == res\layout\xml
        * 2. Adapter 생성
            -2-1. 클래스를 추가한다.
            -2-2. extend(상속)을 연결한다.
        *
        * 3.ListView<=>Adapter연결
        */

        return v;
    }

}