package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f17743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f17744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17745c;

    public d(long[] jArr, long[] jArr2, long j10) {
        this.f17743a = jArr;
        this.f17744b = jArr2;
        this.f17745c = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return this.f17744b[z.a(this.f17743a, j10, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j10) {
        return this.f17743a[z.a(this.f17744b, j10, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f17745c;
    }
}
