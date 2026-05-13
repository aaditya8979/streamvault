package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4773f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f66725a;

    public C4773f4() {
        this(new SystemTimeProvider());
    }

    public C4773f4(SystemTimeProvider systemTimeProvider) {
        this.f66725a = systemTimeProvider;
    }

    public final void a() {
        this.f66725a.elapsedRealtime();
    }
}
