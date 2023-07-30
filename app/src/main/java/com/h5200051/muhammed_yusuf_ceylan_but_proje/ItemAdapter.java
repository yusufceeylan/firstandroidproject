package com.h5200051.muhammed_yusuf_ceylan_but_proje;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<MarketViewHolder> {

    List<String> item =new ArrayList<>();
    public ItemAdapter(List<String> item) {
        this.item = item;
    }
    @NonNull
    @Override
    public MarketViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_market, viewGroup,false);
        return new MarketViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MarketViewHolder viewHolder, int position) {
        viewHolder.txtItemAdi.setText(item.get(position));
    }
    @Override
    public int getItemCount() {
        return item.size();
    }
}

