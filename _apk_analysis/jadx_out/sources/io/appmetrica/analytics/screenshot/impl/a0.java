package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68428b;

    public a0() {
        this(new P().f68403a, new P().f68404b);
    }

    public a0(boolean z10, long j10) {
        this.f68427a = z10;
        this.f68428b = j10;
    }

    public final long a() {
        return this.f68428b;
    }

    public final boolean b() {
        return this.f68427a;
    }

    public final String toString() {
        return "ServiceCaptorConfig(enabled=" + this.f68427a + ", delaySeconds=" + this.f68428b + ')';
    }
}
