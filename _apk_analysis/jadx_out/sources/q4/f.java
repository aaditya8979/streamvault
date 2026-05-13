package q4;

import a6.g0;
import a6.k0;
import a6.q;
import a6.t;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.metadata.emsg.EventMessage;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k4.r;
import k4.s;
import k4.u;
import q4.a;

/* JADX INFO: compiled from: FragmentedMp4Extractor.java */
/* JADX INFO: loaded from: classes7.dex */
public class f implements k4.g {
    public static final k4.k I = new k4.k() { // from class: q4.e
        @Override // k4.k
        public final k4.g[] createExtractors() {
            return f.k();
        }
    };
    public static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final Format K = Format.t(null, "application/x-emsg", Long.MAX_VALUE);
    public int A;
    public int B;
    public int C;
    public boolean D;
    public k4.i E;
    public u[] F;
    public u[] G;
    public boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final l f77703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Format> f77704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<b> f77705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f77706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f77707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f77708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f77709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f77710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final g0 f77711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x4.b f77712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f77713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayDeque<a.C0930a> f77714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque<a> f77715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final u f77716o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f77717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f77718q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f77719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f77720s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t f77721t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f77722u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f77723v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f77724w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f77725x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f77726y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f77727z;

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f77728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77729b;

        public a(long j10, int i10) {
            this.f77728a = j10;
            this.f77729b = i10;
        }
    }

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f77730a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public l f77733d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f77734e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f77735f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f77736g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f77737h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f77738i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f77731b = new n();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f77732c = new t();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final t f77739j = new t(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final t f77740k = new t();

        public b(u uVar) {
            this.f77730a = uVar;
        }

        public final m c() {
            n nVar = this.f77731b;
            int i10 = nVar.f77788a.f77692a;
            m mVarA = nVar.f77802o;
            if (mVarA == null) {
                mVarA = this.f77733d.a(i10);
            }
            if (mVarA == null || !mVarA.f77783a) {
                return null;
            }
            return mVarA;
        }

        public void d(l lVar, c cVar) {
            this.f77733d = (l) a6.a.e(lVar);
            this.f77734e = (c) a6.a.e(cVar);
            this.f77730a.d(lVar.f77777f);
            g();
        }

        public boolean e() {
            this.f77735f++;
            int i10 = this.f77736g + 1;
            this.f77736g = i10;
            int[] iArr = this.f77731b.f77795h;
            int i11 = this.f77737h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f77737h = i11 + 1;
            this.f77736g = 0;
            return false;
        }

        public int f(int i10, int i11) {
            t tVar;
            m mVarC = c();
            if (mVarC == null) {
                return 0;
            }
            int length = mVarC.f77786d;
            if (length != 0) {
                tVar = this.f77731b.f77804q;
            } else {
                byte[] bArr = mVarC.f77787e;
                this.f77740k.J(bArr, bArr.length);
                t tVar2 = this.f77740k;
                length = bArr.length;
                tVar = tVar2;
            }
            boolean zG = this.f77731b.g(this.f77735f);
            boolean z10 = zG || i11 != 0;
            t tVar3 = this.f77739j;
            tVar3.f3620a[0] = (byte) ((z10 ? 128 : 0) | length);
            tVar3.L(0);
            this.f77730a.a(this.f77739j, 1);
            this.f77730a.a(tVar, length);
            if (!z10) {
                return length + 1;
            }
            if (!zG) {
                this.f77732c.H(8);
                t tVar4 = this.f77732c;
                byte[] bArr2 = tVar4.f3620a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                bArr2[4] = (byte) ((i10 >> 24) & 255);
                bArr2[5] = (byte) ((i10 >> 16) & 255);
                bArr2[6] = (byte) ((i10 >> 8) & 255);
                bArr2[7] = (byte) (i10 & 255);
                this.f77730a.a(tVar4, 8);
                return length + 1 + 8;
            }
            t tVar5 = this.f77731b.f77804q;
            int iE = tVar5.E();
            tVar5.M(-2);
            int i12 = (iE * 6) + 2;
            if (i11 != 0) {
                this.f77732c.H(i12);
                this.f77732c.h(tVar5.f3620a, 0, i12);
                tVar5.M(i12);
                tVar5 = this.f77732c;
                byte[] bArr3 = tVar5.f3620a;
                int i13 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
                bArr3[2] = (byte) ((i13 >> 8) & 255);
                bArr3[3] = (byte) (i13 & 255);
            }
            this.f77730a.a(tVar5, i12);
            return length + 1 + i12;
        }

        public void g() {
            this.f77731b.f();
            this.f77735f = 0;
            this.f77737h = 0;
            this.f77736g = 0;
            this.f77738i = 0;
        }

        public void h(long j10) {
            int i10 = this.f77735f;
            while (true) {
                n nVar = this.f77731b;
                if (i10 >= nVar.f77793f || nVar.c(i10) >= j10) {
                    return;
                }
                if (this.f77731b.f77799l[i10]) {
                    this.f77738i = i10;
                }
                i10++;
            }
        }

        public final void i() {
            m mVarC = c();
            if (mVarC == null) {
                return;
            }
            t tVar = this.f77731b.f77804q;
            int i10 = mVarC.f77786d;
            if (i10 != 0) {
                tVar.M(i10);
            }
            if (this.f77731b.g(this.f77735f)) {
                tVar.M(tVar.E() * 6);
            }
        }

        public void j(DrmInitData drmInitData) {
            m mVarA = this.f77733d.a(this.f77731b.f77788a.f77692a);
            this.f77730a.d(this.f77733d.f77777f.e(drmInitData.d(mVarA != null ? mVarA.f77784b : null)));
        }
    }

    public f() {
        this(0);
    }

    public f(int i10) {
        this(i10, null);
    }

    public f(int i10, @Nullable g0 g0Var) {
        this(i10, g0Var, null, Collections.emptyList());
    }

    public f(int i10, @Nullable g0 g0Var, @Nullable l lVar) {
        this(i10, g0Var, lVar, Collections.emptyList());
    }

    public f(int i10, @Nullable g0 g0Var, @Nullable l lVar, List<Format> list) {
        this(i10, g0Var, lVar, list, null);
    }

    public f(int i10, @Nullable g0 g0Var, @Nullable l lVar, List<Format> list, @Nullable u uVar) {
        this.f77702a = i10 | (lVar != null ? 8 : 0);
        this.f77711j = g0Var;
        this.f77703b = lVar;
        this.f77704c = Collections.unmodifiableList(list);
        this.f77716o = uVar;
        this.f77712k = new x4.b();
        this.f77713l = new t(16);
        this.f77706e = new t(q.f3596a);
        this.f77707f = new t(5);
        this.f77708g = new t();
        byte[] bArr = new byte[16];
        this.f77709h = bArr;
        this.f77710i = new t(bArr);
        this.f77714m = new ArrayDeque<>();
        this.f77715n = new ArrayDeque<>();
        this.f77705d = new SparseArray<>();
        this.f77725x = -9223372036854775807L;
        this.f77724w = -9223372036854775807L;
        this.f77726y = -9223372036854775807L;
        f();
    }

    public static Pair<Long, k4.b> A(t tVar, long j10) throws ParserException {
        long jD;
        long jD2;
        tVar.L(8);
        int iC = q4.a.c(tVar.j());
        tVar.M(4);
        long jA = tVar.A();
        if (iC == 0) {
            jD = tVar.A();
            jD2 = tVar.A();
        } else {
            jD = tVar.D();
            jD2 = tVar.D();
        }
        long j11 = jD;
        long j12 = j10 + jD2;
        long jY0 = k0.y0(j11, 1000000L, jA);
        tVar.M(2);
        int iE = tVar.E();
        int[] iArr = new int[iE];
        long[] jArr = new long[iE];
        long[] jArr2 = new long[iE];
        long[] jArr3 = new long[iE];
        long j13 = jY0;
        int i10 = 0;
        long j14 = j11;
        while (i10 < iE) {
            int iJ = tVar.j();
            if ((iJ & Integer.MIN_VALUE) != 0) {
                throw new ParserException("Unhandled indirect reference");
            }
            long jA2 = tVar.A();
            iArr[i10] = iJ & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            long j15 = j14 + jA2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i11 = iE;
            int[] iArr2 = iArr;
            long jY02 = k0.y0(j15, 1000000L, jA);
            jArr4[i10] = jY02 - jArr5[i10];
            tVar.M(4);
            j12 += (long) iArr2[i10];
            i10++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            iE = i11;
            j14 = j15;
            j13 = jY02;
        }
        return Pair.create(Long.valueOf(jY0), new k4.b(iArr, jArr, jArr2, jArr3));
    }

    public static long B(t tVar) {
        tVar.L(8);
        return q4.a.c(tVar.j()) == 1 ? tVar.D() : tVar.A();
    }

    public static b C(t tVar, SparseArray<b> sparseArray) {
        tVar.L(8);
        int iB = q4.a.b(tVar.j());
        b bVarJ = j(sparseArray, tVar.j());
        if (bVarJ == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jD = tVar.D();
            n nVar = bVarJ.f77731b;
            nVar.f77790c = jD;
            nVar.f77791d = jD;
        }
        c cVar = bVarJ.f77734e;
        bVarJ.f77731b.f77788a = new c((iB & 2) != 0 ? tVar.j() - 1 : cVar.f77692a, (iB & 8) != 0 ? tVar.j() : cVar.f77693b, (iB & 16) != 0 ? tVar.j() : cVar.f77694c, (iB & 32) != 0 ? tVar.j() : cVar.f77695d);
        return bVarJ;
    }

    public static void D(a.C0930a c0930a, SparseArray<b> sparseArray, int i10, byte[] bArr) throws ParserException {
        b bVarC = C(c0930a.g(1952868452).f77666b, sparseArray);
        if (bVarC == null) {
            return;
        }
        n nVar = bVarC.f77731b;
        long jB = nVar.f77806s;
        bVarC.g();
        if (c0930a.g(1952867444) != null && (i10 & 2) == 0) {
            jB = B(c0930a.g(1952867444).f77666b);
        }
        G(c0930a, bVarC, jB, i10);
        m mVarA = bVarC.f77733d.a(nVar.f77788a.f77692a);
        a.b bVarG = c0930a.g(1935763834);
        if (bVarG != null) {
            w(mVarA, bVarG.f77666b, nVar);
        }
        a.b bVarG2 = c0930a.g(1935763823);
        if (bVarG2 != null) {
            v(bVarG2.f77666b, nVar);
        }
        a.b bVarG3 = c0930a.g(1936027235);
        if (bVarG3 != null) {
            y(bVarG3.f77666b, nVar);
        }
        a.b bVarG4 = c0930a.g(1935828848);
        a.b bVarG5 = c0930a.g(1936158820);
        if (bVarG4 != null && bVarG5 != null) {
            z(bVarG4.f77666b, bVarG5.f77666b, mVarA != null ? mVarA.f77784b : null, nVar);
        }
        int size = c0930a.f77664c.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = c0930a.f77664c.get(i11);
            if (bVar.f77662a == 1970628964) {
                H(bVar.f77666b, nVar, bArr);
            }
        }
    }

    public static Pair<Integer, c> E(t tVar) {
        tVar.L(12);
        return Pair.create(Integer.valueOf(tVar.j()), new c(tVar.j() - 1, tVar.j(), tVar.j(), tVar.j()));
    }

    public static int F(b bVar, int i10, long j10, int i11, t tVar, int i12) throws ParserException {
        boolean z10;
        int iJ;
        boolean z11;
        int iJ2;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        tVar.L(8);
        int iB = q4.a.b(tVar.j());
        l lVar = bVar.f77733d;
        n nVar = bVar.f77731b;
        c cVar = nVar.f77788a;
        nVar.f77795h[i10] = tVar.C();
        long[] jArr = nVar.f77794g;
        long j11 = nVar.f77790c;
        jArr[i10] = j11;
        if ((iB & 1) != 0) {
            jArr[i10] = j11 + ((long) tVar.j());
        }
        boolean z16 = (iB & 4) != 0;
        int iJ3 = cVar.f77695d;
        if (z16) {
            iJ3 = tVar.j();
        }
        boolean z17 = (iB & 256) != 0;
        boolean z18 = (iB & 512) != 0;
        boolean z19 = (iB & 1024) != 0;
        boolean z20 = (iB & 2048) != 0;
        long[] jArr2 = lVar.f77779h;
        long jY0 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            jY0 = k0.y0(lVar.f77780i[0], 1000000L, lVar.f77774c);
        }
        int[] iArr = nVar.f77796i;
        int[] iArr2 = nVar.f77797j;
        long[] jArr3 = nVar.f77798k;
        boolean[] zArr = nVar.f77799l;
        int i13 = iJ3;
        boolean z21 = lVar.f77773b == 2 && (i11 & 1) != 0;
        int i14 = i12 + nVar.f77795h[i10];
        long j12 = lVar.f77774c;
        long j13 = jY0;
        long j14 = i10 > 0 ? nVar.f77806s : j10;
        int i15 = i12;
        while (i15 < i14) {
            int iE = e(z17 ? tVar.j() : cVar.f77693b);
            if (z18) {
                iJ = tVar.j();
                z10 = z17;
            } else {
                z10 = z17;
                iJ = cVar.f77694c;
            }
            int iE2 = e(iJ);
            if (i15 == 0 && z16) {
                z11 = z16;
                iJ2 = i13;
            } else if (z19) {
                z11 = z16;
                iJ2 = tVar.j();
            } else {
                z11 = z16;
                iJ2 = cVar.f77695d;
            }
            if (z20) {
                z12 = z20;
                z13 = z18;
                z14 = z19;
                iArr2[i15] = (int) ((((long) tVar.j()) * 1000000) / j12);
                z15 = false;
            } else {
                z12 = z20;
                z13 = z18;
                z14 = z19;
                z15 = false;
                iArr2[i15] = 0;
            }
            jArr3[i15] = k0.y0(j14, 1000000L, j12) - j13;
            iArr[i15] = iE2;
            zArr[i15] = (((iJ2 >> 16) & 1) != 0 || (z21 && i15 != 0)) ? z15 : true;
            i15++;
            j14 += (long) iE;
            j12 = j12;
            z17 = z10;
            z16 = z11;
            z20 = z12;
            z18 = z13;
            z19 = z14;
        }
        nVar.f77806s = j14;
        return i14;
    }

    public static void G(a.C0930a c0930a, b bVar, long j10, int i10) throws ParserException {
        List<a.b> list = c0930a.f77664c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar2 = list.get(i13);
            if (bVar2.f77662a == 1953658222) {
                t tVar = bVar2.f77666b;
                tVar.L(12);
                int iC = tVar.C();
                if (iC > 0) {
                    i12 += iC;
                    i11++;
                }
            }
        }
        bVar.f77737h = 0;
        bVar.f77736g = 0;
        bVar.f77735f = 0;
        bVar.f77731b.e(i11, i12);
        int i14 = 0;
        int iF = 0;
        for (int i15 = 0; i15 < size; i15++) {
            a.b bVar3 = list.get(i15);
            if (bVar3.f77662a == 1953658222) {
                iF = F(bVar, i14, j10, i10, bVar3.f77666b, iF);
                i14++;
            }
        }
    }

    public static void H(t tVar, n nVar, byte[] bArr) throws ParserException {
        tVar.L(8);
        tVar.h(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            x(tVar, 16, nVar);
        }
    }

    public static boolean N(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    public static boolean O(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    public static int e(int i10) throws ParserException {
        if (i10 >= 0) {
            return i10;
        }
        throw new ParserException("Unexpected negtive value: " + i10);
    }

    @Nullable
    public static DrmInitData h(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.f77662a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f77666b.f3620a;
                UUID uuidD = j.d(bArr);
                if (uuidD == null) {
                    a6.m.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidD, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    public static b i(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVarValueAt = sparseArray.valueAt(i10);
            int i11 = bVarValueAt.f77737h;
            n nVar = bVarValueAt.f77731b;
            if (i11 != nVar.f77792e) {
                long j11 = nVar.f77794g[i11];
                if (j11 < j10) {
                    bVar = bVarValueAt;
                    j10 = j11;
                }
            }
        }
        return bVar;
    }

    @Nullable
    public static b j(SparseArray<b> sparseArray, int i10) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : sparseArray.get(i10);
    }

    public static /* synthetic */ k4.g[] k() {
        return new k4.g[]{new f()};
    }

    public static long t(t tVar) {
        tVar.L(8);
        return q4.a.c(tVar.j()) == 0 ? tVar.A() : tVar.D();
    }

    public static void u(a.C0930a c0930a, SparseArray<b> sparseArray, int i10, byte[] bArr) throws ParserException {
        int size = c0930a.f77665d.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.C0930a c0930a2 = c0930a.f77665d.get(i11);
            if (c0930a2.f77662a == 1953653094) {
                D(c0930a2, sparseArray, i10, bArr);
            }
        }
    }

    public static void v(t tVar, n nVar) throws ParserException {
        tVar.L(8);
        int iJ = tVar.j();
        if ((q4.a.b(iJ) & 1) == 1) {
            tVar.M(8);
        }
        int iC = tVar.C();
        if (iC == 1) {
            nVar.f77791d += q4.a.c(iJ) == 0 ? tVar.A() : tVar.D();
        } else {
            throw new ParserException("Unexpected saio entry count: " + iC);
        }
    }

    public static void w(m mVar, t tVar, n nVar) throws ParserException {
        int i10;
        int i11 = mVar.f77786d;
        tVar.L(8);
        if ((q4.a.b(tVar.j()) & 1) == 1) {
            tVar.M(8);
        }
        int iY = tVar.y();
        int iC = tVar.C();
        if (iC != nVar.f77793f) {
            throw new ParserException("Length mismatch: " + iC + ", " + nVar.f77793f);
        }
        if (iY == 0) {
            boolean[] zArr = nVar.f77801n;
            i10 = 0;
            for (int i12 = 0; i12 < iC; i12++) {
                int iY2 = tVar.y();
                i10 += iY2;
                zArr[i12] = iY2 > i11;
            }
        } else {
            i10 = (iY * iC) + 0;
            Arrays.fill(nVar.f77801n, 0, iC, iY > i11);
        }
        nVar.d(i10);
    }

    public static void x(t tVar, int i10, n nVar) throws ParserException {
        tVar.L(i10 + 8);
        int iB = q4.a.b(tVar.j());
        if ((iB & 1) != 0) {
            throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iB & 2) != 0;
        int iC = tVar.C();
        if (iC == nVar.f77793f) {
            Arrays.fill(nVar.f77801n, 0, iC, z10);
            nVar.d(tVar.a());
            nVar.a(tVar);
        } else {
            throw new ParserException("Length mismatch: " + iC + ", " + nVar.f77793f);
        }
    }

    public static void y(t tVar, n nVar) throws ParserException {
        x(tVar, 0, nVar);
    }

    public static void z(t tVar, t tVar2, String str, n nVar) throws ParserException {
        byte[] bArr;
        tVar.L(8);
        int iJ = tVar.j();
        if (tVar.j() != 1936025959) {
            return;
        }
        if (q4.a.c(iJ) == 1) {
            tVar.M(4);
        }
        if (tVar.j() != 1) {
            throw new ParserException("Entry count in sbgp != 1 (unsupported).");
        }
        tVar2.L(8);
        int iJ2 = tVar2.j();
        if (tVar2.j() != 1936025959) {
            return;
        }
        int iC = q4.a.c(iJ2);
        if (iC == 1) {
            if (tVar2.A() == 0) {
                throw new ParserException("Variable length description in sgpd found (unsupported)");
            }
        } else if (iC >= 2) {
            tVar2.M(4);
        }
        if (tVar2.A() != 1) {
            throw new ParserException("Entry count in sgpd != 1 (unsupported).");
        }
        tVar2.M(1);
        int iY = tVar2.y();
        int i10 = (iY & 240) >> 4;
        int i11 = iY & 15;
        boolean z10 = tVar2.y() == 1;
        if (z10) {
            int iY2 = tVar2.y();
            byte[] bArr2 = new byte[16];
            tVar2.h(bArr2, 0, 16);
            if (iY2 == 0) {
                int iY3 = tVar2.y();
                byte[] bArr3 = new byte[iY3];
                tVar2.h(bArr3, 0, iY3);
                bArr = bArr3;
            } else {
                bArr = null;
            }
            nVar.f77800m = true;
            nVar.f77802o = new m(z10, str, iY2, bArr2, i10, i11, bArr);
        }
    }

    public final void I(long j10) throws ParserException {
        while (!this.f77714m.isEmpty() && this.f77714m.peek().f77663b == j10) {
            n(this.f77714m.pop());
        }
        f();
    }

    public final boolean J(k4.h hVar) throws InterruptedException, IOException {
        if (this.f77720s == 0) {
            if (!hVar.readFully(this.f77713l.f3620a, 0, 8, true)) {
                return false;
            }
            this.f77720s = 8;
            this.f77713l.L(0);
            this.f77719r = this.f77713l.A();
            this.f77718q = this.f77713l.j();
        }
        long j10 = this.f77719r;
        if (j10 == 1) {
            hVar.readFully(this.f77713l.f3620a, 8, 8);
            this.f77720s += 8;
            this.f77719r = this.f77713l.D();
        } else if (j10 == 0) {
            long length = hVar.getLength();
            if (length == -1 && !this.f77714m.isEmpty()) {
                length = this.f77714m.peek().f77663b;
            }
            if (length != -1) {
                this.f77719r = (length - hVar.getPosition()) + ((long) this.f77720s);
            }
        }
        if (this.f77719r < this.f77720s) {
            throw new ParserException("Atom size less than header length (unsupported).");
        }
        long position = hVar.getPosition() - ((long) this.f77720s);
        if (this.f77718q == 1836019558) {
            int size = this.f77705d.size();
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = this.f77705d.valueAt(i10).f77731b;
                nVar.f77789b = position;
                nVar.f77791d = position;
                nVar.f77790c = position;
            }
        }
        int i11 = this.f77718q;
        if (i11 == 1835295092) {
            this.f77727z = null;
            this.f77722u = this.f77719r + position;
            if (!this.H) {
                this.E.c(new s.b(this.f77725x, position));
                this.H = true;
            }
            this.f77717p = 2;
            return true;
        }
        if (N(i11)) {
            long position2 = (hVar.getPosition() + this.f77719r) - 8;
            this.f77714m.push(new a.C0930a(this.f77718q, position2));
            if (this.f77719r == this.f77720s) {
                I(position2);
            } else {
                f();
            }
        } else if (O(this.f77718q)) {
            if (this.f77720s != 8) {
                throw new ParserException("Leaf atom defines extended atom size (unsupported).");
            }
            long j11 = this.f77719r;
            if (j11 > 2147483647L) {
                throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
            }
            t tVar = new t((int) j11);
            this.f77721t = tVar;
            System.arraycopy(this.f77713l.f3620a, 0, tVar.f3620a, 0, 8);
            this.f77717p = 1;
        } else {
            if (this.f77719r > 2147483647L) {
                throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f77721t = null;
            this.f77717p = 1;
        }
        return true;
    }

    public final void K(k4.h hVar) throws InterruptedException, IOException {
        int i10 = ((int) this.f77719r) - this.f77720s;
        t tVar = this.f77721t;
        if (tVar != null) {
            hVar.readFully(tVar.f3620a, 8, i10);
            p(new a.b(this.f77718q, this.f77721t), hVar.getPosition());
        } else {
            hVar.skipFully(i10);
        }
        I(hVar.getPosition());
    }

    public final void L(k4.h hVar) throws InterruptedException, IOException {
        int size = this.f77705d.size();
        b bVarValueAt = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = this.f77705d.valueAt(i10).f77731b;
            if (nVar.f77805r) {
                long j11 = nVar.f77791d;
                if (j11 < j10) {
                    bVarValueAt = this.f77705d.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVarValueAt == null) {
            this.f77717p = 3;
            return;
        }
        int position = (int) (j10 - hVar.getPosition());
        if (position < 0) {
            throw new ParserException("Offset to encryption data was negative.");
        }
        hVar.skipFully(position);
        bVarValueAt.f77731b.b(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean M(k4.h hVar) throws InterruptedException, IOException {
        int i10;
        u.a aVar;
        int iB;
        int i11 = 4;
        int i12 = 1;
        int i13 = 0;
        if (this.f77717p == 3) {
            if (this.f77727z == null) {
                b bVarI = i(this.f77705d);
                if (bVarI == null) {
                    int position = (int) (this.f77722u - hVar.getPosition());
                    if (position < 0) {
                        throw new ParserException("Offset to end of mdat was negative.");
                    }
                    hVar.skipFully(position);
                    f();
                    return false;
                }
                int position2 = (int) (bVarI.f77731b.f77794g[bVarI.f77737h] - hVar.getPosition());
                if (position2 < 0) {
                    a6.m.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                    position2 = 0;
                }
                hVar.skipFully(position2);
                this.f77727z = bVarI;
            }
            b bVar = this.f77727z;
            int[] iArr = bVar.f77731b.f77796i;
            int i14 = bVar.f77735f;
            int i15 = iArr[i14];
            this.A = i15;
            if (i14 < bVar.f77738i) {
                hVar.skipFully(i15);
                this.f77727z.i();
                if (!this.f77727z.e()) {
                    this.f77727z = null;
                }
                this.f77717p = 3;
                return true;
            }
            if (bVar.f77733d.f77778g == 1) {
                this.A = i15 - 8;
                hVar.skipFully(8);
            }
            if ("audio/ac4".equals(this.f77727z.f77733d.f77777f.f19927j)) {
                this.B = this.f77727z.f(this.A, 7);
                g4.b.a(this.A, this.f77710i);
                this.f77727z.f77730a.a(this.f77710i, 7);
                this.B += 7;
            } else {
                this.B = this.f77727z.f(this.A, 0);
            }
            this.A += this.B;
            this.f77717p = 4;
            this.C = 0;
        }
        b bVar2 = this.f77727z;
        n nVar = bVar2.f77731b;
        l lVar = bVar2.f77733d;
        u uVar = bVar2.f77730a;
        int i16 = bVar2.f77735f;
        long jC = nVar.c(i16);
        g0 g0Var = this.f77711j;
        if (g0Var != null) {
            jC = g0Var.a(jC);
        }
        long j10 = jC;
        int i17 = lVar.f77781j;
        if (i17 == 0) {
            while (true) {
                int i18 = this.B;
                int i19 = this.A;
                if (i18 >= i19) {
                    break;
                }
                this.B += uVar.b(hVar, i19 - i18, false);
            }
        } else {
            byte[] bArr = this.f77707f.f3620a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i20 = i17 + 1;
            int i21 = 4 - i17;
            while (this.B < this.A) {
                int i22 = this.C;
                if (i22 == 0) {
                    hVar.readFully(bArr, i21, i20);
                    this.f77707f.L(i13);
                    int iJ = this.f77707f.j();
                    if (iJ < i12) {
                        throw new ParserException("Invalid NAL length");
                    }
                    this.C = iJ - 1;
                    this.f77706e.L(i13);
                    uVar.a(this.f77706e, i11);
                    uVar.a(this.f77707f, i12);
                    this.D = (this.G.length <= 0 || !q.g(lVar.f77777f.f19927j, bArr[i11])) ? i13 : i12;
                    this.B += 5;
                    this.A += i21;
                } else {
                    if (this.D) {
                        this.f77708g.H(i22);
                        hVar.readFully(this.f77708g.f3620a, i13, this.C);
                        uVar.a(this.f77708g, this.C);
                        iB = this.C;
                        t tVar = this.f77708g;
                        int iK = q.k(tVar.f3620a, tVar.d());
                        this.f77708g.L("video/hevc".equals(lVar.f77777f.f19927j) ? 1 : 0);
                        this.f77708g.K(iK);
                        o5.g.a(j10, this.f77708g, this.G);
                    } else {
                        iB = uVar.b(hVar, i22, i13);
                    }
                    this.B += iB;
                    this.C -= iB;
                    i11 = 4;
                    i12 = 1;
                    i13 = 0;
                }
            }
        }
        boolean z10 = nVar.f77799l[i16];
        m mVarC = this.f77727z.c();
        if (mVarC != null) {
            i10 = (z10 ? 1 : 0) | 1073741824;
            aVar = mVarC.f77785c;
        } else {
            i10 = z10 ? 1 : 0;
            aVar = null;
        }
        uVar.c(j10, i10, this.A, 0, aVar);
        s(j10);
        if (!this.f77727z.e()) {
            this.f77727z = null;
        }
        this.f77717p = 3;
        return true;
    }

    @Override // k4.g
    public boolean a(k4.h hVar) throws InterruptedException, IOException {
        return k.b(hVar);
    }

    @Override // k4.g
    public void b(k4.i iVar) {
        this.E = iVar;
        l lVar = this.f77703b;
        if (lVar != null) {
            b bVar = new b(iVar.track(0, lVar.f77773b));
            bVar.d(this.f77703b, new c(0, 0, 0, 0));
            this.f77705d.put(0, bVar);
            l();
            this.E.endTracks();
        }
    }

    @Override // k4.g
    public int c(k4.h hVar, r rVar) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.f77717p;
            if (i10 != 0) {
                if (i10 == 1) {
                    K(hVar);
                } else if (i10 == 2) {
                    L(hVar);
                } else if (M(hVar)) {
                    return 0;
                }
            } else if (!J(hVar)) {
                return -1;
            }
        }
    }

    public final void f() {
        this.f77717p = 0;
        this.f77720s = 0;
    }

    public final c g(SparseArray<c> sparseArray, int i10) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (c) a6.a.e(sparseArray.get(i10));
    }

    public final void l() {
        int i10;
        if (this.F == null) {
            u[] uVarArr = new u[2];
            this.F = uVarArr;
            u uVar = this.f77716o;
            if (uVar != null) {
                uVarArr[0] = uVar;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if ((this.f77702a & 4) != 0) {
                uVarArr[i10] = this.E.track(this.f77705d.size(), 4);
                i10++;
            }
            u[] uVarArr2 = (u[]) Arrays.copyOf(this.F, i10);
            this.F = uVarArr2;
            for (u uVar2 : uVarArr2) {
                uVar2.d(K);
            }
        }
        if (this.G == null) {
            this.G = new u[this.f77704c.size()];
            for (int i11 = 0; i11 < this.G.length; i11++) {
                u uVarTrack = this.E.track(this.f77705d.size() + 1 + i11, 3);
                uVarTrack.d(this.f77704c.get(i11));
                this.G[i11] = uVarTrack;
            }
        }
    }

    @Nullable
    public l m(@Nullable l lVar) {
        return lVar;
    }

    public final void n(a.C0930a c0930a) throws ParserException {
        int i10 = c0930a.f77662a;
        if (i10 == 1836019574) {
            r(c0930a);
        } else if (i10 == 1836019558) {
            q(c0930a);
        } else {
            if (this.f77714m.isEmpty()) {
                return;
            }
            this.f77714m.peek().d(c0930a);
        }
    }

    public final void o(t tVar) {
        long jY0;
        String str;
        long jY02;
        String str2;
        long jA;
        long jA2;
        u[] uVarArr = this.F;
        if (uVarArr == null || uVarArr.length == 0) {
            return;
        }
        tVar.L(8);
        int iC = q4.a.c(tVar.j());
        if (iC == 0) {
            String str3 = (String) a6.a.e(tVar.s());
            String str4 = (String) a6.a.e(tVar.s());
            long jA3 = tVar.A();
            jY0 = k0.y0(tVar.A(), 1000000L, jA3);
            long j10 = this.f77726y;
            long j11 = j10 != -9223372036854775807L ? j10 + jY0 : -9223372036854775807L;
            str = str3;
            jY02 = k0.y0(tVar.A(), 1000L, jA3);
            str2 = str4;
            jA = tVar.A();
            jA2 = j11;
        } else {
            if (iC != 1) {
                a6.m.h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iC);
                return;
            }
            long jA4 = tVar.A();
            jA2 = k0.y0(tVar.D(), 1000000L, jA4);
            long jY03 = k0.y0(tVar.A(), 1000L, jA4);
            long jA5 = tVar.A();
            str = (String) a6.a.e(tVar.s());
            jY02 = jY03;
            jA = jA5;
            str2 = (String) a6.a.e(tVar.s());
            jY0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[tVar.a()];
        tVar.h(bArr, 0, tVar.a());
        t tVar2 = new t(this.f77712k.a(new EventMessage(str, str2, jY02, jA, bArr)));
        int iA = tVar2.a();
        for (u uVar : this.F) {
            tVar2.L(0);
            uVar.a(tVar2, iA);
        }
        if (jA2 == -9223372036854775807L) {
            this.f77715n.addLast(new a(jY0, iA));
            this.f77723v += iA;
            return;
        }
        g0 g0Var = this.f77711j;
        if (g0Var != null) {
            jA2 = g0Var.a(jA2);
        }
        for (u uVar2 : this.F) {
            uVar2.c(jA2, 1, iA, 0, null);
        }
    }

    public final void p(a.b bVar, long j10) throws ParserException {
        if (!this.f77714m.isEmpty()) {
            this.f77714m.peek().e(bVar);
            return;
        }
        int i10 = bVar.f77662a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                o(bVar.f77666b);
            }
        } else {
            Pair<Long, k4.b> pairA = A(bVar.f77666b, j10);
            this.f77726y = ((Long) pairA.first).longValue();
            this.E.c((s) pairA.second);
            this.H = true;
        }
    }

    public final void q(a.C0930a c0930a) throws ParserException {
        u(c0930a, this.f77705d, this.f77702a, this.f77709h);
        DrmInitData drmInitDataH = h(c0930a.f77664c);
        if (drmInitDataH != null) {
            int size = this.f77705d.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f77705d.valueAt(i10).j(drmInitDataH);
            }
        }
        if (this.f77724w != -9223372036854775807L) {
            int size2 = this.f77705d.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f77705d.valueAt(i11).h(this.f77724w);
            }
            this.f77724w = -9223372036854775807L;
        }
    }

    public final void r(a.C0930a c0930a) throws ParserException {
        int i10;
        int i11;
        int i12 = 0;
        a6.a.g(this.f77703b == null, "Unexpected moov box.");
        DrmInitData drmInitDataH = h(c0930a.f77664c);
        a.C0930a c0930aF = c0930a.f(1836475768);
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c0930aF.f77664c.size();
        long jT = -9223372036854775807L;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar = c0930aF.f77664c.get(i13);
            int i14 = bVar.f77662a;
            if (i14 == 1953654136) {
                Pair<Integer, c> pairE = E(bVar.f77666b);
                sparseArray.put(((Integer) pairE.first).intValue(), (c) pairE.second);
            } else if (i14 == 1835362404) {
                jT = t(bVar.f77666b);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c0930a.f77665d.size();
        int i15 = 0;
        while (i15 < size2) {
            a.C0930a c0930a2 = c0930a.f77665d.get(i15);
            if (c0930a2.f77662a == 1953653099) {
                i10 = i15;
                i11 = size2;
                l lVarM = m(q4.b.v(c0930a2, c0930a.g(1836476516), jT, drmInitDataH, (this.f77702a & 16) != 0, false));
                if (lVarM != null) {
                    sparseArray2.put(lVarM.f77772a, lVarM);
                }
            } else {
                i10 = i15;
                i11 = size2;
            }
            i15 = i10 + 1;
            size2 = i11;
        }
        int size3 = sparseArray2.size();
        if (this.f77705d.size() != 0) {
            a6.a.f(this.f77705d.size() == size3);
            while (i12 < size3) {
                l lVar = (l) sparseArray2.valueAt(i12);
                this.f77705d.get(lVar.f77772a).d(lVar, g(sparseArray, lVar.f77772a));
                i12++;
            }
            return;
        }
        while (i12 < size3) {
            l lVar2 = (l) sparseArray2.valueAt(i12);
            b bVar2 = new b(this.E.track(i12, lVar2.f77773b));
            bVar2.d(lVar2, g(sparseArray, lVar2.f77772a));
            this.f77705d.put(lVar2.f77772a, bVar2);
            this.f77725x = Math.max(this.f77725x, lVar2.f77776e);
            i12++;
        }
        l();
        this.E.endTracks();
    }

    @Override // k4.g
    public void release() {
    }

    public final void s(long j10) {
        while (!this.f77715n.isEmpty()) {
            a aVarRemoveFirst = this.f77715n.removeFirst();
            this.f77723v -= aVarRemoveFirst.f77729b;
            long jA = aVarRemoveFirst.f77728a + j10;
            g0 g0Var = this.f77711j;
            if (g0Var != null) {
                jA = g0Var.a(jA);
            }
            for (u uVar : this.F) {
                uVar.c(jA, 1, aVarRemoveFirst.f77729b, this.f77723v, null);
            }
        }
    }

    @Override // k4.g
    public void seek(long j10, long j11) {
        int size = this.f77705d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f77705d.valueAt(i10).g();
        }
        this.f77715n.clear();
        this.f77723v = 0;
        this.f77724w = j11;
        this.f77714m.clear();
        f();
    }
}
