package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes5.dex */
public final class Nh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f65653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4839hi f65654b;

    public Nh(C4839hi c4839hi, String str) {
        this.f65654b = c4839hi;
        this.f65653a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f65654b;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).setUserProfileID(this.f65653a);
    }
}
