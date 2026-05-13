package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes7.dex */
public final class Ih implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f65367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f65368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4839hi f65369c;

    public Ih(C4839hi c4839hi, String str, Throwable th2) {
        this.f65369c = c4839hi;
        this.f65367a = str;
        this.f65368b = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f65369c;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).reportError(this.f65367a, this.f65368b);
    }
}
