package com.h5200051.muhammed_yusuf_ceylan_but_proje;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class SecondPage extends AppCompatActivity {
RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        recyclerView = findViewById(R.id.rcvMarket);

        ArrayList<String> item =new ArrayList<>();
        item.add("Sebze");
        item.add("Meyve");
        item.add("Bakliyat");
        item.add("Atıştırmalık");
        item.add("Fırın");

        ItemAdapter ogrenciAdapter = new ItemAdapter(item);
        recyclerView.setAdapter(ogrenciAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);


       Button thirdPageButton = findViewById(R.id.thirdPageButton);
        thirdPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdPageIntent = new Intent(getApplicationContext(),ThirdPage.class);
                startActivity(thirdPageIntent);
            }
        });

    }
}