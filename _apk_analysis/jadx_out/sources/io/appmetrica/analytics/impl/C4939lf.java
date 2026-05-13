package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4939lf extends S7 {
    @Override // io.appmetrica.analytics.impl.S7
    public final boolean a(@NotNull C5088rf c5088rf, @NotNull C5088rf c5088rf2) {
        if (c5088rf.f67619c) {
            return !c5088rf2.f67619c || ((Number) this.f65869a.a(c5088rf.f67621e)).intValue() > ((Number) this.f65869a.a(c5088rf2.f67621e)).intValue();
        }
        return false;
    }
}
