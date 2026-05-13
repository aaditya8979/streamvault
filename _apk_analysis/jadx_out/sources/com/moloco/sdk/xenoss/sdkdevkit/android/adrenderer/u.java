package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4389c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.I;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class u {
    @NotNull
    public static final s<o, p> a(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @Nullable i iVar, @NotNull C4381e c4381e, @NotNull w0 w0Var, @NotNull e0 e0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar2) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(c4381e, "bid");
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(e0Var, "watermark");
        tn.p.k(aVar2, "metricsRecorder");
        return new C4389c(context, aVar, iVar, c4381e, w0Var, e0Var, aVar2);
    }

    public static /* synthetic */ s b(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, i iVar, C4381e c4381e, w0 w0Var, e0 e0Var, com.moloco.sdk.acm.recorder.a aVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            iVar = null;
        }
        return a(context, aVar, iVar, c4381e, w0Var, e0Var, aVar2);
    }

    @NotNull
    public static final s<a0, z> c(@NotNull Context context, @NotNull String str, @NotNull com.moloco.sdk.internal.services.f0 f0Var, @NotNull e0 e0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "adm");
        tn.p.k(f0Var, "clickthroughService");
        tn.p.k(e0Var, "watermark");
        tn.p.k(aVar, "metricsRecorder");
        return new I(context, str, f0Var, e0Var, b.h.f47664a.f(), b.i.f47671a.c(), aVar);
    }
}
