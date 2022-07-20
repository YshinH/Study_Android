package com.example.test02_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    TextView id_chk, pw_chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        IntentDTO dto = (IntentDTO)intent.getSerializableExtra("dto");

        id_chk = findViewById(R.id.id_chk);
        pw_chk = findViewById(R.id.pw_chk);

        id_chk.setText(dto.getId());
        pw_chk.setText(dto.getPw());

        Log.d("가져온 dto id ", dto.getId());
        Log.d("가져온 dto pw ", dto.getPw());
    }
}