package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f68455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f68456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f68457c;

    /* JADX WARN: Illegal instructions before constructor call */
    public k0(W w10) {
        C5301e c5301eA = w10.a();
        h0 h0Var = c5301eA != null ? new h0(c5301eA) : null;
        a0 a0VarC = w10.c();
        l0 l0Var = a0VarC != null ? new l0(a0VarC) : null;
        C5312p c5312pB = w10.b();
        this(h0Var, l0Var, c5312pB != null ? new i0(c5312pB) : null);
    }

    public k0(h0 h0Var, l0 l0Var, i0 i0Var) {
        this.f68455a = h0Var;
        this.f68456b = l0Var;
        this.f68457c = i0Var;
    }

    public final h0 a() {
        return this.f68455a;
    }

    public final i0 b() {
        return this.f68457c;
    }

    public final l0 c() {
        return this.f68456b;
    }

    public final String toString() {
        return "ServiceSideScreenshotConfig(apiCaptorConfig=" + this.f68455a + ", serviceCaptorConfig=" + this.f68456b + ", contentObserverCaptorConfig=" + this.f68457c + ')';
    }
}
