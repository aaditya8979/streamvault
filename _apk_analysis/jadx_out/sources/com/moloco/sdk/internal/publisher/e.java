package com.moloco.sdk.internal.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class e<T extends AdShowListener> implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0 f46638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final T f46639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.r f46640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f46641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AdFormatType f46642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f46643f;

    public e(@NotNull T t10, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull sn.a<A> aVar2, @NotNull sn.a<h0> aVar3, @NotNull AdFormatType adFormatType, @NotNull com.moloco.sdk.acm.recorder.a aVar4, @NotNull sn.a<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> aVar5) {
        tn.p.k(t10, "adShowListener");
        tn.p.k(rVar, "appLifecycleTrackerService");
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(aVar2, "provideSdkEvents");
        tn.p.k(aVar3, "provideBUrlData");
        tn.p.k(adFormatType, "adFormatType");
        tn.p.k(aVar4, "metricsRecorder");
        tn.p.k(aVar5, "getCreativeType");
        this.f46638a = a.a(t10, rVar, aVar, aVar2, aVar3, (1632 & 32) != 0 ? com.moloco.sdk.internal.k0.b() : null, (1632 & 64) != 0 ? com.moloco.sdk.internal.l.a() : null, adFormatType, aVar4, (1632 & 512) != 0 ? new com.moloco.sdk.internal.client_metrics_data.a(aVar4) : null, (1632 & 1024) != 0 ? null : aVar5);
        this.f46639b = t10;
        this.f46640c = rVar;
        this.f46641d = aVar;
        this.f46642e = adFormatType;
        this.f46643f = aVar4;
    }

    @Override // com.moloco.sdk.internal.publisher.x0
    public void a() {
        this.f46638a.a();
    }

    @Override // com.moloco.sdk.internal.publisher.x0
    public void a(@NotNull com.moloco.sdk.internal.c0 c0Var) {
        tn.p.k(c0Var, "internalError");
        this.f46638a.a(c0Var);
    }

    @Override // com.moloco.sdk.internal.publisher.x0
    public void onAdClicked(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        this.f46638a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.x0
    public void onAdHidden(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        this.f46638a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.x0
    public void onAdShowSuccess(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        this.f46638a.onAdShowSuccess(molocoAd);
    }
}
