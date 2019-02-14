package com.example.nzheng2.rxgydemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvViewHolder> {
    private List<TieredLandingPagePayload.Explaination> explainations;

    @NonNull
    @Override
    public RvViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv, viewGroup, false);
        return new RvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RvViewHolder rvViewHolder, int i) {
        rvViewHolder.bindData(explainations.get(i));
    }

    @Override
    public int getItemCount() {
        return explainations.size();
    }

    public void setData(List<TieredLandingPagePayload.Explaination> explainations){
        this.explainations = explainations;
    }
}
