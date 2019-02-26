package com.example.nzheng2.rxgydemo;

import java.util.ArrayList;
import java.util.List;

public class ModelManager {

    public static TieredLandingPagePayload providePayload() {
        TieredLandingPagePayload.Explaination e1 =
                new TieredLandingPagePayload.Explaination("1", "Ride",
                        "Ride this week to unlock next week's saving.");
        TieredLandingPagePayload.Explaination e2 =
                new TieredLandingPagePayload.Explaination("2", "Ride",
                        "Ride this week to unlock next week's saving.");
        TieredLandingPagePayload.Explaination e3 =
                new TieredLandingPagePayload.Explaination("3" +
                        "", "Ride",
                        "Ride this week to unlock next week's saving.");
        TieredLandingPagePayload.TierBadgeInfo b1 = new TieredLandingPagePayload.TierBadgeInfo(50, 100, 5, "15% off", "", "Rides", "5/10");
        TieredLandingPagePayload.TierBadgeInfo b2 = new TieredLandingPagePayload.TierBadgeInfo(50, 100, 5, "15% off", "", "Rides", "5/10");
        TieredLandingPagePayload.TierBadgeInfo b3 = new TieredLandingPagePayload.TierBadgeInfo(50, 100, 5, "15% off", "", "Rides", "5/10");
        List<TieredLandingPagePayload.Explaination> explainations = new ArrayList<>();
        explainations.add(e1);
        explainations.add(e2);
//        explainations.add(e3);
//        explainations.add(e3);
//        explainations.add(e3);
//        explainations.add(e3);
//        explainations.add(e3);
        List<TieredLandingPagePayload.TierBadgeInfo> badgeInfos = new ArrayList<>();
        badgeInfos.add(b1);
        badgeInfos.add(b2);
        badgeInfos.add(b3);
        TieredLandingPagePayload pagePayload = new TieredLandingPagePayload("Ride & Save","30% off this week","Next week's progress","3 days left","Unlock saving for next week (1/14 - 1/20)","How it works",
                badgeInfos,explainations,"Terms & Conditions");
        return pagePayload;
    }
}
