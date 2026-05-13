package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    @NotNull
    public static final s<m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n> a(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull x xVar, @NotNull e eVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0 b0Var, @NotNull MraidActivity.a aVar, @Nullable String str, @NotNull com.moloco.sdk.acm.recorder.a aVar2) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(e0Var, "watermark");
        tn.p.k(xVar, "mraidAdLoader");
        tn.p.k(eVar, "mraidBaseAd");
        tn.p.k(b0Var, "mraidFullscreenController");
        tn.p.k(aVar, "mraidAdActivity");
        tn.p.k(aVar2, "metricsRecorder");
        return new z(context, e0Var, xVar, eVar, b0Var, aVar, str, aVar2);
    }
}
