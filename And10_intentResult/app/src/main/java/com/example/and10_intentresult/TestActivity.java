package com.example.and10_intentresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Intent intent = getIntent();
        LoginDTO dto = (LoginDTO) intent.getSerializableExtra("dto");
        String ysh = intent.getStringExtra("String");
        int num = intent.getIntExtra("num", -1);


        Log.d("dto", "dto : " + dto.getId() + dto.getPw());
        Log.d("String","String : " +  ysh);
        Log.d("int", "int : " + num);

        findViewById(R.id.btn_finish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reIntent = new Intent();
                reIntent.putExtra("test", "테스트가 끝남");
                // 결과코드를 지정을 한다.
                setResult(RESULT_OK, reIntent);

                //액티비티를 종료함(끔/..)
                finish();
                
                
                
            }
        });
        

    }
}