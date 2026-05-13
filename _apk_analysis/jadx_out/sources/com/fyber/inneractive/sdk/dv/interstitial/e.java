package com.fyber.inneractive.sdk.dv.interstitial;

import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.google.android.gms.ads.AdListener;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f16202a;

    public e(g gVar) {
        this.f16202a = gVar;
    }

    public final void onAdFailedToLoad(int i10) {
        com.fyber.inneractive.sdk.dv.c cVar = this.f16202a.f16178g;
        if (cVar != null) {
            cVar.j();
            InneractiveAdRequest inneractiveAdRequest = this.f16202a.f16695a;
            String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
            com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
            g gVar = this.f16202a;
            com.fyber.inneractive.sdk.dv.handler.e.a(spotId, aVar, gVar.f16695a, (i) gVar.f16696b, String.format("errorCode - %d", Integer.valueOf(i10)));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        g gVar = this.f16202a;
        if (gVar.f16178g != null) {
            gVar.g();
            this.f16202a.f16178g.g();
        }
    }
}
