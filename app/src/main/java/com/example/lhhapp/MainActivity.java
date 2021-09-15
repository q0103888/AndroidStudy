package com.example.lhhapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText TextInputEditText_email,TextInputEditText_password;
    LinearLayout LinearLayout_login, LinearLayout_singup;
    Button btn1, btn2, btn3;
    Button testbtn, gocal;
    TextView textView_btn1;
    private Spinner spinner; //프로젝트 생성에 있는 spinner
    private ListView list;

    EditText et_save;
    String shared = "file"; //sharedexample

    private WebView webView;
    private String url = "https://www.naver.com";


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

        gocal = (Button)findViewById(R.id.gocal);
        gocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), calculator.class);
                startActivity(intent);
            }
        });

        testbtn = (Button)findViewById(R.id.testbtn);
        testbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                startActivity(intent);
            }
        });


        // Fragment에 대한 자바 코드
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                Fragment1 fragment1 = new Fragment1();
//                transaction.replace(R.id.frame, fragment1);
//                transaction.commit();
//            }
//        });
//
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                Fragment2 fragment2 = new Fragment2();
//                transaction.replace(R.id.frame, fragment2);
//                transaction.commit();
//            }
//        });
//
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                Fragment3 fragment3 = new Fragment3();
//                transaction.replace(R.id.frame, fragment3);
//                transaction.commit();
//            }
//        });


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

        //리스트 뷰에 대한 자바코드
//        list = (ListView)findViewById(R.id.list);
//
//        List<String> data = new ArrayList<>();
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
//        list.setAdapter(adapter);
//
//        data.add("안녕");
//        data.add("hi");
//        data.add("apple");
//        adapter.notifyDataSetChanged(); //notify는 현재 이상태를 저장하겠다라는 뜻


        //sharedPreferences에 대한 자바
//        et_save = (EditText)findViewById(R.id.et_save);
//
//        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
//        String value = sharedPreferences.getString("LHH", "");
//        et_save.setText(value);

    }

//    @Override
//    //sharedPreferences에 필한거 앱이 종료되었을때도 내용이 저장되어있게해줌 실제적인 저장공간
//   protected void onDestroy() {
//        super.onDestroy();
//
//        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
//        SharedPreferences.Editor editor = sharedPreferences.edit();  //저장할때 항상 에디터 불러야됨
//        String value = et_save.getText().toString();  //에딧택스트에 현재 써져있는 값을 받아옴
//        editor.putString("LHH", value); //저장하는 값 lhh라는 별명으로 저장함
//        editor.commit();
//    }

}