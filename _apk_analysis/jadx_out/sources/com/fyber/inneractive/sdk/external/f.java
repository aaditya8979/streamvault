package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveAdViewUnitController f16268a;

    public f(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        this.f16268a = inneractiveAdViewUnitController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16268a.a();
    }
}
