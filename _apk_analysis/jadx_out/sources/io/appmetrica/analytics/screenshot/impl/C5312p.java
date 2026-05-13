package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5312p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f68470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68471c;

    public C5312p() {
        this(new O().f68399a, cn.r.G0(new O().f68401c), new O().f68400b);
    }

    public C5312p(boolean z10, List list, long j10) {
        this.f68469a = z10;
        this.f68470b = list;
        this.f68471c = j10;
    }

    public final long a() {
        return this.f68471c;
    }

    public final boolean b() {
        return this.f68469a;
    }

    public final List c() {
        return this.f68470b;
    }

    public final String toString() {
        return "ContentObserverCaptorConfig(enabled=" + this.f68469a + ", mediaStoreColumnNames='" + this.f68470b + "', detectWindowSeconds=" + this.f68471c + ')';
    }
}
