package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0 f46583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final BannerAdShowListener f46584b;

    public c(@Nullable BannerAdShowListener bannerAdShowListener, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull sn.a<A> aVar2, @NotNull sn.a<h0> aVar3, @NotNull AdFormatType adFormatType, @NotNull com.moloco.sdk.acm.recorder.a aVar4) {
        tn.p.k(rVar, "appLifecycleTrackerService");
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(aVar2, "provideSdkEvents");
        tn.p.k(aVar3, "provideBUrlData");
        tn.p.k(adFormatType, "adType");
        tn.p.k(aVar4, "metricsRecorder");
        this.f46583a = a.a(bannerAdShowListener, rVar, aVar, aVar2, aVar3, (1632 & 32) != 0 ? com.moloco.sdk.internal.k0.b() : null, (1632 & 64) != 0 ? com.moloco.sdk.internal.l.a() : null, adFormatType, aVar4, (1632 & 512) != 0 ? new com.moloco.sdk.internal.client_metrics_data.a(aVar4) : null, (1632 & 1024) != 0 ? null : null);
        this.f46584b = bannerAdShowListener;
    }

    @Override // com.moloco.sdk.internal.publisher.x0
    public void a() {
        this.f46583a.a();
    }

    @Override // com.moloco.sdk.internal.publisher.x0
    public void a(@NotNull com.moloco.sdk.internal.c0 c0Var) {
        tn.p.k(c0Var, "internalError");
        this.f46583a.a(c0Var);
    }

    @Nullable
    public final BannerAdShowListener b() {
        return this.f46584b;
    }

    @Override // com.moloco.sdk.internal.publisher.x0
    public void onAdClicked(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        this.f46583a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.x0
    public void onAdHidden(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        this.f46583a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.x0
    public void onAdShowSuccess(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        this.f46583a.onAdShowSuccess(molocoAd);
    }
}
