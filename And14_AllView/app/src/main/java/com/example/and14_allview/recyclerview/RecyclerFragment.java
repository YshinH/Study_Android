package com.example.and14_allview.recyclerview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and14_allview.R;
import com.example.and14_allview.listview.YshDTO;

import java.util.ArrayList;


public class RecyclerFragment extends Fragment {
    RecyclerView recview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_recycler, container, false);

        recview = v.findViewById(R.id.recview);
        //가로, 세로 지정안함 모양안나옴

        ArrayList<YshDTO> list = new ArrayList<>();
        //5건 추가하기.
        list.add(0, new YshDTO(1, R.drawable.img1, "북금곰", "백구"));
        list.add(1, new YshDTO(2, R.drawable.img2, "고양이", "나비"));
        list.add(2, new YshDTO(3, R.drawable.img3, "새", "짹짹이"));
        list.add(3, new YshDTO(4, R.drawable.img4, "강아지", "귀요미" ));
        list.add(4, new YshDTO(5, R.drawable.img5, "고양이", "야옹이"));



        Rec_Adapter adapter = new Rec_Adapter(inflater, list);

        recview.setAdapter(adapter);

        /* LayoutManager <- 가로인지 세로인지를 설정해서 넣을 수가 있음 필수 */
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
               // getContext(), RecyclerView.VERTICAL, false
                getContext(), RecyclerView.HORIZONTAL, false
        );
        recview.setLayoutManager(layoutManager);
        //첫번째 파라메터(Context, 액티비티면 this고 Fragment면 받아와서 넘기면 됨)
        // 두번째 파라메터(방향 가로 또는 세로)
        //세번재 파라메터(반대로 순서를 바꿀껀지 여부, 대부분 false)

         /*1. 목록을 가지는 모든 뷰는 Adaper가 필요함.
            -1-1.한칸마다 보여질 데이터를 묶어놓은 객체 == DTO(ArrayList)
            -1-2.한칸마다 보여질 데이터를 디자인해놓은 파일 == res\layout\xml
        * 2. Adapter 생성  ※※※※※ 다름 ※※※※※
            -2-1. 클래스를 추가한다.
            -2-2. extend(상속)을 받아서 어댑터가 된다.ㅗ
        *
        * 3.GridView<=>Adapter연결
        */


        return v;
    }
}