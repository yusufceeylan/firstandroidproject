package com.h5200051.muhammed_yusuf_ceylan_but_proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);




        Button btnAtistirmalik = findViewById(R.id.btnAtistirmalik);
        btnAtistirmalik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atistirmalikSayfasiIntent = new Intent(getApplicationContext(),AtistirmalikSayfasi.class);
                startActivity(atistirmalikSayfasiIntent);
            }
        });

        Button btnBakliyet = findViewById(R.id.btnBakliyat);
        btnBakliyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bakliyatSayfasiIntent = new Intent(getApplicationContext(),BakliyatSayfasi.class);
                startActivity(bakliyatSayfasiIntent);
            }
        });

        Button btnFirin = findViewById(R.id.btnFirin);
        btnFirin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firinSayfasiIntent = new Intent(getApplicationContext(),FirinSayfasi.class);
                startActivity(firinSayfasiIntent);
            }
        });

        Button btnSebze = findViewById(R.id.btnSebze);
        btnSebze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sebzeSayfasiIntent = new Intent(getApplicationContext(),SebzeSayfasi.class);
                startActivity(sebzeSayfasiIntent);
            }
        });

        Button btnMeyve = findViewById(R.id.btnMeyve);
        btnMeyve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent meyveSayfasiIntent = new Intent(getApplicationContext(),MeyveSayfasi.class);
                startActivity(meyveSayfasiIntent);
            }
        });
    }
}