package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC4710ci implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4839hi f66537a;

    public RunnableC4710ci(C4839hi c4839hi) {
        this.f66537a = c4839hi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f66537a;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).sendEventsBuffer();
    }
}
