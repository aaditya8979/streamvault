package k4;

import a6.k0;
import java.util.Arrays;
import k4.s;

/* JADX INFO: compiled from: ChunkIndex.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f72868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f72869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f72870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f72871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f72872f;

    public b(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f72868b = iArr;
        this.f72869c = jArr;
        this.f72870d = jArr2;
        this.f72871e = jArr3;
        int length = iArr.length;
        this.f72867a = length;
        if (length > 0) {
            this.f72872f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f72872f = 0L;
        }
    }

    public int a(long j10) {
        return k0.h(this.f72871e, j10, true, true);
    }

    @Override // k4.s
    public long getDurationUs() {
        return this.f72872f;
    }

    @Override // k4.s
    public s.a getSeekPoints(long j10) {
        int iA = a(j10);
        t tVar = new t(this.f72871e[iA], this.f72869c[iA]);
        if (tVar.f72924a >= j10 || iA == this.f72867a - 1) {
            return new s.a(tVar);
        }
        int i10 = iA + 1;
        return new s.a(tVar, new t(this.f72871e[i10], this.f72869c[i10]));
    }

    @Override // k4.s
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f72867a + ", sizes=" + Arrays.toString(this.f72868b) + ", offsets=" + Arrays.toString(this.f72869c) + ", timeUs=" + Arrays.toString(this.f72871e) + ", durationsUs=" + Arrays.toString(this.f72870d) + ")";
    }
}
