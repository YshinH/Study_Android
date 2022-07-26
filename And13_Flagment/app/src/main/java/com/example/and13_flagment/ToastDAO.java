package com.example.and13_flagment;

import android.content.Context;
import android.widget.Toast;

public class ToastDAO {

/*    Context context;
    
    Context의 기능을 여러 메소드에서 (ToastDAO) 사용한다면 생성자를 사용해서
    Context자체를 필드로 두고 사용하는 것이 편하고
    한번만 쓴다면 Context를 파라미터로 받아옴

    public ToastDAO(Context context) {
        this.context = context;
    }*/

    public void showToast(Context context, String inputData){

         Toast.makeText(context, inputData, Toast.LENGTH_SHORT).show();

        return;
    }


}
