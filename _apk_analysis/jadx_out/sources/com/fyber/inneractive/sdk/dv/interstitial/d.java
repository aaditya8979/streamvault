package com.fyber.inneractive.sdk.dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends com.fyber.inneractive.sdk.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f16200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f16201l;

    public d(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f16200k = new b(this);
        this.f16201l = new c(this);
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(a aVar, Activity activity) {
        this.f15769j = aVar;
        Object obj = this.f16180i;
        if (obj != null) {
            ((InterstitialAd) obj).setFullScreenContentCallback(this.f16201l);
            ((InterstitialAd) this.f16180i).show(activity);
        }
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        this.f16178g = cVar;
        InterstitialAd.load(o.f19548a, "FyberInterstitial", adRequest, this.f16200k);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return this.f16180i != null;
    }
}
