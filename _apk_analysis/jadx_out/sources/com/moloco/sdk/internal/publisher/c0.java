package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 {
    @NotNull
    public static final AdLoad a(@NotNull p000do.l0 l0Var, @NotNull sn.l<? super Long, co.b> lVar, @NotNull String str, @NotNull sn.l<? super C4381e, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k> lVar2, @NotNull AdFormatType adFormatType, @NotNull com.moloco.sdk.internal.services.l lVar3, @NotNull com.moloco.sdk.acm.recorder.a aVar) {
        tn.p.k(l0Var, "scope");
        tn.p.k(lVar, "timeout");
        tn.p.k(str, "adUnitId");
        tn.p.k(lVar2, "recreateXenossAdLoader");
        tn.p.k(adFormatType, "adFormatType");
        tn.p.k(lVar3, "webViewChecker");
        tn.p.k(aVar, "metricsRecorder");
        return new d(l0Var, lVar, str, lVar2, com.moloco.sdk.internal.ortb.d.a(), o0.a(), adFormatType, lVar3, aVar);
    }
}
