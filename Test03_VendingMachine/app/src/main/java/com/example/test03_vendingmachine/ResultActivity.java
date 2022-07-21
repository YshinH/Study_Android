package com.example.test03_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {
    
    TextView balance, drink_1, drink_2, num_1, num_2;

   int bal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();

        balance = findViewById(R.id.balance);
        drink_1 = findViewById(R.id.drink_1);
        drink_2 = findViewById(R.id.drink_2);
        num_1 = findViewById(R.id.num_1);
        num_2 = findViewById(R.id.num_2);

        balance.setText(intent.getStringExtra("bal"));

        //balance.setText("bal");
        ArrayList<VendingListDTO> list = (ArrayList<VendingListDTO>) intent.getSerializableExtra("list");
        VendingListDTO dto = (VendingListDTO) intent.getSerializableExtra("dto");

//        drink_1.setText( list.get(0).getName());
//        num_1.setText(list.get(0).getQty() + "");
//        drink_2.setText(list.get(1).getName());
//        num_2.setText(list.get(1).getQty() + "");

        if(list.get(0).getQty() < 10){
            drink_1.setText(list.get(0).getName());
        }else if(list.get(1).getQty() <10){
            drink_1.setText(list.get(1).getName());
        }else if(list.get(2).getQty() <5){
            drink_1.setText(list.get(2).getName());
        }else if(list.get(3).getQty() <8){
            drink_1.setText(list.get(3).getName());
        }else if(list.get(4).getQty() <12){
            drink_1.setText(list.get(4).getName());
        }else if(list.get(5).getQty() <15){
            drink_1.setText(list.get(5).getName());
        }

        if(list.get(0).getQty() < 10){
            drink_2.setText(list.get(0).getName());
        }else if(list.get(1).getQty() <10){
            drink_2.setText(list.get(1).getName());
        }else if(list.get(2).getQty() <5){
            drink_2.setText(list.get(2).getName());
        }else if(list.get(3).getQty() <8){
            drink_2.setText(list.get(3).getName());
        }else if(list.get(4).getQty() <12){
            drink_2.setText(list.get(4).getName());
        }else if(list.get(5).getQty() <15){
            drink_2.setText(list.get(5).getName());
        }

//        if(list.get(0).getQty() < 10){
//            num_1.setText(list.get(0).getQty());
//        }else if(list.get(1).getQty() <10){
//            num_1.setText(list.get(1).getQty());
//        }else if(list.get(2).getQty() <5){
//            num_1.setText(list.get(2).getQty());
//        }else if(list.get(3).getQty() <8){
//            num_1.setText(list.get(3).getQty());
//        }else if(list.get(4).getQty() <12){
//            num_1.setText(list.get(4).getQty());
//        }else if(list.get(5).getQty() <15){
//            num_1.setText(list.get(5).getQty());
//        }
//
//        if(list.get(0).getQty() < 10){
//            num_2.setText(list.get(0).getQty());
//        }else if(list.get(1).getQty() <10){
//            num_2.setText(list.get(1).getQty());
//        }else if(list.get(2).getQty() <5){
//            num_2.setText(list.get(2).getQty());
//        }else if(list.get(3).getQty() <8){
//            num_2.setText(list.get(3).getQty());
//        }else if(list.get(4).getQty() <12){
//            num_2.setText(list.get(4).getQty());
//        }else if(list.get(5).getQty() <15){
//            num_2.setText(list.get(5).getQty());
//        }

        Log.d("intent에서 가져온 값", dto.getName());
        Log.d("intent에서 가져온 값", dto.getPrice() + "");
        Log.d("intent에서 가져온 값", dto.getQty()+ "");
        Log.d("intent에서 가져온 balance", bal+"");






    }
}