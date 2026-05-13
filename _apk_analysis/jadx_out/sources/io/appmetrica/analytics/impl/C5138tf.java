package io.appmetrica.analytics.impl;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5138tf implements Jm {
    @NotNull
    public final C4758ef a(@NotNull C5088rf c5088rf, @NotNull List<? extends C4733df> list) {
        return new C4758ef(c5088rf, list);
    }

    @Override // io.appmetrica.analytics.impl.Jm, sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C4758ef((C5088rf) obj, (List) obj2);
    }
}
