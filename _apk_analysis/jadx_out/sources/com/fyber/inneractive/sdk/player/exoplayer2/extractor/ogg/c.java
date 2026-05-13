package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements h, com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f17984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f17985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17986c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17987d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f17988e;

    public c(d dVar) {
        this.f17988e = dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return this.f17986c + this.f17985b[z.a(this.f17984a, (((long) this.f17988e.f18018i) * j10) / 1000000, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        long j10 = this.f17987d;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f17987d = -1L;
        return j11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.q b() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.f fVar = this.f17988e.f17989n;
        return (fVar.f18771d * 1000000) / ((long) fVar.f18768a);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long c(long j10) {
        long j11 = (((long) this.f17988e.f18018i) * j10) / 1000000;
        this.f17987d = this.f17984a[z.a(this.f17984a, j11, true)];
        return j11;
    }
}
