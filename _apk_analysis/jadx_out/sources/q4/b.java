package q4;

import a6.k0;
import a6.p;
import a6.t;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import q4.a;

/* JADX INFO: compiled from: AtomParsers.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f77667a = k0.c0("OpusHead");

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f77669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f77670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f77671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f77672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final t f77673f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final t f77674g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f77675h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f77676i;

        public a(t tVar, t tVar2, boolean z10) {
            this.f77674g = tVar;
            this.f77673f = tVar2;
            this.f77672e = z10;
            tVar2.L(12);
            this.f77668a = tVar2.C();
            tVar.L(12);
            this.f77676i = tVar.C();
            a6.a.g(tVar.j() == 1, "first_chunk must be 1");
            this.f77669b = -1;
        }

        public boolean a() {
            int i10 = this.f77669b + 1;
            this.f77669b = i10;
            if (i10 == this.f77668a) {
                return false;
            }
            this.f77671d = this.f77672e ? this.f77673f.D() : this.f77673f.A();
            if (this.f77669b == this.f77675h) {
                this.f77670c = this.f77674g.C();
                this.f77674g.M(4);
                int i11 = this.f77676i - 1;
                this.f77676i = i11;
                this.f77675h = i11 > 0 ? this.f77674g.C() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: q4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AtomParsers.java */
    public interface InterfaceC0931b {
        int getSampleCount();

        boolean isFixedSampleSize();

        int readNextSampleSize();
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m[] f77677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Format f77678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f77679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f77680d = 0;

        public c(int i10) {
            this.f77677a = new m[i10];
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class d implements InterfaceC0931b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f77683c;

        public d(a.b bVar) {
            t tVar = bVar.f77666b;
            this.f77683c = tVar;
            tVar.L(12);
            this.f77681a = tVar.C();
            this.f77682b = tVar.C();
        }

        @Override // q4.b.InterfaceC0931b
        public int getSampleCount() {
            return this.f77682b;
        }

        @Override // q4.b.InterfaceC0931b
        public boolean isFixedSampleSize() {
            return this.f77681a != 0;
        }

        @Override // q4.b.InterfaceC0931b
        public int readNextSampleSize() {
            int i10 = this.f77681a;
            return i10 == 0 ? this.f77683c.C() : i10;
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class e implements InterfaceC0931b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f77684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f77686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f77687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f77688e;

        public e(a.b bVar) {
            t tVar = bVar.f77666b;
            this.f77684a = tVar;
            tVar.L(12);
            this.f77686c = tVar.C() & 255;
            this.f77685b = tVar.C();
        }

        @Override // q4.b.InterfaceC0931b
        public int getSampleCount() {
            return this.f77685b;
        }

        @Override // q4.b.InterfaceC0931b
        public boolean isFixedSampleSize() {
            return false;
        }

        @Override // q4.b.InterfaceC0931b
        public int readNextSampleSize() {
            int i10 = this.f77686c;
            if (i10 == 8) {
                return this.f77684a.y();
            }
            if (i10 == 16) {
                return this.f77684a.E();
            }
            int i11 = this.f77687d;
            this.f77687d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f77688e & 15;
            }
            int iY = this.f77684a.y();
            this.f77688e = iY;
            return (iY & 240) >> 4;
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f77690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f77691c;

        public f(int i10, long j10, int i11) {
            this.f77689a = i10;
            this.f77690b = j10;
            this.f77691c = i11;
        }
    }

    public static boolean a(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[k0.q(4, 0, length)] && jArr[k0.q(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    public static int b(t tVar, int i10, int i11) {
        int iC = tVar.c();
        while (iC - i10 < i11) {
            tVar.L(iC);
            int iJ = tVar.j();
            a6.a.b(iJ > 0, "childAtomSize should be positive");
            if (tVar.j() == 1702061171) {
                return iC;
            }
            iC += iJ;
        }
        return -1;
    }

    public static int c(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 4 : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(a6.t r28, int r29, int r30, int r31, int r32, java.lang.String r33, boolean r34, com.google.android.exoplayer.drm.DrmInitData r35, q4.b.c r36, int r37) throws com.google.android.exoplayer.ParserException {
        /*
            Method dump skipped, instruction units count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.b.d(a6.t, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer.drm.DrmInitData, q4.b$c, int):void");
    }

    public static Pair<Integer, m> e(t tVar, int i10, int i11) {
        int i12 = i10 + 8;
        int i13 = -1;
        String strV = null;
        Integer numValueOf = null;
        int i14 = 0;
        while (i12 - i10 < i11) {
            tVar.L(i12);
            int iJ = tVar.j();
            int iJ2 = tVar.j();
            if (iJ2 == 1718775137) {
                numValueOf = Integer.valueOf(tVar.j());
            } else if (iJ2 == 1935894637) {
                tVar.M(4);
                strV = tVar.v(4);
            } else if (iJ2 == 1935894633) {
                i13 = i12;
                i14 = iJ;
            }
            i12 += iJ;
        }
        if (!"cenc".equals(strV) && !"cbc1".equals(strV) && !"cens".equals(strV) && !"cbcs".equals(strV)) {
            return null;
        }
        a6.a.b(numValueOf != null, "frma atom is mandatory");
        a6.a.b(i13 != -1, "schi atom is mandatory");
        m mVarQ = q(tVar, i13, i14, strV);
        a6.a.b(mVarQ != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, mVarQ);
    }

    public static Pair<long[], long[]> f(a.C0930a c0930a) {
        a.b bVarG;
        if (c0930a == null || (bVarG = c0930a.g(1701606260)) == null) {
            return Pair.create(null, null);
        }
        t tVar = bVarG.f77666b;
        tVar.L(8);
        int iC = q4.a.c(tVar.j());
        int iC2 = tVar.C();
        long[] jArr = new long[iC2];
        long[] jArr2 = new long[iC2];
        for (int i10 = 0; i10 < iC2; i10++) {
            jArr[i10] = iC == 1 ? tVar.D() : tVar.A();
            jArr2[i10] = iC == 1 ? tVar.r() : tVar.j();
            if (tVar.u() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            tVar.M(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static Pair<String, byte[]> g(t tVar, int i10) {
        tVar.L(i10 + 8 + 4);
        tVar.M(1);
        h(tVar);
        tVar.M(2);
        int iY = tVar.y();
        if ((iY & 128) != 0) {
            tVar.M(2);
        }
        if ((iY & 64) != 0) {
            tVar.M(tVar.E());
        }
        if ((iY & 32) != 0) {
            tVar.M(2);
        }
        tVar.M(1);
        h(tVar);
        String strF = p.f(tVar.y());
        if ("audio/mpeg".equals(strF) || "audio/vnd.dts".equals(strF) || "audio/vnd.dts.hd".equals(strF)) {
            return Pair.create(strF, null);
        }
        tVar.M(12);
        tVar.M(1);
        int iH = h(tVar);
        byte[] bArr = new byte[iH];
        tVar.h(bArr, 0, iH);
        return Pair.create(strF, bArr);
    }

    public static int h(t tVar) {
        int iY = tVar.y();
        int i10 = iY & 127;
        while ((iY & 128) == 128) {
            iY = tVar.y();
            i10 = (i10 << 7) | (iY & 127);
        }
        return i10;
    }

    public static int i(t tVar) {
        tVar.L(16);
        return tVar.j();
    }

    @Nullable
    public static Metadata j(t tVar, int i10) {
        tVar.M(8);
        ArrayList arrayList = new ArrayList();
        while (tVar.c() < i10) {
            Metadata.Entry entryD = g.d(tVar);
            if (entryD != null) {
                arrayList.add(entryD);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Pair<Long, String> k(t tVar) {
        tVar.L(8);
        int iC = q4.a.c(tVar.j());
        tVar.M(iC == 0 ? 8 : 16);
        long jA = tVar.A();
        tVar.M(iC == 0 ? 4 : 8);
        int iE = tVar.E();
        return Pair.create(Long.valueOf(jA), "" + ((char) (((iE >> 10) & 31) + 96)) + ((char) (((iE >> 5) & 31) + 96)) + ((char) ((iE & 31) + 96)));
    }

    @Nullable
    public static Metadata l(a.C0930a c0930a) {
        a.b bVarG = c0930a.g(1751411826);
        a.b bVarG2 = c0930a.g(1801812339);
        a.b bVarG3 = c0930a.g(1768715124);
        if (bVarG == null || bVarG2 == null || bVarG3 == null || i(bVarG.f77666b) != 1835299937) {
            return null;
        }
        t tVar = bVarG2.f77666b;
        tVar.L(12);
        int iJ = tVar.j();
        String[] strArr = new String[iJ];
        for (int i10 = 0; i10 < iJ; i10++) {
            int iJ2 = tVar.j();
            tVar.M(4);
            strArr[i10] = tVar.v(iJ2 - 8);
        }
        t tVar2 = bVarG3.f77666b;
        tVar2.L(8);
        ArrayList arrayList = new ArrayList();
        while (tVar2.a() > 8) {
            int iC = tVar2.c();
            int iJ3 = tVar2.j();
            int iJ4 = tVar2.j() - 1;
            if (iJ4 < 0 || iJ4 >= iJ) {
                a6.m.h("AtomParsers", "Skipped metadata with unknown key index: " + iJ4);
            } else {
                MdtaMetadataEntry mdtaMetadataEntryG = g.g(tVar2, iC + iJ3, strArr[iJ4]);
                if (mdtaMetadataEntryG != null) {
                    arrayList.add(mdtaMetadataEntryG);
                }
            }
            tVar2.L(iC + iJ3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static long m(t tVar) {
        tVar.L(8);
        tVar.M(q4.a.c(tVar.j()) != 0 ? 16 : 8);
        return tVar.A();
    }

    public static float n(t tVar, int i10) {
        tVar.L(i10 + 8);
        return tVar.C() / tVar.C();
    }

    public static byte[] o(t tVar, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            tVar.L(i12);
            int iJ = tVar.j();
            if (tVar.j() == 1886547818) {
                return Arrays.copyOfRange(tVar.f3620a, i12, iJ + i12);
            }
            i12 += iJ;
        }
        return null;
    }

    public static Pair<Integer, m> p(t tVar, int i10, int i11) {
        Pair<Integer, m> pairE;
        int iC = tVar.c();
        while (iC - i10 < i11) {
            tVar.L(iC);
            int iJ = tVar.j();
            a6.a.b(iJ > 0, "childAtomSize should be positive");
            if (tVar.j() == 1936289382 && (pairE = e(tVar, iC, iJ)) != null) {
                return pairE;
            }
            iC += iJ;
        }
        return null;
    }

    public static m q(t tVar, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            tVar.L(i14);
            int iJ = tVar.j();
            if (tVar.j() == 1952804451) {
                int iC = q4.a.c(tVar.j());
                tVar.M(1);
                if (iC == 0) {
                    tVar.M(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int iY = tVar.y();
                    i12 = iY & 15;
                    i13 = (iY & 240) >> 4;
                }
                boolean z10 = tVar.y() == 1;
                int iY2 = tVar.y();
                byte[] bArr2 = new byte[16];
                tVar.h(bArr2, 0, 16);
                if (z10 && iY2 == 0) {
                    int iY3 = tVar.y();
                    bArr = new byte[iY3];
                    tVar.h(bArr, 0, iY3);
                }
                return new m(z10, str, iY2, bArr2, i13, i12, bArr);
            }
            i14 += iJ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q4.o r(q4.l r38, q4.a.C0930a r39, k4.o r40) throws com.google.android.exoplayer.ParserException {
        /*
            Method dump skipped, instruction units count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.b.r(q4.l, q4.a$a, k4.o):q4.o");
    }

    public static c s(t tVar, int i10, int i11, String str, DrmInitData drmInitData, boolean z10) throws ParserException {
        tVar.L(12);
        int iJ = tVar.j();
        c cVar = new c(iJ);
        for (int i12 = 0; i12 < iJ; i12++) {
            int iC = tVar.c();
            int iJ2 = tVar.j();
            a6.a.b(iJ2 > 0, "childAtomSize should be positive");
            int iJ3 = tVar.j();
            if (iJ3 == 1635148593 || iJ3 == 1635148595 || iJ3 == 1701733238 || iJ3 == 1836070006 || iJ3 == 1752589105 || iJ3 == 1751479857 || iJ3 == 1932670515 || iJ3 == 1987063864 || iJ3 == 1987063865 || iJ3 == 1635135537 || iJ3 == 1685479798 || iJ3 == 1685479729 || iJ3 == 1685481573 || iJ3 == 1685481521) {
                y(tVar, iJ3, iC, iJ2, i10, i11, drmInitData, cVar, i12);
            } else if (iJ3 == 1836069985 || iJ3 == 1701733217 || iJ3 == 1633889587 || iJ3 == 1700998451 || iJ3 == 1633889588 || iJ3 == 1685353315 || iJ3 == 1685353317 || iJ3 == 1685353320 || iJ3 == 1685353324 || iJ3 == 1935764850 || iJ3 == 1935767394 || iJ3 == 1819304813 || iJ3 == 1936684916 || iJ3 == 1953984371 || iJ3 == 778924083 || iJ3 == 1634492771 || iJ3 == 1634492791 || iJ3 == 1970037111 || iJ3 == 1332770163 || iJ3 == 1716281667) {
                d(tVar, iJ3, iC, iJ2, i10, str, z10, drmInitData, cVar, i12);
            } else if (iJ3 == 1414810956 || iJ3 == 1954034535 || iJ3 == 2004251764 || iJ3 == 1937010800 || iJ3 == 1664495672) {
                t(tVar, iJ3, iC, iJ2, i10, str, cVar);
            } else if (iJ3 == 1667329389) {
                cVar.f77678b = Format.u(Integer.toString(i10), "application/x-camera-motion", null, -1, null);
            }
            tVar.L(iC + iJ2);
        }
        return cVar;
    }

    public static void t(t tVar, int i10, int i11, int i12, int i13, String str, c cVar) throws ParserException {
        tVar.L(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        List listSingletonList = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                tVar.h(bArr, 0, i14);
                listSingletonList = Collections.singletonList(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                cVar.f77680d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        cVar.f77678b = Format.z(Integer.toString(i13), str2, null, -1, 0, str, -1, null, j10, listSingletonList);
    }

    public static f u(t tVar) {
        boolean z10;
        tVar.L(8);
        int iC = q4.a.c(tVar.j());
        tVar.M(iC == 0 ? 8 : 16);
        int iJ = tVar.j();
        tVar.M(4);
        int iC2 = tVar.c();
        int i10 = iC == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            }
            if (tVar.f3620a[iC2 + i12] != -1) {
                z10 = false;
                break;
            }
            i12++;
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            tVar.M(i10);
        } else {
            long jA = iC == 0 ? tVar.A() : tVar.D();
            if (jA != 0) {
                j10 = jA;
            }
        }
        tVar.M(16);
        int iJ2 = tVar.j();
        int iJ3 = tVar.j();
        tVar.M(4);
        int iJ4 = tVar.j();
        int iJ5 = tVar.j();
        if (iJ2 == 0 && iJ3 == 65536 && iJ4 == -65536 && iJ5 == 0) {
            i11 = 90;
        } else if (iJ2 == 0 && iJ3 == -65536 && iJ4 == 65536 && iJ5 == 0) {
            i11 = 270;
        } else if (iJ2 == -65536 && iJ3 == 0 && iJ4 == 0 && iJ5 == -65536) {
            i11 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
        }
        return new f(iJ, j10, i11);
    }

    public static l v(a.C0930a c0930a, a.b bVar, long j10, DrmInitData drmInitData, boolean z10, boolean z11) throws ParserException {
        a.b bVar2;
        long j11;
        long[] jArr;
        long[] jArr2;
        a.C0930a c0930aF = c0930a.f(1835297121);
        int iC = c(i(c0930aF.g(1751411826).f77666b));
        if (iC == -1) {
            return null;
        }
        f fVarU = u(c0930a.g(1953196132).f77666b);
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = fVarU.f77690b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long jM = m(bVar2.f77666b);
        long jY0 = j11 != -9223372036854775807L ? k0.y0(j11, 1000000L, jM) : -9223372036854775807L;
        a.C0930a c0930aF2 = c0930aF.f(1835626086).f(1937007212);
        Pair<Long, String> pairK = k(c0930aF.g(1835296868).f77666b);
        c cVarS = s(c0930aF2.g(1937011556).f77666b, fVarU.f77689a, fVarU.f77691c, (String) pairK.second, drmInitData, z11);
        if (z10) {
            jArr = null;
            jArr2 = null;
        } else {
            Pair<long[], long[]> pairF = f(c0930a.f(1701082227));
            long[] jArr3 = (long[]) pairF.first;
            jArr2 = (long[]) pairF.second;
            jArr = jArr3;
        }
        if (cVarS.f77678b == null) {
            return null;
        }
        return new l(fVarU.f77689a, iC, ((Long) pairK.first).longValue(), jM, jY0, cVarS.f77678b, cVarS.f77680d, cVarS.f77677a, cVarS.f77679c, jArr, jArr2);
    }

    @Nullable
    public static Metadata w(a.b bVar, boolean z10) {
        if (z10) {
            return null;
        }
        t tVar = bVar.f77666b;
        tVar.L(8);
        while (tVar.a() >= 8) {
            int iC = tVar.c();
            int iJ = tVar.j();
            if (tVar.j() == 1835365473) {
                tVar.L(iC);
                return x(tVar, iC + iJ);
            }
            tVar.L(iC + iJ);
        }
        return null;
    }

    @Nullable
    public static Metadata x(t tVar, int i10) {
        tVar.M(12);
        while (tVar.c() < i10) {
            int iC = tVar.c();
            int iJ = tVar.j();
            if (tVar.j() == 1768715124) {
                tVar.L(iC);
                return j(tVar, iC + iJ);
            }
            tVar.L(iC + iJ);
        }
        return null;
    }

    public static void y(t tVar, int i10, int i11, int i12, int i13, int i14, DrmInitData drmInitData, c cVar, int i15) throws ParserException {
        int i16 = i11;
        DrmInitData drmInitDataD = drmInitData;
        tVar.L(i16 + 8 + 8);
        tVar.M(16);
        int iE = tVar.E();
        int iE2 = tVar.E();
        tVar.M(50);
        int iC = tVar.c();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair<Integer, m> pairP = p(tVar, i16, i12);
            if (pairP != null) {
                iIntValue = ((Integer) pairP.first).intValue();
                drmInitDataD = drmInitDataD == null ? null : drmInitDataD.d(((m) pairP.second).f77784b);
                cVar.f77677a[i15] = (m) pairP.second;
            }
            tVar.L(iC);
        }
        DrmInitData drmInitData2 = drmInitDataD;
        int i17 = -1;
        String str = null;
        List<byte[]> listSingletonList = null;
        byte[] bArrO = null;
        float fN = 1.0f;
        String str2 = null;
        boolean z10 = false;
        while (iC - i16 < i12) {
            tVar.L(iC);
            int iC2 = tVar.c();
            int iJ = tVar.j();
            if (iJ == 0 && tVar.c() - i16 == i12) {
                break;
            }
            a6.a.b(iJ > 0, "childAtomSize should be positive");
            int iJ2 = tVar.j();
            if (iJ2 == 1635148611) {
                a6.a.f(str == null);
                tVar.L(iC2 + 8);
                b6.a aVarB = b6.a.b(tVar);
                listSingletonList = aVarB.f5404a;
                cVar.f77679c = aVarB.f5405b;
                if (!z10) {
                    fN = aVarB.f5408e;
                }
                str = "video/avc";
            } else if (iJ2 == 1752589123) {
                a6.a.f(str == null);
                tVar.L(iC2 + 8);
                b6.c cVarA = b6.c.a(tVar);
                listSingletonList = cVarA.f5412a;
                cVar.f77679c = cVarA.f5413b;
                str = "video/hevc";
            } else if (iJ2 == 1685480259 || iJ2 == 1685485123) {
                b6.b bVarA = b6.b.a(tVar);
                if (bVarA != null) {
                    str2 = bVarA.f5411c;
                    str = "video/dolby-vision";
                }
            } else if (iJ2 == 1987076931) {
                a6.a.f(str == null);
                str = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
            } else if (iJ2 == 1635135811) {
                a6.a.f(str == null);
                str = "video/av01";
            } else if (iJ2 == 1681012275) {
                a6.a.f(str == null);
                str = "video/3gpp";
            } else if (iJ2 == 1702061171) {
                a6.a.f(str == null);
                Pair<String, byte[]> pairG = g(tVar, iC2);
                str = (String) pairG.first;
                listSingletonList = Collections.singletonList((byte[]) pairG.second);
            } else if (iJ2 == 1885434736) {
                fN = n(tVar, iC2);
                z10 = true;
            } else if (iJ2 == 1937126244) {
                bArrO = o(tVar, iC2, iJ);
            } else if (iJ2 == 1936995172) {
                int iY = tVar.y();
                tVar.M(3);
                if (iY == 0) {
                    int iY2 = tVar.y();
                    if (iY2 == 0) {
                        i17 = 0;
                    } else if (iY2 == 1) {
                        i17 = 1;
                    } else if (iY2 == 2) {
                        i17 = 2;
                    } else if (iY2 == 3) {
                        i17 = 3;
                    }
                }
            }
            iC += iJ;
            i16 = i11;
        }
        if (str == null) {
            return;
        }
        cVar.f77678b = Format.D(Integer.toString(i13), str, str2, -1, -1, iE, iE2, -1.0f, listSingletonList, i14, fN, bArrO, i17, null, drmInitData2);
    }
}
