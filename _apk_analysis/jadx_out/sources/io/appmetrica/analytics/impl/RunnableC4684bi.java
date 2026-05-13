package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4684bi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f66439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4839hi f66440b;

    public RunnableC4684bi(C4839hi c4839hi, V v10) {
        this.f66440b = c4839hi;
        this.f66439a = v10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f66440b;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).a(this.f66439a);
    }
}
