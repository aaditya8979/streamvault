package s6;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import i6.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s6.i0;
import s7.m0;

/* JADX INFO: compiled from: TsExtractor.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h0 implements i6.k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final i6.p f79163t = new i6.p() { // from class: s6.g0
        @Override // i6.p
        public final i6.k[] createExtractors() {
            return h0.v();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<s7.j0> f79166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s7.a0 f79167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f79168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0.c f79169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray<i0> f79170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f79171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f79172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f0 f79173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e0 f79174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i6.m f79175l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f79176m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f79177n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f79178o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f79179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public i0 f79180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f79181r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f79182s;

    /* JADX INFO: compiled from: TsExtractor.java */
    public class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s7.z f79183a = new s7.z(new byte[4]);

        public a() {
        }

        @Override // s6.b0
        public void a(s7.a0 a0Var) {
            if (a0Var.D() == 0 && (a0Var.D() & 128) != 0) {
                a0Var.Q(6);
                int iA = a0Var.a() / 4;
                for (int i10 = 0; i10 < iA; i10++) {
                    a0Var.i(this.f79183a, 4);
                    int iH = this.f79183a.h(16);
                    this.f79183a.r(3);
                    if (iH == 0) {
                        this.f79183a.r(13);
                    } else {
                        int iH2 = this.f79183a.h(13);
                        if (h0.this.f79170g.get(iH2) == null) {
                            h0.this.f79170g.put(iH2, new c0(h0.this.new b(iH2)));
                            h0.j(h0.this);
                        }
                    }
                }
                if (h0.this.f79164a != 2) {
                    h0.this.f79170g.remove(0);
                }
            }
        }

        @Override // s6.b0
        public void b(s7.j0 j0Var, i6.m mVar, i0.d dVar) {
        }
    }

    /* JADX INFO: compiled from: TsExtractor.java */
    public class b implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s7.z f79185a = new s7.z(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<i0> f79186b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseIntArray f79187c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f79188d;

        public b(int i10) {
            this.f79188d = i10;
        }

        @Override // s6.b0
        public void a(s7.a0 a0Var) {
            s7.j0 j0Var;
            if (a0Var.D() != 2) {
                return;
            }
            if (h0.this.f79164a == 1 || h0.this.f79164a == 2 || h0.this.f79176m == 1) {
                j0Var = (s7.j0) h0.this.f79166c.get(0);
            } else {
                j0Var = new s7.j0(((s7.j0) h0.this.f79166c.get(0)).c());
                h0.this.f79166c.add(j0Var);
            }
            if ((a0Var.D() & 128) == 0) {
                return;
            }
            a0Var.Q(1);
            int iJ = a0Var.J();
            int i10 = 3;
            a0Var.Q(3);
            a0Var.i(this.f79185a, 2);
            this.f79185a.r(3);
            int i11 = 13;
            h0.this.f79182s = this.f79185a.h(13);
            a0Var.i(this.f79185a, 2);
            int i12 = 4;
            this.f79185a.r(4);
            a0Var.Q(this.f79185a.h(12));
            if (h0.this.f79164a == 2 && h0.this.f79180q == null) {
                i0.b bVar = new i0.b(21, null, null, m0.f79492f);
                h0 h0Var = h0.this;
                h0Var.f79180q = h0Var.f79169f.a(21, bVar);
                if (h0.this.f79180q != null) {
                    h0.this.f79180q.b(j0Var, h0.this.f79175l, new i0.d(iJ, 21, 8192));
                }
            }
            this.f79186b.clear();
            this.f79187c.clear();
            int iA = a0Var.a();
            while (iA > 0) {
                a0Var.i(this.f79185a, 5);
                int iH = this.f79185a.h(8);
                this.f79185a.r(i10);
                int iH2 = this.f79185a.h(i11);
                this.f79185a.r(i12);
                int iH3 = this.f79185a.h(12);
                i0.b bVarC = c(a0Var, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarC.f79215a;
                }
                iA -= iH3 + 5;
                int i13 = h0.this.f79164a == 2 ? iH : iH2;
                if (!h0.this.f79171h.get(i13)) {
                    i0 i0VarA = (h0.this.f79164a == 2 && iH == 21) ? h0.this.f79180q : h0.this.f79169f.a(iH, bVarC);
                    if (h0.this.f79164a != 2 || iH2 < this.f79187c.get(i13, 8192)) {
                        this.f79187c.put(i13, iH2);
                        this.f79186b.put(i13, i0VarA);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f79187c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f79187c.keyAt(i14);
                int iValueAt = this.f79187c.valueAt(i14);
                h0.this.f79171h.put(iKeyAt, true);
                h0.this.f79172i.put(iValueAt, true);
                i0 i0VarValueAt = this.f79186b.valueAt(i14);
                if (i0VarValueAt != null) {
                    if (i0VarValueAt != h0.this.f79180q) {
                        i0VarValueAt.b(j0Var, h0.this.f79175l, new i0.d(iJ, iKeyAt, 8192));
                    }
                    h0.this.f79170g.put(iValueAt, i0VarValueAt);
                }
            }
            if (h0.this.f79164a == 2) {
                if (h0.this.f79177n) {
                    return;
                }
                h0.this.f79175l.endTracks();
                h0.this.f79176m = 0;
                h0.this.f79177n = true;
                return;
            }
            h0.this.f79170g.remove(this.f79188d);
            h0 h0Var2 = h0.this;
            h0Var2.f79176m = h0Var2.f79164a == 1 ? 0 : h0.this.f79176m - 1;
            if (h0.this.f79176m == 0) {
                h0.this.f79175l.endTracks();
                h0.this.f79177n = true;
            }
        }

        @Override // s6.b0
        public void b(s7.j0 j0Var, i6.m mVar, i0.d dVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final s6.i0.b c(s7.a0 r14, int r15) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: s6.h0.b.c(s7.a0, int):s6.i0$b");
        }
    }

    public h0() {
        this(0);
    }

    public h0(int i10) {
        this(1, i10, 112800);
    }

    public h0(int i10, int i11, int i12) {
        this(i10, new s7.j0(0L), new j(i11), i12);
    }

    public h0(int i10, s7.j0 j0Var, i0.c cVar, int i11) {
        this.f79169f = (i0.c) s7.a.e(cVar);
        this.f79165b = i11;
        this.f79164a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f79166c = Collections.singletonList(j0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f79166c = arrayList;
            arrayList.add(j0Var);
        }
        this.f79167d = new s7.a0(new byte[9400], 0);
        this.f79171h = new SparseBooleanArray();
        this.f79172i = new SparseBooleanArray();
        this.f79170g = new SparseArray<>();
        this.f79168e = new SparseIntArray();
        this.f79173j = new f0(i11);
        this.f79175l = i6.m.F8;
        this.f79182s = -1;
        x();
    }

    public static /* synthetic */ int j(h0 h0Var) {
        int i10 = h0Var.f79176m;
        h0Var.f79176m = i10 + 1;
        return i10;
    }

    public static /* synthetic */ i6.k[] v() {
        return new i6.k[]{new h0()};
    }

    @Override // i6.k
    public void a(i6.m mVar) {
        this.f79175l = mVar;
    }

    @Override // i6.k
    public int b(i6.l lVar, i6.y yVar) throws IOException {
        long length = lVar.getLength();
        if (this.f79177n) {
            if (((length == -1 || this.f79164a == 2) ? false : true) && !this.f79173j.d()) {
                return this.f79173j.e(lVar, yVar, this.f79182s);
            }
            w(length);
            if (this.f79179p) {
                this.f79179p = false;
                seek(0L, 0L);
                if (lVar.getPosition() != 0) {
                    yVar.f63944a = 0L;
                    return 1;
                }
            }
            e0 e0Var = this.f79174k;
            if (e0Var != null && e0Var.d()) {
                return this.f79174k.c(lVar, yVar);
            }
        }
        if (!t(lVar)) {
            return -1;
        }
        int iU = u();
        int iF = this.f79167d.f();
        if (iU > iF) {
            return 0;
        }
        int iN = this.f79167d.n();
        if ((8388608 & iN) != 0) {
            this.f79167d.P(iU);
            return 0;
        }
        int i10 = ((4194304 & iN) != 0 ? 1 : 0) | 0;
        int i11 = (2096896 & iN) >> 8;
        boolean z10 = (iN & 32) != 0;
        i0 i0Var = (iN & 16) != 0 ? this.f79170g.get(i11) : null;
        if (i0Var == null) {
            this.f79167d.P(iU);
            return 0;
        }
        if (this.f79164a != 2) {
            int i12 = iN & 15;
            int i13 = this.f79168e.get(i11, i12 - 1);
            this.f79168e.put(i11, i12);
            if (i13 == i12) {
                this.f79167d.P(iU);
                return 0;
            }
            if (i12 != ((i13 + 1) & 15)) {
                i0Var.seek();
            }
        }
        if (z10) {
            int iD = this.f79167d.D();
            i10 |= (this.f79167d.D() & 64) != 0 ? 2 : 0;
            this.f79167d.Q(iD - 1);
        }
        boolean z11 = this.f79177n;
        if (y(i11)) {
            this.f79167d.O(iU);
            i0Var.a(this.f79167d, i10);
            this.f79167d.O(iF);
        }
        if (this.f79164a != 2 && !z11 && this.f79177n && length != -1) {
            this.f79179p = true;
        }
        this.f79167d.P(iU);
        return 0;
    }

    @Override // i6.k
    public boolean c(i6.l lVar) throws IOException {
        boolean z10;
        byte[] bArrD = this.f79167d.d();
        lVar.peekFully(bArrD, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                }
                if (bArrD[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                lVar.skipFully(i10);
                return true;
            }
        }
        return false;
    }

    @Override // i6.k
    public void release() {
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        e0 e0Var;
        s7.a.g(this.f79164a != 2);
        int size = this.f79166c.size();
        for (int i10 = 0; i10 < size; i10++) {
            s7.j0 j0Var = this.f79166c.get(i10);
            boolean z10 = j0Var.e() == -9223372036854775807L;
            if (!z10) {
                long jC = j0Var.c();
                z10 = (jC == -9223372036854775807L || jC == 0 || jC == j11) ? false : true;
            }
            if (z10) {
                j0Var.g(j11);
            }
        }
        if (j11 != 0 && (e0Var = this.f79174k) != null) {
            e0Var.h(j11);
        }
        this.f79167d.L(0);
        this.f79168e.clear();
        for (int i11 = 0; i11 < this.f79170g.size(); i11++) {
            this.f79170g.valueAt(i11).seek();
        }
        this.f79181r = 0;
    }

    public final boolean t(i6.l lVar) throws IOException {
        byte[] bArrD = this.f79167d.d();
        if (9400 - this.f79167d.e() < 188) {
            int iA = this.f79167d.a();
            if (iA > 0) {
                System.arraycopy(bArrD, this.f79167d.e(), bArrD, 0, iA);
            }
            this.f79167d.N(bArrD, iA);
        }
        while (this.f79167d.a() < 188) {
            int iF = this.f79167d.f();
            int i10 = lVar.read(bArrD, iF, 9400 - iF);
            if (i10 == -1) {
                return false;
            }
            this.f79167d.O(iF + i10);
        }
        return true;
    }

    public final int u() throws ParserException {
        int iE = this.f79167d.e();
        int iF = this.f79167d.f();
        int iA = j0.a(this.f79167d.d(), iE, iF);
        this.f79167d.P(iA);
        int i10 = iA + 188;
        if (i10 > iF) {
            int i11 = this.f79181r + (iA - iE);
            this.f79181r = i11;
            if (this.f79164a == 2 && i11 > 376) {
                throw ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f79181r = 0;
        }
        return i10;
    }

    public final void w(long j10) {
        if (this.f79178o) {
            return;
        }
        this.f79178o = true;
        if (this.f79173j.b() == -9223372036854775807L) {
            this.f79175l.h(new z.b(this.f79173j.b()));
            return;
        }
        e0 e0Var = new e0(this.f79173j.c(), this.f79173j.b(), j10, this.f79182s, this.f79165b);
        this.f79174k = e0Var;
        this.f79175l.h(e0Var.b());
    }

    public final void x() {
        this.f79171h.clear();
        this.f79170g.clear();
        SparseArray<i0> sparseArrayCreateInitialPayloadReaders = this.f79169f.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f79170g.put(sparseArrayCreateInitialPayloadReaders.keyAt(i10), sparseArrayCreateInitialPayloadReaders.valueAt(i10));
        }
        this.f79170g.put(0, new c0(new a()));
        this.f79180q = null;
    }

    public final boolean y(int i10) {
        return this.f79164a == 2 || this.f79177n || !this.f79172i.get(i10, false);
    }
}
