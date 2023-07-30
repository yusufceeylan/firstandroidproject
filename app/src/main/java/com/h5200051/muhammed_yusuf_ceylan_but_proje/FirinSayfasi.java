package com.h5200051.muhammed_yusuf_ceylan_but_proje;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;

public class FirinSayfasi extends AppCompatActivity {
WebView wbvFirin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firin_sayfasi);

        ProgressDialog progressDialog = new ProgressDialog(FirinSayfasi.this);
        progressDialog.setMessage("Yükleniyor...");
        progressDialog.setCancelable(true);
        progressDialog.show();

        wbvFirin= findViewById(R.id.wbvFirin);
        wbvFirin.getSettings().setJavaScriptEnabled(true);
        wbvFirin.loadData(getResources().getString(R.string.firin_html_webview), "text/html; charset=UTF-8", null);
    }
}