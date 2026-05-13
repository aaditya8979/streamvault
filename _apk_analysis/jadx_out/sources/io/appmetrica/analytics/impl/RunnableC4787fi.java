package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4787fi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f66787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4839hi f66788b;

    public RunnableC4787fi(C4839hi c4839hi, String str) {
        this.f66788b = c4839hi;
        this.f66787a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f66788b;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).reportEvent(this.f66787a);
    }
}
