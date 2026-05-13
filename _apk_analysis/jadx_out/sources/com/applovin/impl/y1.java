package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;

/* JADX INFO: loaded from: classes6.dex */
public class y1 extends v1 {
    public y1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(bVar, activity, kVar);
    }

    @Override // com.applovin.impl.v1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f10538d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f10537c.n(), (this.f10537c.u0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.f10538d.addView(kVar, this.f10539e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f10538d);
        } else {
            this.f10536b.setContentView(this.f10538d);
        }
    }
}
