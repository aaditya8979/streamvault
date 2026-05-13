package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class RunnableC4813gi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f66839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f66840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4839hi f66841c;

    public RunnableC4813gi(C4839hi c4839hi, String str, String str2) {
        this.f66841c = c4839hi;
        this.f66839a = str;
        this.f66840b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f66841c;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).reportEvent(this.f66839a, this.f66840b);
    }
}
