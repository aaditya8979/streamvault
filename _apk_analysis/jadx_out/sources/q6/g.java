package q6;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import i6.b0;
import i6.y;
import i6.z;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import q6.a;
import s7.a0;
import s7.j0;
import s7.m0;
import s7.v;

/* JADX INFO: compiled from: FragmentedMp4Extractor.java */
/* JADX INFO: loaded from: classes9.dex */
public class g implements i6.k {
    public static final i6.p I = new i6.p() { // from class: q6.f
        @Override // i6.p
        public final i6.k[] createExtractors() {
            return g.k();
        }
    };
    public static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final com.google.android.exoplayer2.m K = new m.b().e0("application/x-emsg").E();
    public int A;
    public int B;
    public int C;
    public boolean D;
    public i6.m E;
    public b0[] F;
    public b0[] G;
    public boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final o f77875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<com.google.android.exoplayer2.m> f77876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<b> f77877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f77878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f77879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f77880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f77881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0 f77882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final j0 f77883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x6.b f77884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a0 f77885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayDeque<a.C0933a> f77886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque<a> f77887n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final b0 f77888o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f77889p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f77890q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f77891r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f77892s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public a0 f77893t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f77894u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f77895v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f77896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f77897x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f77898y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public b f77899z;

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f77900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f77901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f77902c;

