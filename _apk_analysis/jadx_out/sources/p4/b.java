package p4;

import a6.k0;
import android.util.Pair;
import com.google.android.exoplayer.metadata.id3.MlltFrame;
import e4.k;
import k4.s;
import k4.t;

/* JADX INFO: compiled from: MlltSeeker.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f76963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f76964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f76965c;

    public b(long[] jArr, long[] jArr2) {
        this.f76963a = jArr;
        this.f76964b = jArr2;
        this.f76965c = k.a(jArr2[jArr2.length - 1]);
    }

    public static b a(long j10, MlltFrame mlltFrame) {
        int length = mlltFrame.f20286f.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j11 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (mlltFrame.f20284d + mlltFrame.f20286f[i12]);
            j11 += (long) (mlltFrame.f20285e + mlltFrame.f20287g[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j11;
        }
        return new b(jArr, jArr2);
    }

    public static Pair<Long, Long> b(long j10, long[] jArr, long[] jArr2) {
        int iH = k0.h(jArr, j10, true, true);
        long j11 = jArr[iH];
        long j12 = jArr2[iH];
        int i10 = iH + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // p4.f
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // k4.s
    public long getDurationUs() {
        return this.f76965c;
    }

    @Override // k4.s
    public s.a getSeekPoints(long j10) {
        Pair<Long, Long> pairB = b(k.b(k0.r(j10, 0L, this.f76965c)), this.f76964b, this.f76963a);
        return new s.a(new t(k.a(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue()));
    }

    @Override // p4.f
    public long getTimeUs(long j10) {
        return k.a(((Long) b(j10, this.f76963a, this.f76964b).second).longValue());
    }

    @Override // k4.s
    public boolean isSeekable() {
        return true;
    }
}
