package com.example.lhhapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class sharedexample extends AppCompatActivity {

    EditText et_save;
    String shared = "file"; //sharedexample

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharedexample);

        //sharedPreferences에 대한 자바
        et_save = (EditText)findViewById(R.id.et_save);

        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        String value = sharedPreferences.getString("LHH", "");
        et_save.setText(value);
    }

        @Override
    //sharedPreferences에 필한거 앱이 종료되었을때도 내용이 저장되어있게해줌 실제적인 저장공간
   protected void onDestroy() {
        super.onDestroy();

        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();  //저장할때 항상 에디터 불러야됨
        String value = et_save.getText().toString();  //에딧택스트에 현재 써져있는 값을 받아옴
        editor.putString("LHH", value); //저장하는 값 lhh라는 별명으로 저장함
        editor.commit();
    }
}