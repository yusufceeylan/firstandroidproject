package com.h5200051.muhammed_yusuf_ceylan_but_proje;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;

public class BakliyatSayfasi extends AppCompatActivity {

    WebView wbvBakliyat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakliyat_sayfasi);

        ProgressDialog progressDialog = new ProgressDialog(BakliyatSayfasi.this);
        progressDialog.setMessage("Yükleniyor...");
        progressDialog.setCancelable(true);
        progressDialog.show();

        wbvBakliyat= findViewById(R.id.wbvBakliyat);
        wbvBakliyat.getSettings().setJavaScriptEnabled(true);
        wbvBakliyat.loadData(getResources().getString(R.string.bakliyat_html_webview), "text/html; charset=UTF-8", null);

    }
}