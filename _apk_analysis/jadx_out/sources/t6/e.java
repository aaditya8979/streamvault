package t6;

import i6.a0;
import i6.z;
import s7.m0;

/* JADX INFO: compiled from: WavSeekMap.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f85074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f85076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f85077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f85078e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f85074a = cVar;
        this.f85075b = i10;
        this.f85076c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f85069e);
        this.f85077d = j12;
        this.f85078e = a(j12);
    }

    public final long a(long j10) {
        return m0.F0(j10 * ((long) this.f85075b), 1000000L, this.f85074a.f85067c);
    }

    @Override // i6.z
    public long getDurationUs() {
        return this.f85078e;
    }

    @Override // i6.z
    public z.a getSeekPoints(long j10) {
        long jQ = m0.q((((long) this.f85074a.f85067c) * j10) / (((long) this.f85075b) * 1000000), 0L, this.f85077d - 1);
        long j11 = this.f85076c + (((long) this.f85074a.f85069e) * jQ);
        long jA = a(jQ);
        a0 a0Var = new a0(jA, j11);
        if (jA >= j10 || jQ == this.f85077d - 1) {
            return new z.a(a0Var);
        }
        long j12 = jQ + 1;
        return new z.a(a0Var, new a0(a(j12), this.f85076c + (((long) this.f85074a.f85069e) * j12)));
    }

    @Override // i6.z
    public boolean isSeekable() {
        return true;
    }
}
