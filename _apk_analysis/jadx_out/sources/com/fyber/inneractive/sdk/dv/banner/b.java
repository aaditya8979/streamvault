package com.fyber.inneractive.sdk.dv.banner;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends com.fyber.inneractive.sdk.dv.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f16185l;

    public b(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f16183j = false;
        this.f16184k = false;
        this.f16185l = new a(this);
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        l0 l0Var;
        this.f16178g = cVar;
        AdView adView = new AdView(o.f19548a);
        this.f16180i = adView;
        AdSize adSize = AdSize.BANNER;
        s0 s0Var = this.f16698d;
        if (s0Var != null && (l0Var = ((r0) s0Var).f16095c) != null && l0Var.f16080b == UnitDisplayType.MRECT) {
            adSize = AdSize.MEDIUM_RECTANGLE;
        }
        adView.setAdSize(adSize);
        ((AdView) this.f16180i).setAdUnitId("FyberBanner");
        ((AdView) this.f16180i).setAdListener(this.f16185l);
        ((AdView) this.f16180i).loadAd(adRequest);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return this.f16184k;
    }
}
