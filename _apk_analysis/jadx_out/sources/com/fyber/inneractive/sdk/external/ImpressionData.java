package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: classes2.dex */
public class ImpressionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Pricing f16220a = new Pricing();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Video f16221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f16223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f16225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f16226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f16227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f16228i;

    public static class Pricing {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f16229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16230b;

        public String getCurrency() {
            return this.f16230b;
        }

        public double getValue() {
            return this.f16229a;
        }

        public void setValue(double d10) {
            this.f16229a = d10;
        }

        public String toString() {
            return "Pricing{value=" + this.f16229a + ", currency='" + this.f16230b + "'}";
        }
    }

    public static class Video {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f16231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f16232b;

        public Video(boolean z10, long j10) {
            this.f16231a = z10;
            this.f16232b = j10;
        }

        public long getDuration() {
            return this.f16232b;
        }

        public boolean isSkippable() {
            return this.f16231a;
        }

        public String toString() {
            return "Video{skippable=" + this.f16231a + ", duration=" + this.f16232b + '}';
        }
    }

    public String getAdvertiserDomain() {
        return this.f16228i;
    }

    public String getCampaignId() {
        return this.f16227h;
    }

    public String getCountry() {
        return this.f16224e;
    }

    public String getCreativeId() {
        return this.f16226g;
    }

    public Long getDemandId() {
        return this.f16223d;
    }

    public String getDemandSource() {
        return this.f16222c;
    }

    public String getImpressionId() {
        return this.f16225f;
    }

    public Pricing getPricing() {
        return this.f16220a;
    }

    public Video getVideo() {
        return this.f16221b;
    }

    public void setAdvertiserDomain(String str) {
        this.f16228i = str;
    }

    public void setCampaignId(String str) {
        this.f16227h = str;
    }

    public void setCountry(String str) {
        this.f16224e = str;
    }

    public void setCpmValue(String str) {
        double d10;
        try {
            d10 = Double.parseDouble(str);
        } catch (Exception unused) {
            d10 = 0.0d;
        }
        this.f16220a.f16229a = d10;
    }

    public void setCreativeId(String str) {
        this.f16226g = str;
    }

    public void setCurrency(String str) {
        this.f16220a.f16230b = str;
    }

    public void setDemandId(Long l10) {
        this.f16223d = l10;
    }

    public void setDemandSource(String str) {
        this.f16222c = str;
    }

    public void setDuration(long j10) {
        this.f16221b.f16232b = j10;
    }

    public void setImpressionId(String str) {
        this.f16225f = str;
    }

    public void setPricing(Pricing pricing) {
        this.f16220a = pricing;
    }

    public void setVideo(Video video) {
        this.f16221b = video;
    }

    public String toString() {
        return "ImpressionData{pricing=" + this.f16220a + ", video=" + this.f16221b + ", demandSource='" + this.f16222c + "', country='" + this.f16224e + "', impressionId='" + this.f16225f + "', creativeId='" + this.f16226g + "', campaignId='" + this.f16227h + "', advertiserDomain='" + this.f16228i + "'}";
    }
}
