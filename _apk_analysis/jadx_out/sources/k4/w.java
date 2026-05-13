package k4;

import com.google.android.exoplayer.ParserException;
import java.util.Arrays;

/* JADX INFO: compiled from: VorbisUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f72934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f72935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f72936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f72937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f72938e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f72934a = i10;
            this.f72935b = i11;
            this.f72936c = jArr;
            this.f72937d = i12;
            this.f72938e = z10;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f72940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f72941c;

        public b(String str, String[] strArr, int i10) {
            this.f72939a = str;
            this.f72940b = strArr;
            this.f72941c = i10;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f72942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f72943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f72944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f72945d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f72942a = z10;
            this.f72943b = i10;
            this.f72944c = i11;
            this.f72945d = i12;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f72946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f72947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f72948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f72949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f72950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f72951f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f72952g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f72953h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f72954i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f72955j;

        public d(long j10, int i10, long j11, int i11, int i12, int i13, int i14, int i15, boolean z10, byte[] bArr) {
            this.f72946a = j10;
            this.f72947b = i10;
            this.f72948c = j11;
            this.f72949d = i11;
            this.f72950e = i12;
            this.f72951f = i13;
            this.f72952g = i14;
            this.f72953h = i15;
            this.f72954i = z10;
            this.f72955j = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static long b(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static a c(v vVar) throws ParserException {
        if (vVar.d(24) != 5653314) {
            throw new ParserException("expected code book to start with [0x56, 0x43, 0x42] at " + vVar.b());
        }
        int iD = vVar.d(16);
        int iD2 = vVar.d(24);
        long[] jArr = new long[iD2];
        boolean zC = vVar.c();
        long jB = 0;
        if (zC) {
            int iD3 = vVar.d(5) + 1;
            int i10 = 0;
            while (i10 < iD2) {
                int iD4 = vVar.d(a(iD2 - i10));
                for (int i11 = 0; i11 < iD4 && i10 < iD2; i11++) {
                    jArr[i10] = iD3;
                    i10++;
                }
                iD3++;
            }
        } else {
            boolean zC2 = vVar.c();
            for (int i12 = 0; i12 < iD2; i12++) {
                if (!zC2) {
                    jArr[i12] = vVar.d(5) + 1;
                } else if (vVar.c()) {
                    jArr[i12] = vVar.d(5) + 1;
                } else {
                    jArr[i12] = 0;
                }
            }
        }
        int iD5 = vVar.d(4);
        if (iD5 > 2) {
            throw new ParserException("lookup type greater than 2 not decodable: " + iD5);
        }
        if (iD5 == 1 || iD5 == 2) {
            vVar.e(32);
            vVar.e(32);
            int iD6 = vVar.d(4) + 1;
            vVar.e(1);
            if (iD5 != 1) {
                jB = ((long) iD2) * ((long) iD);
            } else if (iD != 0) {
                jB = b(iD2, iD);
            }
            vVar.e((int) (jB * ((long) iD6)));
        }
        return new a(iD, iD2, jArr, iD5, zC);
    }

    public static void d(v vVar) throws ParserException {
        int iD = vVar.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            int iD2 = vVar.d(16);
            if (iD2 == 0) {
                vVar.e(8);
                vVar.e(16);
                vVar.e(16);
                vVar.e(6);
                vVar.e(8);
                int iD3 = vVar.d(4) + 1;
                for (int i11 = 0; i11 < iD3; i11++) {
                    vVar.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw new ParserException("floor type greater than 1 not decodable: " + iD2);
                }
                int iD4 = vVar.d(5);
                int i12 = -1;
                int[] iArr = new int[iD4];
                for (int i13 = 0; i13 < iD4; i13++) {
                    int iD5 = vVar.d(4);
                    iArr[i13] = iD5;
                    if (iD5 > i12) {
                        i12 = iD5;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = vVar.d(3) + 1;
                    int iD6 = vVar.d(2);
                    if (iD6 > 0) {
                        vVar.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << iD6); i16++) {
                        vVar.e(8);
                    }
                }
                vVar.e(2);
                int iD7 = vVar.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < iD4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        vVar.e(iD7);
                        i18++;
                    }
                }
            }
        }
    }

    public static void e(int i10, v vVar) throws ParserException {
        int iD = vVar.d(6) + 1;
        for (int i11 = 0; i11 < iD; i11++) {
            int iD2 = vVar.d(16);
            if (iD2 != 0) {
                a6.m.c("VorbisUtil", "mapping type other than 0 not supported: " + iD2);
            } else {
                int iD3 = vVar.c() ? vVar.d(4) + 1 : 1;
                if (vVar.c()) {
                    int iD4 = vVar.d(8) + 1;
                    for (int i12 = 0; i12 < iD4; i12++) {
                        int i13 = i10 - 1;
                        vVar.e(a(i13));
                        vVar.e(a(i13));
                    }
                }
                if (vVar.d(2) != 0) {
                    throw new ParserException("to reserved bits must be zero after mapping coupling steps");
                }
                if (iD3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        vVar.e(4);
                    }
                }
                for (int i15 = 0; i15 < iD3; i15++) {
                    vVar.e(8);
                    vVar.e(8);
                    vVar.e(8);
                }
            }
        }
    }

    public static c[] f(v vVar) {
        int iD = vVar.d(6) + 1;
        c[] cVarArr = new c[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            cVarArr[i10] = new c(vVar.c(), vVar.d(16), vVar.d(16), vVar.d(8));
        }
        return cVarArr;
    }

    public static void g(v vVar) throws ParserException {
        int iD = vVar.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            if (vVar.d(16) > 2) {
                throw new ParserException("residueType greater than 2 is not decodable");
            }
            vVar.e(24);
            vVar.e(24);
            vVar.e(24);
            int iD2 = vVar.d(6) + 1;
            vVar.e(8);
            int[] iArr = new int[iD2];
            for (int i11 = 0; i11 < iD2; i11++) {
                iArr[i11] = ((vVar.c() ? vVar.d(5) : 0) * 8) + vVar.d(3);
            }
            for (int i12 = 0; i12 < iD2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        vVar.e(8);
                    }
                }
            }
        }
    }

    public static b h(a6.t tVar) throws ParserException {
        return i(tVar, true, true);
    }

    public static b i(a6.t tVar, boolean z10, boolean z11) throws ParserException {
        if (z10) {
            l(3, tVar, false);
        }
        String strV = tVar.v((int) tVar.o());
        int length = 11 + strV.length();
        long jO = tVar.o();
        String[] strArr = new String[(int) jO];
        int length2 = length + 4;
        for (int i10 = 0; i10 < jO; i10++) {
            String strV2 = tVar.v((int) tVar.o());
            strArr[i10] = strV2;
            length2 = length2 + 4 + strV2.length();
        }
        if (z11 && (tVar.y() & 1) == 0) {
            throw new ParserException("framing bit expected to be set");
        }
        return new b(strV, strArr, length2 + 1);
    }

    public static d j(a6.t tVar) throws ParserException {
        l(1, tVar, false);
        long jO = tVar.o();
        int iY = tVar.y();
        long jO2 = tVar.o();
        int iM = tVar.m();
        int iM2 = tVar.m();
        int iM3 = tVar.m();
        int iY2 = tVar.y();
        return new d(jO, iY, jO2, iM, iM2, iM3, (int) Math.pow(2.0d, iY2 & 15), (int) Math.pow(2.0d, (iY2 & 240) >> 4), (tVar.y() & 1) > 0, Arrays.copyOf(tVar.f3620a, tVar.d()));
    }

    public static c[] k(a6.t tVar, int i10) throws ParserException {
        l(5, tVar, false);
        int iY = tVar.y() + 1;
        v vVar = new v(tVar.f3620a);
        vVar.e(tVar.c() * 8);
        for (int i11 = 0; i11 < iY; i11++) {
            c(vVar);
        }
        int iD = vVar.d(6) + 1;
        for (int i12 = 0; i12 < iD; i12++) {
            if (vVar.d(16) != 0) {
                throw new ParserException("placeholder of time domain transforms not zeroed out");
            }
        }
        d(vVar);
        g(vVar);
        e(i10, vVar);
        c[] cVarArrF = f(vVar);
        if (vVar.c()) {
            return cVarArrF;
        }
        throw new ParserException("framing bit after modes not set as expected");
    }

    public static boolean l(int i10, a6.t tVar, boolean z10) throws ParserException {
        if (tVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw new ParserException("too short header: " + tVar.a());
        }
        if (tVar.y() != i10) {
            if (z10) {
                return false;
            }
            throw new ParserException("expected header type " + Integer.toHexString(i10));
        }
        if (tVar.y() == 118 && tVar.y() == 111 && tVar.y() == 114 && tVar.y() == 98 && tVar.y() == 105 && tVar.y() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw new ParserException("expected characters 'vorbis'");
    }
}
