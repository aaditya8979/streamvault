package i6;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import s7.m0;

/* JADX INFO: compiled from: VorbisUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e0 {

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f63877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f63878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f63879e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f63875a = i10;
            this.f63876b = i11;
            this.f63877c = jArr;
            this.f63878d = i12;
            this.f63879e = z10;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f63881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63882c;

        public b(String str, String[] strArr, int i10) {
            this.f63880a = str;
            this.f63881b = strArr;
            this.f63882c = i10;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f63883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f63886d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f63883a = z10;
            this.f63884b = i10;
            this.f63885c = i11;
            this.f63886d = i12;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f63890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f63891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f63892f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f63893g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f63894h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f63895i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f63896j;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f63887a = i10;
            this.f63888b = i11;
            this.f63889c = i12;
            this.f63890d = i13;
            this.f63891e = i14;
            this.f63892f = i15;
            this.f63893g = i16;
            this.f63894h = i17;
            this.f63895i = z10;
            this.f63896j = bArr;
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

    @Nullable
    public static Metadata c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] strArrI0 = m0.I0(str, "=");
            if (strArrI0.length != 2) {
                s7.q.i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrI0[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.b(new s7.a0(Base64.decode(strArrI0[1], 0))));
                } catch (RuntimeException e10) {
                    s7.q.j("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new VorbisComment(strArrI0[0], strArrI0[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static a d(d0 d0Var) throws ParserException {
        if (d0Var.d(24) != 5653314) {
            throw ParserException.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + d0Var.b(), null);
        }
        int iD = d0Var.d(16);
        int iD2 = d0Var.d(24);
        long[] jArr = new long[iD2];
        boolean zC = d0Var.c();
        long jB = 0;
        if (zC) {
            int iD3 = d0Var.d(5) + 1;
            int i10 = 0;
            while (i10 < iD2) {
                int iD4 = d0Var.d(a(iD2 - i10));
                for (int i11 = 0; i11 < iD4 && i10 < iD2; i11++) {
                    jArr[i10] = iD3;
                    i10++;
                }
                iD3++;
            }
        } else {
            boolean zC2 = d0Var.c();
            for (int i12 = 0; i12 < iD2; i12++) {
                if (!zC2) {
                    jArr[i12] = d0Var.d(5) + 1;
                } else if (d0Var.c()) {
                    jArr[i12] = d0Var.d(5) + 1;
                } else {
                    jArr[i12] = 0;
                }
            }
        }
        int iD5 = d0Var.d(4);
        if (iD5 > 2) {
            throw ParserException.createForMalformedContainer("lookup type greater than 2 not decodable: " + iD5, null);
        }
        if (iD5 == 1 || iD5 == 2) {
            d0Var.e(32);
            d0Var.e(32);
            int iD6 = d0Var.d(4) + 1;
            d0Var.e(1);
            if (iD5 != 1) {
                jB = ((long) iD2) * ((long) iD);
            } else if (iD != 0) {
                jB = b(iD2, iD);
            }
            d0Var.e((int) (jB * ((long) iD6)));
        }
        return new a(iD, iD2, jArr, iD5, zC);
    }

    public static void e(d0 d0Var) throws ParserException {
        int iD = d0Var.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            int iD2 = d0Var.d(16);
            if (iD2 == 0) {
                d0Var.e(8);
                d0Var.e(16);
                d0Var.e(16);
                d0Var.e(6);
                d0Var.e(8);
                int iD3 = d0Var.d(4) + 1;
                for (int i11 = 0; i11 < iD3; i11++) {
                    d0Var.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw ParserException.createForMalformedContainer("floor type greater than 1 not decodable: " + iD2, null);
                }
                int iD4 = d0Var.d(5);
                int i12 = -1;
                int[] iArr = new int[iD4];
                for (int i13 = 0; i13 < iD4; i13++) {
                    int iD5 = d0Var.d(4);
                    iArr[i13] = iD5;
                    if (iD5 > i12) {
                        i12 = iD5;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = d0Var.d(3) + 1;
                    int iD6 = d0Var.d(2);
                    if (iD6 > 0) {
                        d0Var.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << iD6); i16++) {
                        d0Var.e(8);
                    }
                }
                d0Var.e(2);
                int iD7 = d0Var.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < iD4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        d0Var.e(iD7);
                        i18++;
                    }
                }
            }
        }
    }

    public static void f(int i10, d0 d0Var) throws ParserException {
        int iD = d0Var.d(6) + 1;
        for (int i11 = 0; i11 < iD; i11++) {
            int iD2 = d0Var.d(16);
            if (iD2 != 0) {
                s7.q.c("VorbisUtil", "mapping type other than 0 not supported: " + iD2);
            } else {
                int iD3 = d0Var.c() ? d0Var.d(4) + 1 : 1;
                if (d0Var.c()) {
                    int iD4 = d0Var.d(8) + 1;
                    for (int i12 = 0; i12 < iD4; i12++) {
                        int i13 = i10 - 1;
                        d0Var.e(a(i13));
                        d0Var.e(a(i13));
                    }
                }
                if (d0Var.d(2) != 0) {
                    throw ParserException.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iD3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        d0Var.e(4);
                    }
                }
                for (int i15 = 0; i15 < iD3; i15++) {
                    d0Var.e(8);
                    d0Var.e(8);
                    d0Var.e(8);
                }
            }
        }
    }

    public static c[] g(d0 d0Var) {
        int iD = d0Var.d(6) + 1;
        c[] cVarArr = new c[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            cVarArr[i10] = new c(d0Var.c(), d0Var.d(16), d0Var.d(16), d0Var.d(8));
        }
        return cVarArr;
    }

    public static void h(d0 d0Var) throws ParserException {
        int iD = d0Var.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            if (d0Var.d(16) > 2) {
                throw ParserException.createForMalformedContainer("residueType greater than 2 is not decodable", null);
            }
            d0Var.e(24);
            d0Var.e(24);
            d0Var.e(24);
            int iD2 = d0Var.d(6) + 1;
            d0Var.e(8);
            int[] iArr = new int[iD2];
            for (int i11 = 0; i11 < iD2; i11++) {
                iArr[i11] = ((d0Var.c() ? d0Var.d(5) : 0) * 8) + d0Var.d(3);
            }
            for (int i12 = 0; i12 < iD2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        d0Var.e(8);
                    }
                }
            }
        }
    }

    public static b i(s7.a0 a0Var) throws ParserException {
        return j(a0Var, true, true);
    }

    public static b j(s7.a0 a0Var, boolean z10, boolean z11) throws ParserException {
        if (z10) {
            m(3, a0Var, false);
        }
        String strA = a0Var.A((int) a0Var.t());
        int length = 11 + strA.length();
        long jT = a0Var.t();
        String[] strArr = new String[(int) jT];
        int length2 = length + 4;
        for (int i10 = 0; i10 < jT; i10++) {
            String strA2 = a0Var.A((int) a0Var.t());
            strArr[i10] = strA2;
            length2 = length2 + 4 + strA2.length();
        }
        if (z11 && (a0Var.D() & 1) == 0) {
            throw ParserException.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new b(strA, strArr, length2 + 1);
    }

    public static d k(s7.a0 a0Var) throws ParserException {
        m(1, a0Var, false);
        int iU = a0Var.u();
        int iD = a0Var.D();
        int iU2 = a0Var.u();
        int iQ = a0Var.q();
        if (iQ <= 0) {
            iQ = -1;
        }
        int iQ2 = a0Var.q();
        if (iQ2 <= 0) {
            iQ2 = -1;
        }
        int iQ3 = a0Var.q();
        if (iQ3 <= 0) {
            iQ3 = -1;
        }
        int iD2 = a0Var.D();
        return new d(iU, iD, iU2, iQ, iQ2, iQ3, (int) Math.pow(2.0d, iD2 & 15), (int) Math.pow(2.0d, (iD2 & 240) >> 4), (a0Var.D() & 1) > 0, Arrays.copyOf(a0Var.d(), a0Var.f()));
    }

    public static c[] l(s7.a0 a0Var, int i10) throws ParserException {
        m(5, a0Var, false);
        int iD = a0Var.D() + 1;
        d0 d0Var = new d0(a0Var.d());
        d0Var.e(a0Var.e() * 8);
        for (int i11 = 0; i11 < iD; i11++) {
            d(d0Var);
        }
        int iD2 = d0Var.d(6) + 1;
        for (int i12 = 0; i12 < iD2; i12++) {
            if (d0Var.d(16) != 0) {
                throw ParserException.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        e(d0Var);
        h(d0Var);
        f(i10, d0Var);
        c[] cVarArrG = g(d0Var);
        if (d0Var.c()) {
            return cVarArrG;
        }
        throw ParserException.createForMalformedContainer("framing bit after modes not set as expected", null);
    }

    public static boolean m(int i10, s7.a0 a0Var, boolean z10) throws ParserException {
        if (a0Var.a() < 7) {
            if (z10) {
                return false;
            }
            throw ParserException.createForMalformedContainer("too short header: " + a0Var.a(), null);
        }
        if (a0Var.D() != i10) {
            if (z10) {
                return false;
            }
            throw ParserException.createForMalformedContainer("expected header type " + Integer.toHexString(i10), null);
        }
        if (a0Var.D() == 118 && a0Var.D() == 111 && a0Var.D() == 114 && a0Var.D() == 98 && a0Var.D() == 105 && a0Var.D() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw ParserException.createForMalformedContainer("expected characters 'vorbis'", null);
    }
}
