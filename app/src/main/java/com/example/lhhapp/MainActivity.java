package com.example.lhhapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import android.app.Fragment;

public class MainActivity extends AppCompatActivity {

    TextInputEditText TextInputEditText_email,TextInputEditText_password;
    LinearLayout LinearLayout_login, LinearLayout_singup;

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 밑 내용은 아직 덜 작성(로그인 화면에 대한 액션들)
//        TextInputEditText_email    = findViewById(R.id.TextInputEditText_email); //findView = 화면에서 컴포넌트를 찾아라
//        TextInputEditText_password = findViewById(R.id.TextInputEditText_password);
//        LinearLayout_login         = findViewById(R.id.LinearLayout_login);
//        LinearLayout_singup        = findViewById(R.id.LinearLayout_singup);
//        //1. 값을 가져온다
//        //2. 클릭을 감지한다
//        //3. 1번의 값을 다음 액티비티로 넘긴다
//
//        String email = TextInputEditText_email.getText().toString();
//        String password = TextInputEditText_password.getText().toString();

        btn1 = (Button)findViewById(R.id.btn_1);
        btn2 = (Button)findViewById(R.id.btn_2);
        btn3 = (Button)findViewById(R.id.btn_3);


    }
}