package com.example.nzheng2.rxgydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

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
        View medelView = getLayoutInflater().inflate(R.layout.medal_view, null);

        llBadgeContainer.addView(medelView);
        bindData(ModelManager.providePayload());
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

    private void bindData(TieredLandingPagePayload tieredLandingPagePayload) {

    }
}
