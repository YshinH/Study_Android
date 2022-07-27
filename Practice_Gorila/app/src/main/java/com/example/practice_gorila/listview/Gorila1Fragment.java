package com.example.practice_gorila.listview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.practice_gorila.R;

import java.util.ArrayList;
import java.util.List;


public class Gorila1Fragment extends Fragment {

    ListView gorila1View;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_gorila1, container, false);
        gorila1View = v.findViewById(R.id.gorila1View);

        ArrayList<Gorila1DTO> list = new ArrayList<>();
        list.add(0, new Gorila1DTO(R.color.purple_200, R.drawable.img, R.drawable.play, "LOVE ME", "김태현의 정치쇼 3,4부"));
        list.add(1, new Gorila1DTO(R.color.teal_200,R.drawable.img1, R.drawable.pause, "POWER FM", "아름다운 이 아침 김창완입니다."));
        list.add(2, new Gorila1DTO(R.color.purple_500,R.drawable.img2, R.drawable.play, "고릴라디오M", "Classic 20"));
        list.add(3, new Gorila1DTO(R.color.teal_700, R.drawable.img3, R.drawable.play, "Follow ME", "나를 따르라!!"));
        list.add(4, new Gorila1DTO(R.color.purple_200,R.drawable.img4, R.drawable.play, "LOVE YOU", "농담이지 말입니다"));
        list.add(5, new Gorila1DTO(R.color.teal_200,R.drawable.img5, R.drawable.play, "하하하하하", "웃으면 행복이와요"));

        Gorila1Adapter gorila1Adapter = new Gorila1Adapter(list, inflater);
        gorila1View.setAdapter(gorila1Adapter);


        return v;
    }

}