package q6;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import i6.b0;
import i6.c0;
import i6.y;
import i6.z;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import q6.a;
import s7.a0;
import s7.m0;
import s7.v;

/* JADX INFO: compiled from: Mp4Extractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k implements i6.k, z {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final i6.p f77916y = new i6.p() { // from class: q6.i
        @Override // i6.p
        public final i6.k[] createExtractors() {
            return k.m();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f77918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f77919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f77920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f77921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque<a.C0933a> f77922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f77923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Metadata.Entry> f77924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f77925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f77926j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f77927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f77928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public a0 f77929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f77930n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f77931o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f77932p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f77933q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i6.m f77934r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a[] f77935s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long[][] f77936t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f77937u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f77938v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f77939w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public MotionPhotoMetadata f77940x;

    /* JADX INFO: compiled from: Mp4Extractor.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f77941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f77942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b0 f77943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final c0 f77944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f77945e;

        public a(o oVar, r rVar, b0 b0Var) {
            this.f77941a = oVar;
            this.f77942b = rVar;
            this.f77943c = b0Var;
            this.f77944d = "audio/true-hd".equals(oVar.f77963f.f21751m) ? new c0() : null;
        }
    }

    public k() {
        this(0);
    }

    public k(int i10) {
        this.f77917a = i10;
        this.f77925i = (i10 & 4) != 0 ? 3 : 0;
        this.f77923g = new m();
        this.f77924h = new ArrayList();
        this.f77921e = new a0(16);
        this.f77922f = new ArrayDeque<>();
        this.f77918b = new a0(v.f79531a);
        this.f77919c = new a0(4);
        this.f77920d = new a0();
        this.f77930n = -1;
        this.f77934r = i6.m.F8;
        this.f77935s = new a[0];
    }

    public static int f(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static long[][] g(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f77942b.f77993b];
            jArr2[i10] = aVarArr[i10].f77942b.f77997f[0];
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
            r rVar = aVarArr[i12].f77942b;
            j10 += (long) rVar.f77995d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = rVar.f77997f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    public static int j(r rVar, long j10) {
        int iA = rVar.a(j10);
        return iA == -1 ? rVar.b(j10) : iA;
    }

    public static /* synthetic */ o l(o oVar) {
        return oVar;
    }

    public static /* synthetic */ i6.k[] m() {
        return new i6.k[]{new k()};
    }

    public static long n(r rVar, long j10, long j11) {
        int iJ = j(rVar, j10);
        return iJ == -1 ? j11 : Math.min(rVar.f77994c[iJ], j11);
    }

    public static int r(a0 a0Var) {
        a0Var.P(8);
        int iF = f(a0Var.n());
        if (iF != 0) {
            return iF;
        }
        a0Var.Q(4);
        while (a0Var.a() > 0) {
            int iF2 = f(a0Var.n());
            if (iF2 != 0) {
                return iF2;
            }
        }
        return 0;
    }

    public static boolean y(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    public static boolean z(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    public final void A(a aVar, long j10) {
        r rVar = aVar.f77942b;
        int iA = rVar.a(j10);
        if (iA == -1) {
            iA = rVar.b(j10);
        }
        aVar.f77945e = iA;
    }

    @Override // i6.k
    public void a(i6.m mVar) {
        this.f77934r = mVar;
    }

    @Override // i6.k
    public int b(i6.l lVar, y yVar) throws IOException {
        while (true) {
            int i10 = this.f77925i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return w(lVar, yVar);
                    }
                    if (i10 == 3) {
                        return x(lVar, yVar);
                    }
                    throw new IllegalStateException();
                }
                if (v(lVar, yVar)) {
                    return 1;
                }
            } else if (!u(lVar)) {
                return -1;
            }
        }
    }

    @Override // i6.k
    public boolean c(i6.l lVar) throws IOException {
        return n.d(lVar, (this.f77917a & 2) != 0);
    }

    @Override // i6.z
    public long getDurationUs() {
        return this.f77938v;
    }

    @Override // i6.z
    public z.a getSeekPoints(long j10) {
        return i(j10, -1);
    }

    public final void h() {
        this.f77925i = 0;
        this.f77928l = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i6.z.a i(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            q6.k$a[] r4 = r0.f77935s
            int r5 = r4.length
            if (r5 != 0) goto L13
            i6.z$a r1 = new i6.z$a
            i6.a0 r2 = i6.a0.f63837c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            r7 = -1
            if (r3 == r7) goto L1a
            r8 = r3
            goto L1c
        L1a:
            int r8 = r0.f77937u
        L1c:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == r7) goto L58
            r4 = r4[r8]
            q6.r r4 = r4.f77942b
            int r8 = j(r4, r1)
            if (r8 != r7) goto L35
            i6.z$a r1 = new i6.z$a
            i6.a0 r2 = i6.a0.f63837c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f77997f
            r12 = r11[r8]
            long[] r11 = r4.f77994c
            r14 = r11[r8]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.f77993b
            int r11 = r11 + (-1)
            if (r8 >= r11) goto L5e
            int r1 = r4.b(r1)
            if (r1 == r7) goto L5e
            if (r1 == r8) goto L5e
            long[] r2 = r4.f77997f
            r5 = r2[r1]
            long[] r2 = r4.f77994c
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r5
            r5 = r9
        L60:
            if (r3 != r7) goto L7f
            r3 = 0
        L63:
            q6.k$a[] r4 = r0.f77935s
            int r7 = r4.length
            if (r3 >= r7) goto L7f
            int r7 = r0.f77937u
            if (r3 == r7) goto L7c
            r4 = r4[r3]
            q6.r r4 = r4.f77942b
            long r14 = n(r4, r12, r14)
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L7c
            long r1 = n(r4, r5, r1)
        L7c:
            int r3 = r3 + 1
            goto L63
        L7f:
            i6.a0 r3 = new i6.a0
            r3.<init>(r12, r14)
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 != 0) goto L8e
            i6.z$a r1 = new i6.z$a
            r1.<init>(r3)
            return r1
        L8e:
            i6.a0 r4 = new i6.a0
            r4.<init>(r5, r1)
            i6.z$a r1 = new i6.z$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.k.i(long, int):i6.z$a");
    }

    @Override // i6.z
    public boolean isSeekable() {
        return true;
    }

    public final int k(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f77935s;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f77945e;
            r rVar = aVar.f77942b;
            if (i13 != rVar.f77993b) {
                long j14 = rVar.f77994c[i13];
                long j15 = ((long[][]) m0.j(this.f77936t))[i12][i13];
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

    public final void o(i6.l lVar) throws IOException {
        this.f77920d.L(8);
        lVar.peekFully(this.f77920d.d(), 0, 8);
        b.e(this.f77920d);
        lVar.skipFully(this.f77920d.e());
        lVar.resetPeekPosition();
    }

    public final void p(long j10) throws ParserException {
        while (!this.f77922f.isEmpty() && this.f77922f.peek().f77830b == j10) {
            a.C0933a c0933aPop = this.f77922f.pop();
            if (c0933aPop.f77829a == 1836019574) {
                s(c0933aPop);
                this.f77922f.clear();
                this.f77925i = 2;
            } else if (!this.f77922f.isEmpty()) {
                this.f77922f.peek().d(c0933aPop);
            }
        }
        if (this.f77925i != 2) {
            h();
        }
    }

    public final void q() {
        if (this.f77939w != 2 || (this.f77917a & 2) == 0) {
            return;
        }
        this.f77934r.track(0, 4).b(new m.b().X(this.f77940x == null ? null : new Metadata(this.f77940x)).E());
        this.f77934r.endTracks();
        this.f77934r.h(new z.b(-9223372036854775807L));
    }

    @Override // i6.k
    public void release() {
    }

    public final void s(a.C0933a c0933a) throws ParserException {
        Metadata metadata;
        Metadata metadata2;
        List<r> list;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.f77939w == 1;
        i6.v vVar = new i6.v();
        a.b bVarG = c0933a.g(1969517665);
        if (bVarG != null) {
            Pair<Metadata, Metadata> pairB = b.B(bVarG);
            Metadata metadata3 = (Metadata) pairB.first;
            Metadata metadata4 = (Metadata) pairB.second;
            if (metadata3 != null) {
                vVar.c(metadata3);
            }
            metadata = metadata4;
            metadata2 = metadata3;
        } else {
            metadata = null;
            metadata2 = null;
        }
        a.C0933a c0933aF = c0933a.f(1835365473);
        long j10 = -9223372036854775807L;
        Metadata metadataN = c0933aF != null ? b.n(c0933aF) : null;
        List<r> listA = b.A(c0933a, vVar, -9223372036854775807L, null, (this.f77917a & 1) != 0, z10, new y7.e() { // from class: q6.j
            @Override // y7.e
            public final Object apply(Object obj) {
                return k.l((o) obj);
            }
        });
        int size = listA.size();
        long j11 = -9223372036854775807L;
        int i12 = 0;
        int size2 = -1;
        while (i12 < size) {
            r rVar = listA.get(i12);
            if (rVar.f77993b == 0) {
                list = listA;
                i10 = size;
            } else {
                o oVar = rVar.f77992a;
                list = listA;
                i10 = size;
                long j12 = oVar.f77962e;
                if (j12 == j10) {
                    j12 = rVar.f77999h;
                }
                long jMax = Math.max(j11, j12);
                a aVar = new a(oVar, rVar, this.f77934r.track(i12, oVar.f77959b));
                int i13 = "audio/true-hd".equals(oVar.f77963f.f21751m) ? rVar.f77996e * 16 : rVar.f77996e + 30;
                m.b bVarB = oVar.f77963f.b();
                bVarB.W(i13);
                if (oVar.f77959b == 2 && j12 > 0 && (i11 = rVar.f77993b) > 1) {
                    bVarB.P(i11 / (j12 / 1000000.0f));
                }
                h.k(oVar.f77959b, vVar, bVarB);
                int i14 = oVar.f77959b;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata;
                metadataArr[1] = this.f77924h.isEmpty() ? null : new Metadata(this.f77924h);
                h.l(i14, metadata2, metadataN, bVarB, metadataArr);
                aVar.f77943c.b(bVarB.E());
                if (oVar.f77959b == 2 && size2 == -1) {
                    size2 = arrayList.size();
                }
                arrayList.add(aVar);
                j11 = jMax;
            }
            i12++;
            listA = list;
            size = i10;
            j10 = -9223372036854775807L;
        }
        this.f77937u = size2;
        this.f77938v = j11;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.f77935s = aVarArr;
        this.f77936t = g(aVarArr);
        this.f77934r.endTracks();
        this.f77934r.h(this);
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        this.f77922f.clear();
        this.f77928l = 0;
        this.f77930n = -1;
        this.f77931o = 0;
        this.f77932p = 0;
        this.f77933q = 0;
        if (j10 == 0) {
            if (this.f77925i != 3) {
                h();
                return;
            } else {
                this.f77923g.g();
                this.f77924h.clear();
                return;
            }
        }
        for (a aVar : this.f77935s) {
            A(aVar, j11);
            c0 c0Var = aVar.f77944d;
            if (c0Var != null) {
                c0Var.b();
            }
        }
    }

    public final void t(long j10) {
        if (this.f77926j == 1836086884) {
            int i10 = this.f77928l;
            this.f77940x = new MotionPhotoMetadata(0L, j10, -9223372036854775807L, j10 + ((long) i10), this.f77927k - ((long) i10));
        }
    }

    public final boolean u(i6.l lVar) throws IOException {
        a.C0933a c0933aPeek;
        if (this.f77928l == 0) {
            if (!lVar.readFully(this.f77921e.d(), 0, 8, true)) {
                q();
                return false;
            }
            this.f77928l = 8;
            this.f77921e.P(0);
            this.f77927k = this.f77921e.F();
            this.f77926j = this.f77921e.n();
        }
        long j10 = this.f77927k;
        if (j10 == 1) {
            lVar.readFully(this.f77921e.d(), 8, 8);
            this.f77928l += 8;
            this.f77927k = this.f77921e.I();
        } else if (j10 == 0) {
            long length = lVar.getLength();
            if (length == -1 && (c0933aPeek = this.f77922f.peek()) != null) {
                length = c0933aPeek.f77830b;
            }
            if (length != -1) {
                this.f77927k = (length - lVar.getPosition()) + ((long) this.f77928l);
            }
        }
        if (this.f77927k < this.f77928l) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (y(this.f77926j)) {
            long position = lVar.getPosition();
            long j11 = this.f77927k;
            int i10 = this.f77928l;
            long j12 = (position + j11) - ((long) i10);
            if (j11 != i10 && this.f77926j == 1835365473) {
                o(lVar);
            }
            this.f77922f.push(new a.C0933a(this.f77926j, j12));
            if (this.f77927k == this.f77928l) {
                p(j12);
            } else {
                h();
            }
        } else if (z(this.f77926j)) {
            s7.a.g(this.f77928l == 8);
            s7.a.g(this.f77927k <= 2147483647L);
            a0 a0Var = new a0((int) this.f77927k);
            System.arraycopy(this.f77921e.d(), 0, a0Var.d(), 0, 8);
            this.f77929m = a0Var;
            this.f77925i = 1;
        } else {
            t(lVar.getPosition() - ((long) this.f77928l));
            this.f77929m = null;
            this.f77925i = 1;
        }
        return true;
    }

    public final boolean v(i6.l lVar, y yVar) throws IOException {
        boolean z10;
        long j10 = this.f77927k - ((long) this.f77928l);
        long position = lVar.getPosition() + j10;
        a0 a0Var = this.f77929m;
        if (a0Var != null) {
            lVar.readFully(a0Var.d(), this.f77928l, (int) j10);
            if (this.f77926j == 1718909296) {
                this.f77939w = r(a0Var);
            } else if (!this.f77922f.isEmpty()) {
                this.f77922f.peek().e(new a.b(this.f77926j, a0Var));
            }
        } else {
            if (j10 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                yVar.f63944a = lVar.getPosition() + j10;
                z10 = true;
                p(position);
                return (z10 || this.f77925i == 2) ? false : true;
            }
            lVar.skipFully((int) j10);
        }
        z10 = false;
        p(position);
        if (z10) {
        }
    }

    public final int w(i6.l lVar, y yVar) throws IOException {
        int i10;
        y yVar2;
        long position = lVar.getPosition();
        if (this.f77930n == -1) {
            int iK = k(position);
            this.f77930n = iK;
            if (iK == -1) {
                return -1;
            }
        }
        a aVar = this.f77935s[this.f77930n];
        b0 b0Var = aVar.f77943c;
        int i11 = aVar.f77945e;
        r rVar = aVar.f77942b;
        long j10 = rVar.f77994c[i11];
        int i12 = rVar.f77995d[i11];
        c0 c0Var = aVar.f77944d;
        long j11 = (j10 - position) + ((long) this.f77931o);
        if (j11 < 0) {
            i10 = 1;
            yVar2 = yVar;
        } else {
            if (j11 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                if (aVar.f77941a.f77964g == 1) {
                    j11 += 8;
                    i12 -= 8;
                }
                lVar.skipFully((int) j11);
                o oVar = aVar.f77941a;
                if (oVar.f77967j == 0) {
                    if ("audio/ac4".equals(oVar.f77963f.f21751m)) {
                        if (this.f77932p == 0) {
                            f6.c.a(i12, this.f77920d);
                            b0Var.e(this.f77920d, 7);
                            this.f77932p += 7;
                        }
                        i12 += 7;
                    } else if (c0Var != null) {
                        c0Var.d(lVar);
                    }
                    while (true) {
                        int i13 = this.f77932p;
                        if (i13 >= i12) {
                            break;
                        }
                        int iF = b0Var.f(lVar, i12 - i13, false);
                        this.f77931o += iF;
                        this.f77932p += iF;
                        this.f77933q -= iF;
                    }
                } else {
                    byte[] bArrD = this.f77919c.d();
                    bArrD[0] = 0;
                    bArrD[1] = 0;
                    bArrD[2] = 0;
                    int i14 = aVar.f77941a.f77967j;
                    int i15 = 4 - i14;
                    while (this.f77932p < i12) {
                        int i16 = this.f77933q;
                        if (i16 == 0) {
                            lVar.readFully(bArrD, i15, i14);
                            this.f77931o += i14;
                            this.f77919c.P(0);
                            int iN = this.f77919c.n();
                            if (iN < 0) {
                                throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                            }
                            this.f77933q = iN;
                            this.f77918b.P(0);
                            b0Var.e(this.f77918b, 4);
                            this.f77932p += 4;
                            i12 += i15;
                        } else {
                            int iF2 = b0Var.f(lVar, i16, false);
                            this.f77931o += iF2;
                            this.f77932p += iF2;
                            this.f77933q -= iF2;
                        }
                    }
                }
                int i17 = i12;
                r rVar2 = aVar.f77942b;
                long j12 = rVar2.f77997f[i11];
                int i18 = rVar2.f77998g[i11];
                if (c0Var != null) {
                    c0Var.c(b0Var, j12, i18, i17, 0, null);
                    if (i11 + 1 == aVar.f77942b.f77993b) {
                        c0Var.a(b0Var, null);
                    }
                } else {
                    b0Var.c(j12, i18, i17, 0, null);
                }
                aVar.f77945e++;
                this.f77930n = -1;
                this.f77931o = 0;
                this.f77932p = 0;
                this.f77933q = 0;
                return 0;
            }
            yVar2 = yVar;
            i10 = 1;
        }
        yVar2.f63944a = j10;
        return i10;
    }

    public final int x(i6.l lVar, y yVar) throws IOException {
        int iC = this.f77923g.c(lVar, yVar, this.f77924h);
        if (iC == 1 && yVar.f63944a == 0) {
            h();
        }
        return iC;
    }
}
