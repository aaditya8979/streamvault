package com.fyber.inneractive.sdk.dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends com.fyber.inneractive.sdk.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f16204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f16205l;

    public g(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f16204k = new e(this);
        this.f16205l = new f(this);
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(a aVar, Activity activity) {
        this.f15769j = aVar;
        Object obj = this.f16180i;
        if (obj != null) {
            ((InterstitialAd) obj).setAdListener(this.f16205l);
            ((InterstitialAd) this.f16180i).show();
        }
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        this.f16178g = cVar;
        InterstitialAd interstitialAd = new InterstitialAd(o.f19548a);
        this.f16180i = interstitialAd;
        interstitialAd.setAdListener(this.f16204k);
        ((InterstitialAd) this.f16180i).setAdUnitId("FyberInterstitial");
        ((InterstitialAd) this.f16180i).loadAd(adRequest);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        Object obj = this.f16180i;
        return obj != null && ((InterstitialAd) obj).isLoaded();
    }
}
