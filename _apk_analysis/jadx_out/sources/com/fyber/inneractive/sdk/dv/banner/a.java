package com.fyber.inneractive.sdk.dv.banner;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.handler.e;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.b0;
import com.fyber.inneractive.sdk.flow.x;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f16182a;

    public a(b bVar) {
        this.f16182a = bVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        InneractiveAdRequest inneractiveAdRequest = this.f16182a.f16695a;
        String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
        com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
        b bVar = this.f16182a;
        e.a(spotId, aVar, bVar.f16695a, (i) bVar.f16696b, loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        b bVar = this.f16182a;
        c cVar = bVar.f16179h;
        if (cVar != null) {
            cVar.w();
        } else {
            bVar.f16183j = true;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        b bVar = this.f16182a;
        com.fyber.inneractive.sdk.dv.c cVar = bVar.f16178g;
        if (cVar != null) {
            bVar.f16184k = true;
            cVar.g();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        i iVar;
        l0 l0Var;
        c cVar = this.f16182a.f16179h;
        if (cVar != null) {
            cVar.a(cVar.y(), false, Float.NaN, Float.NaN);
            x xVar = cVar.f16282b;
            if (xVar == null || (iVar = (i) ((b) xVar).f16696b) == null) {
                return;
            }
            b0.a(iVar);
            s0 s0Var = ((b) cVar.f16282b).f16698d;
            if (s0Var == null || (l0Var = ((r0) s0Var).f16095c) == null) {
                return;
            }
            b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.CLICK, l0Var.f16080b == UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY);
        }
    }
}
