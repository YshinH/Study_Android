package com.example.and14_allview.gridview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import com.example.and14_allview.R;
import com.example.and14_allview.listview.List_Adapter;
import com.example.and14_allview.listview.YshDTO;

import java.util.ArrayList;

public class GridFragment extends Fragment {

    GridView gridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_grid, container, false);

        gridView = v.findViewById(R.id.gridview);

        ArrayList<YshDTO> list = new ArrayList<>();
        //5건 추가하기.
        list.add(0, new YshDTO(1, R.drawable.img1, "북금곰", "백구"));
        list.add(1, new YshDTO(2, R.drawable.img2, "고양이", "나비"));
        list.add(2, new YshDTO(3, R.drawable.img3, "새", "짹짹이"));
        list.add(3, new YshDTO(4, R.drawable.img4, "강아지", "귀요미" ));
        list.add(4, new YshDTO(5, R.drawable.img5, "고양이", "야옹이"));
        list.add(5, new YshDTO(6, R.drawable.image2, "고양이", "그림이"));
        list.add(6, new YshDTO(7, R.drawable.image3, "마멋", "마멀레이드"));
        list.add(7, new YshDTO(8, R.drawable.image4, "새", "학학"));
        list.add(7, new YshDTO(9, R.drawable.image5, "강아지", "삽살이"));

        Grid_Adapter adapter = new Grid_Adapter(list, inflater);
        gridView.setAdapter(adapter);



        return v;
    }


}