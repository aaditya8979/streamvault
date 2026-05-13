package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4743e0 implements Dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4769f0 f66640a;

    public C4743e0(C4769f0 c4769f0) {
        this.f66640a = c4769f0;
    }

    @Override // io.appmetrica.analytics.impl.Dn
    @NotNull
    public final Thread a() {
        return this.f66640a.f66720b;
    }

    @Override // io.appmetrica.analytics.impl.Dn
    @Nullable
    public final StackTraceElement[] b() {
        C4769f0 c4769f0 = this.f66640a;
        return (StackTraceElement[]) c4769f0.f66719a.get(c4769f0.f66720b);
    }

    @Override // io.appmetrica.analytics.impl.Dn
    @NotNull
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f66640a.f66719a;
    }
}
