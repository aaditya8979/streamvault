package com.moloco.sdk.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import io.bidmachine.unified.UnifiedMediationParams;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f47081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47082b;

    public q(@NotNull String str, int i10) {
        tn.p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
        this.f47081a = str;
        this.f47082b = i10;
    }

    @NotNull
    public final String a() {
        return this.f47081a;
    }

    public final int b() {
        return this.f47082b;
    }
}
