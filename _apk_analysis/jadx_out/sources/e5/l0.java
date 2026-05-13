package e5;

import androidx.annotation.Nullable;
import e4.v0;

/* JADX INFO: compiled from: SinglePeriodTimeline.java */
/* JADX INFO: loaded from: classes10.dex */
public final class l0 extends v0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f60539m = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f60540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f60541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f60542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f60543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f60544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f60545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f60546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f60547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f60548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Object f60549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Object f60550l;

    public l0(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, @Nullable Object obj, @Nullable Object obj2) {
        this.f60540b = j10;
        this.f60541c = j11;
        this.f60542d = j12;
        this.f60543e = j13;
        this.f60544f = j14;
        this.f60545g = j15;
        this.f60546h = z10;
        this.f60547i = z11;
        this.f60548j = z12;
        this.f60550l = obj;
        this.f60549k = obj2;
    }

    public l0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, @Nullable Object obj, @Nullable Object obj2) {
        this(-9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, z12, obj, obj2);
    }

    public l0(long j10, boolean z10, boolean z11, boolean z12, @Nullable Object obj, @Nullable Object obj2) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, obj2);
    }

    @Override // e4.v0
    public int b(Object obj) {
        return f60539m.equals(obj) ? 0 : -1;
    }

    @Override // e4.v0
    public v0.b g(int i10, v0.b bVar, boolean z10) {
        a6.a.c(i10, 0, 1);
        return bVar.p(null, z10 ? f60539m : null, 0, this.f60542d, -this.f60544f);
    }

    @Override // e4.v0
    public int i() {
        return 1;
    }

    @Override // e4.v0
    public Object m(int i10) {
        a6.a.c(i10, 0, 1);
        return f60539m;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x0012, B:5:0x0018, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // e4.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e4.v0.c o(int r23, e4.v0.c r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 0
            r2 = 1
            r3 = r23
            a6.a.c(r3, r1, r2)
            long r1 = r0.f60545g
            boolean r12 = r0.f60547i
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r12 == 0) goto L29
            r5 = 0
            int r5 = (r25 > r5 ? 1 : (r25 == r5 ? 0 : -1))
            if (r5 == 0) goto L29
            long r5 = r0.f60543e
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L22
        L20:
            r14 = r3
            goto L2a
        L22:
            long r1 = r1 + r25
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L29
            goto L20
        L29:
            r14 = r1
        L2a:
            java.lang.Object r4 = e4.v0.c.f60310n
            java.lang.Object r5 = r0.f60549k
            java.lang.Object r6 = r0.f60550l
            long r7 = r0.f60540b
            long r9 = r0.f60541c
            boolean r11 = r0.f60546h
            boolean r13 = r0.f60548j
            long r1 = r0.f60543e
            r16 = r1
            r18 = 0
            r19 = 0
            long r1 = r0.f60544f
            r20 = r1
            r3 = r24
            e4.v0$c r1 = r3.e(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r18, r19, r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.l0.o(int, e4.v0$c, long):e4.v0$c");
    }

    @Override // e4.v0
    public int p() {
        return 1;
    }
}
