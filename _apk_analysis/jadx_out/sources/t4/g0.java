package t4;

import a6.k0;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.s;
import t4.h0;

/* JADX INFO: compiled from: TsExtractor.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g0 implements k4.g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k4.k f84702s = new k4.k() { // from class: t4.f0
        @Override // k4.k
        public final k4.g[] createExtractors() {
            return g0.v();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a6.g0> f84704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6.t f84705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f84706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0.c f84707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray<h0> f84708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f84709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f84710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e0 f84711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d0 f84712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k4.i f84713k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f84714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f84715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f84716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f84717o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h0 f84718p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f84719q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f84720r;

    /* JADX INFO: compiled from: TsExtractor.java */
    public class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a6.s f84721a = new a6.s(new byte[4]);

        public a() {
        }

        @Override // t4.z
        public void a(a6.t tVar) {
            if (tVar.y() == 0 && (tVar.y() & 128) != 0) {
                tVar.M(6);
                int iA = tVar.a() / 4;
                for (int i10 = 0; i10 < iA; i10++) {
                    tVar.g(this.f84721a, 4);
                    int iH = this.f84721a.h(16);
                    this.f84721a.q(3);
                    if (iH == 0) {
                        this.f84721a.q(13);
                    } else {
                        int iH2 = this.f84721a.h(13);
                        g0.this.f84708f.put(iH2, new a0(g0.this.new b(iH2)));
                        g0.j(g0.this);
                    }
                }
                if (g0.this.f84703a != 2) {
                    g0.this.f84708f.remove(0);
                }
            }
        }

        @Override // t4.z
        public void b(a6.g0 g0Var, k4.i iVar, h0.d dVar) {
        }
    }

    /* JADX INFO: compiled from: TsExtractor.java */
    public class b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a6.s f84723a = new a6.s(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<h0> f84724b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseIntArray f84725c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f84726d;

        public b(int i10) {
            this.f84726d = i10;
        }

        @Override // t4.z
        public void a(a6.t tVar) {
            a6.g0 g0Var;
            if (tVar.y() != 2) {
                return;
            }
            if (g0.this.f84703a == 1 || g0.this.f84703a == 2 || g0.this.f84714l == 1) {
                g0Var = (a6.g0) g0.this.f84704b.get(0);
            } else {
                g0Var = new a6.g0(((a6.g0) g0.this.f84704b.get(0)).c());
                g0.this.f84704b.add(g0Var);
            }
            if ((tVar.y() & 128) == 0) {
                return;
            }
            tVar.M(1);
            int iE = tVar.E();
            int i10 = 3;
            tVar.M(3);
            tVar.g(this.f84723a, 2);
            this.f84723a.q(3);
            int i11 = 13;
            g0.this.f84720r = this.f84723a.h(13);
            tVar.g(this.f84723a, 2);
            int i12 = 4;
            this.f84723a.q(4);
            tVar.M(this.f84723a.h(12));
            if (g0.this.f84703a == 2 && g0.this.f84718p == null) {
                h0.b bVar = new h0.b(21, null, null, k0.f3579f);
                g0 g0Var2 = g0.this;
                g0Var2.f84718p = g0Var2.f84707e.a(21, bVar);
                g0.this.f84718p.b(g0Var, g0.this.f84713k, new h0.d(iE, 21, 8192));
            }
            this.f84724b.clear();
            this.f84725c.clear();
            int iA = tVar.a();
            while (iA > 0) {
                tVar.g(this.f84723a, 5);
                int iH = this.f84723a.h(8);
                this.f84723a.q(i10);
                int iH2 = this.f84723a.h(i11);
                this.f84723a.q(i12);
                int iH3 = this.f84723a.h(12);
                h0.b bVarC = c(tVar, iH3);
                if (iH == 6) {
                    iH = bVarC.f84744a;
                }
                iA -= iH3 + 5;
                int i13 = g0.this.f84703a == 2 ? iH : iH2;
                if (!g0.this.f84709g.get(i13)) {
                    h0 h0VarA = (g0.this.f84703a == 2 && iH == 21) ? g0.this.f84718p : g0.this.f84707e.a(iH, bVarC);
                    if (g0.this.f84703a != 2 || iH2 < this.f84725c.get(i13, 8192)) {
                        this.f84725c.put(i13, iH2);
                        this.f84724b.put(i13, h0VarA);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f84725c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f84725c.keyAt(i14);
                int iValueAt = this.f84725c.valueAt(i14);
                g0.this.f84709g.put(iKeyAt, true);
                g0.this.f84710h.put(iValueAt, true);
                h0 h0VarValueAt = this.f84724b.valueAt(i14);
                if (h0VarValueAt != null) {
                    if (h0VarValueAt != g0.this.f84718p) {
                        h0VarValueAt.b(g0Var, g0.this.f84713k, new h0.d(iE, iKeyAt, 8192));
                    }
                    g0.this.f84708f.put(iValueAt, h0VarValueAt);
                }
            }
            if (g0.this.f84703a == 2) {
                if (g0.this.f84715m) {
                    return;
                }
                g0.this.f84713k.endTracks();
                g0.this.f84714l = 0;
                g0.this.f84715m = true;
                return;
            }
            g0.this.f84708f.remove(this.f84726d);
            g0 g0Var3 = g0.this;
            g0Var3.f84714l = g0Var3.f84703a != 1 ? g0.this.f84714l - 1 : 0;
            if (g0.this.f84714l == 0) {
                g0.this.f84713k.endTracks();
                g0.this.f84715m = true;
            }
        }

        @Override // t4.z
        public void b(a6.g0 g0Var, k4.i iVar, h0.d dVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final t4.h0.b c(a6.t r14, int r15) {
            /*
                r13 = this;
                int r0 = r14.c()
                int r15 = r15 + r0
                r1 = 0
                r2 = -1
                r3 = r2
                r2 = r1
            L9:
                int r4 = r14.c()
                if (r4 >= r15) goto Lb1
                int r4 = r14.y()
                int r5 = r14.y()
                int r6 = r14.c()
                int r6 = r6 + r5
                r5 = 5
                r7 = 89
                r8 = 172(0xac, float:2.41E-43)
                r9 = 135(0x87, float:1.89E-43)
                r10 = 129(0x81, float:1.81E-43)
                if (r4 != r5) goto L4f
                long r4 = r14.A()
                r11 = 1094921523(0x41432d33, double:5.409631094E-315)
                int r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r7 != 0) goto L33
                goto L53
            L33:
                r10 = 1161904947(0x45414333, double:5.74057318E-315)
                int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r7 != 0) goto L3b
                goto L59
            L3b:
                r9 = 1094921524(0x41432d34, double:5.4096311E-315)
                int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r7 != 0) goto L45
            L42:
                r3 = r8
                goto La7
            L45:
                r7 = 1212503619(0x48455643, double:5.990563836E-315)
                int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r4 != 0) goto La7
                r3 = 36
                goto La7
            L4f:
                r5 = 106(0x6a, float:1.49E-43)
                if (r4 != r5) goto L55
            L53:
                r3 = r10
                goto La7
            L55:
                r5 = 122(0x7a, float:1.71E-43)
                if (r4 != r5) goto L5b
            L59:
                r3 = r9
                goto La7
            L5b:
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 != r5) goto L68
                int r4 = r14.y()
                r5 = 21
                if (r4 != r5) goto La7
                goto L42
            L68:
                r5 = 123(0x7b, float:1.72E-43)
                if (r4 != r5) goto L6f
                r3 = 138(0x8a, float:1.93E-43)
                goto La7
            L6f:
                r5 = 10
                r8 = 3
                if (r4 != r5) goto L7d
                java.lang.String r1 = r14.v(r8)
                java.lang.String r1 = r1.trim()
                goto La7
            L7d:
                if (r4 != r7) goto La7
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
            L84:
                int r3 = r14.c()
                if (r3 >= r6) goto La6
                java.lang.String r3 = r14.v(r8)
                java.lang.String r3 = r3.trim()
                int r4 = r14.y()
                r5 = 4
                byte[] r9 = new byte[r5]
                r10 = 0
                r14.h(r9, r10, r5)
                t4.h0$a r5 = new t4.h0$a
                r5.<init>(r3, r4, r9)
                r2.add(r5)
                goto L84
            La6:
                r3 = r7
            La7:
                int r4 = r14.c()
                int r6 = r6 - r4
                r14.M(r6)
                goto L9
            Lb1:
                r14.L(r15)
                t4.h0$b r4 = new t4.h0$b
                byte[] r14 = r14.f3620a
                byte[] r14 = java.util.Arrays.copyOfRange(r14, r0, r15)
                r4.<init>(r3, r1, r2, r14)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: t4.g0.b.c(a6.t, int):t4.h0$b");
        }
    }

    public g0() {
        this(0);
    }

    public g0(int i10) {
        this(1, i10);
    }

    public g0(int i10, int i11) {
        this(i10, new a6.g0(0L), new j(i11));
    }

    public g0(int i10, a6.g0 g0Var, h0.c cVar) {
        this.f84707e = (h0.c) a6.a.e(cVar);
        this.f84703a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f84704b = Collections.singletonList(g0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f84704b = arrayList;
            arrayList.add(g0Var);
        }
        this.f84705c = new a6.t(new byte[9400], 0);
        this.f84709g = new SparseBooleanArray();
        this.f84710h = new SparseBooleanArray();
        this.f84708f = new SparseArray<>();
        this.f84706d = new SparseIntArray();
        this.f84711i = new e0();
        this.f84720r = -1;
        x();
    }

    public static /* synthetic */ int j(g0 g0Var) {
        int i10 = g0Var.f84714l;
        g0Var.f84714l = i10 + 1;
        return i10;
    }

    public static /* synthetic */ k4.g[] v() {
        return new k4.g[]{new g0()};
    }

    @Override // k4.g
    public boolean a(k4.h hVar) throws InterruptedException, IOException {
        boolean z10;
        byte[] bArr = this.f84705c.f3620a;
        hVar.peekFully(bArr, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                }
                if (bArr[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                hVar.skipFully(i10);
                return true;
            }
        }
        return false;
    }

    @Override // k4.g
    public void b(k4.i iVar) {
        this.f84713k = iVar;
    }

    @Override // k4.g
    public int c(k4.h hVar, k4.r rVar) throws InterruptedException, IOException {
        long length = hVar.getLength();
        if (this.f84715m) {
            if (((length == -1 || this.f84703a == 2) ? false : true) && !this.f84711i.d()) {
                return this.f84711i.e(hVar, rVar, this.f84720r);
            }
            w(length);
            if (this.f84717o) {
                this.f84717o = false;
                seek(0L, 0L);
                if (hVar.getPosition() != 0) {
                    rVar.f72918a = 0L;
                    return 1;
                }
            }
            d0 d0Var = this.f84712j;
            if (d0Var != null && d0Var.d()) {
                return this.f84712j.c(hVar, rVar);
            }
        }
        if (!t(hVar)) {
            return -1;
        }
        int iU = u();
        int iD = this.f84705c.d();
        if (iU > iD) {
            return 0;
        }
        int iJ = this.f84705c.j();
        if ((8388608 & iJ) != 0) {
            this.f84705c.L(iU);
            return 0;
        }
        int i10 = ((4194304 & iJ) != 0 ? 1 : 0) | 0;
        int i11 = (2096896 & iJ) >> 8;
        boolean z10 = (iJ & 32) != 0;
        h0 h0Var = (iJ & 16) != 0 ? this.f84708f.get(i11) : null;
        if (h0Var == null) {
            this.f84705c.L(iU);
            return 0;
        }
        if (this.f84703a != 2) {
            int i12 = iJ & 15;
            int i13 = this.f84706d.get(i11, i12 - 1);
            this.f84706d.put(i11, i12);
            if (i13 == i12) {
                this.f84705c.L(iU);
                return 0;
            }
            if (i12 != ((i13 + 1) & 15)) {
                h0Var.seek();
            }
        }
        if (z10) {
            int iY = this.f84705c.y();
            i10 |= (this.f84705c.y() & 64) != 0 ? 2 : 0;
            this.f84705c.M(iY - 1);
        }
        boolean z11 = this.f84715m;
        if (y(i11)) {
            this.f84705c.K(iU);
            h0Var.a(this.f84705c, i10);
            this.f84705c.K(iD);
        }
        if (this.f84703a != 2 && !z11 && this.f84715m && length != -1) {
            this.f84717o = true;
        }
        this.f84705c.L(iU);
        return 0;
    }

    @Override // k4.g
    public void release() {
    }

    @Override // k4.g
    public void seek(long j10, long j11) {
        d0 d0Var;
        a6.a.f(this.f84703a != 2);
        int size = this.f84704b.size();
        for (int i10 = 0; i10 < size; i10++) {
            a6.g0 g0Var = this.f84704b.get(i10);
            if ((g0Var.e() == -9223372036854775807L) || (g0Var.e() != 0 && g0Var.c() != j11)) {
                g0Var.g();
                g0Var.h(j11);
            }
        }
        if (j11 != 0 && (d0Var = this.f84712j) != null) {
            d0Var.h(j11);
        }
        this.f84705c.G();
        this.f84706d.clear();
        for (int i11 = 0; i11 < this.f84708f.size(); i11++) {
            this.f84708f.valueAt(i11).seek();
        }
        this.f84719q = 0;
    }

    public final boolean t(k4.h hVar) throws InterruptedException, IOException {
        a6.t tVar = this.f84705c;
        byte[] bArr = tVar.f3620a;
        if (9400 - tVar.c() < 188) {
            int iA = this.f84705c.a();
            if (iA > 0) {
                System.arraycopy(bArr, this.f84705c.c(), bArr, 0, iA);
            }
            this.f84705c.J(bArr, iA);
        }
        while (this.f84705c.a() < 188) {
            int iD = this.f84705c.d();
            int i10 = hVar.read(bArr, iD, 9400 - iD);
            if (i10 == -1) {
                return false;
            }
            this.f84705c.K(iD + i10);
        }
        return true;
    }

    public final int u() throws ParserException {
        int iC = this.f84705c.c();
        int iD = this.f84705c.d();
        int iA = i0.a(this.f84705c.f3620a, iC, iD);
        this.f84705c.L(iA);
        int i10 = iA + 188;
        if (i10 > iD) {
            int i11 = this.f84719q + (iA - iC);
            this.f84719q = i11;
            if (this.f84703a == 2 && i11 > 376) {
                throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f84719q = 0;
        }
        return i10;
    }

    public final void w(long j10) {
        if (this.f84716n) {
            return;
        }
        this.f84716n = true;
        if (this.f84711i.b() == -9223372036854775807L) {
            this.f84713k.c(new s.b(this.f84711i.b()));
            return;
        }
        d0 d0Var = new d0(this.f84711i.c(), this.f84711i.b(), j10, this.f84720r);
        this.f84712j = d0Var;
        this.f84713k.c(d0Var.b());
    }

    public final void x() {
        this.f84709g.clear();
        this.f84708f.clear();
        SparseArray<h0> sparseArrayCreateInitialPayloadReaders = this.f84707e.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f84708f.put(sparseArrayCreateInitialPayloadReaders.keyAt(i10), sparseArrayCreateInitialPayloadReaders.valueAt(i10));
        }
        this.f84708f.put(0, new a0(new a()));
        this.f84718p = null;
    }

    public final boolean y(int i10) {
        return this.f84703a == 2 || this.f84715m || !this.f84710h.get(i10, false);
    }
}
