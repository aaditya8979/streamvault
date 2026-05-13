package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.k;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f16187m;

    public c() {
        boolean z10;
        try {
            Class.forName("com.google.android.gms.ads.InterstitialAd");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        this.f16187m = !z10;
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        x xVar = this.f16414c;
        if (xVar != null) {
            a aVar = (a) xVar;
            aVar.f16178g = null;
            aVar.f16180i = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        x xVar = this.f16414c;
        if (xVar != null) {
            a aVar = (a) xVar;
            aVar.f16178g = null;
            aVar.f16180i = null;
        }
        this.f16422k.a();
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        r.f19556b.removeCallbacks(this.f16423l);
        this.f16412a = null;
        this.f16413b = null;
        this.f16414c = null;
        this.f16415d = null;
        this.f16416e = null;
        this.f16417f = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void h() {
        com.fyber.inneractive.sdk.response.e eVar = this.f16413b;
        if (eVar == null || ((i) eVar).f19401u == null) {
            j();
            return;
        }
        InneractiveAdRequest inneractiveAdRequest = this.f16412a;
        if (inneractiveAdRequest != null) {
            boolean muteVideo = inneractiveAdRequest.getMuteVideo();
            try {
                MobileAds.setAppMuted(muteVideo);
                MobileAds.setAppVolume(muteVideo ? 0.0f : 1.0f);
            } catch (Throwable unused) {
            }
        }
        i iVar = (i) this.f16413b;
        UnitDisplayType unitDisplayType = iVar.f19396p;
        QueryInfo queryInfo = iVar.f19401u.f16207a;
        int i10 = b.f16181a[unitDisplayType.ordinal()];
        x bVar = i10 != 1 ? (i10 == 2 || i10 == 3) ? new com.fyber.inneractive.sdk.dv.banner.b(f(), this.f16418g, (i) this.f16413b) : i10 != 4 ? null : this.f16187m ? new com.fyber.inneractive.sdk.dv.rewarded.d(f(), this.f16418g, (i) this.f16413b) : new com.fyber.inneractive.sdk.dv.rewarded.g(f(), this.f16418g, (i) this.f16413b) : this.f16187m ? new com.fyber.inneractive.sdk.dv.interstitial.d(f(), this.f16418g, (i) this.f16413b) : new com.fyber.inneractive.sdk.dv.interstitial.g(f(), this.f16418g, (i) this.f16413b);
        this.f16414c = bVar;
        if (queryInfo == null || bVar == null || this.f16413b == null) {
            j();
            return;
        }
        try {
            AdRequest.Builder builder = new AdRequest.Builder();
            try {
                AdRequest.Builder.class.getMethod("setAdString", String.class).invoke(builder, ((i) this.f16413b).N);
            } catch (Exception unused2) {
                builder.setAdInfo(new AdInfo(queryInfo, ((i) this.f16413b).N));
            }
            ((a) this.f16414c).a(builder.build(), this);
        } catch (Throwable unused3) {
            j();
        }
    }

    public final void j() {
        b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.NETWORK_ERROR));
    }
}
