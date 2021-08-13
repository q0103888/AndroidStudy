package com.example.lhhapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.content.Intent;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText TextInputEditText_email,TextInputEditText_password;
    LinearLayout LinearLayout_login, LinearLayout_singup;
    Button btn1, btn2, btn3;
    TextView textView_btn1;
    private Spinner spinner; //프로젝트 생성에 있는 spinner


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

        btn1 = (Button)findViewById(R.id.btn_1); //btn들은 프래그먼트 화면전환
        btn2 = (Button)findViewById(R.id.btn_2);
        btn3 = (Button)findViewById(R.id.btn_3);
        textView_btn1 = findViewById(R.id.LinearLayout_singup);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment1 fragment1 = new Fragment1();
                transaction.replace(R.id.frame, fragment1);
                transaction.commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment2 fragment2 = new Fragment2();
                transaction.replace(R.id.frame, fragment2);
                transaction.commit();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment3 fragment3 = new Fragment3();
                transaction.replace(R.id.frame, fragment3);
                transaction.commit();
            }
        });

//        textView_btn1 = findViewById(R.id.LinearLayout_singup); //로그인 창에서 회원가입 창으로 넘어가는거
//        textView_btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Singup.class);
//                startActivity(intent); //액티비티 이동
//            }
//        });


//        spinner = (Spinner)findViewById(R.id.spinner); //프로젝트 생성에 있는 spinner에 대한 리스너들
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });


    }
}