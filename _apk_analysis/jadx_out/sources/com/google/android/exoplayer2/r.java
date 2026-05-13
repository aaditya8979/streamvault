package com.google.android.exoplayer2;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.source.i;
import com.google.common.collect.ImmutableList;
import d6.h1;
import d6.i1;
import d6.o1;
import d6.u1;

/* JADX INFO: compiled from: MediaPeriodQueue.java */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0.b f22177a = new c0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0.d f22178b = new c0.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e6.a f22179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f22180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public h1 f22184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public h1 f22185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public h1 f22186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Object f22188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f22189m;

    public r(e6.a aVar, Handler handler) {
        this.f22179c = aVar;
        this.f22180d = handler;
    }

    public static i.b A(c0 c0Var, Object obj, long j10, long j11, c0.d dVar, c0.b bVar) {
        c0Var.l(obj, bVar);
        c0Var.r(bVar.f21389d, dVar);
        int iF = c0Var.f(obj);
        Object objE = obj;
        while (bVar.f21390e == 0 && bVar.f() > 0 && bVar.t(bVar.r()) && bVar.h(0L) == -1) {
            int i10 = iF + 1;
            if (iF >= dVar.f21417q) {
                break;
            }
            c0Var.k(i10, bVar, true);
            objE = s7.a.e(bVar.f21388c);
            iF = i10;
        }
        c0Var.l(objE, bVar);
        int iH = bVar.h(j10);
        return iH == -1 ? new i.b(objE, j11, bVar.g(j10)) : new i.b(objE, iH, bVar.n(iH), j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(ImmutableList.a aVar, i.b bVar) {
        this.f22179c.H(aVar.m(), bVar);
    }

    public i.b B(c0 c0Var, Object obj, long j10) {
        long jC = C(c0Var, obj);
        c0Var.l(obj, this.f22177a);
        c0Var.r(this.f22177a.f21389d, this.f22178b);
        boolean z10 = false;
        for (int iF = c0Var.f(obj); iF >= this.f22178b.f21416p; iF--) {
            c0Var.k(iF, this.f22177a, true);
            boolean z11 = this.f22177a.f() > 0;
            z10 |= z11;
            c0.b bVar = this.f22177a;
            if (bVar.h(bVar.f21390e) != -1) {
                obj = s7.a.e(this.f22177a.f21388c);
            }
            if (z10 && (!z11 || this.f22177a.f21390e != 0)) {
                break;
            }
        }
        return A(c0Var, obj, j10, jC, this.f22178b, this.f22177a);
    }

    public final long C(c0 c0Var, Object obj) {
        int iF;
        int i10 = c0Var.l(obj, this.f22177a).f21389d;
        Object obj2 = this.f22188l;
        if (obj2 != null && (iF = c0Var.f(obj2)) != -1 && c0Var.j(iF, this.f22177a).f21389d == i10) {
            return this.f22189m;
        }
        for (h1 h1VarJ = this.f22184h; h1VarJ != null; h1VarJ = h1VarJ.j()) {
            if (h1VarJ.f59618b.equals(obj)) {
                return h1VarJ.f59622f.f59638a.f60902d;
            }
        }
        for (h1 h1VarJ2 = this.f22184h; h1VarJ2 != null; h1VarJ2 = h1VarJ2.j()) {
            int iF2 = c0Var.f(h1VarJ2.f59618b);
            if (iF2 != -1 && c0Var.j(iF2, this.f22177a).f21389d == i10) {
                return h1VarJ2.f59622f.f59638a.f60902d;
            }
        }
        long j10 = this.f22181e;
        this.f22181e = 1 + j10;
        if (this.f22184h == null) {
            this.f22188l = obj;
            this.f22189m = j10;
        }
        return j10;
    }

    public boolean D() {
        h1 h1Var = this.f22186j;
        return h1Var == null || (!h1Var.f59622f.f59646i && h1Var.q() && this.f22186j.f59622f.f59642e != -9223372036854775807L && this.f22187k < 100);
    }

    public final boolean E(c0 c0Var) {
        h1 h1VarJ = this.f22184h;
        if (h1VarJ == null) {
            return true;
        }
        int iF = c0Var.f(h1VarJ.f59618b);
        while (true) {
            iF = c0Var.h(iF, this.f22177a, this.f22178b, this.f22182f, this.f22183g);
            while (h1VarJ.j() != null && !h1VarJ.f59622f.f59644g) {
                h1VarJ = h1VarJ.j();
            }
            h1 h1VarJ2 = h1VarJ.j();
            if (iF == -1 || h1VarJ2 == null || c0Var.f(h1VarJ2.f59618b) != iF) {
                break;
            }
            h1VarJ = h1VarJ2;
        }
        boolean z10 = z(h1VarJ);
        h1VarJ.f59622f = r(c0Var, h1VarJ.f59622f);
        return !z10;
    }

    public boolean F(c0 c0Var, long j10, long j11) {
        i1 i1VarR;
        h1 h1VarJ = this.f22184h;
        h1 h1Var = null;
        while (h1VarJ != null) {
            i1 i1Var = h1VarJ.f59622f;
            if (h1Var != null) {
                i1 i1VarI = i(c0Var, h1Var, j10);
                if (i1VarI != null && e(i1Var, i1VarI)) {
                    i1VarR = i1VarI;
                }
                return !z(h1Var);
            }
            i1VarR = r(c0Var, i1Var);
            h1VarJ.f59622f = i1VarR.a(i1Var.f59640c);
            if (!d(i1Var.f59642e, i1VarR.f59642e)) {
                h1VarJ.A();
                long j12 = i1VarR.f59642e;
                return (z(h1VarJ) || (h1VarJ == this.f22185i && !h1VarJ.f59622f.f59643f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : h1VarJ.z(j12)) ? 1 : (j11 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : h1VarJ.z(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            h1Var = h1VarJ;
            h1VarJ = h1VarJ.j();
        }
        return true;
    }

    public boolean G(c0 c0Var, int i10) {
        this.f22182f = i10;
        return E(c0Var);
    }

    public boolean H(c0 c0Var, boolean z10) {
        this.f22183g = z10;
        return E(c0Var);
    }

    @Nullable
    public h1 b() {
        h1 h1Var = this.f22184h;
        if (h1Var == null) {
            return null;
        }
        if (h1Var == this.f22185i) {
            this.f22185i = h1Var.j();
        }
        this.f22184h.t();
        int i10 = this.f22187k - 1;
        this.f22187k = i10;
        if (i10 == 0) {
            this.f22186j = null;
            h1 h1Var2 = this.f22184h;
            this.f22188l = h1Var2.f59618b;
            this.f22189m = h1Var2.f59622f.f59638a.f60902d;
        }
        this.f22184h = this.f22184h.j();
        x();
        return this.f22184h;
    }

    public h1 c() {
        h1 h1Var = this.f22185i;
        s7.a.g((h1Var == null || h1Var.j() == null) ? false : true);
        this.f22185i = this.f22185i.j();
        x();
        return this.f22185i;
    }

    public final boolean d(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    public final boolean e(i1 i1Var, i1 i1Var2) {
        return i1Var.f59639b == i1Var2.f59639b && i1Var.f59638a.equals(i1Var2.f59638a);
    }

    public void f() {
        if (this.f22187k == 0) {
            return;
        }
        h1 h1VarJ = (h1) s7.a.i(this.f22184h);
        this.f22188l = h1VarJ.f59618b;
        this.f22189m = h1VarJ.f59622f.f59638a.f60902d;
        while (h1VarJ != null) {
            h1VarJ.t();
            h1VarJ = h1VarJ.j();
        }
        this.f22184h = null;
        this.f22186j = null;
        this.f22185i = null;
        this.f22187k = 0;
        x();
    }

    public h1 g(u1[] u1VarArr, q7.a0 a0Var, r7.b bVar, s sVar, i1 i1Var, q7.b0 b0Var) {
        h1 h1Var = this.f22186j;
        h1 h1Var2 = new h1(u1VarArr, h1Var == null ? 1000000000000L : (h1Var.l() + this.f22186j.f59622f.f59642e) - i1Var.f59639b, a0Var, bVar, sVar, i1Var, b0Var);
        h1 h1Var3 = this.f22186j;
        if (h1Var3 != null) {
            h1Var3.w(h1Var2);
        } else {
            this.f22184h = h1Var2;
            this.f22185i = h1Var2;
        }
        this.f22188l = null;
        this.f22186j = h1Var2;
        this.f22187k++;
        x();
        return h1Var2;
    }

    @Nullable
    public final i1 h(o1 o1Var) {
        return k(o1Var.f59665a, o1Var.f59666b, o1Var.f59667c, o1Var.f59682r);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d6.i1 i(com.google.android.exoplayer2.c0 r20, d6.h1 r21, long r22) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.r.i(com.google.android.exoplayer2.c0, d6.h1, long):d6.i1");
    }

    @Nullable
    public h1 j() {
        return this.f22186j;
    }

    @Nullable
    public final i1 k(c0 c0Var, i.b bVar, long j10, long j11) {
        c0Var.l(bVar.f60899a, this.f22177a);
        return bVar.b() ? l(c0Var, bVar.f60899a, bVar.f60900b, bVar.f60901c, j10, bVar.f60902d) : m(c0Var, bVar.f60899a, j11, j10, bVar.f60902d);
    }

    public final i1 l(c0 c0Var, Object obj, int i10, int i11, long j10, long j11) {
        i.b bVar = new i.b(obj, i10, i11, j11);
        long jE = c0Var.l(bVar.f60899a, this.f22177a).e(bVar.f60900b, bVar.f60901c);
        long j12 = i11 == this.f22177a.n(i10) ? this.f22177a.j() : 0L;
        return new i1(bVar, (jE == -9223372036854775807L || j12 < jE) ? j12 : Math.max(0L, jE - 1), j10, -9223372036854775807L, jE, this.f22177a.t(bVar.f60900b), false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d6.i1 m(com.google.android.exoplayer2.c0 r25, java.lang.Object r26, long r27, long r29, long r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            com.google.android.exoplayer2.c0$b r5 = r0.f22177a
            r1.l(r2, r5)
            com.google.android.exoplayer2.c0$b r5 = r0.f22177a
            int r5 = r5.g(r3)
            r6 = 1
            r7 = -1
            r8 = 0
            if (r5 != r7) goto L2e
            com.google.android.exoplayer2.c0$b r9 = r0.f22177a
            int r9 = r9.f()
            if (r9 <= 0) goto L4d
            com.google.android.exoplayer2.c0$b r9 = r0.f22177a
            int r10 = r9.r()
            boolean r9 = r9.t(r10)
            if (r9 == 0) goto L4d
            r9 = r6
            goto L4e
        L2e:
            com.google.android.exoplayer2.c0$b r9 = r0.f22177a
            boolean r9 = r9.t(r5)
            if (r9 == 0) goto L4d
            com.google.android.exoplayer2.c0$b r9 = r0.f22177a
            long r9 = r9.i(r5)
            com.google.android.exoplayer2.c0$b r11 = r0.f22177a
            long r12 = r11.f21390e
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L4d
            boolean r9 = r11.s(r5)
            if (r9 == 0) goto L4d
            r9 = r6
            r5 = r7
            goto L4e
        L4d:
            r9 = r8
        L4e:
            com.google.android.exoplayer2.source.i$b r11 = new com.google.android.exoplayer2.source.i$b
            r12 = r31
            r11.<init>(r2, r12, r5)
            boolean r2 = r0.s(r11)
            boolean r22 = r0.u(r1, r11)
            boolean r23 = r0.t(r1, r11, r2)
            if (r5 == r7) goto L6e
            com.google.android.exoplayer2.c0$b r1 = r0.f22177a
            boolean r1 = r1.t(r5)
            if (r1 == 0) goto L6e
            r20 = r6
            goto L70
        L6e:
            r20 = r8
        L70:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r7) goto L80
            com.google.android.exoplayer2.c0$b r1 = r0.f22177a
            long r14 = r1.i(r5)
        L7d:
            r16 = r14
            goto L89
        L80:
            if (r9 == 0) goto L87
            com.google.android.exoplayer2.c0$b r1 = r0.f22177a
            long r14 = r1.f21390e
            goto L7d
        L87:
            r16 = r12
        L89:
            int r1 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r1 == 0) goto L97
            r14 = -9223372036854775808
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 != 0) goto L94
            goto L97
        L94:
            r18 = r16
            goto L9d
        L97:
            com.google.android.exoplayer2.c0$b r1 = r0.f22177a
            long r14 = r1.f21390e
            r18 = r14
        L9d:
            int r1 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r1 == 0) goto Lb4
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 < 0) goto Lb4
            if (r23 != 0) goto Lab
            if (r9 != 0) goto Laa
            goto Lab
        Laa:
            r6 = r8
        Lab:
            r3 = 0
            long r5 = (long) r6
            long r5 = r18 - r5
            long r3 = java.lang.Math.max(r3, r5)
        Lb4:
            r12 = r3
            d6.i1 r1 = new d6.i1
            r10 = r1
            r14 = r29
            r21 = r2
            r10.<init>(r11, r12, r14, r16, r18, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.r.m(com.google.android.exoplayer2.c0, java.lang.Object, long, long, long):d6.i1");
    }

    public final long n(c0 c0Var, Object obj, int i10) {
        c0Var.l(obj, this.f22177a);
        long jI = this.f22177a.i(i10);
        return jI == Long.MIN_VALUE ? this.f22177a.f21390e : jI + this.f22177a.l(i10);
    }

    @Nullable
    public i1 o(long j10, o1 o1Var) {
        h1 h1Var = this.f22186j;
        return h1Var == null ? h(o1Var) : i(o1Var.f59665a, h1Var, j10);
    }

    @Nullable
    public h1 p() {
        return this.f22184h;
    }

    @Nullable
    public h1 q() {
        return this.f22185i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d6.i1 r(com.google.android.exoplayer2.c0 r19, d6.i1 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.exoplayer2.source.i$b r3 = r2.f59638a
            boolean r12 = r0.s(r3)
            boolean r13 = r0.u(r1, r3)
            boolean r14 = r0.t(r1, r3, r12)
            com.google.android.exoplayer2.source.i$b r4 = r2.f59638a
            java.lang.Object r4 = r4.f60899a
            com.google.android.exoplayer2.c0$b r5 = r0.f22177a
            r1.l(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.f60903e
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            com.google.android.exoplayer2.c0$b r7 = r0.f22177a
            long r7 = r7.i(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            com.google.android.exoplayer2.c0$b r1 = r0.f22177a
            int r5 = r3.f60900b
            int r6 = r3.f60901c
            long r5 = r1.e(r5, r6)
        L46:
            r9 = r5
            goto L5c
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            com.google.android.exoplayer2.c0$b r1 = r0.f22177a
            long r5 = r1.m()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            com.google.android.exoplayer2.c0$b r1 = r0.f22177a
            int r4 = r3.f60900b
            boolean r1 = r1.t(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.f60903e
            if (r1 == r4) goto L7a
            com.google.android.exoplayer2.c0$b r4 = r0.f22177a
            boolean r1 = r4.t(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            d6.i1 r15 = new d6.i1
            long r4 = r2.f59639b
            long r1 = r2.f59640c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.r.r(com.google.android.exoplayer2.c0, d6.i1):d6.i1");
    }

    public final boolean s(i.b bVar) {
        return !bVar.b() && bVar.f60903e == -1;
    }

    public final boolean t(c0 c0Var, i.b bVar, boolean z10) {
        int iF = c0Var.f(bVar.f60899a);
        return !c0Var.r(c0Var.j(iF, this.f22177a).f21389d, this.f22178b).f21410j && c0Var.v(iF, this.f22177a, this.f22178b, this.f22182f, this.f22183g) && z10;
    }

    public final boolean u(c0 c0Var, i.b bVar) {
        if (s(bVar)) {
            return c0Var.r(c0Var.l(bVar.f60899a, this.f22177a).f21389d, this.f22178b).f21417q == c0Var.f(bVar.f60899a);
        }
        return false;
    }

    public boolean v(com.google.android.exoplayer2.source.h hVar) {
        h1 h1Var = this.f22186j;
        return h1Var != null && h1Var.f59617a == hVar;
    }

    public final void x() {
        final ImmutableList.a aVarBuilder = ImmutableList.builder();
        for (h1 h1VarJ = this.f22184h; h1VarJ != null; h1VarJ = h1VarJ.j()) {
            aVarBuilder.a(h1VarJ.f59622f.f59638a);
        }
        h1 h1Var = this.f22185i;
        final i.b bVar = h1Var == null ? null : h1Var.f59622f.f59638a;
        this.f22180d.post(new Runnable() { // from class: d6.j1
            @Override // java.lang.Runnable
            public final void run() {
                this.f59649b.w(aVarBuilder, bVar);
            }
        });
    }

    public void y(long j10) {
        h1 h1Var = this.f22186j;
        if (h1Var != null) {
            h1Var.s(j10);
        }
    }

    public boolean z(h1 h1Var) {
        boolean z10 = false;
        s7.a.g(h1Var != null);
        if (h1Var.equals(this.f22186j)) {
            return false;
        }
        this.f22186j = h1Var;
        while (h1Var.j() != null) {
            h1Var = h1Var.j();
            if (h1Var == this.f22185i) {
                this.f22185i = this.f22184h;
                z10 = true;
            }
            h1Var.t();
            this.f22187k--;
        }
        this.f22186j.w(null);
        x();
        return z10;
    }
}
