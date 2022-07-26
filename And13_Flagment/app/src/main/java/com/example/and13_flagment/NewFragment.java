package com.example.and13_flagment;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class NewFragment extends Fragment {
    //기본적으로 프래그먼트 파일을 추가하게 되면 불필요한 코드가 많음
    //우리가 필요한것은 onCreateView!만 있으면 됨.
    //onCreateView라는 메소드는 항상 View타입이 리턴되어야한다.

    //서브프래그먼트가 생성될때 상위 액티비티에서 받아오는 방식 ????
    //
    Context context;
    //생성자를 이용해서 액티비티로부터 Context를 받아온다.
    // ※ 3번째 방법 필요한 기능(객체)이 있고 생성하거나 받아올 수 없는 상황이면,
    //객체가 생성될때 해당하는 기능을 받아오면된다.
    Button btn_new;

    public NewFragment(Context context) {
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_new, container, false);
        btn_new = v.findViewById(R.id.btn_new);

        btn_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Context는 어떠한 기능을 사용하기위해서 상위 액티비티에서 무언가를 받아옴. 영역을 나눠놓음
                //Toast.makeText(v.getContext(), "", Toast.LENGTH_SHORT).show(); <= 오류가 날 소지가 많음 x
                //Toast.makeText(getContext(), btn_new.getText(),Toast.LENGTH_LONG).show(); // 1. Fragment에서 Context기능을 받아오는 위한 첫번째 방법
                //Toast.makeText(getActivity(), btn_new.getText(),Toast.LENGTH_LONG).show(); // 2. Fragment에서 Context기능을 받아오는 위한 첫번째 방법

                Toast.makeText(context, "하...생성자", Toast.LENGTH_SHORT).show();;
            }
        });


        return v;
    }
}