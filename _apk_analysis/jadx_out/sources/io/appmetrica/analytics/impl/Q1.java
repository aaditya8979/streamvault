package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes.dex */
public final class Q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4680be f65779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5280z7 f65780b;

    public Q1(S1 s12, C5280z7 c5280z7) {
        this.f65779a = s12;
        this.f65780b = c5280z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f65779a.consume(this.f65780b);
    }
}
