package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f68447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68448c;

    public i0(C5312p c5312p) {
        this(c5312p.b(), c5312p.c(), c5312p.a());
    }

    public i0(boolean z10, List list, long j10) {
        this.f68446a = z10;
        this.f68447b = list;
        this.f68448c = j10;
    }

    public final long a() {
        return this.f68448c;
    }

    public final boolean b() {
        return this.f68446a;
    }

    public final List c() {
        return this.f68447b;
    }

    public final String toString() {
        return "ServiceSideContentObserverCaptorConfig(enabled=" + this.f68446a + ", mediaStoreColumnNames=" + this.f68447b + ", detectWindowSeconds=" + this.f68448c + ')';
    }
}
