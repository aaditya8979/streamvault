package com.fyber.inneractive.sdk.dv.rewarded;

import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends RewardedAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f16214a;

    public e(g gVar) {
        this.f16214a = gVar;
    }

    public final void onRewardedAdFailedToLoad(int i10) {
        com.fyber.inneractive.sdk.dv.c cVar = this.f16214a.f16178g;
        if (cVar != null) {
            cVar.j();
            InneractiveAdRequest inneractiveAdRequest = this.f16214a.f16695a;
            String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
            com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
            g gVar = this.f16214a;
            com.fyber.inneractive.sdk.dv.handler.e.a(spotId, aVar, gVar.f16695a, (i) gVar.f16696b, String.format("errorCode - %d", Integer.valueOf(i10)));
        }
    }

    public final void onRewardedAdLoaded() {
        g gVar = this.f16214a;
        if (gVar.f16178g != null) {
            gVar.g();
            this.f16214a.f16178g.g();
        }
    }
}
