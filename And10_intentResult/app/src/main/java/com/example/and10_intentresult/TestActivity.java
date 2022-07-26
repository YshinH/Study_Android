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

        Intent intent = getIntent();//보내준 Intent를 받아옴.
        LoginDTO dto = (LoginDTO) intent.getSerializableExtra("dto");
        String sData = intent.getStringExtra("sData");
        int iData = intent.getIntExtra("iData",-1);

        Log.d("테스트", " dto : " + dto.getId() + dto.getPw());
        Log.d("테스트", " sData : " + sData);
        Log.d("테스트", " iData : " + iData);

        findViewById(R.id.btn_finish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reIntent = new Intent();
                reIntent.putExtra("test" , "테스트가 끝남");
                // 결과 코드 를 지정을 한다
                setResult(RESULT_OK,reIntent);

                //액티비티를 종료함(끔)
                finish();

            }
        });


    }
}