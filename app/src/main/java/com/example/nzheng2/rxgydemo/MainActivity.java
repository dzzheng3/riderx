package com.example.nzheng2.rxgydemo;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView leftHeadText;
    private TextView rightHeadText;
    private TextView cardDesc;
    private TextView titleOfExplanation;
    private TextView tvCTA;
    private RecyclerView rv;
    private LinearLayout llBadgeContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
//        View medelView1 = getMedalView(3);
//        View medelView2 = getMedalView(3);
//        View medelView3 = getMedalView(3);
//        View medelView4 = getMedalView(3);

//        llBadgeContainer.addView(medelView1);
//        llBadgeContainer.addView(medelView2);
//        llBadgeContainer.addView(medelView3);
//        llBadgeContainer.addView(medelView4);
        TieredLandingPagePayload tieredLandingPagePayload = ModelManager.providePayload();
        bindData(tieredLandingPagePayload);


    }

    private View getMedalView(int count) {
        View view = getLayoutInflater().inflate(R.layout.medal_view, null);
        ProgressBar progressBar = view.findViewById(R.id.pb);
        resetConnectorSize(progressBar, count);
        return view;
    }

    private void resetConnectorSize(ProgressBar progressBar, int count) {
        if(count == 0) return;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) progressBar.getLayoutParams();
        if (count == 1){
            layoutParams.width = displayMetrics.widthPixels;
            layoutParams.height *= 2;
        }else {
            layoutParams.width = displayMetrics.widthPixels / (count+1);
        }
        progressBar.setLayoutParams(layoutParams);
    }

    private void initView() {
        leftHeadText = findViewById(R.id.tv_card_left_head_text);
        rightHeadText = findViewById(R.id.tv_card_right_head_text);
        cardDesc = findViewById(R.id.card_description_text);
        titleOfExplanation = findViewById(R.id.title_of_explanation);
        tvCTA = findViewById(R.id.tv_cta);
        rv = findViewById(R.id.rv);
        llBadgeContainer = findViewById(R.id.ll_badge_container);
    }

    private void bindData(TieredLandingPagePayload payload) {
        leftHeadText.setText(payload.cardLeftHeadText);
        rightHeadText.setText(payload.cardRightHeadText);
        cardDesc.setText(payload.cardDescriptionText);
        titleOfExplanation.setText(payload.titleOfExplaination);
        tvCTA.setText(payload.ctaText);

        List<TieredLandingPagePayload.TierBadgeInfo> feedTierList = payload.feedTierList;
        for(TieredLandingPagePayload.TierBadgeInfo badgeInfo: feedTierList){
            llBadgeContainer.addView(getMedalView(feedTierList.size()));
        }

        RvAdapter rvAdapter = new RvAdapter();
        rvAdapter.setData(payload.explainations);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rv.setLayoutManager(manager);
        rv.setAdapter(rvAdapter);
    }
}
