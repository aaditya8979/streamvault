package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f18817d = com.fyber.inneractive.sdk.player.exoplayer2.s.f18475d;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a() {
        return this.f18817d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.f18814a) {
            a(b());
        }
        this.f18817d = sVar;
        return sVar;
    }

    public final void a(long j10) {
        this.f18815b = j10;
        if (this.f18814a) {
            this.f18816c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final long b() {
        long j10 = this.f18815b;
        if (!this.f18814a) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f18816c;
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar = this.f18817d;
        if (sVar.f18476a != 1.0f) {
            return j10 + (jElapsedRealtime * ((long) sVar.f18478c));
        }
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.b.f17363a;
        return j10 + (jElapsedRealtime != -9223372036854775807L ? 1000 * jElapsedRealtime : -9223372036854775807L);
    }
}
