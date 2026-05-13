package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68461b;

    public l0(a0 a0Var) {
        this(a0Var.b(), a0Var.a());
    }

    public l0(boolean z10, long j10) {
        this.f68460a = z10;
        this.f68461b = j10;
    }

    public final long a() {
        return this.f68461b;
    }

    public final boolean b() {
        return this.f68460a;
    }

    public final String toString() {
        return "ServiceSideServiceCaptorConfig(enabled=" + this.f68460a + ", delaySeconds=" + this.f68461b + ')';
    }
}
