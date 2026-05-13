package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4761ei implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4839hi f66686a;

    public RunnableC4761ei(C4839hi c4839hi) {
        this.f66686a = c4839hi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f66686a;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).clearAppEnvironment();
    }
}
