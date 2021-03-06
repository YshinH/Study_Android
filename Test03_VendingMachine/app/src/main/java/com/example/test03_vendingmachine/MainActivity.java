package com.example.test03_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout line1, line2, line3;

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_push, btn_result;
    EditText edt_money;
    TextView number_1, number_2, number_3,number_4, number_5, number_6, balance;

    int n1=1, n2=1, n3=1, n4=1, n5=1, n6=1, balance_int=0;

    ArrayList<VendingListDTO> list = new ArrayList<VendingListDTO>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        line1 = findViewById(R.id.line1);
        line2 = findViewById(R.id.line2);
        line3 = findViewById(R.id.line3);
        LayoutInflater inflater = getLayoutInflater();

        inflater.inflate(R.layout.line1, line1, true);
        inflater.inflate(R.layout.line2, line2, true);
        inflater.inflate(R.layout.line3, line3, true);

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_push = findViewById(R.id.btn_push);
        btn_result = findViewById(R.id.btn_result);

        edt_money = findViewById(R.id.edt_money);

        number_1 = findViewById(R.id.number_1);
        number_2 = findViewById(R.id.number_2);
        number_3 = findViewById(R.id.number_3);
        number_4 = findViewById(R.id.number_4);
        number_5 = findViewById(R.id.number_5);
        number_6 = findViewById(R.id.number_6);
        balance = findViewById(R.id.balance);

        btn_push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rtnInt(edt_money.getText().toString())){
                    Log.d("???" , "OK: ");

                    balance.setText(edt_money.getText());
                    balance_int = Integer.parseInt(String.valueOf(balance.getText()));
                }else{
                    Log.d("???" , "NG: ");
                    Toast.makeText(getApplicationContext(), "????????? ??????????????????", Toast.LENGTH_SHORT).show();
                    edt_money.setText("");
                    edt_money.setHint("???????????????????????????!");
                }
            }
        });

        n1 = Integer.parseInt(number_1.getText().toString());
        n2 = Integer.parseInt(number_2.getText().toString());
        n3 = Integer.parseInt(number_3.getText().toString());
        n4 = Integer.parseInt(number_4.getText().toString());
        n5 = Integer.parseInt(number_5.getText().toString());
        n6 = Integer.parseInt(number_6.getText().toString());

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { /* try catch ????????? */
                 if(n1 > 0 && balance_int > 800) {
                    --n1;
                    number_1.setText(n1 + "");
                    balance_int -= 800;
                    balance.setText(balance_int+"");
                 }
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n2 > 0 && balance_int > 800){
                    --n2;
                    balance_int -= 800;
                    number_2.setText(n2 + "");
                    balance.setText(balance_int+"");
                }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n3 > 0 && balance_int > 1000){
                    --n3;
                    balance_int -= 1000;
                    number_3.setText(n3 + "");
                    balance.setText(balance_int+"");
                }
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n4 > 0 && balance_int > 1000){
                    --n4;
                    balance_int -= 1000;
                    number_4.setText(n4 + "");
                    balance.setText(balance_int+"");
                }
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n5 > 0 && balance_int > 1100){
                    --n5;
                    balance_int -= 1100;
                    number_5.setText(n5 + "");
                    balance.setText(balance_int+"");
                }
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n6 > 0 && balance_int > 1100){
                    --n6;
                    balance_int -= 1100;
                    number_6.setText(n6 + "");
                    balance.setText(balance_int+"");
                }
            }
        });

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("??????", String.valueOf(balance.getText()));

                list.add(new VendingListDTO("??????", 800,10-Integer.parseInt(String.valueOf(n1))));
                list.add(new VendingListDTO("?????????", 800, 10-Integer.parseInt(String.valueOf(n2))));
                list.add(new VendingListDTO("???????????????", 1000,  5-Integer.parseInt(String.valueOf(n3))));
                list.add(new VendingListDTO("????????????", 1000, 8-Integer.parseInt(String.valueOf(n4))));
                list.add(new VendingListDTO("??????", 1100, 12-Integer.parseInt(String.valueOf(n5))));
                list.add(new VendingListDTO("????????????", 1100, 15-Integer.parseInt(String.valueOf(n6))));

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("list", list);

                intent.putExtra("balance", String.valueOf(balance.getText()));

                startActivity(intent);
            }
        });
    }

    public boolean rtnInt(String inputData){ // => int????????? ????????? ??????????????? 0???????????? OK??? ???????????? ?????????
        try{
            if(Integer.parseInt(inputData) > 0 ) return true;//???????????? ????????? ????????? 0???????????? true??? ?????????
        }catch (Exception e){
            e.getStackTrace();
        }
        return false;
    }

}