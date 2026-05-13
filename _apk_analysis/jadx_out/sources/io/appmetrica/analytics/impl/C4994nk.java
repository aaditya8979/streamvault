package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4994nk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f67378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67379b;

    public C4994nk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f67378a = systemTimeProvider;
        this.f67379b = systemTimeProvider.currentTimeMillis();
    }
}
