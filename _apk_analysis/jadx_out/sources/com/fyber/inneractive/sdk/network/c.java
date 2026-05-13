package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f16950c;

    public c(f fVar, int i10, long j10) {
        this.f16950c = fVar;
        this.f16948a = i10;
        this.f16949b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16950c.f16967d.sendEmptyMessageDelayed(this.f16948a, this.f16949b);
    }
}
