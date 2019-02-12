package com.example.nzheng2.rxgydemo;

import java.util.List;


class TieredLandingPagePayload {

    // Headlines
    String title;
    String subtitle;

    public TieredLandingPagePayload(String title, String subtitle, String cardLeftHeadText, String cardRightHeadText, String cardDescriptionText, String titleOfExplaination, List<TierBadgeInfo> feedTierList, List<Explaination> explainations, String ctaText) {
        this.title = title;
        this.subtitle = subtitle;
        this.cardLeftHeadText = cardLeftHeadText;
        this.cardRightHeadText = cardRightHeadText;
        this.cardDescriptionText = cardDescriptionText;
        this.titleOfExplaination = titleOfExplaination;
        this.feedTierList = feedTierList;
        this.explainations = explainations;
        CtaText = ctaText;
    }

    // inside card
    String cardLeftHeadText;
    String cardRightHeadText;
    String cardDescriptionText;
    String titleOfExplaination;
    // Tiers
    List<TierBadgeInfo> feedTierList;
    List<Explaination> explainations;
    // CTA
    String CtaText;

    static class TierBadgeInfo {
        int progress;
        int total;
        int initialProgress;
        String trackerText;
        String tierIcon;
        String primaryFooterText;
        String secondaryFooterText;

        public TierBadgeInfo(int progress, int total, int initialProgress, String trackerText, String tierIcon, String primaryFooterText, String secondaryFooterText) {
            this.progress = progress;
            this.total = total;
            this.initialProgress = initialProgress;
            this.trackerText = trackerText;
            this.tierIcon = tierIcon;
            this.primaryFooterText = primaryFooterText;
            this.secondaryFooterText = secondaryFooterText;
        }
    }

    static class Explaination {
        //how about 1 2 3
        String number;
        String headline;
        String headlineDescription;

        public Explaination(String number, String headline, String headlineDescription) {
            this.number = number;
            this.headline = headline;
            this.headlineDescription = headlineDescription;
        }
    }
}


