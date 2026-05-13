package e7;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.p;

/* JADX INFO: compiled from: SinglePeriodTimeline.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends com.google.android.exoplayer2.c0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f60844q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final com.google.android.exoplayer2.p f60845r = new p.c().d("SinglePeriodTimeline").g(Uri.EMPTY).a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f60846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f60847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f60848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f60849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f60850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f60851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f60852j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f60853k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f60854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f60855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Object f60856n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final com.google.android.exoplayer2.p f60857o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final p.g f60858p;

    public d0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, @Nullable Object obj, com.google.android.exoplayer2.p pVar, @Nullable p.g gVar) {
        this.f60846d = j10;
        this.f60847e = j11;
        this.f60848f = j12;
        this.f60849g = j13;
        this.f60850h = j14;
        this.f60851i = j15;
        this.f60852j = j16;
        this.f60853k = z10;
        this.f60854l = z11;
        this.f60855m = z12;
        this.f60856n = obj;
        this.f60857o = (com.google.android.exoplayer2.p) s7.a.e(pVar);
        this.f60858p = gVar;
    }

    public d0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, @Nullable Object obj, com.google.android.exoplayer2.p pVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, pVar, z12 ? pVar.f22035e : null);
    }

    public d0(long j10, boolean z10, boolean z11, boolean z12, @Nullable Object obj, com.google.android.exoplayer2.p pVar) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, pVar);
    }

    @Override // com.google.android.exoplayer2.c0
    public int f(Object obj) {
        return f60844q.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.c0
    public c0.b k(int i10, c0.b bVar, boolean z10) {
        s7.a.c(i10, 0, 1);
        return bVar.v(null, z10 ? f60844q : null, 0, this.f60849g, -this.f60851i);
    }

    @Override // com.google.android.exoplayer2.c0
    public int m() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.c0
    public Object q(int i10) {
        s7.a.c(i10, 0, 1);
        return f60844q;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x0012, B:5:0x0016, B:7:0x001c, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.exoplayer2.c0.d s(int r25, com.google.android.exoplayer2.c0.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            s7.a.c(r3, r1, r2)
            long r1 = r0.f60852j
            boolean r14 = r0.f60854l
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L2e
            boolean r5 = r0.f60855m
            if (r5 != 0) goto L2e
            r5 = 0
            int r5 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r5 == 0) goto L2e
            long r5 = r0.f60850h
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r3
            goto L30
        L27:
            long r1 = r1 + r27
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = com.google.android.exoplayer2.c0.d.f21398s
            com.google.android.exoplayer2.p r5 = r0.f60857o
            java.lang.Object r6 = r0.f60856n
            long r7 = r0.f60846d
            long r9 = r0.f60847e
            long r11 = r0.f60848f
            boolean r13 = r0.f60853k
            com.google.android.exoplayer2.p$g r15 = r0.f60858p
            long r1 = r0.f60850h
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f60851i
            r22 = r1
            r3 = r26
            com.google.android.exoplayer2.c0$d r1 = r3.k(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.d0.s(int, com.google.android.exoplayer2.c0$d, long):com.google.android.exoplayer2.c0$d");
    }

    @Override // com.google.android.exoplayer2.c0
    public int t() {
        return 1;
    }
}
