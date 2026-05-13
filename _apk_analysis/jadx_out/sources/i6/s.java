package i6;

import i6.t;
import i6.z;
import s7.m0;

/* JADX INFO: compiled from: FlacSeekTableSeekMap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f63919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63920b;

    public s(t tVar, long j10) {
        this.f63919a = tVar;
        this.f63920b = j10;
    }

    public final a0 a(long j10, long j11) {
        return new a0((j10 * 1000000) / ((long) this.f63919a.f63925e), this.f63920b + j11);
    }

    @Override // i6.z
    public long getDurationUs() {
        return this.f63919a.f();
    }

    @Override // i6.z
    public z.a getSeekPoints(long j10) {
        s7.a.i(this.f63919a.f63931k);
        t tVar = this.f63919a;
        t.a aVar = tVar.f63931k;
        long[] jArr = aVar.f63933a;
        long[] jArr2 = aVar.f63934b;
        int i10 = m0.i(jArr, tVar.i(j10), true, false);
        a0 a0VarA = a(i10 == -1 ? 0L : jArr[i10], i10 != -1 ? jArr2[i10] : 0L);
        if (a0VarA.f63838a == j10 || i10 == jArr.length - 1) {
            return new z.a(a0VarA);
        }
        int i11 = i10 + 1;
        return new z.a(a0VarA, a(jArr[i11], jArr2[i11]));
    }

    @Override // i6.z
    public boolean isSeekable() {
        return true;
    }
}
