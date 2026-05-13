package e5;

import androidx.annotation.Nullable;
import e4.v0;
import e5.b0;
import e5.r;
import java.io.IOException;

/* JADX INFO: compiled from: MaskingMediaSource.java */
/* JADX INFO: loaded from: classes12.dex */
public final class p extends e<Void> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f60566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f60567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v0.c f60568l = new v0.c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v0.b f60569m = new v0.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f60570n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public o f60571o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public b0.a f60572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f60573q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f60574r;

    /* JADX INFO: compiled from: MaskingMediaSource.java */
    public static final class a extends v0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Object f60575b;

        public a(@Nullable Object obj) {
            this.f60575b = obj;
        }

        @Override // e4.v0
        public int b(Object obj) {
            return obj == b.f60576e ? 0 : -1;
        }

        @Override // e4.v0
        public v0.b g(int i10, v0.b bVar, boolean z10) {
            return bVar.p(0, b.f60576e, 0, -9223372036854775807L, 0L);
        }

        @Override // e4.v0
        public int i() {
            return 1;
        }

        @Override // e4.v0
        public Object m(int i10) {
            return b.f60576e;
        }

        @Override // e4.v0
        public v0.c o(int i10, v0.c cVar, long j10) {
            return cVar.e(v0.c.f60310n, this.f60575b, null, -9223372036854775807L, -9223372036854775807L, false, true, false, 0L, -9223372036854775807L, 0, 0, 0L);
        }

        @Override // e4.v0
        public int p() {
            return 1;
        }
    }

    /* JADX INFO: compiled from: MaskingMediaSource.java */
    public static final class b extends m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Object f60576e = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f60577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f60578d;

        public b(v0 v0Var, Object obj, Object obj2) {
            super(v0Var);
            this.f60577c = obj;
            this.f60578d = obj2;
        }

        public static b u(@Nullable Object obj) {
            return new b(new a(obj), v0.c.f60310n, f60576e);
        }

        public static b v(v0 v0Var, Object obj, Object obj2) {
            return new b(v0Var, obj, obj2);
        }

        @Override // e4.v0
        public int b(Object obj) {
            v0 v0Var = this.f60551b;
            if (f60576e.equals(obj)) {
                obj = this.f60578d;
            }
            return v0Var.b(obj);
        }

        @Override // e4.v0
        public v0.b g(int i10, v0.b bVar, boolean z10) {
            this.f60551b.g(i10, bVar, z10);
            if (a6.k0.c(bVar.f60305b, this.f60578d)) {
                bVar.f60305b = f60576e;
            }
            return bVar;
        }

        @Override // e4.v0
        public Object m(int i10) {
            Object objM = this.f60551b.m(i10);
            return a6.k0.c(objM, this.f60578d) ? f60576e : objM;
        }

        @Override // e4.v0
        public v0.c o(int i10, v0.c cVar, long j10) {
            this.f60551b.o(i10, cVar, j10);
            if (a6.k0.c(cVar.f60311a, this.f60577c)) {
                cVar.f60311a = v0.c.f60310n;
            }
            return cVar;
        }

        public b t(v0 v0Var) {
            return new b(v0Var, this.f60577c, this.f60578d);
        }
    }

    public p(r rVar, boolean z10) {
        this.f60566j = rVar;
        this.f60567k = z10;
        this.f60570n = b.u(rVar.getTag());
    }

    @Override // e5.e
    public boolean F(r.a aVar) {
        o oVar = this.f60571o;
        return oVar == null || !aVar.equals(oVar.f60558c);
    }

    @Override // e5.r
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public o b(r.a aVar, y5.b bVar, long j10) {
        o oVar = new o(this.f60566j, aVar, bVar, j10);
        if (this.f60574r) {
            oVar.b(aVar.a(I(aVar.f60579a)));
        } else {
            this.f60571o = oVar;
            b0.a aVarM = m(0, aVar, 0L);
            this.f60572p = aVarM;
            aVarM.I();
            if (!this.f60573q) {
                this.f60573q = true;
                D(null, this.f60566j);
            }
        }
        return oVar;
    }

    public final Object H(Object obj) {
        return this.f60570n.f60578d.equals(obj) ? b.f60576e : obj;
    }

    public final Object I(Object obj) {
        return obj.equals(b.f60576e) ? this.f60570n.f60578d : obj;
    }

    @Override // e5.e
    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public r.a y(Void r12, r.a aVar) {
        return aVar.a(H(aVar.f60579a));
    }

    public v0 K() {
        return this.f60570n;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    @Override // e5.e
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(java.lang.Void r10, e5.r r11, e4.v0 r12) {
        /*
            r9 = this;
            boolean r10 = r9.f60574r
            if (r10 == 0) goto Ld
            e5.p$b r10 = r9.f60570n
            e5.p$b r10 = r10.t(r12)
            r9.f60570n = r10
            goto L6d
        Ld:
            boolean r10 = r12.q()
            if (r10 == 0) goto L1e
            java.lang.Object r10 = e4.v0.c.f60310n
            java.lang.Object r11 = e5.p.b.f60576e
            e5.p$b r10 = e5.p.b.v(r12, r10, r11)
            r9.f60570n = r10
            goto L6d
        L1e:
            r10 = 0
            e4.v0$c r11 = r9.f60568l
            r12.n(r10, r11)
            e4.v0$c r10 = r9.f60568l
            long r10 = r10.b()
            e5.o r0 = r9.f60571o
            if (r0 == 0) goto L3a
            long r0 = r0.g()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L3a
            r7 = r0
            goto L3b
        L3a:
            r7 = r10
        L3b:
            e4.v0$c r4 = r9.f60568l
            java.lang.Object r10 = r4.f60311a
            e4.v0$b r5 = r9.f60569m
            r6 = 0
            r3 = r12
            android.util.Pair r11 = r3.j(r4, r5, r6, r7)
            java.lang.Object r0 = r11.first
            java.lang.Object r11 = r11.second
            java.lang.Long r11 = (java.lang.Long) r11
            long r1 = r11.longValue()
            e5.p$b r10 = e5.p.b.v(r12, r10, r0)
            r9.f60570n = r10
            e5.o r10 = r9.f60571o
            if (r10 == 0) goto L6d
            r10.j(r1)
            e5.r$a r11 = r10.f60558c
            java.lang.Object r12 = r11.f60579a
            java.lang.Object r12 = r9.I(r12)
            e5.r$a r11 = r11.a(r12)
            r10.b(r11)
        L6d:
            r10 = 1
            r9.f60574r = r10
            e5.p$b r10 = r9.f60570n
            r9.t(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.p.B(java.lang.Void, e5.r, e4.v0):void");
    }

    @Override // e5.r
    @Nullable
    public Object getTag() {
        return this.f60566j.getTag();
    }

    @Override // e5.r
    public void k(q qVar) {
        ((o) qVar).k();
        if (qVar == this.f60571o) {
            ((b0.a) a6.a.e(this.f60572p)).J();
            this.f60572p = null;
            this.f60571o = null;
        }
    }

    @Override // e5.e, e5.r
    public void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    @Override // e5.e, e5.b
    public void s(@Nullable y5.q qVar) {
        super.s(qVar);
        if (this.f60567k) {
            return;
        }
        this.f60573q = true;
        D(null, this.f60566j);
    }

    @Override // e5.e, e5.b
    public void u() {
        this.f60574r = false;
        this.f60573q = false;
        super.u();
    }
}
