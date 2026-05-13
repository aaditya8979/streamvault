package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5301e f68413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f68414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5312p f68415c;

    public W() {
        this(new C5301e(), new a0(), new C5312p());
    }

    public W(C5301e c5301e, a0 a0Var, C5312p c5312p) {
        this.f68413a = c5301e;
        this.f68414b = a0Var;
        this.f68415c = c5312p;
    }

    public final C5301e a() {
        return this.f68413a;
    }

    public final C5312p b() {
        return this.f68415c;
    }

    public final a0 c() {
        return this.f68414b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f68413a + ", serviceCaptorConfig=" + this.f68414b + ", contentObserverCaptorConfig=" + this.f68415c + ')';
    }
}
