package com.unity3d.ads.core.domain;

import com.unity3d.services.core.log.DeviceLog;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import p000do.i0;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 extends kotlin.coroutines.a implements i0 {
    public CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(i0.b bVar) {
        super(bVar);
    }

    @Override // p000do.i0
    public void handleException(@NotNull d dVar, @NotNull Throwable th2) {
        DeviceLog.debug("CleanUpExpiredOpportunity: " + th2.getMessage());
    }
}
