package com.h5200051.muhammed_yusuf_ceylan_but_proje;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MarketViewHolder extends RecyclerView.ViewHolder {

    ImageView imgUrun;
    TextView txtItemAdi;
    TextView txtInformasyon;


    public MarketViewHolder(@NonNull View itemView) {
        super(itemView);
        imgUrun = itemView.findViewById(R.id.imgHoca);
        txtItemAdi= itemView.findViewById(R.id.txtItemAdi);
        txtInformasyon= itemView.findViewById(R.id.txtMail);
    }
}
