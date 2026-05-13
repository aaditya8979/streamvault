package e4;

import android.util.Pair;
import androidx.annotation.Nullable;
import e4.v0;
import e5.r;

/* JADX INFO: compiled from: MediaPeriodQueue.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f60157c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f60159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f60160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public h0 f60161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public h0 f60162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public h0 f60163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f60164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Object f60165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f60166l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0.b f60155a = new v0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0.c f60156b = new v0.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v0 f60158d = v0.f60303a;

    public final boolean A() {
        h0 h0VarJ = this.f60161g;
        if (h0VarJ == null) {
            return true;
        }
        int iB = this.f60158d.b(h0VarJ.f60122b);
        while (true) {
            iB = this.f60158d.d(iB, this.f60155a, this.f60156b, this.f60159e, this.f60160f);
            while (h0VarJ.j() != null && !h0VarJ.f60126f.f60146f) {
                h0VarJ = h0VarJ.j();
            }
            h0 h0VarJ2 = h0VarJ.j();
            if (iB == -1 || h0VarJ2 == null || this.f60158d.b(h0VarJ2.f60122b) != iB) {
                break;
            }
            h0VarJ = h0VarJ2;
        }
        boolean zU = u(h0VarJ);
        h0VarJ.f60126f = p(h0VarJ.f60126f);
        return !zU;
    }

    public boolean B(long j10, long j11) {
        i0 i0VarP;
        h0 h0VarJ = this.f60161g;
        h0 h0Var = null;
        while (h0VarJ != null) {
            i0 i0Var = h0VarJ.f60126f;
            if (h0Var != null) {
                i0 i0VarH = h(h0Var, j10);
                if (i0VarH != null && d(i0Var, i0VarH)) {
                    i0VarP = i0VarH;
                }
                return !u(h0Var);
            }
            i0VarP = p(i0Var);
            h0VarJ.f60126f = i0VarP.a(i0Var.f60143c);
            if (!c(i0Var.f60145e, i0VarP.f60145e)) {
                long j12 = i0VarP.f60145e;
                return (u(h0VarJ) || (h0VarJ == this.f60162h && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : h0VarJ.z(j12)) ? 1 : (j11 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : h0VarJ.z(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            h0Var = h0VarJ;
            h0VarJ = h0VarJ.j();
        }
        return true;
    }

    public boolean C(int i10) {
        this.f60159e = i10;
        return A();
    }

    public boolean D(boolean z10) {
        this.f60160f = z10;
        return A();
    }

    @Nullable
    public h0 a() {
        h0 h0Var = this.f60161g;
        if (h0Var == null) {
            return null;
        }
        if (h0Var == this.f60162h) {
            this.f60162h = h0Var.j();
        }
        this.f60161g.t();
        int i10 = this.f60164j - 1;
        this.f60164j = i10;
        if (i10 == 0) {
            this.f60163i = null;
            h0 h0Var2 = this.f60161g;
            this.f60165k = h0Var2.f60122b;
            this.f60166l = h0Var2.f60126f.f60141a.f60582d;
        }
        h0 h0VarJ = this.f60161g.j();
        this.f60161g = h0VarJ;
        return h0VarJ;
    }

    public h0 b() {
        h0 h0Var = this.f60162h;
        a6.a.f((h0Var == null || h0Var.j() == null) ? false : true);
        h0 h0VarJ = this.f60162h.j();
        this.f60162h = h0VarJ;
        return h0VarJ;
    }

    public final boolean c(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    public final boolean d(i0 i0Var, i0 i0Var2) {
        return i0Var.f60142b == i0Var2.f60142b && i0Var.f60141a.equals(i0Var2.f60141a);
    }

    public void e(boolean z10) {
        h0 h0Var = this.f60161g;
        if (h0Var != null) {
            this.f60165k = z10 ? h0Var.f60122b : null;
            this.f60166l = h0Var.f60126f.f60141a.f60582d;
            u(h0Var);
            h0Var.t();
        } else if (!z10) {
            this.f60165k = null;
        }
        this.f60161g = null;
        this.f60163i = null;
        this.f60162h = null;
        this.f60164j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e4.h0 f(e4.q0[] r12, w5.d r13, y5.b r14, e5.r r15, e4.i0 r16, w5.e r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            e4.h0 r1 = r0.f60163i
            if (r1 != 0) goto L1e
            e5.r$a r1 = r8.f60141a
            boolean r1 = r1.b()
            if (r1 == 0) goto L1b
            long r1 = r8.f60143c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L1b
            goto L2c
        L1b:
            r1 = 0
            goto L2c
        L1e:
            long r1 = r1.l()
            e4.h0 r3 = r0.f60163i
            e4.i0 r3 = r3.f60126f
            long r3 = r3.f60145e
            long r1 = r1 + r3
            long r3 = r8.f60142b
            long r1 = r1 - r3
        L2c:
            r3 = r1
            e4.h0 r10 = new e4.h0
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            e4.h0 r1 = r0.f60163i
            if (r1 == 0) goto L43
            r1.w(r10)
            goto L47
        L43:
            r0.f60161g = r10
            r0.f60162h = r10
        L47:
            r1 = 0
            r0.f60165k = r1
            r0.f60163i = r10
            int r1 = r0.f60164j
            int r1 = r1 + 1
            r0.f60164j = r1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.j0.f(e4.q0[], w5.d, y5.b, e5.r, e4.i0, w5.e):e4.h0");
    }

    public final i0 g(k0 k0Var) {
        return j(k0Var.f60174b, k0Var.f60176d, k0Var.f60175c);
    }

    @Nullable
    public final i0 h(h0 h0Var, long j10) {
        long jLongValue;
        Object obj;
        long j11;
        long j12;
        long j13;
        i0 i0Var = h0Var.f60126f;
        long jL = (h0Var.l() + i0Var.f60145e) - j10;
        long j14 = 0;
        if (i0Var.f60146f) {
            int iD = this.f60158d.d(this.f60158d.b(i0Var.f60141a.f60579a), this.f60155a, this.f60156b, this.f60159e, this.f60160f);
            if (iD == -1) {
                return null;
            }
            int i10 = this.f60158d.g(iD, this.f60155a, true).f60306c;
            Object obj2 = this.f60155a.f60305b;
            long j15 = i0Var.f60141a.f60582d;
            if (this.f60158d.n(i10, this.f60156b).f60319i == iD) {
                Pair<Object, Long> pairK = this.f60158d.k(this.f60156b, this.f60155a, i10, -9223372036854775807L, Math.max(0L, jL));
                if (pairK == null) {
                    return null;
                }
                Object obj3 = pairK.first;
                long jLongValue2 = ((Long) pairK.second).longValue();
                h0 h0VarJ = h0Var.j();
                if (h0VarJ == null || !h0VarJ.f60122b.equals(obj3)) {
                    j13 = this.f60157c;
                    this.f60157c = 1 + j13;
                } else {
                    j13 = h0VarJ.f60126f.f60141a.f60582d;
                }
                j12 = jLongValue2;
                j14 = -9223372036854775807L;
                j11 = j13;
                obj = obj3;
            } else {
                obj = obj2;
                j11 = j15;
                j12 = 0;
            }
            return j(w(obj, j12, j11), j14, j12);
        }
        r.a aVar = i0Var.f60141a;
        this.f60158d.h(aVar.f60579a, this.f60155a);
        if (!aVar.b()) {
            int iE = this.f60155a.e(i0Var.f60144d);
            if (iE == -1) {
                return l(aVar.f60579a, i0Var.f60145e, aVar.f60582d);
            }
            int iJ = this.f60155a.j(iE);
            if (this.f60155a.o(iE, iJ)) {
                return k(aVar.f60579a, iE, iJ, i0Var.f60145e, aVar.f60582d);
            }
            return null;
        }
        int i11 = aVar.f60580b;
        int iA = this.f60155a.a(i11);
        if (iA == -1) {
            return null;
        }
        int iK = this.f60155a.k(i11, aVar.f60581c);
        if (iK < iA) {
            if (this.f60155a.o(i11, iK)) {
                return k(aVar.f60579a, i11, iK, i0Var.f60143c, aVar.f60582d);
            }
            return null;
        }
        long j16 = i0Var.f60143c;
        if (j16 == -9223372036854775807L) {
            v0 v0Var = this.f60158d;
            v0.c cVar = this.f60156b;
            v0.b bVar = this.f60155a;
            Pair<Object, Long> pairK2 = v0Var.k(cVar, bVar, bVar.f60306c, -9223372036854775807L, Math.max(0L, jL));
            if (pairK2 == null) {
                return null;
            }
            jLongValue = ((Long) pairK2.second).longValue();
        } else {
            jLongValue = j16;
        }
        return l(aVar.f60579a, jLongValue, aVar.f60582d);
    }

    @Nullable
    public h0 i() {
        return this.f60163i;
    }

    public final i0 j(r.a aVar, long j10, long j11) {
        this.f60158d.h(aVar.f60579a, this.f60155a);
        if (!aVar.b()) {
            return l(aVar.f60579a, j11, aVar.f60582d);
        }
        if (this.f60155a.o(aVar.f60580b, aVar.f60581c)) {
            return k(aVar.f60579a, aVar.f60580b, aVar.f60581c, j10, aVar.f60582d);
        }
        return null;
    }

    public final i0 k(Object obj, int i10, int i11, long j10, long j11) {
        r.a aVar = new r.a(obj, i10, i11, j11);
        return new i0(aVar, i11 == this.f60155a.j(i10) ? this.f60155a.g() : 0L, j10, -9223372036854775807L, this.f60158d.h(aVar.f60579a, this.f60155a).b(aVar.f60580b, aVar.f60581c), false, false);
    }

    public final i0 l(Object obj, long j10, long j11) {
        int iD = this.f60155a.d(j10);
        r.a aVar = new r.a(obj, j11, iD);
        boolean zQ = q(aVar);
        boolean zR = r(aVar, zQ);
        long jF = iD != -1 ? this.f60155a.f(iD) : -9223372036854775807L;
        return new i0(aVar, j10, -9223372036854775807L, jF, (jF == -9223372036854775807L || jF == Long.MIN_VALUE) ? this.f60155a.f60307d : jF, zQ, zR);
    }

    @Nullable
    public i0 m(long j10, k0 k0Var) {
        h0 h0Var = this.f60163i;
        return h0Var == null ? g(k0Var) : h(h0Var, j10);
    }

    @Nullable
    public h0 n() {
        return this.f60161g;
    }

    @Nullable
    public h0 o() {
        return this.f60162h;
    }

    public i0 p(i0 i0Var) {
        long jI;
        r.a aVar = i0Var.f60141a;
        boolean zQ = q(aVar);
        boolean zR = r(aVar, zQ);
        this.f60158d.h(i0Var.f60141a.f60579a, this.f60155a);
        if (aVar.b()) {
            jI = this.f60155a.b(aVar.f60580b, aVar.f60581c);
        } else {
            jI = i0Var.f60144d;
            if (jI == -9223372036854775807L || jI == Long.MIN_VALUE) {
                jI = this.f60155a.i();
            }
        }
        return new i0(aVar, i0Var.f60142b, i0Var.f60143c, i0Var.f60144d, jI, zQ, zR);
    }

    public final boolean q(r.a aVar) {
        return !aVar.b() && aVar.f60583e == -1;
    }

    public final boolean r(r.a aVar, boolean z10) {
        int iB = this.f60158d.b(aVar.f60579a);
        return !this.f60158d.n(this.f60158d.f(iB, this.f60155a).f60306c, this.f60156b).f60317g && this.f60158d.r(iB, this.f60155a, this.f60156b, this.f60159e, this.f60160f) && z10;
    }

    public boolean s(e5.q qVar) {
        h0 h0Var = this.f60163i;
        return h0Var != null && h0Var.f60121a == qVar;
    }

    public void t(long j10) {
        h0 h0Var = this.f60163i;
        if (h0Var != null) {
            h0Var.s(j10);
        }
    }

    public boolean u(h0 h0Var) {
        boolean z10 = false;
        a6.a.f(h0Var != null);
        this.f60163i = h0Var;
        while (h0Var.j() != null) {
            h0Var = h0Var.j();
            if (h0Var == this.f60162h) {
                this.f60162h = this.f60161g;
                z10 = true;
            }
            h0Var.t();
            this.f60164j--;
        }
        this.f60163i.w(null);
        return z10;
    }

    public r.a v(Object obj, long j10) {
        return w(obj, j10, x(obj));
    }

    public final r.a w(Object obj, long j10, long j11) {
        this.f60158d.h(obj, this.f60155a);
        int iE = this.f60155a.e(j10);
        return iE == -1 ? new r.a(obj, j11, this.f60155a.d(j10)) : new r.a(obj, iE, this.f60155a.j(iE), j11);
    }

    public final long x(Object obj) {
        int iB;
        int i10 = this.f60158d.h(obj, this.f60155a).f60306c;
        Object obj2 = this.f60165k;
        if (obj2 != null && (iB = this.f60158d.b(obj2)) != -1 && this.f60158d.f(iB, this.f60155a).f60306c == i10) {
            return this.f60166l;
        }
        for (h0 h0VarJ = this.f60161g; h0VarJ != null; h0VarJ = h0VarJ.j()) {
            if (h0VarJ.f60122b.equals(obj)) {
                return h0VarJ.f60126f.f60141a.f60582d;
            }
        }
        for (h0 h0VarJ2 = this.f60161g; h0VarJ2 != null; h0VarJ2 = h0VarJ2.j()) {
            int iB2 = this.f60158d.b(h0VarJ2.f60122b);
            if (iB2 != -1 && this.f60158d.f(iB2, this.f60155a).f60306c == i10) {
                return h0VarJ2.f60126f.f60141a.f60582d;
            }
        }
        long j10 = this.f60157c;
        this.f60157c = 1 + j10;
        if (this.f60161g == null) {
            this.f60165k = obj;
            this.f60166l = j10;
        }
        return j10;
    }

    public void y(v0 v0Var) {
        this.f60158d = v0Var;
    }

    public boolean z() {
        h0 h0Var = this.f60163i;
        return h0Var == null || (!h0Var.f60126f.f60147g && h0Var.q() && this.f60163i.f60126f.f60145e != -9223372036854775807L && this.f60164j < 100);
    }
}
