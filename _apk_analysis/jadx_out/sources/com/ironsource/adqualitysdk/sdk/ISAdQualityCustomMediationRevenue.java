package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: loaded from: classes12.dex */
public class ISAdQualityCustomMediationRevenue {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final double f58;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final ISAdQualityAdType f59;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final ISAdQualityMediationNetwork f60;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final String f61;

    public static class Builder {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f62;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private double f64;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ISAdQualityMediationNetwork f65 = ISAdQualityMediationNetwork.UNKNOWN;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private ISAdQualityAdType f63 = ISAdQualityAdType.UNKNOWN;

        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f65, this.f63, this.f64, this.f62, (byte) 0);
        }

        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f63 = iSAdQualityAdType;
            return this;
        }

        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f65 = iSAdQualityMediationNetwork;
            return this;
        }

        public Builder setPlacement(String str) {
            this.f62 = str;
            return this;
        }

        public Builder setRevenue(double d10) {
            this.f64 = d10;
            return this;
        }
    }

    private ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d10, String str) {
        this.f60 = iSAdQualityMediationNetwork;
        this.f59 = iSAdQualityAdType;
        this.f58 = d10;
        this.f61 = str;
    }

    public /* synthetic */ ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d10, String str, byte b10) {
        this(iSAdQualityMediationNetwork, iSAdQualityAdType, d10, str);
    }

    public ISAdQualityAdType getAdType() {
        return this.f59;
    }

    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f60;
    }

    public String getPlacement() {
        return this.f61;
    }

    public double getRevenue() {
        return this.f58;
    }
}
