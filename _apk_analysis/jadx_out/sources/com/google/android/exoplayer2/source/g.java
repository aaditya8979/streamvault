package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.source.i;
import s7.m0;

/* JADX INFO: compiled from: MaskingMediaSource.java */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends t {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f22303m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c0.d f22304n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c0.b f22305o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f22306p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public f f22307q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f22308r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f22309s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f22310t;

    /* JADX INFO: compiled from: MaskingMediaSource.java */
    public static final class a extends e7.m {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Object f22311g = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Object f22312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final Object f22313f;

        public a(c0 c0Var, @Nullable Object obj, @Nullable Object obj2) {
            super(c0Var);
            this.f22312e = obj;
            this.f22313f = obj2;
        }

        public static a A(com.google.android.exoplayer2.p pVar) {
            return new a(new b(pVar), c0.d.f21398s, f22311g);
        }

        public static a B(c0 c0Var, @Nullable Object obj, @Nullable Object obj2) {
            return new a(c0Var, obj, obj2);
        }

        @Override // e7.m, com.google.android.exoplayer2.c0
        public int f(Object obj) {
            Object obj2;
            c0 c0Var = this.f60883d;
            if (f22311g.equals(obj) && (obj2 = this.f22313f) != null) {
                obj = obj2;
            }
            return c0Var.f(obj);
        }

        @Override // e7.m, com.google.android.exoplayer2.c0
        public c0.b k(int i10, c0.b bVar, boolean z10) {
            this.f60883d.k(i10, bVar, z10);
            if (m0.c(bVar.f21388c, this.f22313f) && z10) {
                bVar.f21388c = f22311g;
            }
            return bVar;
        }

        @Override // e7.m, com.google.android.exoplayer2.c0
        public Object q(int i10) {
            Object objQ = this.f60883d.q(i10);
            return m0.c(objQ, this.f22313f) ? f22311g : objQ;
        }

        @Override // e7.m, com.google.android.exoplayer2.c0
        public c0.d s(int i10, c0.d dVar, long j10) {
            this.f60883d.s(i10, dVar, j10);
            if (m0.c(dVar.f21402b, this.f22312e)) {
                dVar.f21402b = c0.d.f21398s;
            }
            return dVar;
        }

        public a z(c0 c0Var) {
            return new a(c0Var, this.f22312e, this.f22313f);
        }
    }

    /* JADX INFO: compiled from: MaskingMediaSource.java */
    @VisibleForTesting
    public static final class b extends c0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.google.android.exoplayer2.p f22314d;

        public b(com.google.android.exoplayer2.p pVar) {
            this.f22314d = pVar;
        }

        @Override // com.google.android.exoplayer2.c0
        public int f(Object obj) {
            return obj == a.f22311g ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.c0
        public c0.b k(int i10, c0.b bVar, boolean z10) {
            bVar.w(z10 ? 0 : null, z10 ? a.f22311g : null, 0, -9223372036854775807L, 0L, f7.c.f61578h, true);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.c0
        public int m() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.c0
        public Object q(int i10) {
            return a.f22311g;
        }

        @Override // com.google.android.exoplayer2.c0
        public c0.d s(int i10, c0.d dVar, long j10) {
            dVar.k(c0.d.f21398s, this.f22314d, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f21413m = true;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.c0
        public int t() {
            return 1;
        }
    }

    public g(i iVar, boolean z10) {
        super(iVar);
        this.f22303m = z10 && iVar.isSingleWindow();
        this.f22304n = new c0.d();
        this.f22305o = new c0.b();
        c0 initialTimeline = iVar.getInitialTimeline();
        if (initialTimeline == null) {
            this.f22306p = a.A(iVar.getMediaItem());
        } else {
            this.f22306p = a.B(initialTimeline, null, null);
            this.f22310t = true;
        }
    }

    @Override // com.google.android.exoplayer2.source.t
    @Nullable
    public i.b C(i.b bVar) {
        return bVar.c(N(bVar.f60899a));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I(com.google.android.exoplayer2.c0 r15) {
        /*
            r14 = this;
            boolean r0 = r14.f22309s
            if (r0 == 0) goto L19
            com.google.android.exoplayer2.source.g$a r0 = r14.f22306p
            com.google.android.exoplayer2.source.g$a r15 = r0.z(r15)
            r14.f22306p = r15
            com.google.android.exoplayer2.source.f r15 = r14.f22307q
            if (r15 == 0) goto Lae
            long r0 = r15.g()
            r14.Q(r0)
            goto Lae
        L19:
            boolean r0 = r15.u()
            if (r0 == 0) goto L36
            boolean r0 = r14.f22310t
            if (r0 == 0) goto L2a
            com.google.android.exoplayer2.source.g$a r0 = r14.f22306p
            com.google.android.exoplayer2.source.g$a r15 = r0.z(r15)
            goto L32
        L2a:
            java.lang.Object r0 = com.google.android.exoplayer2.c0.d.f21398s
            java.lang.Object r1 = com.google.android.exoplayer2.source.g.a.f22311g
            com.google.android.exoplayer2.source.g$a r15 = com.google.android.exoplayer2.source.g.a.B(r15, r0, r1)
        L32:
            r14.f22306p = r15
            goto Lae
        L36:
            com.google.android.exoplayer2.c0$d r0 = r14.f22304n
            r1 = 0
            r15.r(r1, r0)
            com.google.android.exoplayer2.c0$d r0 = r14.f22304n
            long r2 = r0.f()
            com.google.android.exoplayer2.c0$d r0 = r14.f22304n
            java.lang.Object r0 = r0.f21402b
            com.google.android.exoplayer2.source.f r4 = r14.f22307q
            if (r4 == 0) goto L74
            long r4 = r4.h()
            com.google.android.exoplayer2.source.g$a r6 = r14.f22306p
            com.google.android.exoplayer2.source.f r7 = r14.f22307q
            com.google.android.exoplayer2.source.i$b r7 = r7.f22294b
            java.lang.Object r7 = r7.f60899a
            com.google.android.exoplayer2.c0$b r8 = r14.f22305o
            r6.l(r7, r8)
            com.google.android.exoplayer2.c0$b r6 = r14.f22305o
            long r6 = r6.q()
            long r6 = r6 + r4
            com.google.android.exoplayer2.source.g$a r4 = r14.f22306p
            com.google.android.exoplayer2.c0$d r5 = r14.f22304n
            com.google.android.exoplayer2.c0$d r1 = r4.r(r1, r5)
            long r4 = r1.f()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            com.google.android.exoplayer2.c0$d r9 = r14.f22304n
            com.google.android.exoplayer2.c0$b r10 = r14.f22305o
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.n(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.f22310t
            if (r1 == 0) goto L94
            com.google.android.exoplayer2.source.g$a r0 = r14.f22306p
            com.google.android.exoplayer2.source.g$a r15 = r0.z(r15)
            goto L98
        L94:
            com.google.android.exoplayer2.source.g$a r15 = com.google.android.exoplayer2.source.g.a.B(r15, r0, r2)
        L98:
            r14.f22306p = r15
            com.google.android.exoplayer2.source.f r15 = r14.f22307q
            if (r15 == 0) goto Lae
            r14.Q(r3)
            com.google.android.exoplayer2.source.i$b r15 = r15.f22294b
            java.lang.Object r0 = r15.f60899a
            java.lang.Object r0 = r14.O(r0)
            com.google.android.exoplayer2.source.i$b r15 = r15.c(r0)
            goto Laf
        Lae:
            r15 = 0
        Laf:
            r0 = 1
            r14.f22310t = r0
            r14.f22309s = r0
            com.google.android.exoplayer2.source.g$a r0 = r14.f22306p
            r14.t(r0)
            if (r15 == 0) goto Lc6
            com.google.android.exoplayer2.source.f r0 = r14.f22307q
            java.lang.Object r0 = s7.a.e(r0)
            com.google.android.exoplayer2.source.f r0 = (com.google.android.exoplayer2.source.f) r0
            r0.d(r15)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.g.I(com.google.android.exoplayer2.c0):void");
    }

    @Override // com.google.android.exoplayer2.source.t
    public void L() {
        if (this.f22303m) {
            return;
        }
        this.f22308r = true;
        K();
    }

    @Override // com.google.android.exoplayer2.source.i
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public f a(i.b bVar, r7.b bVar2, long j10) {
        f fVar = new f(bVar, bVar2, j10);
        fVar.m(this.f22481k);
        if (this.f22309s) {
            fVar.d(bVar.c(O(bVar.f60899a)));
        } else {
            this.f22307q = fVar;
            if (!this.f22308r) {
                this.f22308r = true;
                K();
            }
        }
        return fVar;
    }

    public final Object N(Object obj) {
        return (this.f22306p.f22313f == null || !this.f22306p.f22313f.equals(obj)) ? obj : a.f22311g;
    }

    public final Object O(Object obj) {
        return (this.f22306p.f22313f == null || !obj.equals(a.f22311g)) ? obj : this.f22306p.f22313f;
    }

    public c0 P() {
        return this.f22306p;
    }

    public final void Q(long j10) {
        f fVar = this.f22307q;
        int iF = this.f22306p.f(fVar.f22294b.f60899a);
        if (iF == -1) {
            return;
        }
        long j11 = this.f22306p.j(iF, this.f22305o).f21390e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        fVar.k(j10);
    }

    @Override // com.google.android.exoplayer2.source.i
    public void f(h hVar) {
        ((f) hVar).l();
        if (hVar == this.f22307q) {
            this.f22307q = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.i
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void u() {
        this.f22309s = false;
        this.f22308r = false;
        super.u();
    }
}