        public a(long j10, boolean z10, int i10) {
            this.f77900a = j10;
            this.f77901b = z10;
            this.f77902c = i10;
        }
    }

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f77903a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public r f77906d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f77907e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f77908f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f77909g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f77910h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f77911i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f77914l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f77904b = new q();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a0 f77905c = new a0();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a0 f77912j = new a0(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final a0 f77913k = new a0();

        public b(b0 b0Var, r rVar, c cVar) {
            this.f77903a = b0Var;
            this.f77906d = rVar;
            this.f77907e = cVar;
            j(rVar, cVar);
        }

        public int c() {
            int i10 = !this.f77914l ? this.f77906d.f77998g[this.f77908f] : this.f77904b.f77984k[this.f77908f] ? 1 : 0;
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            return !this.f77914l ? this.f77906d.f77994c[this.f77908f] : this.f77904b.f77980g[this.f77910h];
        }

        public long e() {
            return !this.f77914l ? this.f77906d.f77997f[this.f77908f] : this.f77904b.c(this.f77908f);
        }

        public int f() {
            return !this.f77914l ? this.f77906d.f77995d[this.f77908f] : this.f77904b.f77982i[this.f77908f];
        }

        @Nullable
        public p g() {
            if (!this.f77914l) {
                return null;
            }
            int i10 = ((c) m0.j(this.f77904b.f77974a)).f77863a;
            p pVarA = this.f77904b.f77987n;
            if (pVarA == null) {
                pVarA = this.f77906d.f77992a.a(i10);
            }
            if (pVarA == null || !pVarA.f77969a) {
                return null;
            }
            return pVarA;
        }

        public boolean h() {
            this.f77908f++;
            if (!this.f77914l) {
                return false;
            }
            int i10 = this.f77909g + 1;
            this.f77909g = i10;
            int[] iArr = this.f77904b.f77981h;
            int i11 = this.f77910h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f77910h = i11 + 1;
            this.f77909g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            a0 a0Var;
            p pVarG = g();
            if (pVarG == null) {
                return 0;
            }
            int length = pVarG.f77972d;
            if (length != 0) {
                a0Var = this.f77904b.f77988o;
            } else {
                byte[] bArr = (byte[]) m0.j(pVarG.f77973e);
                this.f77913k.N(bArr, bArr.length);
                a0 a0Var2 = this.f77913k;
                length = bArr.length;
                a0Var = a0Var2;
            }
            boolean zG = this.f77904b.g(this.f77908f);
            boolean z10 = zG || i11 != 0;
            this.f77912j.d()[0] = (byte) ((z10 ? 128 : 0) | length);
            this.f77912j.P(0);
            this.f77903a.a(this.f77912j, 1, 1);
            this.f77903a.a(a0Var, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zG) {
                this.f77905c.L(8);
                byte[] bArrD = this.f77905c.d();
                bArrD[0] = 0;
                bArrD[1] = 1;
                bArrD[2] = (byte) ((i11 >> 8) & 255);
                bArrD[3] = (byte) (i11 & 255);
                bArrD[4] = (byte) ((i10 >> 24) & 255);
                bArrD[5] = (byte) ((i10 >> 16) & 255);
                bArrD[6] = (byte) ((i10 >> 8) & 255);
                bArrD[7] = (byte) (i10 & 255);
                this.f77903a.a(this.f77905c, 8, 1);
                return length + 1 + 8;
            }
            a0 a0Var3 = this.f77904b.f77988o;
            int iJ = a0Var3.J();
            a0Var3.Q(-2);
            int i12 = (iJ * 6) + 2;
            if (i11 != 0) {
                this.f77905c.L(i12);
                byte[] bArrD2 = this.f77905c.d();
                a0Var3.j(bArrD2, 0, i12);
                int i13 = (((bArrD2[2] & 255) << 8) | (bArrD2[3] & 255)) + i11;
                bArrD2[2] = (byte) ((i13 >> 8) & 255);
                bArrD2[3] = (byte) (i13 & 255);
                a0Var3 = this.f77905c;
            }
            this.f77903a.a(a0Var3, i12, 1);
            return length + 1 + i12;
        }

        public void j(r rVar, c cVar) {
            this.f77906d = rVar;
            this.f77907e = cVar;
            this.f77903a.b(rVar.f77992a.f77963f);
            k();
        }

        public void k() {
            this.f77904b.f();
            this.f77908f = 0;
            this.f77910h = 0;
            this.f77909g = 0;
            this.f77911i = 0;
            this.f77914l = false;
        }

        public void l(long j10) {
            int i10 = this.f77908f;
            while (true) {
                q qVar = this.f77904b;
                if (i10 >= qVar.f77979f || qVar.c(i10) >= j10) {
                    return;
                }
                if (this.f77904b.f77984k[i10]) {
                    this.f77911i = i10;
                }
                i10++;
            }
        }

        public void m() {
            p pVarG = g();
            if (pVarG == null) {
                return;
            }
            a0 a0Var = this.f77904b.f77988o;
            int i10 = pVarG.f77972d;
            if (i10 != 0) {
                a0Var.Q(i10);
            }
            if (this.f77904b.g(this.f77908f)) {
                a0Var.Q(a0Var.J() * 6);
            }
        }

        public void n(DrmInitData drmInitData) {
            p pVarA = this.f77906d.f77992a.a(((c) m0.j(this.f77904b.f77974a)).f77863a);
            this.f77903a.b(this.f77906d.f77992a.f77963f.b().M(drmInitData.c(pVarA != null ? pVarA.f77970b : null)).E());
        }
    }

    public g() {
        this(0);
    }

    public g(int i10) {
        this(i10, null);
    }

    public g(int i10, @Nullable j0 j0Var) {
        this(i10, j0Var, null, Collections.emptyList());
    }

    public g(int i10, @Nullable j0 j0Var, @Nullable o oVar, List<com.google.android.exoplayer2.m> list) {
        this(i10, j0Var, oVar, list, null);
    }

    public g(int i10, @Nullable j0 j0Var, @Nullable o oVar, List<com.google.android.exoplayer2.m> list, @Nullable b0 b0Var) {
        this.f77874a = i10;
        this.f77883j = j0Var;
        this.f77875b = oVar;
        this.f77876c = Collections.unmodifiableList(list);
        this.f77888o = b0Var;
        this.f77884k = new x6.b();
        this.f77885l = new a0(16);
        this.f77878e = new a0(v.f79531a);
        this.f77879f = new a0(5);
        this.f77880g = new a0();
        byte[] bArr = new byte[16];
        this.f77881h = bArr;
        this.f77882i = new a0(bArr);
        this.f77886m = new ArrayDeque<>();
        this.f77887n = new ArrayDeque<>();
        this.f77877d = new SparseArray<>();
        this.f77897x = -9223372036854775807L;
        this.f77896w = -9223372036854775807L;
        this.f77898y = -9223372036854775807L;
        this.E = i6.m.F8;
        this.F = new b0[0];
        this.G = new b0[0];
    }

    public static long A(a0 a0Var) {
        a0Var.P(8);
        return q6.a.c(a0Var.n()) == 1 ? a0Var.I() : a0Var.F();
    }

    @Nullable
    public static b B(a0 a0Var, SparseArray<b> sparseArray, boolean z10) {
        a0Var.P(8);
        int iB = q6.a.b(a0Var.n());
        b bVarValueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(a0Var.n());
        if (bVarValueAt == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jI = a0Var.I();
            q qVar = bVarValueAt.f77904b;
            qVar.f77976c = jI;
            qVar.f77977d = jI;
        }
        c cVar = bVarValueAt.f77907e;
        bVarValueAt.f77904b.f77974a = new c((iB & 2) != 0 ? a0Var.n() - 1 : cVar.f77863a, (iB & 8) != 0 ? a0Var.n() : cVar.f77864b, (iB & 16) != 0 ? a0Var.n() : cVar.f77865c, (iB & 32) != 0 ? a0Var.n() : cVar.f77866d);
        return bVarValueAt;
    }

    public static void C(a.C0933a c0933a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        b bVarB = B(((a.b) s7.a.e(c0933a.g(1952868452))).f77833b, sparseArray, z10);
        if (bVarB == null) {
            return;
        }
        q qVar = bVarB.f77904b;
        long j10 = qVar.f77990q;
        boolean z11 = qVar.f77991r;
        bVarB.k();
        bVarB.f77914l = true;
        a.b bVarG = c0933a.g(1952867444);
        if (bVarG == null || (i10 & 2) != 0) {
            qVar.f77990q = j10;
            qVar.f77991r = z11;
        } else {
            qVar.f77990q = A(bVarG.f77833b);
            qVar.f77991r = true;
        }
        F(c0933a, bVarB, i10);
        p pVarA = bVarB.f77906d.f77992a.a(((c) s7.a.e(qVar.f77974a)).f77863a);
        a.b bVarG2 = c0933a.g(1935763834);
        if (bVarG2 != null) {
            v((p) s7.a.e(pVarA), bVarG2.f77833b, qVar);
        }
        a.b bVarG3 = c0933a.g(1935763823);
        if (bVarG3 != null) {
            u(bVarG3.f77833b, qVar);
        }
        a.b bVarG4 = c0933a.g(1936027235);
        if (bVarG4 != null) {
            y(bVarG4.f77833b, qVar);
        }
        w(c0933a, pVarA != null ? pVarA.f77970b : null, qVar);
        int size = c0933a.f77831c.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = c0933a.f77831c.get(i11);
            if (bVar.f77829a == 1970628964) {
                G(bVar.f77833b, qVar, bArr);
            }
        }
    }

    public static Pair<Integer, c> D(a0 a0Var) {
        a0Var.P(12);
        return Pair.create(Integer.valueOf(a0Var.n()), new c(a0Var.n() - 1, a0Var.n(), a0Var.n(), a0Var.n()));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int E(q6.g.b r34, int r35, int r36, s7.a0 r37, int r38) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.g.E(q6.g$b, int, int, s7.a0, int):int");
    }

    public static void F(a.C0933a c0933a, b bVar, int i10) throws ParserException {
        List<a.b> list = c0933a.f77831c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar2 = list.get(i13);
            if (bVar2.f77829a == 1953658222) {
                a0 a0Var = bVar2.f77833b;
                a0Var.P(12);
                int iH = a0Var.H();
                if (iH > 0) {
                    i12 += iH;
                    i11++;
                }
            }
        }
        bVar.f77910h = 0;
        bVar.f77909g = 0;
        bVar.f77908f = 0;
        bVar.f77904b.e(i11, i12);
        int i14 = 0;
        int iE = 0;
        for (int i15 = 0; i15 < size; i15++) {
            a.b bVar3 = list.get(i15);
            if (bVar3.f77829a == 1953658222) {
                iE = E(bVar, i14, i10, bVar3.f77833b, iE);
                i14++;
            }
        }
    }

    public static void G(a0 a0Var, q qVar, byte[] bArr) throws ParserException {
        a0Var.P(8);
        a0Var.j(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            x(a0Var, 16, qVar);
        }
    }

    public static boolean M(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    public static boolean N(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    public static int e(int i10) throws ParserException {
        if (i10 >= 0) {
            return i10;
        }
        throw ParserException.createForMalformedContainer("Unexpected negative value: " + i10, null);
    }

    @Nullable
    public static DrmInitData h(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.f77829a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrD = bVar.f77833b.d();
                UUID uuidF = l.f(bArrD);
                if (uuidF == null) {
                    s7.q.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidF, "video/mp4", bArrD));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    @Nullable
    public static b i(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVarValueAt = sparseArray.valueAt(i10);
            if ((bVarValueAt.f77914l || bVarValueAt.f77908f != bVarValueAt.f77906d.f77993b) && (!bVarValueAt.f77914l || bVarValueAt.f77910h != bVarValueAt.f77904b.f77978e)) {
                long jD = bVarValueAt.d();
                if (jD < j10) {
                    bVar = bVarValueAt;
                    j10 = jD;
                }
            }
        }
        return bVar;
    }

    public static /* synthetic */ i6.k[] k() {
        return new i6.k[]{new g()};
    }

    public static long s(a0 a0Var) {
        a0Var.P(8);
        return q6.a.c(a0Var.n()) == 0 ? a0Var.F() : a0Var.I();
    }

    public static void t(a.C0933a c0933a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        int size = c0933a.f77832d.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.C0933a c0933a2 = c0933a.f77832d.get(i11);
            if (c0933a2.f77829a == 1953653094) {
                C(c0933a2, sparseArray, z10, i10, bArr);
            }
        }
    }

    public static void u(a0 a0Var, q qVar) throws ParserException {
        a0Var.P(8);
        int iN = a0Var.n();
        if ((q6.a.b(iN) & 1) == 1) {
            a0Var.Q(8);
        }
        int iH = a0Var.H();
        if (iH == 1) {
            qVar.f77977d += q6.a.c(iN) == 0 ? a0Var.F() : a0Var.I();
        } else {
            throw ParserException.createForMalformedContainer("Unexpected saio entry count: " + iH, null);
        }
    }

    public static void v(p pVar, a0 a0Var, q qVar) throws ParserException {
        int i10;
        int i11 = pVar.f77972d;
        a0Var.P(8);
        if ((q6.a.b(a0Var.n()) & 1) == 1) {
            a0Var.Q(8);
        }
        int iD = a0Var.D();
        int iH = a0Var.H();
        if (iH > qVar.f77979f) {
            throw ParserException.createForMalformedContainer("Saiz sample count " + iH + " is greater than fragment sample count" + qVar.f77979f, null);
        }
        if (iD == 0) {
            boolean[] zArr = qVar.f77986m;
            i10 = 0;
            for (int i12 = 0; i12 < iH; i12++) {
                int iD2 = a0Var.D();
                i10 += iD2;
                zArr[i12] = iD2 > i11;
            }
        } else {
            i10 = (iD * iH) + 0;
            Arrays.fill(qVar.f77986m, 0, iH, iD > i11);
        }
        Arrays.fill(qVar.f77986m, iH, qVar.f77979f, false);
        if (i10 > 0) {
            qVar.d(i10);
        }
    }

    public static void w(a.C0933a c0933a, @Nullable String str, q qVar) throws ParserException {
        byte[] bArr = null;
        a0 a0Var = null;
        a0 a0Var2 = null;
        for (int i10 = 0; i10 < c0933a.f77831c.size(); i10++) {
            a.b bVar = c0933a.f77831c.get(i10);
            a0 a0Var3 = bVar.f77833b;
            int i11 = bVar.f77829a;
            if (i11 == 1935828848) {
                a0Var3.P(12);
                if (a0Var3.n() == 1936025959) {
                    a0Var = a0Var3;
                }
            } else if (i11 == 1936158820) {
                a0Var3.P(12);
                if (a0Var3.n() == 1936025959) {
                    a0Var2 = a0Var3;
                }
            }
        }
        if (a0Var == null || a0Var2 == null) {
            return;
        }
        a0Var.P(8);
        int iC = q6.a.c(a0Var.n());
        a0Var.Q(4);
        if (iC == 1) {
            a0Var.Q(4);
        }
        if (a0Var.n() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        a0Var2.P(8);
        int iC2 = q6.a.c(a0Var2.n());
        a0Var2.Q(4);
        if (iC2 == 1) {
            if (a0Var2.F() == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
            }
        } else if (iC2 >= 2) {
            a0Var2.Q(4);
        }
        if (a0Var2.F() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        a0Var2.Q(1);
        int iD = a0Var2.D();
        int i12 = (iD & 240) >> 4;
        int i13 = iD & 15;
        boolean z10 = a0Var2.D() == 1;
        if (z10) {
            int iD2 = a0Var2.D();
            byte[] bArr2 = new byte[16];
            a0Var2.j(bArr2, 0, 16);
            if (iD2 == 0) {
                int iD3 = a0Var2.D();
                bArr = new byte[iD3];
                a0Var2.j(bArr, 0, iD3);
            }
            qVar.f77985l = true;
            qVar.f77987n = new p(z10, str, iD2, bArr2, i12, i13, bArr);
        }
    }

    public static void x(a0 a0Var, int i10, q qVar) throws ParserException {
        a0Var.P(i10 + 8);
        int iB = q6.a.b(a0Var.n());
        if ((iB & 1) != 0) {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iB & 2) != 0;
        int iH = a0Var.H();
        if (iH == 0) {
            Arrays.fill(qVar.f77986m, 0, qVar.f77979f, false);
            return;
        }
        if (iH == qVar.f77979f) {
            Arrays.fill(qVar.f77986m, 0, iH, z10);
            qVar.d(a0Var.a());
            qVar.b(a0Var);
        } else {
            throw ParserException.createForMalformedContainer("Senc sample count " + iH + " is different from fragment sample count" + qVar.f77979f, null);
        }
    }

    public static void y(a0 a0Var, q qVar) throws ParserException {
        x(a0Var, 0, qVar);
    }

    public static Pair<Long, i6.c> z(a0 a0Var, long j10) throws ParserException {
        long jI;
        long jI2;
        a0Var.P(8);
        int iC = q6.a.c(a0Var.n());
        a0Var.Q(4);
        long jF = a0Var.F();
        if (iC == 0) {
            jI = a0Var.F();
            jI2 = a0Var.F();
        } else {
            jI = a0Var.I();
            jI2 = a0Var.I();
        }
        long j11 = jI;
        long j12 = j10 + jI2;
        long jF0 = m0.F0(j11, 1000000L, jF);
        a0Var.Q(2);
        int iJ = a0Var.J();
        int[] iArr = new int[iJ];
        long[] jArr = new long[iJ];
        long[] jArr2 = new long[iJ];
        long[] jArr3 = new long[iJ];
        long j13 = jF0;
        int i10 = 0;
        long j14 = j11;
        while (i10 < iJ) {
            int iN = a0Var.n();
            if ((iN & Integer.MIN_VALUE) != 0) {
                throw ParserException.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long jF2 = a0Var.F();
            iArr[i10] = iN & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            long j15 = j14 + jF2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i11 = iJ;
            int[] iArr2 = iArr;
            long jF02 = m0.F0(j15, 1000000L, jF);
            jArr4[i10] = jF02 - jArr5[i10];
            a0Var.Q(4);
            j12 += (long) iArr2[i10];
            i10++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            iJ = i11;
            j14 = j15;
            j13 = jF02;
        }
        return Pair.create(Long.valueOf(jF0), new i6.c(iArr, jArr, jArr2, jArr3));
    }

    public final void H(long j10) throws ParserException {
        while (!this.f77886m.isEmpty() && this.f77886m.peek().f77830b == j10) {
            m(this.f77886m.pop());
        }
        f();
    }

    public final boolean I(i6.l lVar) throws IOException {
        if (this.f77892s == 0) {
            if (!lVar.readFully(this.f77885l.d(), 0, 8, true)) {
                return false;
            }
            this.f77892s = 8;
            this.f77885l.P(0);
            this.f77891r = this.f77885l.F();
            this.f77890q = this.f77885l.n();
        }
        long j10 = this.f77891r;
        if (j10 == 1) {
            lVar.readFully(this.f77885l.d(), 8, 8);
            this.f77892s += 8;
            this.f77891r = this.f77885l.I();
        } else if (j10 == 0) {
            long length = lVar.getLength();
            if (length == -1 && !this.f77886m.isEmpty()) {
                length = this.f77886m.peek().f77830b;
            }
            if (length != -1) {
                this.f77891r = (length - lVar.getPosition()) + ((long) this.f77892s);
            }
        }
        if (this.f77891r < this.f77892s) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        long position = lVar.getPosition() - ((long) this.f77892s);
        int i10 = this.f77890q;
        if ((i10 == 1836019558 || i10 == 1835295092) && !this.H) {
            this.E.h(new z.b(this.f77897x, position));
            this.H = true;
        }
        if (this.f77890q == 1836019558) {
            int size = this.f77877d.size();
            for (int i11 = 0; i11 < size; i11++) {
                q qVar = this.f77877d.valueAt(i11).f77904b;
                qVar.f77975b = position;
                qVar.f77977d = position;
                qVar.f77976c = position;
            }
        }
        int i12 = this.f77890q;
        if (i12 == 1835295092) {
            this.f77899z = null;
            this.f77894u = position + this.f77891r;
            this.f77889p = 2;
            return true;
        }
        if (M(i12)) {
            long position2 = (lVar.getPosition() + this.f77891r) - 8;
            this.f77886m.push(new a.C0933a(this.f77890q, position2));
            if (this.f77891r == this.f77892s) {
                H(position2);
            } else {
                f();
            }
        } else if (N(this.f77890q)) {
            if (this.f77892s != 8) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            long j11 = this.f77891r;
            if (j11 > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            a0 a0Var = new a0((int) j11);
            System.arraycopy(this.f77885l.d(), 0, a0Var.d(), 0, 8);
            this.f77893t = a0Var;
            this.f77889p = 1;
        } else {
            if (this.f77891r > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f77893t = null;
            this.f77889p = 1;
        }
        return true;
    }

    public final void J(i6.l lVar) throws IOException {
        int i10 = ((int) this.f77891r) - this.f77892s;
        a0 a0Var = this.f77893t;
        if (a0Var != null) {
            lVar.readFully(a0Var.d(), 8, i10);
            o(new a.b(this.f77890q, a0Var), lVar.getPosition());
        } else {
            lVar.skipFully(i10);
        }
        H(lVar.getPosition());
    }

    public final void K(i6.l lVar) throws IOException {
        int size = this.f77877d.size();
        long j10 = Long.MAX_VALUE;
        b bVarValueAt = null;
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = this.f77877d.valueAt(i10).f77904b;
            if (qVar.f77989p) {
                long j11 = qVar.f77977d;
                if (j11 < j10) {
                    bVarValueAt = this.f77877d.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVarValueAt == null) {
            this.f77889p = 3;
            return;
        }
        int position = (int) (j10 - lVar.getPosition());
        if (position < 0) {
            throw ParserException.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        lVar.skipFully(position);
        bVarValueAt.f77904b.a(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean L(i6.l lVar) throws IOException {
        int iF;
        b bVarI = this.f77899z;
        Throwable th2 = null;
        if (bVarI == null) {
            bVarI = i(this.f77877d);
            if (bVarI == null) {
                int position = (int) (this.f77894u - lVar.getPosition());
                if (position < 0) {
                    throw ParserException.createForMalformedContainer("Offset to end of mdat was negative.", null);
                }
                lVar.skipFully(position);
                f();
                return false;
            }
            int iD = (int) (bVarI.d() - lVar.getPosition());
            if (iD < 0) {
                s7.q.i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iD = 0;
            }
            lVar.skipFully(iD);
            this.f77899z = bVarI;
        }
        int i10 = 4;
        int i11 = 1;
        if (this.f77889p == 3) {
            int iF2 = bVarI.f();
            this.A = iF2;
            if (bVarI.f77908f < bVarI.f77911i) {
                lVar.skipFully(iF2);
                bVarI.m();
                if (!bVarI.h()) {
                    this.f77899z = null;
                }
                this.f77889p = 3;
                return true;
            }
            if (bVarI.f77906d.f77992a.f77964g == 1) {
                this.A = iF2 - 8;
                lVar.skipFully(8);
            }
            if ("audio/ac4".equals(bVarI.f77906d.f77992a.f77963f.f21751m)) {
                this.B = bVarI.i(this.A, 7);
                f6.c.a(this.A, this.f77882i);
                bVarI.f77903a.e(this.f77882i, 7);
                this.B += 7;
            } else {
                this.B = bVarI.i(this.A, 0);
            }
            this.A += this.B;
            this.f77889p = 4;
            this.C = 0;
        }
        o oVar = bVarI.f77906d.f77992a;
        b0 b0Var = bVarI.f77903a;
        long jE = bVarI.e();
        j0 j0Var = this.f77883j;
        if (j0Var != null) {
            jE = j0Var.a(jE);
        }
        long j10 = jE;
        if (oVar.f77967j == 0) {
            while (true) {
                int i12 = this.B;
                int i13 = this.A;
                if (i12 >= i13) {
                    break;
                }
                this.B += b0Var.f(lVar, i13 - i12, false);
            }
        } else {
            byte[] bArrD = this.f77879f.d();
            bArrD[0] = 0;
            bArrD[1] = 0;
            bArrD[2] = 0;
            int i14 = oVar.f77967j;
            int i15 = i14 + 1;
            int i16 = 4 - i14;
            while (this.B < this.A) {
                int i17 = this.C;
                if (i17 == 0) {
                    lVar.readFully(bArrD, i16, i15);
                    this.f77879f.P(0);
                    int iN = this.f77879f.n();
                    if (iN < i11) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", th2);
                    }
                    this.C = iN - 1;
                    this.f77878e.P(0);
                    b0Var.e(this.f77878e, i10);
                    b0Var.e(this.f77879f, i11);
                    this.D = (this.G.length <= 0 || !v.g(oVar.f77963f.f21751m, bArrD[i10])) ? 0 : i11;
                    this.B += 5;
                    this.A += i16;
                } else {
                    if (this.D) {
                        this.f77880g.L(i17);
                        lVar.readFully(this.f77880g.d(), 0, this.C);
                        b0Var.e(this.f77880g, this.C);
                        iF = this.C;
                        int iQ = v.q(this.f77880g.d(), this.f77880g.f());
                        this.f77880g.P("video/hevc".equals(oVar.f77963f.f21751m) ? 1 : 0);
                        this.f77880g.O(iQ);
                        i6.b.a(j10, this.f77880g, this.G);
                    } else {
                        iF = b0Var.f(lVar, i17, false);
                    }
                    this.B += iF;
                    this.C -= iF;
                    th2 = null;
                    i10 = 4;
                    i11 = 1;
                }
            }
        }
        int iC = bVarI.c();
        p pVarG = bVarI.g();
        b0Var.c(j10, iC, this.A, 0, pVarG != null ? pVarG.f77971c : null);
        r(j10);
        if (!bVarI.h()) {
            this.f77899z = null;
        }
        this.f77889p = 3;
        return true;
    }

    @Override // i6.k
    public void a(i6.m mVar) {
        this.E = mVar;
        f();
        j();
        o oVar = this.f77875b;
        if (oVar != null) {
            this.f77877d.put(0, new b(mVar.track(0, oVar.f77959b), new r(this.f77875b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.E.endTracks();
        }
    }

    @Override // i6.k
    public int b(i6.l lVar, y yVar) throws IOException {
        while (true) {
            int i10 = this.f77889p;
            if (i10 != 0) {
                if (i10 == 1) {
                    J(lVar);
                } else if (i10 == 2) {
                    K(lVar);
                } else if (L(lVar)) {
                    return 0;
                }
            } else if (!I(lVar)) {
                return -1;
            }
        }
    }

    @Override // i6.k
    public boolean c(i6.l lVar) throws IOException {
        return n.b(lVar);
    }

    public final void f() {
        this.f77889p = 0;
        this.f77892s = 0;
    }

    public final c g(SparseArray<c> sparseArray, int i10) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (c) s7.a.e(sparseArray.get(i10));
    }

    public final void j() {
        int i10;
        b0[] b0VarArr = new b0[2];
        this.F = b0VarArr;
        b0 b0Var = this.f77888o;
        int i11 = 0;
        if (b0Var != null) {
            b0VarArr[0] = b0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f77874a & 4) != 0) {
            b0VarArr[i10] = this.E.track(100, 5);
            i10++;
            i12 = 101;
        }
        b0[] b0VarArr2 = (b0[]) m0.A0(this.F, i10);
        this.F = b0VarArr2;
        for (b0 b0Var2 : b0VarArr2) {
            b0Var2.b(K);
        }
        this.G = new b0[this.f77876c.size()];
        while (i11 < this.G.length) {
            b0 b0VarTrack = this.E.track(i12, 3);
            b0VarTrack.b(this.f77876c.get(i11));
            this.G[i11] = b0VarTrack;
            i11++;
            i12++;
        }
    }

    @Nullable
    public o l(@Nullable o oVar) {
        return oVar;
    }

    public final void m(a.C0933a c0933a) throws ParserException {
        int i10 = c0933a.f77829a;
        if (i10 == 1836019574) {
            q(c0933a);
        } else if (i10 == 1836019558) {
            p(c0933a);
        } else {
            if (this.f77886m.isEmpty()) {
                return;
            }
            this.f77886m.peek().d(c0933a);
        }
    }

    public final void n(a0 a0Var) {
        long jF0;
        String str;
        long jF02;
        String str2;
        long jF;
        long jA;
        if (this.F.length == 0) {
            return;
        }
        a0Var.P(8);
        int iC = q6.a.c(a0Var.n());
        if (iC == 0) {
            String str3 = (String) s7.a.e(a0Var.x());
            String str4 = (String) s7.a.e(a0Var.x());
            long jF2 = a0Var.F();
            jF0 = m0.F0(a0Var.F(), 1000000L, jF2);
            long j10 = this.f77898y;
            long j11 = j10 != -9223372036854775807L ? j10 + jF0 : -9223372036854775807L;
            str = str3;
            jF02 = m0.F0(a0Var.F(), 1000L, jF2);
            str2 = str4;
            jF = a0Var.F();
            jA = j11;
        } else {
            if (iC != 1) {
                s7.q.i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iC);
                return;
            }
            long jF3 = a0Var.F();
            jA = m0.F0(a0Var.I(), 1000000L, jF3);
            long jF03 = m0.F0(a0Var.F(), 1000L, jF3);
            long jF4 = a0Var.F();
            str = (String) s7.a.e(a0Var.x());
            jF02 = jF03;
            jF = jF4;
            str2 = (String) s7.a.e(a0Var.x());
            jF0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[a0Var.a()];
        a0Var.j(bArr, 0, a0Var.a());
        a0 a0Var2 = new a0(this.f77884k.a(new EventMessage(str, str2, jF02, jF, bArr)));
        int iA = a0Var2.a();
        for (b0 b0Var : this.F) {
            a0Var2.P(0);
            b0Var.e(a0Var2, iA);
        }
        if (jA == -9223372036854775807L) {
            this.f77887n.addLast(new a(jF0, true, iA));
            this.f77895v += iA;
            return;
        }
        if (!this.f77887n.isEmpty()) {
            this.f77887n.addLast(new a(jA, false, iA));
            this.f77895v += iA;
            return;
        }
        j0 j0Var = this.f77883j;
        if (j0Var != null) {
            jA = j0Var.a(jA);
        }
        for (b0 b0Var2 : this.F) {
            b0Var2.c(jA, 1, iA, 0, null);
        }
    }

    public final void o(a.b bVar, long j10) throws ParserException {
        if (!this.f77886m.isEmpty()) {
            this.f77886m.peek().e(bVar);
            return;
        }
        int i10 = bVar.f77829a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                n(bVar.f77833b);
            }
        } else {
            Pair<Long, i6.c> pairZ = z(bVar.f77833b, j10);
            this.f77898y = ((Long) pairZ.first).longValue();
            this.E.h((z) pairZ.second);
            this.H = true;
        }
    }

    public final void p(a.C0933a c0933a) throws ParserException {
        t(c0933a, this.f77877d, this.f77875b != null, this.f77874a, this.f77881h);
        DrmInitData drmInitDataH = h(c0933a.f77831c);
        if (drmInitDataH != null) {
            int size = this.f77877d.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f77877d.valueAt(i10).n(drmInitDataH);
            }
        }
        if (this.f77896w != -9223372036854775807L) {
            int size2 = this.f77877d.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f77877d.valueAt(i11).l(this.f77896w);
            }
            this.f77896w = -9223372036854775807L;
        }
    }

    public final void q(a.C0933a c0933a) throws ParserException {
        int i10 = 0;
        s7.a.h(this.f77875b == null, "Unexpected moov box.");
        DrmInitData drmInitDataH = h(c0933a.f77831c);
        a.C0933a c0933a2 = (a.C0933a) s7.a.e(c0933a.f(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c0933a2.f77831c.size();
        long jS = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = c0933a2.f77831c.get(i11);
            int i12 = bVar.f77829a;
            if (i12 == 1953654136) {
                Pair<Integer, c> pairD = D(bVar.f77833b);
                sparseArray.put(((Integer) pairD.first).intValue(), (c) pairD.second);
            } else if (i12 == 1835362404) {
                jS = s(bVar.f77833b);
            }
        }
        List<r> listA = q6.b.A(c0933a, new i6.v(), jS, drmInitDataH, (this.f77874a & 16) != 0, false, new y7.e() { // from class: q6.e
            @Override // y7.e
            public final Object apply(Object obj) {
                return this.f77873b.l((o) obj);
            }
        });
        int size2 = listA.size();
        if (this.f77877d.size() != 0) {
            s7.a.g(this.f77877d.size() == size2);
            while (i10 < size2) {
                r rVar = listA.get(i10);
                o oVar = rVar.f77992a;
                this.f77877d.get(oVar.f77958a).j(rVar, g(sparseArray, oVar.f77958a));
                i10++;
            }
            return;
        }
        while (i10 < size2) {
            r rVar2 = listA.get(i10);
            o oVar2 = rVar2.f77992a;
            this.f77877d.put(oVar2.f77958a, new b(this.E.track(i10, oVar2.f77959b), rVar2, g(sparseArray, oVar2.f77958a)));
            this.f77897x = Math.max(this.f77897x, oVar2.f77962e);
            i10++;
        }
        this.E.endTracks();
    }

    public final void r(long j10) {
        while (!this.f77887n.isEmpty()) {
            a aVarRemoveFirst = this.f77887n.removeFirst();
            this.f77895v -= aVarRemoveFirst.f77902c;
            long jA = aVarRemoveFirst.f77900a;
            if (aVarRemoveFirst.f77901b) {
                jA += j10;
            }
            j0 j0Var = this.f77883j;
            if (j0Var != null) {
                jA = j0Var.a(jA);
            }
            for (b0 b0Var : this.F) {
                b0Var.c(jA, 1, aVarRemoveFirst.f77902c, this.f77895v, null);
            }
        }
    }

    @Override // i6.k
    public void release() {
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        int size = this.f77877d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f77877d.valueAt(i10).k();
        }
        this.f77887n.clear();
        this.f77895v = 0;
        this.f77896w = j11;
        this.f77886m.clear();
        f();
    }
}
