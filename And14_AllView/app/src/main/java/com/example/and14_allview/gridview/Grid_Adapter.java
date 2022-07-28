package com.example.and14_allview.gridview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.and14_allview.R;
import com.example.and14_allview.listview.YshDTO;

import java.util.ArrayList;


public class Grid_Adapter extends BaseAdapter {

    ArrayList<YshDTO> list;
    LayoutInflater inflater;

    public Grid_Adapter(ArrayList<YshDTO> list, LayoutInflater inflater) {
        this.list = list;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //convertView 부분은 우리한테 내용물을 넣으라고 null인상태로 비워져서 들어오는 변수 return해주면 알아서 붙임(os)
    //parent getCount만큼 나눈 공간을 position별로 한칸씩 우리한테 줌.
    // ↑ 두가지는 붙일 내용물과 붙일 공간. ※ LayoutInflater ※
    // ViewHolder라는 것을 만들어보기!( View(위젯) DTO) <= RecyclerView에서는 ViewHoler를 강제함

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.item_gridview, parent, false);
        GridViewHolder viewHolder = new GridViewHolder(convertView);
        viewHolder.bind(list.get(position));
   /*     ImageView img_id = convertView.findViewById(R.id.img_id);
        img_id.setImageResource(list.get(position).getImg_id());

        TextView no = convertView.findViewById(R.id.no);
        no.setText(list.get(position).getNo()+"");

        TextView category = convertView.findViewById(R.id.category);
        category.setText(list.get(position).getCategory());

        TextView name = convertView.findViewById(R.id.name);
        name.setText(list.get(position).getName());*/

        return convertView;
    }


    public class GridViewHolder {
        ImageView img_id;
        TextView no, category, name;
        View v;

        public GridViewHolder(View v) { //생성자
            this.v = v;

            img_id = v.findViewById(R.id.img_id);
            no = v.findViewById(R.id.no);
            category = v.findViewById(R.id.category);
            name = v.findViewById(R.id.name);

        }

        public void bind(YshDTO dto){       //메소드
            img_id.setImageResource(dto.getImg_id());
            no.setText(dto.getNo()+"");
            category.setText(dto.getCategory());
            name.setText(dto.getName());

        }


    }
    // ? Inner Class < GridAdapter에 GridViewHolder라는 클래스



}
