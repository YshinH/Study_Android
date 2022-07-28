package com.example.and14_allview.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and14_allview.R;
import com.example.and14_allview.listview.YshDTO;

import java.util.ArrayList;

public class Rec_Adapter extends RecyclerView.Adapter<Rec_Adapter.RecHolder>{

    LayoutInflater inflater;
    ArrayList<YshDTO> list;

    public Rec_Adapter(LayoutInflater inflater, ArrayList<YshDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }


    @NonNull
    @Override
    public RecHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_listview, parent, false);
        RecHolder holder = new RecHolder(v);

        return holder;
    }
    //데이터바인딩( 뷰 <-> dto) 연결부. GridAdapter.bind

    @Override
    public void onBindViewHolder(@NonNull RecHolder holder, int position) {
        //holder <-> dto연결(holder갯수 == list.size()_
        holder.img_id.setImageResource(list.get(position).getImg_id());
        holder.no.setText(list.get(position).getNo()+"");
        holder.category.setText(list.get(position).getCategory());
        holder.name.setText(list.get(position).getName());
    }

    //리사이클러뷰의 아이템 갯수를 지정함.
    @Override
    public int getItemCount() {
        return list.size();
    }
    // Recycler <- 재활용 : 뷰홀더(ViewHolder)를 장제 한다. (무조건 만들어야함)
    // 가로, 세로, 지그재그(잘사용안함)을 제공함.
    // 1. ViewHolder클래스를 상속받은 inner class를 만든다.
    // 2. RecyclerView.Adapter를 상속받음 RecyclerView(VH) == VH : ViewHolder(이너클래스를 의미함)





    //1. 어떤 이름이든 일단 extens RecyclerView.ViewHolder를 상속받아서 ViewHolder구조를 만드는 것!.
    public class RecHolder extends RecyclerView.ViewHolder {

        //@NonNull <- null을 넣으면안됨.

        ImageView img_id;
        TextView no, category, name;

        public RecHolder(@NonNull View v) {
            super(v);

            img_id = v.findViewById(R.id.img_id);
            no = v.findViewById(R.id.no);
            category = v.findViewById(R.id.category);
            name = v.findViewById(R.id.name);





        }


    }




}
