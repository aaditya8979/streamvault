package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f17749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17751f;

    public e(long j10, long j11, long j12, long[] jArr, long j13, int i10) {
        this.f17746a = j10;
        this.f17747b = j11;
        this.f17748c = j12;
        this.f17749d = jArr;
        this.f17750e = j13;
        this.f17751f = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        if (!a()) {
            return this.f17746a;
        }
        float f10 = (j10 * 100.0f) / this.f17747b;
        if (f10 > 0.0f) {
            if (f10 >= 100.0f) {
                f = 256.0f;
            } else {
                int i10 = (int) f10;
                f = i10 != 0 ? this.f17749d[i10 - 1] : 0.0f;
                f += (f10 - i10) * ((i10 < 99 ? this.f17749d[i10] : 256.0f) - f);
            }
        }
        long jRound = Math.round(((double) f) * 0.00390625d * this.f17750e);
        long j11 = this.f17746a;
        long j12 = jRound + j11;
        long j13 = this.f17748c;
        return Math.min(j12, j13 != -1 ? j13 - 1 : ((j11 - ((long) this.f17751f)) + this.f17750e) - 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return this.f17749d != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j10) {
        if (!a()) {
            return 0L;
        }
        if (j10 < this.f17746a) {
            return 0L;
        }
        double d10 = ((j10 - r4) * 256.0d) / this.f17750e;
        int iA = z.a(this.f17749d, (long) d10, false);
        int i10 = iA + 1;
        long j11 = (((long) i10) * this.f17747b) / 100;
        long j12 = i10 == 0 ? 0L : this.f17749d[iA];
        return j11 + ((i10 == 99 ? 256L : this.f17749d[i10]) == j12 ? 0L : (long) (((d10 - j12) * (((r7 * ((long) (iA + 2))) / 100) - j11)) / (r16 - j12)));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f17747b;
    }
}
