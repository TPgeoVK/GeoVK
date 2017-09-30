package ru.iojs.geovk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview = new WebView(this);
    }
    public void login(View view) {
        webview.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                setContentView(webview);
                return false;


            }
        });
        webview.loadUrl("https://tpgeovk-backend.herokuapp.com/auth");



        Intent intent = new Intent(MainActivity.this, RecommendationsActivity.class);
        startActivity(intent);
    }
}
