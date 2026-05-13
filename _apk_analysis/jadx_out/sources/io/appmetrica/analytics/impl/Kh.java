package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes7.dex */
public final class Kh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f65485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4839hi f65486b;

    public Kh(C4839hi c4839hi, Throwable th2) {
        this.f65486b = c4839hi;
        this.f65485a = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f65486b;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).reportUnhandledException(this.f65485a);
    }
}
