package com.example.nzheng2.rxgydemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class RvViewHolder extends RecyclerView.ViewHolder {

    private final CircularTextView number;
    private final TextView headline;
    private final TextView headlineDesc;

    public RvViewHolder(@NonNull View itemView) {
        super(itemView);
        number = itemView.findViewById(R.id.ctv_number);
        headline = itemView.findViewById(R.id.tv_headline);
        headlineDesc = itemView.findViewById(R.id.tv_headline_desc);
        number.setStrokeWidth(1);
        number.setStrokeColor("#47B275");
        number.setSolidColor("#47B275");
    }

    public void bindData(TieredLandingPagePayload.Explaination explaination) {
        number.setText(explaination.number);
        headline.setText(explaination.headline);
        headlineDesc.setText(explaination.headlineDescription);
    }
}
