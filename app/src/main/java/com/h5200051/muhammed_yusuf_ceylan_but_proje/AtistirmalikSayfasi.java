package com.h5200051.muhammed_yusuf_ceylan_but_proje;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;

public class AtistirmalikSayfasi extends AppCompatActivity {
WebView wbvAtistirmalik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atistirmalik_sayfasi);

        ProgressDialog progressDialog = new ProgressDialog(AtistirmalikSayfasi.this);
        progressDialog.setMessage("Yükleniyor...");
        progressDialog.setCancelable(true);
        progressDialog.show();

        wbvAtistirmalik = findViewById(R.id.wbvAtistirmalik);
        wbvAtistirmalik.getSettings().setJavaScriptEnabled(true);
        //wbvAtistirmalik.loadUrl("https://www.medipol.edu.tr/");
        //String htmlYazi="<b>Koyu</b> and <i>İtalik</i> yazı</p>";
        wbvAtistirmalik.loadData(getResources().getString(R.string.atistirmalik_html_webview), "text/html; charset=UTF-8", null);
    }
}