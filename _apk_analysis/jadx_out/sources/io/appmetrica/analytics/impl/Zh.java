package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes9.dex */
public final class Zh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rn f66304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4839hi f66305b;

    public Zh(C4839hi c4839hi, Rn rn2) {
        this.f66305b = c4839hi;
        this.f66304a = rn2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f66305b;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).a(this.f66304a);
    }
}
