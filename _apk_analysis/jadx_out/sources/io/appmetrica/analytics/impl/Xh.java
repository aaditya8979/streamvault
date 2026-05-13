package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes9.dex */
public final class Xh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f66177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f66178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4839hi f66179c;

    public Xh(C4839hi c4839hi, String str, byte[] bArr) {
        this.f66179c = c4839hi;
        this.f66177a = str;
        this.f66178b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f66179c;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).setSessionExtra(this.f66177a, this.f66178b);
    }
}
