package com.h5200051.muhammed_yusuf_ceylan_but_proje;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;

public class SebzeSayfasi extends AppCompatActivity {
WebView wbvFirin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebze_sayfasi);

        ProgressDialog progressDialog = new ProgressDialog(SebzeSayfasi.this);
        progressDialog.setMessage("Yükleniyor...");
        progressDialog.setCancelable(true);
        progressDialog.show();

        wbvFirin= findViewById(R.id.wbvSebze);
        wbvFirin.getSettings().setJavaScriptEnabled(true);
        wbvFirin.loadData(getResources().getString(R.string.sebze_html_webview), "text/html; charset=UTF-8", null);
    }
}