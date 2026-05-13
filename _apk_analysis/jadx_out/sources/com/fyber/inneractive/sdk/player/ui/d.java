package com.fyber.inneractive.sdk.player.ui;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f19015b;

    public d(e eVar, boolean z10) {
        this.f19015b = eVar;
        this.f19014a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19014a == this.f19015b.hasWindowFocus()) {
            this.f19015b.e();
        }
    }
}
