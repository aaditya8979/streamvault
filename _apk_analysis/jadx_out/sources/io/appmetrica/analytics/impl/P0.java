package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes5.dex */
public final class P0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f65728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f65729b;

    public P0(C5149u1 c5149u1, String str) {
        this.f65729b = c5149u1;
        this.f65728a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f65729b).c(this.f65728a);
    }
}
