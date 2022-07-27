package com.example.practice_gorila.listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.practice_gorila.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class Gorila1Adapter extends BaseAdapter {

    ArrayList<Gorila1DTO> list;
    LayoutInflater inflater;

    public Gorila1Adapter(ArrayList<Gorila1DTO> list, LayoutInflater inflater) {
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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.item_gorila1view, parent, false);

        LinearLayout back = convertView.findViewById(R.id.back);
        back.setBackgroundColor(list.get(position).getBack());

        ImageView img_1 = convertView.findViewById(R.id.img_1);
        img_1.setImageResource(list.get(position).getImg_1());

        ImageView img_2 = convertView.findViewById(R.id.img_2);
        img_2.setImageResource(list.get(position).getImg_2());

        TextView text_1 = convertView.findViewById(R.id.text_1);
        text_1.setText(list.get(position).getText_1());

        TextView text_2 = convertView.findViewById(R.id.text_2);
        text_2.setText(list.get(position).getText_2());



        return convertView;
    }
}
