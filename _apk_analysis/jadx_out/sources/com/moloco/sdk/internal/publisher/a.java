package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    @NotNull
    public static final x0 a(@Nullable AdShowListener adShowListener, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull sn.a<A> aVar2, @NotNull sn.a<h0> aVar3, @NotNull com.moloco.sdk.internal.h0 h0Var, @NotNull com.moloco.sdk.internal.i iVar, @NotNull AdFormatType adFormatType, @NotNull com.moloco.sdk.acm.recorder.a aVar4, @NotNull com.moloco.sdk.internal.client_metrics_data.a aVar5, @Nullable sn.a<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> aVar6) {
        tn.p.k(rVar, "appLifecycleTrackerService");
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(aVar2, "provideSdkEvents");
        tn.p.k(aVar3, "provideBUrlData");
        tn.p.k(h0Var, "sdkEventUrlTracker");
        tn.p.k(iVar, "bUrlTracker");
        tn.p.k(adFormatType, "adType");
        tn.p.k(aVar4, "metricsRecorder");
        tn.p.k(aVar5, "acmClickDeduper");
        return new z(adShowListener, rVar, aVar, aVar2, aVar3, h0Var, iVar, adFormatType, aVar4, aVar5, aVar6);
    }
}
