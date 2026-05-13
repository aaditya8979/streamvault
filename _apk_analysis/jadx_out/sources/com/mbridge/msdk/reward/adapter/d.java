package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: RewardVideoCampaignState.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f39432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f39433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39434c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39435d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39436e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39437f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39438g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f39439h = 0;

    public void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f39433b = campaignEx;
            this.f39435d = campaignEx.getSecondRequestIndex();
            this.f39436e = campaignEx.getSecondShowIndex();
            this.f39437f = campaignEx.getFilterCallBackState();
            this.f39439h = campaignEx.getFilterAdsShowCallState();
            this.f39438g = campaignEx.getFilterAdsVideoCallState();
        }
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f39432a = copyOnWriteArrayList;
    }

    public void a(boolean z10) {
        this.f39434c = z10;
    }

    public boolean a() {
        return this.f39435d == 1 && this.f39434c;
    }

    public CopyOnWriteArrayList<CampaignEx> b() {
        return this.f39432a;
    }

    public int c() {
        return this.f39438g;
    }

    public int d() {
        return this.f39437f;
    }

    public boolean e() {
        return this.f39434c;
    }
}
