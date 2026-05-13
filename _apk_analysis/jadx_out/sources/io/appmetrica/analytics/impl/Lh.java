package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes7.dex */
public final class Lh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4839hi f65536a;

    public Lh(C4839hi c4839hi) {
        this.f65536a = c4839hi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f65536a;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).resumeSession();
    }
}
