package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f68391b;

    public J() {
        this(new S().f68410a, new W());
    }

    public J(boolean z10, W w10) {
        this.f68390a = z10;
        this.f68391b = w10;
    }

    public final W a() {
        return this.f68391b;
    }

    public final boolean b() {
        return this.f68390a;
    }

    public final String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.f68390a + ", config=" + this.f68391b + ')';
    }
}
