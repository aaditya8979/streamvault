package com.fyber.inneractive.sdk.dv.rewarded;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends com.fyber.inneractive.sdk.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f16216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f16217l;

    public g(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f16216k = new e(this);
        this.f16217l = new f(this);
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity) {
        this.f15769j = aVar;
        ((RewardedAd) this.f16180i).show(activity, this.f16217l);
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        this.f16178g = cVar;
        RewardedAd rewardedAd = new RewardedAd(o.f19548a, "FyberRewarded");
        this.f16180i = rewardedAd;
        rewardedAd.loadAd(adRequest, this.f16216k);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        Object obj = this.f16180i;
        if (obj != null) {
            return ((RewardedAd) obj).isLoaded();
        }
        return false;
    }
}
