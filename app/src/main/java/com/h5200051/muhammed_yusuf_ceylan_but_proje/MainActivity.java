package com.h5200051.muhammed_yusuf_ceylan_but_proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnGiris = findViewById(R.id.btnGiris);
        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Intent secondPageIntent = new Intent(getApplicationContext(),SecondPage.class);
                  startActivity(secondPageIntent);
            }
        });



    }
}