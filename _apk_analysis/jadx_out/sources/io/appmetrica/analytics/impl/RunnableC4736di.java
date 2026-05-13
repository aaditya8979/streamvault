package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4736di implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f66612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f66613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4839hi f66614c;

    public RunnableC4736di(C4839hi c4839hi, String str, String str2) {
        this.f66614c = c4839hi;
        this.f66612a = str;
        this.f66613b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f66614c;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).putAppEnvironmentValue(this.f66612a, this.f66613b);
    }
}
