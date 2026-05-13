package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 {
    @NotNull
    public static final w0 a(@Nullable AdLoad.Listener listener, @NotNull com.moloco.sdk.acm.e eVar, @NotNull AdFormatType adFormatType, @NotNull com.moloco.sdk.acm.recorder.a aVar) {
        tn.p.k(eVar, "acmLoadTimerEvent");
        tn.p.k(adFormatType, "adFormatType");
        tn.p.k(aVar, "metricsRecorder");
        return new d0(listener, com.moloco.sdk.internal.k0.b(), eVar, adFormatType, aVar);
    }
}
