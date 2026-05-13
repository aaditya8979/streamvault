package com.fyber.inneractive.sdk.activities;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveFullscreenAdActivity f15802a;

    public c(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f15802a = inneractiveFullscreenAdActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15802a.isFinishing()) {
            return;
        }
        this.f15802a.hideNavigationBar();
    }
}
