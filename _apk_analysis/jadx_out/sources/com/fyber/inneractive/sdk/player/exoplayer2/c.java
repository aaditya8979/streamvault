package com.fyber.inneractive.sdk.player.exoplayer2;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.l f17365a = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17366b = ((long) 15000) * 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17367c = ((long) 30000) * 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17368d = 2500000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17369e = 5000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17371g;

    public final void a(boolean z10) {
        this.f17370f = 0;
        this.f17371g = false;
        if (z10) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = this.f17365a;
            synchronized (lVar) {
                lVar.a(0);
            }
        }
    }
}
