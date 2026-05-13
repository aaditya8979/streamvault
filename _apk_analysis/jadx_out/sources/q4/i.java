package q4;

import a6.q;
import a6.t;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import k4.r;
import k4.s;
import k4.u;
import q4.a;

/* JADX INFO: compiled from: Mp4Extractor.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i implements k4.g, s {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k4.k f77742v = new k4.k() { // from class: q4.h
        @Override // k4.k
        public final k4.g[] createExtractors() {
            return i.j();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f77744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f77745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f77746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f77747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque<a.C0930a> f77748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f77749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f77750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f77751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f77752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t f77753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f77754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f77755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f77756n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f77757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k4.i f77758p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a[] f77759q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long[][] f77760r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f77761s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f77762t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f77763u;

    /* JADX INFO: compiled from: Mp4Extractor.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f77764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f77765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u f77766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f77767d;

        public a(l lVar, o oVar, u uVar) {
            this.f77764a = lVar;
            this.f77765b = oVar;
            this.f77766c = uVar;
        }
    }

    public i() {
        this(0);
    }

    public i(int i10) {
        this.f77743a = i10;
        this.f77747e = new t(16);
        this.f77748f = new ArrayDeque<>();
        this.f77744b = new t(q.f3596a);
        this.f77745c = new t(4);
        this.f77746d = new t();
        this.f77754l = -1;
    }

    public static long[][] e(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f77765b.f77808b];
            jArr2[i10] = aVarArr[i10].f77765b.f77812f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            o oVar = aVarArr[i12].f77765b;
            j10 += (long) oVar.f77810d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = oVar.f77812f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    public static int g(o oVar, long j10) {
        int iA = oVar.a(j10);
        return iA == -1 ? oVar.b(j10) : iA;
    }

    public static /* synthetic */ k4.g[] j() {
        return new k4.g[]{new i()};
    }

    public static long k(o oVar, long j10, long j11) {
        int iG = g(oVar, j10);
        return iG == -1 ? j11 : Math.min(oVar.f77809c[iG], j11);
    }

    public static boolean n(t tVar) {
        tVar.L(8);
        if (tVar.j() == 1903435808) {
            return true;
        }
        tVar.M(4);
        while (tVar.a() > 0) {
            if (tVar.j() == 1903435808) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    public static boolean t(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    @Override // k4.g
    public boolean a(k4.h hVar) throws InterruptedException, IOException {
        return k.d(hVar);
    }

    @Override // k4.g
    public void b(k4.i iVar) {
        this.f77758p = iVar;
    }

    @Override // k4.g
    public int c(k4.h hVar, r rVar) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.f77749g;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return r(hVar, rVar);
                    }
                    throw new IllegalStateException();
                }
                if (q(hVar, rVar)) {
                    return 1;
                }
            } else if (!p(hVar)) {
                return -1;
            }
        }
    }

    public final void f() {
        this.f77749g = 0;
        this.f77752j = 0;
    }

    @Override // k4.s
    public long getDurationUs() {
        return this.f77762t;
    }

    @Override // k4.s
    public s.a getSeekPoints(long j10) {
        long j11;
        long jK;
        long j12;
        long j13;
        int iB;
        a[] aVarArr = this.f77759q;
        if (aVarArr.length == 0) {
            return new s.a(k4.t.f72923c);
        }
        int i10 = this.f77761s;
        if (i10 != -1) {
            o oVar = aVarArr[i10].f77765b;
            int iG = g(oVar, j10);
            if (iG == -1) {
                return new s.a(k4.t.f72923c);
            }
            long j14 = oVar.f77812f[iG];
            j11 = oVar.f77809c[iG];
            if (j14 >= j10 || iG >= oVar.f77808b - 1 || (iB = oVar.b(j10)) == -1 || iB == iG) {
                j13 = -1;
                j12 = -9223372036854775807L;
            } else {
                j12 = oVar.f77812f[iB];
                j13 = oVar.f77809c[iB];
            }
            jK = j13;
            j10 = j14;
        } else {
            j11 = Long.MAX_VALUE;
            jK = -1;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr2 = this.f77759q;
            if (i11 >= aVarArr2.length) {
                break;
            }
            if (i11 != this.f77761s) {
                o oVar2 = aVarArr2[i11].f77765b;
                long jK2 = k(oVar2, j10, j11);
                if (j12 != -9223372036854775807L) {
                    jK = k(oVar2, j12, jK);
                }
                j11 = jK2;
            }
            i11++;
        }
        k4.t tVar = new k4.t(j10, j11);
        return j12 == -9223372036854775807L ? new s.a(tVar) : new s.a(tVar, new k4.t(j12, jK));
    }

    public final int h(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f77759q;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f77767d;
            o oVar = aVar.f77765b;
            if (i13 != oVar.f77808b) {
                long j14 = oVar.f77809c[i13];
                long j15 = this.f77760r[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    public final ArrayList<o> i(a.C0930a c0930a, k4.o oVar, boolean z10) throws ParserException {
        l lVarV;
        ArrayList<o> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < c0930a.f77665d.size(); i10++) {
            a.C0930a c0930a2 = c0930a.f77665d.get(i10);
            if (c0930a2.f77662a == 1953653099 && (lVarV = b.v(c0930a2, c0930a.g(1836476516), -9223372036854775807L, null, z10, this.f77763u)) != null) {
                o oVarR = b.r(lVarV, c0930a2.f(1835297121).f(1835626086).f(1937007212), oVar);
                if (oVarR.f77808b != 0) {
                    arrayList.add(oVarR);
                }
            }
        }
        return arrayList;
    }

    @Override // k4.s
    public boolean isSeekable() {
        return true;
    }

    public final void l(k4.h hVar) throws InterruptedException, IOException {
        this.f77746d.H(8);
        hVar.peekFully(this.f77746d.f3620a, 0, 8);
        this.f77746d.M(4);
        if (this.f77746d.j() == 1751411826) {
            hVar.resetPeekPosition();
        } else {
            hVar.skipFully(4);
        }
    }

    public final void m(long j10) throws ParserException {
        while (!this.f77748f.isEmpty() && this.f77748f.peek().f77663b == j10) {
            a.C0930a c0930aPop = this.f77748f.pop();
            if (c0930aPop.f77662a == 1836019574) {
                o(c0930aPop);
                this.f77748f.clear();
                this.f77749g = 2;
            } else if (!this.f77748f.isEmpty()) {
                this.f77748f.peek().d(c0930aPop);
            }
        }
        if (this.f77749g != 2) {
            f();
        }
    }

    public final void o(a.C0930a c0930a) throws ParserException {
        Metadata metadataW;
        o oVar;
        long j10;
        ArrayList arrayList = new ArrayList();
        k4.o oVar2 = new k4.o();
        a.b bVarG = c0930a.g(1969517665);
        if (bVarG != null) {
            metadataW = b.w(bVarG, this.f77763u);
            if (metadataW != null) {
                oVar2.c(metadataW);
            }
        } else {
            metadataW = null;
        }
        a.C0930a c0930aF = c0930a.f(1835365473);
        Metadata metadataL = c0930aF != null ? b.l(c0930aF) : null;
        ArrayList<o> arrayListI = i(c0930a, oVar2, (this.f77743a & 1) != 0);
        int size = arrayListI.size();
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        int i10 = 0;
        int size2 = -1;
        while (i10 < size) {
            o oVar3 = arrayListI.get(i10);
            l lVar = oVar3.f77807a;
            long j13 = lVar.f77776e;
            if (j13 != j11) {
                j10 = j13;
                oVar = oVar3;
            } else {
                oVar = oVar3;
                j10 = oVar.f77814h;
            }
            long jMax = Math.max(j12, j10);
            ArrayList<o> arrayList2 = arrayListI;
            int i11 = size;
            a aVar = new a(lVar, oVar, this.f77758p.track(i10, lVar.f77773b));
            Format formatK = lVar.f77777f.k(oVar.f77811e + 30);
            if (lVar.f77773b == 2 && j10 > 0) {
                int i12 = oVar.f77808b;
                if (i12 > 1) {
                    formatK = formatK.g(i12 / (j10 / 1000000.0f));
                }
            }
            aVar.f77766c.d(g.a(lVar.f77773b, formatK, metadataW, metadataL, oVar2));
            if (lVar.f77773b == 2 && size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(aVar);
            i10++;
            arrayListI = arrayList2;
            size = i11;
            j12 = jMax;
            j11 = -9223372036854775807L;
        }
        this.f77761s = size2;
        this.f77762t = j12;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.f77759q = aVarArr;
        this.f77760r = e(aVarArr);
        this.f77758p.endTracks();
        this.f77758p.c(this);
    }

    public final boolean p(k4.h hVar) throws InterruptedException, IOException {
        if (this.f77752j == 0) {
            if (!hVar.readFully(this.f77747e.f3620a, 0, 8, true)) {
                return false;
            }
            this.f77752j = 8;
            this.f77747e.L(0);
            this.f77751i = this.f77747e.A();
            this.f77750h = this.f77747e.j();
        }
        long j10 = this.f77751i;
        if (j10 == 1) {
            hVar.readFully(this.f77747e.f3620a, 8, 8);
            this.f77752j += 8;
            this.f77751i = this.f77747e.D();
        } else if (j10 == 0) {
            long length = hVar.getLength();
            if (length == -1 && !this.f77748f.isEmpty()) {
                length = this.f77748f.peek().f77663b;
            }
            if (length != -1) {
                this.f77751i = (length - hVar.getPosition()) + ((long) this.f77752j);
            }
        }
        if (this.f77751i < this.f77752j) {
            throw new ParserException("Atom size less than header length (unsupported).");
        }
        if (s(this.f77750h)) {
            long position = hVar.getPosition();
            long j11 = this.f77751i;
            int i10 = this.f77752j;
            long j12 = (position + j11) - ((long) i10);
            if (j11 != i10 && this.f77750h == 1835365473) {
                l(hVar);
            }
            this.f77748f.push(new a.C0930a(this.f77750h, j12));
            if (this.f77751i == this.f77752j) {
                m(j12);
            } else {
                f();
            }
        } else if (t(this.f77750h)) {
            a6.a.f(this.f77752j == 8);
            a6.a.f(this.f77751i <= 2147483647L);
            t tVar = new t((int) this.f77751i);
            this.f77753k = tVar;
            System.arraycopy(this.f77747e.f3620a, 0, tVar.f3620a, 0, 8);
            this.f77749g = 1;
        } else {
            this.f77753k = null;
            this.f77749g = 1;
        }
        return true;
    }

    public final boolean q(k4.h hVar, r rVar) throws InterruptedException, IOException {
        boolean z10;
        long j10 = this.f77751i - ((long) this.f77752j);
        long position = hVar.getPosition() + j10;
        t tVar = this.f77753k;
        if (tVar != null) {
            hVar.readFully(tVar.f3620a, this.f77752j, (int) j10);
            if (this.f77750h == 1718909296) {
                this.f77763u = n(this.f77753k);
            } else if (!this.f77748f.isEmpty()) {
                this.f77748f.peek().e(new a.b(this.f77750h, this.f77753k));
            }
        } else {
            if (j10 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                rVar.f72918a = hVar.getPosition() + j10;
                z10 = true;
                m(position);
                return (z10 || this.f77749g == 2) ? false : true;
            }
            hVar.skipFully((int) j10);
        }
        z10 = false;
        m(position);
        if (z10) {
        }
    }

    public final int r(k4.h hVar, r rVar) throws InterruptedException, IOException {
        long position = hVar.getPosition();
        if (this.f77754l == -1) {
            int iH = h(position);
            this.f77754l = iH;
            if (iH == -1) {
                return -1;
            }
        }
        a aVar = this.f77759q[this.f77754l];
        u uVar = aVar.f77766c;
        int i10 = aVar.f77767d;
        o oVar = aVar.f77765b;
        long j10 = oVar.f77809c[i10];
        int i11 = oVar.f77810d[i10];
        long j11 = (j10 - position) + ((long) this.f77755m);
        if (j11 < 0 || j11 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            rVar.f72918a = j10;
            return 1;
        }
        if (aVar.f77764a.f77778g == 1) {
            j11 += 8;
            i11 -= 8;
        }
        hVar.skipFully((int) j11);
        l lVar = aVar.f77764a;
        int i12 = lVar.f77781j;
        if (i12 == 0) {
            if ("audio/ac4".equals(lVar.f77777f.f19927j)) {
                if (this.f77756n == 0) {
                    g4.b.a(i11, this.f77746d);
                    uVar.a(this.f77746d, 7);
                    this.f77756n += 7;
                }
                i11 += 7;
            }
            while (true) {
                int i13 = this.f77756n;
                if (i13 >= i11) {
                    break;
                }
                int iB = uVar.b(hVar, i11 - i13, false);
                this.f77755m += iB;
                this.f77756n += iB;
                this.f77757o -= iB;
            }
        } else {
            byte[] bArr = this.f77745c.f3620a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i14 = 4 - i12;
            while (this.f77756n < i11) {
                int i15 = this.f77757o;
                if (i15 == 0) {
                    hVar.readFully(bArr, i14, i12);
                    this.f77755m += i12;
                    this.f77745c.L(0);
                    int iJ = this.f77745c.j();
                    if (iJ < 0) {
                        throw new ParserException("Invalid NAL length");
                    }
                    this.f77757o = iJ;
                    this.f77744b.L(0);
                    uVar.a(this.f77744b, 4);
                    this.f77756n += 4;
                    i11 += i14;
                } else {
                    int iB2 = uVar.b(hVar, i15, false);
                    this.f77755m += iB2;
                    this.f77756n += iB2;
                    this.f77757o -= iB2;
                }
            }
        }
        o oVar2 = aVar.f77765b;
        uVar.c(oVar2.f77812f[i10], oVar2.f77813g[i10], i11, 0, null);
        aVar.f77767d++;
        this.f77754l = -1;
        this.f77755m = 0;
        this.f77756n = 0;
        this.f77757o = 0;
        return 0;
    }

    @Override // k4.g
    public void release() {
    }

    @Override // k4.g
    public void seek(long j10, long j11) {
        this.f77748f.clear();
        this.f77752j = 0;
        this.f77754l = -1;
        this.f77755m = 0;
        this.f77756n = 0;
        this.f77757o = 0;
        if (j10 == 0) {
            f();
        } else if (this.f77759q != null) {
            u(j11);
        }
    }

    public final void u(long j10) {
        for (a aVar : this.f77759q) {
            o oVar = aVar.f77765b;
            int iA = oVar.a(j10);
            if (iA == -1) {
                iA = oVar.b(j10);
            }
            aVar.f77767d = iA;
        }
    }
}
