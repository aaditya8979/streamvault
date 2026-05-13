package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {
    @NotNull
    public static final s<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0> a(@NotNull Context context, @NotNull C4381e c4381e, boolean z10, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h hVar, @NotNull s0 s0Var) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c4381e, "bid");
        tn.p.k(e0Var, "watermark");
        tn.p.k(aVar, "metricsRecorder");
        tn.p.k(hVar, "loadVast");
        tn.p.k(s0Var, "decLoader");
        return new N(context, c4381e, hVar, s0Var, z10, e0Var, aVar);
    }

    public static /* synthetic */ s b(Context context, C4381e c4381e, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, com.moloco.sdk.acm.recorder.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h hVar, s0 s0Var, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            hVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.o.a(context);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h hVar2 = hVar;
        if ((i10 & 64) != 0) {
            s0Var = b.a.f47629a.a();
        }
        return a(context, c4381e, z10, e0Var, aVar, hVar2, s0Var);
    }
}
