package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: loaded from: classes9.dex */
public final class Yh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f66266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f66267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4839hi f66268c;

    public Yh(C4839hi c4839hi, AdRevenue adRevenue, boolean z10) {
        this.f66268c = c4839hi;
        this.f66266a = adRevenue;
        this.f66267b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f66268c;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).reportAdRevenue(this.f66266a, this.f66267b);
    }
}
