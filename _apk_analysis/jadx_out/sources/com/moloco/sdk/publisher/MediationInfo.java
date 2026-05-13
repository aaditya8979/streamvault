package com.moloco.sdk.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 1)
public final class MediationInfo {
    public static final int $stable = 0;

    @NotNull
    private final String name;

    public MediationInfo(@NotNull String str) {
        p.k(str, "name");
        this.name = str;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }
}
