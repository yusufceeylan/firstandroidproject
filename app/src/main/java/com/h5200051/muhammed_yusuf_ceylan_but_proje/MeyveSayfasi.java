package com.h5200051.muhammed_yusuf_ceylan_but_proje;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;

public class MeyveSayfasi extends AppCompatActivity {
WebView wbvMeyve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meyve_sayfasi);

        ProgressDialog progressDialog = new ProgressDialog(MeyveSayfasi.this);
        progressDialog.setMessage("Yükleniyor...");
        progressDialog.setCancelable(true);
        progressDialog.show();

        wbvMeyve= findViewById(R.id.wbvMeyve);
        wbvMeyve.getSettings().setJavaScriptEnabled(true);
        wbvMeyve.loadData(getResources().getString(R.string.meyve_html_webview), "text/html; charset=UTF-8", null);
    }
}