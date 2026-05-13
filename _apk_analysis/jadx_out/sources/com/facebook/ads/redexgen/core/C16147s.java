package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C16147s implements InterfaceC2968kk {
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public C16147s(long[] jArr, long[] jArr2, long j10) {
        this.A01 = jArr;
        this.A02 = jArr2;
        this.A00 = j10 == -9223372036854775807L ? AbstractC15184a.A0O(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair<Long, Long> A00(long j10, long[] jArr, long[] jArr2) {
        int iA0L = AbstractC15184a.A0L(jArr, j10, true, true);
        long j11 = jArr[iA0L];
        long j12 = jArr2[iA0L];
        int i10 = iA0L + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr2[i10] - j12) * (jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r4 - j11)))) + j12));
    }

    public static C16147s A01(long j10, MlltFrame mlltFrame, long j11) {
        int length = mlltFrame.A03.length;
        long[] jArr = new long[length + 1];
        long[] jArr2 = new long[length + 1];
        jArr[0] = j10;
        jArr2[0] = 0;
        long j12 = 0;
        for (int i10 = 1; i10 <= length; i10++) {
            j10 += (long) (mlltFrame.A00 + mlltFrame.A03[i10 - 1]);
            j12 += (long) (mlltFrame.A01 + mlltFrame.A04[i10 - 1]);
            jArr[i10] = j10;
            jArr2[i10] = j12;
        }
        return new C16147s(jArr, jArr2, j11);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2968kk
    public final long A7b() {
        return -1L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final C1835Gv A8t(long j10) {
        Pair<Long, Long> pairA00 = A00(AbstractC15184a.A0P(AbstractC15184a.A0T(j10, 0L, this.A00)), this.A02, this.A01);
        return new C1835Gv(new C1837Gx(AbstractC15184a.A0O(((Long) pairA00.first).longValue()), ((Long) pairA00.second).longValue()));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2968kk
    public final long A99(long j10) {
        return AbstractC15184a.A0O(((Long) A00(j10, this.A01, this.A02).second).longValue());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final boolean AAa() {
        return true;
    }
}
