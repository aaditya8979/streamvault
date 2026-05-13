package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes5.dex */
public final class Th implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f65942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4839hi f65943b;

    public Th(C4839hi c4839hi, boolean z10) {
        this.f65943b = c4839hi;
        this.f65942a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f65943b;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).setDataSendingEnabled(this.f65942a);
    }
}
