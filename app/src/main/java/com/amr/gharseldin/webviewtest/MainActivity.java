package com.amr.gharseldin.webviewtest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.webkit.WebView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView;
        webView = (WebView)findViewById(R.id.webview);
        webView.loadUrl("http://www.msn.com");
    }
}
