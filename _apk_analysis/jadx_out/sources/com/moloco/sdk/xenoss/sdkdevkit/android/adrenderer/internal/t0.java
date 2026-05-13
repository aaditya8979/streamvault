package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.MolocoLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 {
    @NotNull
    public static final s0 a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n nVar, @NotNull com.moloco.sdk.internal.error.b bVar) {
        tn.p.k(nVar, "mediaCacheRepository");
        tn.p.k(bVar, "errorReportingService");
        return new C4390n(nVar, bVar);
    }

    public static final void c(String str) {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "DECLoaderImpl", str, false, 4, null);
    }
}
