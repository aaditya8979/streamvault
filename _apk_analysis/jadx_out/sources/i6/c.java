package i6;

import i6.z;
import java.util.Arrays;
import s7.m0;

/* JADX INFO: compiled from: ChunkIndex.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f63845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f63846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f63847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f63848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f63849f;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f63845b = iArr;
        this.f63846c = jArr;
        this.f63847d = jArr2;
        this.f63848e = jArr3;
        int length = iArr.length;
        this.f63844a = length;
        if (length > 0) {
            this.f63849f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f63849f = 0L;
        }
    }

    public int a(long j10) {
        return m0.i(this.f63848e, j10, true, true);
    }

    @Override // i6.z
    public long getDurationUs() {
        return this.f63849f;
    }

    @Override // i6.z
    public z.a getSeekPoints(long j10) {
        int iA = a(j10);
        a0 a0Var = new a0(this.f63848e[iA], this.f63846c[iA]);
        if (a0Var.f63838a >= j10 || iA == this.f63844a - 1) {
            return new z.a(a0Var);
        }
        int i10 = iA + 1;
        return new z.a(a0Var, new a0(this.f63848e[i10], this.f63846c[i10]));
    }

    @Override // i6.z
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f63844a + ", sizes=" + Arrays.toString(this.f63845b) + ", offsets=" + Arrays.toString(this.f63846c) + ", timeUs=" + Arrays.toString(this.f63848e) + ", durationsUs=" + Arrays.toString(this.f63847d) + ")";
    }
}
