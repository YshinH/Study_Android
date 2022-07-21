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

    int n1=0, n2=0, n3=0, n4=0, n5=0, n6=0, balance_int=0;

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
                    Log.d("아무값" , "OK: ");

                    balance.setText(edt_money.getText());
                    balance_int = Integer.parseInt(String.valueOf(balance.getText()));
                }else{
                    Log.d("아무값" , "NG: ");
                    Toast.makeText(getApplicationContext(), "정수만 입력해주세요", Toast.LENGTH_SHORT).show();
                    edt_money.setText("");
                    edt_money.setHint("잘못입력하셨습니다!");
                }
            }
        });

        n1 = Integer.parseInt(String.valueOf(number_1.getText()));
        n2 = Integer.parseInt(String.valueOf(number_2.getText()));
        n3 = Integer.parseInt(String.valueOf(number_3.getText()));
        n4 = Integer.parseInt(String.valueOf(number_4.getText()));
        n5 = Integer.parseInt(String.valueOf(number_5.getText()));
        n6 = Integer.parseInt(String.valueOf(number_6.getText()));

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { /* try catch 나중에 */
                 if(n1 > 0 && balance_int >= 800) {
                    n1--;
                    number_1.setText(n1 + "");
                    balance_int -= 800;
                    balance.setText(balance_int+"");
                }
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n2 > 0 && balance_int >= 800){
                    n2--;
                    balance_int -= 800;
                    number_2.setText(n2 + "");
                    balance.setText(balance_int+"");
                }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n3 > 0 && balance_int >= 1000){
                    n3--;
                    balance_int -= 1000;
                    number_3.setText(n3 + "");
                    balance.setText(balance_int+"");
                }
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n4 > 0 && balance_int >= 1000){
                    n4--;
                    balance_int -= 1000;
                    number_4.setText(n4 + "");
                    balance.setText(balance_int+"");
                }
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n5 > 0 && balance_int >= 1100){
                    n5--;
                    balance_int -= 1100;
                    number_5.setText(n5 + "");
                    balance.setText(balance_int+"");
                }
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n6 > 0 && balance_int >= 1100){
                    n6--;
                    balance_int -= 1100;
                    number_6.setText(n6 + "");
                    balance.setText(balance_int+"");
                }
            }
        });

        VendingListDTO dto1 = new VendingListDTO("콜라", 800, 10-n1 );
        VendingListDTO dto2 = new VendingListDTO("사이다", 800, 10-n2 );
        VendingListDTO dto3 = new VendingListDTO("환타오렌지", 1000,  5-n3 );
        VendingListDTO dto4 = new VendingListDTO("환타포도", 1000, 8-n4 );
        VendingListDTO dto5 = new VendingListDTO("펩시", 1100, 12-n5 );
        VendingListDTO dto6 = new VendingListDTO("제로콜라", 1100, 15-n6 );

        ArrayList<VendingListDTO> list = new ArrayList<>();
        list.add(0, dto1);
        list.add(1, dto2);
        list.add(2, dto3);
        list.add(3, dto4);
        list.add(4, dto5);
        list.add(5, dto6);

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("bal", balance.getText());
                intent.putExtra("dto", dto1);
                intent.putExtra("list", list);

                startActivity(intent);

            }
        });

    }

    public boolean rtnInt(String inputData){ // => int형태로 바뀌고 그리고나서 0이상이면 OK를 리턴하는 메소드
        try{
            if(Integer.parseInt(inputData) > 0 ) return true;//바뀌는게 오류가 안나고 0이상이면 true가 리턴됨
        }catch (Exception e){
            e.getStackTrace();
        }
        return false;
    }

}