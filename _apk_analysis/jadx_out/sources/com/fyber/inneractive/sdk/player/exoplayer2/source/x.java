package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends com.fyber.inneractive.sdk.player.exoplayer2.x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f18567g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18572f;

    public x(long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.f18568b = j10;
        this.f18569c = j11;
        this.f18570d = j12;
        this.f18571e = j13;
        this.f18572f = z11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int a() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int a(Object obj) {
        return f18567g.equals(obj) ? 0 : -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final com.fyber.inneractive.sdk.player.exoplayer2.v a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.v vVar, boolean z10) {
        if (i10 < 0 || i10 >= 1) {
            throw new IndexOutOfBoundsException();
        }
        Object obj = z10 ? f18567g : null;
        long j10 = this.f18568b;
        long j11 = -this.f18570d;
        vVar.f18830a = obj;
        vVar.f18831b = obj;
        vVar.f18832c = 0;
        vVar.f18833d = j10;
        vVar.f18834e = j11;
        return vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final com.fyber.inneractive.sdk.player.exoplayer2.w a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.w wVar, long j10) {
        if (i10 < 0 || i10 >= 1) {
            throw new IndexOutOfBoundsException();
        }
        long j11 = this.f18571e;
        boolean z10 = this.f18572f;
        if (z10) {
            j11 += j10;
            if (j11 > this.f18569c) {
                j11 = -9223372036854775807L;
            }
        }
        long j12 = this.f18569c;
        long j13 = this.f18570d;
        wVar.f18904a = null;
        wVar.f18905b = z10;
        wVar.f18908e = j11;
        wVar.f18909f = j12;
        wVar.f18906c = 0;
        wVar.f18907d = 0;
        wVar.f18910g = j13;
        return wVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int b() {
        return 1;
    }
}
