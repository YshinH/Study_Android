package com.example.and11_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tv_name1, tv_name2, tv_cnt1, tv_cnt2, tv_money;
    Button btn_order1, btn_order2, btn_inputmoney, btn_ok;
    EditText edt_money;

    ArrayList<DrinkDTO> list; // = new ArrayList<>();//ArrayList를 사용 할 준비를 마침(초기화)
    ArrayList<ViewDTO> v_list = new ArrayList<>();
    DrinkDAO dao = new DrinkDAO();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_order1.setOnClickListener(this);
        btn_order2.setOnClickListener(this);

        list = dao.initDrinks();    //음료 두건을 만들어냄.(사실 디비에서 가져와야함)

        ViewDTO dto = new ViewDTO(findViewById(R.id.tv_name1), findViewById(R.id.tv_cnt1), findViewById(R.id.btn_order1));
        // dto ↑ 위젯 세개를 묶어서 관리할 수 있게 됨

        for(int i = 0; i < v_list.size(); i++){
            v_list.get(i).getBtn_order().setOnClickListener(this);

        }

        v_list.add(0, new ViewDTO(findViewById(R.id.tv_name1), findViewById(R.id.tv_cnt1), findViewById(R.id.btn_order1)));
        v_list.add(1, new ViewDTO(findViewById(R.id.tv_name2), findViewById(R.id.tv_cnt2), findViewById(R.id.btn_order2)));

        tv_money = findViewById(R.id.tv_money);
        btn_inputmoney = findViewById(R.id.btn_inputmoney);
        btn_ok = findViewById(R.id.btn_ok);
        //edt_money = findViewById(R.id.edt_money);

        dao.setData(list, v_list);
        //dao.setViewDTO(v_list.get(0));

/* ============================== ArrayList와 DTO구조로 묶어서 사용 안해도 되는 부분=================================================
        tv_name1 = findViewById(R.id.tv_name1);
        tv_name1.setText(list.get(0).getNameCnt());

        tv_name2 = findViewById(R.id.tv_name2);
        tv_name2.setText(list.get(1).getNameCnt());

        tv_cnt1 = findViewById(R.id.tv_cnt1);
        tv_cnt2 = findViewById(R.id.tv_cnt2);

        btn_order1 = findViewById(R.id.btn_order1);
        btn_order2 = findViewById(R.id.btn_order2);
        ============================== ArrayList와 DTO구조로 묶어서 사용 안해도 되는 부분=================================================*/


    }

    @Override
    public void onClick(View v) {
        int i = 0;
        if(v.getId() == R.id.btn_order1){
            //0 <- 콜라, 1000, 10
            i = 0;
        }else if (v.getId() == R.id.btn_order2) {
            i = 1;
        }
            dao.setMinusDrink(list, i);
            dao.setData(list, v_list);

    }
}