package p6;

import android.util.Pair;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import i6.a0;
import i6.z;
import s7.m0;

/* JADX INFO: compiled from: MlltSeeker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f77056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f77057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f77058c;

    public c(long[] jArr, long[] jArr2, long j10) {
        this.f77056a = jArr;
        this.f77057b = jArr2;
        this.f77058c = j10 == -9223372036854775807L ? m0.w0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c a(long j10, MlltFrame mlltFrame, long j11) {
        int length = mlltFrame.f21941f.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (mlltFrame.f21939d + mlltFrame.f21941f[i12]);
            j12 += (long) (mlltFrame.f21940e + mlltFrame.f21942g[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    public static Pair<Long, Long> b(long j10, long[] jArr, long[] jArr2) {
        int i10 = m0.i(jArr, j10, true, true);
        long j11 = jArr[i10];
        long j12 = jArr2[i10];
        int i11 = i10 + 1;
        if (i11 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i11] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i11] - j12))) + j12));
    }

    @Override // p6.g
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // i6.z
    public long getDurationUs() {
        return this.f77058c;
    }

    @Override // i6.z
    public z.a getSeekPoints(long j10) {
        Pair<Long, Long> pairB = b(m0.Q0(m0.q(j10, 0L, this.f77058c)), this.f77057b, this.f77056a);
        return new z.a(new a0(m0.w0(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue()));
    }

    @Override // p6.g
    public long getTimeUs(long j10) {
        return m0.w0(((Long) b(j10, this.f77056a, this.f77057b).second).longValue());
    }

    @Override // i6.z
    public boolean isSeekable() {
        return true;
    }
}
