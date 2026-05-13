package com.yandex.div.internal.viewpool;

import androidx.annotation.VisibleForTesting;
import com.unity3d.services.core.di.ServiceProvider;

/* JADX INFO: compiled from: ProfilingSession.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfilingSessionKt {
    private static final long floorTo(long j10, long j11) {
        return (j10 / j11) * j11;
    }

    @VisibleForTesting
    public static final long roundRoughly(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        return j10 < 100 ? floorTo(j10, 20L) : j10 < 1000 ? floorTo(j10, 100L) : j10 < 2000 ? floorTo(j10, 200L) : j10 < 5000 ? floorTo(j10, 500L) : j10 < 10000 ? floorTo(j10, 1000L) : j10 < 20000 ? floorTo(j10, 2000L) : j10 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT ? floorTo(j10, 5000L) : ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT;
    }
}
