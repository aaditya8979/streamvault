package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes7.dex */
public final class Jh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f65444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f65445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f65446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4839hi f65447d;

    public Jh(C4839hi c4839hi, String str, String str2, Throwable th2) {
        this.f65447d = c4839hi;
        this.f65444a = str;
        this.f65445b = str2;
        this.f65446c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f65447d;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).reportError(this.f65444a, this.f65445b, this.f65446c);
    }
}
