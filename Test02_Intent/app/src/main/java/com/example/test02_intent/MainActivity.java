package com.example.test02_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_login;
    EditText id, pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = findViewById(R.id.btn_login);
        id = findViewById(R.id.id);
        pw = findViewById(R.id.pw);
        id.getText().toString();
        pw.getText().toString();


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentDTO dto = new IntentDTO(id.getText().toString(), pw.getText().toString());
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("dto", dto);
                startActivity(intent);



            }
        });

    }
}