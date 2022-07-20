package com.example.test02_intent;

import android.widget.EditText;

import java.io.Serializable;

public class IntentDTO implements Serializable {
    private String id, pw;

    public IntentDTO(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
