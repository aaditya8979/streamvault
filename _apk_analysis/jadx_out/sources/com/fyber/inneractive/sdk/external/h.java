package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdUnitController f16270a;

    public h(NativeAdUnitController nativeAdUnitController) {
        this.f16270a = nativeAdUnitController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16270a.a();
    }
}
