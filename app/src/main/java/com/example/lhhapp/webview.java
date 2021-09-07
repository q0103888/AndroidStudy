package com.example.lhhapp;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class webview extends AppCompatActivity {

    private WebView webView;
    private String url = "https://www.naver.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_example);

        //webview에 대한 자바 현재 지정한 Url을 토대로 화면에 표시
        webView = (WebView)findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new webview.WebViewClientClass());
    }
    // WebView에 대한 추가 클래스 이것은 뒤로가기를 눌렀을때 원래 화면으로 돌아가는 코드 (없어도 웹 화면은 보여지긴함)
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);

    }
    // onCreate에 있는 WebViewClientClass()에 필요한 클래스 저거 할려면 클래스 만들어 줘야댐
    private class WebViewClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
