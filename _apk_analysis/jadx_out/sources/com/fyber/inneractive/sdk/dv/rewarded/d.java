package com.fyber.inneractive.sdk.dv.rewarded;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends com.fyber.inneractive.sdk.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f16211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f16212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f16213m;

    public d(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f16211k = new a(this);
        this.f16212l = new b(this);
        this.f16213m = new c(this);
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity) {
        this.f15769j = aVar;
        Object obj = this.f16180i;
        if (obj != null) {
            ((RewardedAd) obj).setFullScreenContentCallback(this.f16212l);
            ((RewardedAd) this.f16180i).show(activity, this.f16213m);
        }
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        this.f16178g = cVar;
        RewardedAd.load(o.f19548a, "FyberRewarded", adRequest, this.f16211k);
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
