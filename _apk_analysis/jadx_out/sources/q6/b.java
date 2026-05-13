package q6;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import i6.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q6.a;
import s7.a0;
import s7.m0;
import s7.u;

/* JADX INFO: compiled from: AtomParsers.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f77834a = m0.h0("OpusHead");

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f77836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f77837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f77838d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f77839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a0 f77840f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a0 f77841g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f77842h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f77843i;

        public a(a0 a0Var, a0 a0Var2, boolean z10) throws ParserException {
            this.f77841g = a0Var;
            this.f77840f = a0Var2;
            this.f77839e = z10;
            a0Var2.P(12);
            this.f77835a = a0Var2.H();
            a0Var.P(12);
            this.f77843i = a0Var.H();
            i6.n.a(a0Var.n() == 1, "first_chunk must be 1");
            this.f77836b = -1;
        }

        public boolean a() {
            int i10 = this.f77836b + 1;
            this.f77836b = i10;
            if (i10 == this.f77835a) {
                return false;
            }
            this.f77838d = this.f77839e ? this.f77840f.I() : this.f77840f.F();
            if (this.f77836b == this.f77842h) {
                this.f77837c = this.f77841g.H();
                this.f77841g.Q(4);
                int i11 = this.f77843i - 1;
                this.f77843i = i11;
                this.f77842h = i11 > 0 ? this.f77841g.H() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: q6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class C0934b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f77845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f77846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f77847d;

        public C0934b(String str, byte[] bArr, long j10, long j11) {
            this.f77844a = str;
            this.f77845b = bArr;
            this.f77846c = j10;
            this.f77847d = j11;
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public interface c {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p[] f77848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public com.google.android.exoplayer2.m f77849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f77850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f77851d = 0;

        public d(int i10) {
            this.f77848a = new p[i10];
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a0 f77854c;

        public e(a.b bVar, com.google.android.exoplayer2.m mVar) {
            a0 a0Var = bVar.f77833b;
            this.f77854c = a0Var;
            a0Var.P(12);
            int iH = a0Var.H();
            if ("audio/raw".equals(mVar.f21751m)) {
                int iY = m0.Y(mVar.B, mVar.f21764z);
                if (iH == 0 || iH % iY != 0) {
                    s7.q.i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iY + ", stsz sample size: " + iH);
                    iH = iY;
                }
            }
            this.f77852a = iH == 0 ? -1 : iH;
            this.f77853b = a0Var.H();
        }

        @Override // q6.b.c
        public int getFixedSampleSize() {
            return this.f77852a;
        }

        @Override // q6.b.c
        public int getSampleCount() {
            return this.f77853b;
        }

        @Override // q6.b.c
        public int readNextSampleSize() {
            int i10 = this.f77852a;
            return i10 == -1 ? this.f77854c.H() : i10;
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0 f77855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f77857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f77858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f77859e;

        public f(a.b bVar) {
            a0 a0Var = bVar.f77833b;
            this.f77855a = a0Var;
            a0Var.P(12);
            this.f77857c = a0Var.H() & 255;
            this.f77856b = a0Var.H();
        }

        @Override // q6.b.c
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // q6.b.c
        public int getSampleCount() {
            return this.f77856b;
        }

        @Override // q6.b.c
        public int readNextSampleSize() {
            int i10 = this.f77857c;
            if (i10 == 8) {
                return this.f77855a.D();
            }
            if (i10 == 16) {
                return this.f77855a.J();
            }
            int i11 = this.f77858d;
            this.f77858d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f77859e & 15;
            }
            int iD = this.f77855a.D();
            this.f77859e = iD;
            return (iD & 240) >> 4;
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f77861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f77862c;

        public g(int i10, long j10, int i11) {
            this.f77860a = i10;
            this.f77861b = j10;
            this.f77862c = i11;
        }
    }

    public static List<r> A(a.C0933a c0933a, v vVar, long j10, @Nullable DrmInitData drmInitData, boolean z10, boolean z11, y7.e<o, o> eVar) throws ParserException {
        o oVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c0933a.f77832d.size(); i10++) {
            a.C0933a c0933a2 = c0933a.f77832d.get(i10);
            if (c0933a2.f77829a == 1953653099 && (oVarApply = eVar.apply(z(c0933a2, (a.b) s7.a.e(c0933a.g(1836476516)), j10, drmInitData, z10, z11))) != null) {
                arrayList.add(v(oVarApply, (a.C0933a) s7.a.e(((a.C0933a) s7.a.e(((a.C0933a) s7.a.e(c0933a2.f(1835297121))).f(1835626086))).f(1937007212)), vVar));
            }
        }
        return arrayList;
    }

    public static Pair<Metadata, Metadata> B(a.b bVar) {
        a0 a0Var = bVar.f77833b;
        a0Var.P(8);
        Metadata metadataC = null;
        Metadata metadataU = null;
        while (a0Var.a() >= 8) {
            int iE = a0Var.e();
            int iN = a0Var.n();
            int iN2 = a0Var.n();
            if (iN2 == 1835365473) {
                a0Var.P(iE);
                metadataC = C(a0Var, iE + iN);
            } else if (iN2 == 1936553057) {
                a0Var.P(iE);
                metadataU = u(a0Var, iE + iN);
            }
            a0Var.P(iE + iN);
        }
        return Pair.create(metadataC, metadataU);
    }

    @Nullable
    public static Metadata C(a0 a0Var, int i10) {
        a0Var.Q(8);
        e(a0Var);
        while (a0Var.e() < i10) {
            int iE = a0Var.e();
            int iN = a0Var.n();
            if (a0Var.n() == 1768715124) {
                a0Var.P(iE);
                return l(a0Var, iE + iN);
            }
            a0Var.P(iE + iN);
        }
        return null;
    }

    public static void D(a0 a0Var, int i10, int i11, int i12, int i13, int i14, @Nullable DrmInitData drmInitData, d dVar, int i15) throws ParserException {
        DrmInitData drmInitData2;
        int i16;
        int i17;
        byte[] bArr;
        float f10;
        List<byte[]> list;
        String str;
        int i18 = i11;
        int i19 = i12;
        DrmInitData drmInitDataC = drmInitData;
        d dVar2 = dVar;
        a0Var.P(i18 + 8 + 8);
        a0Var.Q(16);
        int iJ = a0Var.J();
        int iJ2 = a0Var.J();
        a0Var.Q(50);
        int iE = a0Var.e();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair<Integer, p> pairS = s(a0Var, i18, i19);
            if (pairS != null) {
                iIntValue = ((Integer) pairS.first).intValue();
                drmInitDataC = drmInitDataC == null ? null : drmInitDataC.c(((p) pairS.second).f77970b);
                dVar2.f77848a[i15] = (p) pairS.second;
            }
            a0Var.P(iE);
        }
        String str2 = "video/3gpp";
        String str3 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float fQ = 1.0f;
        byte[] bArrR = null;
        String str4 = null;
        List<byte[]> listOf = null;
        int i20 = -1;
        int iB = -1;
        int i21 = -1;
        int iC = -1;
        ByteBuffer byteBuffer = null;
        C0934b c0934bI = null;
        boolean z10 = false;
        while (true) {
            if (iE - i18 >= i19) {
                drmInitData2 = drmInitDataC;
                break;
            }
            a0Var.P(iE);
            int iE2 = a0Var.e();
            String str5 = str2;
            int iN = a0Var.n();
            if (iN == 0) {
                drmInitData2 = drmInitDataC;
                if (a0Var.e() - i18 == i19) {
                    break;
                }
            } else {
                drmInitData2 = drmInitDataC;
            }
            i6.n.a(iN > 0, "childAtomSize must be positive");
            int iN2 = a0Var.n();
            if (iN2 == 1635148611) {
                i6.n.a(str3 == null, null);
                a0Var.P(iE2 + 8);
                t7.a aVarB = t7.a.b(a0Var);
                listOf = aVarB.f85079a;
                dVar2.f77850c = aVarB.f85080b;
                if (!z10) {
                    fQ = aVarB.f85083e;
                }
                str4 = aVarB.f85084f;
                str = "video/avc";
            } else if (iN2 == 1752589123) {
                i6.n.a(str3 == null, null);
                a0Var.P(iE2 + 8);
                t7.f fVarA = t7.f.a(a0Var);
                listOf = fVarA.f85109a;
                dVar2.f77850c = fVarA.f85110b;
                if (!z10) {
                    fQ = fVarA.f85113e;
                }
                str4 = fVarA.f85114f;
                str = "video/hevc";
            } else {
                if (iN2 == 1685480259 || iN2 == 1685485123) {
                    i16 = iJ2;
                    i17 = iIntValue;
                    bArr = bArrR;
                    f10 = fQ;
                    list = listOf;
                    t7.d dVarA = t7.d.a(a0Var);
                    if (dVarA != null) {
                        str4 = dVarA.f85094c;
                        str3 = "video/dolby-vision";
                    }
                } else if (iN2 == 1987076931) {
                    i6.n.a(str3 == null, null);
                    str = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (iN2 == 1635135811) {
                    i6.n.a(str3 == null, null);
                    str = "video/av01";
                } else if (iN2 == 1668050025) {
                    ByteBuffer byteBufferA = byteBuffer == null ? a() : byteBuffer;
                    byteBufferA.position(21);
                    byteBufferA.putShort(a0Var.z());
                    byteBufferA.putShort(a0Var.z());
                    byteBuffer = byteBufferA;
                    i16 = iJ2;
                    i17 = iIntValue;
                    iE += iN;
                    i18 = i11;
                    i19 = i12;
                    dVar2 = dVar;
                    str2 = str5;
                    drmInitDataC = drmInitData2;
                    iIntValue = i17;
                    iJ2 = i16;
                } else if (iN2 == 1835295606) {
                    ByteBuffer byteBufferA2 = byteBuffer == null ? a() : byteBuffer;
                    short sZ = a0Var.z();
                    short sZ2 = a0Var.z();
                    short sZ3 = a0Var.z();
                    i17 = iIntValue;
                    short sZ4 = a0Var.z();
                    short sZ5 = a0Var.z();
                    List<byte[]> list2 = listOf;
                    short sZ6 = a0Var.z();
                    byte[] bArr2 = bArrR;
                    short sZ7 = a0Var.z();
                    float f11 = fQ;
                    short sZ8 = a0Var.z();
                    long jF = a0Var.F();
                    long jF2 = a0Var.F();
                    i16 = iJ2;
                    byteBufferA2.position(1);
                    byteBufferA2.putShort(sZ5);
                    byteBufferA2.putShort(sZ6);
                    byteBufferA2.putShort(sZ);
                    byteBufferA2.putShort(sZ2);
                    byteBufferA2.putShort(sZ3);
                    byteBufferA2.putShort(sZ4);
                    byteBufferA2.putShort(sZ7);
                    byteBufferA2.putShort(sZ8);
                    byteBufferA2.putShort((short) (jF / 10000));
                    byteBufferA2.putShort((short) (jF2 / 10000));
                    byteBuffer = byteBufferA2;
                    listOf = list2;
                    bArrR = bArr2;
                    fQ = f11;
                    iE += iN;
                    i18 = i11;
                    i19 = i12;
                    dVar2 = dVar;
                    str2 = str5;
                    drmInitDataC = drmInitData2;
                    iIntValue = i17;
                    iJ2 = i16;
                } else {
                    i16 = iJ2;
                    i17 = iIntValue;
                    bArr = bArrR;
                    f10 = fQ;
                    list = listOf;
                    if (iN2 == 1681012275) {
                        i6.n.a(str3 == null, null);
                        str3 = str5;
                    } else if (iN2 == 1702061171) {
                        i6.n.a(str3 == null, null);
                        c0934bI = i(a0Var, iE2);
                        String str6 = c0934bI.f77844a;
                        byte[] bArr3 = c0934bI.f77845b;
                        listOf = bArr3 != null ? ImmutableList.of(bArr3) : list;
                        str3 = str6;
                        bArrR = bArr;
                        fQ = f10;
                        iE += iN;
                        i18 = i11;
                        i19 = i12;
                        dVar2 = dVar;
                        str2 = str5;
                        drmInitDataC = drmInitData2;
                        iIntValue = i17;
                        iJ2 = i16;
                    } else if (iN2 == 1885434736) {
                        fQ = q(a0Var, iE2);
                        listOf = list;
                        bArrR = bArr;
                        z10 = true;
                        iE += iN;
                        i18 = i11;
                        i19 = i12;
                        dVar2 = dVar;
                        str2 = str5;
                        drmInitDataC = drmInitData2;
                        iIntValue = i17;
                        iJ2 = i16;
                    } else if (iN2 == 1937126244) {
                        bArrR = r(a0Var, iE2, iN);
                        listOf = list;
                        fQ = f10;
                        iE += iN;
                        i18 = i11;
                        i19 = i12;
                        dVar2 = dVar;
                        str2 = str5;
                        drmInitDataC = drmInitData2;
                        iIntValue = i17;
                        iJ2 = i16;
                    } else if (iN2 == 1936995172) {
                        int iD = a0Var.D();
                        a0Var.Q(3);
                        if (iD == 0) {
                            int iD2 = a0Var.D();
                            if (iD2 == 0) {
                                i20 = 0;
                            } else if (iD2 == 1) {
                                i20 = 1;
                            } else if (iD2 == 2) {
                                i20 = 2;
                            } else if (iD2 == 3) {
                                i20 = 3;
                            }
                        }
                    } else if (iN2 == 1668246642) {
                        int iN3 = a0Var.n();
                        if (iN3 == 1852009592 || iN3 == 1852009571) {
                            int iJ3 = a0Var.J();
                            int iJ4 = a0Var.J();
                            a0Var.Q(2);
                            boolean z11 = iN == 19 && (a0Var.D() & 128) != 0;
                            iB = t7.c.b(iJ3);
                            i21 = z11 ? 1 : 2;
                            iC = t7.c.c(iJ4);
                        } else {
                            s7.q.i("AtomParsers", "Unsupported color type: " + q6.a.a(iN3));
                        }
                    }
                }
                listOf = list;
                bArrR = bArr;
                fQ = f10;
                iE += iN;
                i18 = i11;
                i19 = i12;
                dVar2 = dVar;
                str2 = str5;
                drmInitDataC = drmInitData2;
                iIntValue = i17;
                iJ2 = i16;
            }
            str3 = str;
            i16 = iJ2;
            i17 = iIntValue;
            iE += iN;
            i18 = i11;
            i19 = i12;
            dVar2 = dVar;
            str2 = str5;
            drmInitDataC = drmInitData2;
            iIntValue = i17;
            iJ2 = i16;
        }
        int i22 = iJ2;
        byte[] bArr4 = bArrR;
        float f12 = fQ;
        List<byte[]> list3 = listOf;
        if (str3 == null) {
            return;
        }
        m.b bVarM = new m.b().R(i13).e0(str3).I(str4).j0(iJ).Q(i22).a0(f12).d0(i14).b0(bArr4).h0(i20).T(list3).M(drmInitData2);
        int i23 = iB;
        int i24 = i21;
        int i25 = iC;
        if (i23 != -1 || i24 != -1 || i25 != -1 || byteBuffer != null) {
            bVarM.J(new t7.c(i23, i24, i25, byteBuffer != null ? byteBuffer.array() : null));
        }
        if (c0934bI != null) {
            bVarM.G(Ints.m(c0934bI.f77846c)).Z(Ints.m(c0934bI.f77847d));
        }
        dVar.f77849b = bVarM.E();
    }

    public static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[m0.p(4, 0, length)] && jArr[m0.p(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    public static int c(a0 a0Var, int i10, int i11, int i12) throws ParserException {
        int iE = a0Var.e();
        i6.n.a(iE >= i11, null);
        while (iE - i11 < i12) {
            a0Var.P(iE);
            int iN = a0Var.n();
            i6.n.a(iN > 0, "childAtomSize must be positive");
            if (a0Var.n() == i10) {
                return iE;
            }
            iE += iN;
        }
        return -1;
    }

    public static int d(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void e(a0 a0Var) {
        int iE = a0Var.e();
        a0Var.Q(4);
        if (a0Var.n() != 1751411826) {
            iE += 4;
        }
        a0Var.P(iE);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(s7.a0 r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r29, q6.b.d r30, int r31) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.b.f(s7.a0, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData, q6.b$d, int):void");
    }

    @Nullable
    public static Pair<Integer, p> g(a0 a0Var, int i10, int i11) throws ParserException {
        int i12 = i10 + 8;
        int i13 = -1;
        String strA = null;
        Integer numValueOf = null;
        int i14 = 0;
        while (i12 - i10 < i11) {
            a0Var.P(i12);
            int iN = a0Var.n();
            int iN2 = a0Var.n();
            if (iN2 == 1718775137) {
                numValueOf = Integer.valueOf(a0Var.n());
            } else if (iN2 == 1935894637) {
                a0Var.Q(4);
                strA = a0Var.A(4);
            } else if (iN2 == 1935894633) {
                i13 = i12;
                i14 = iN;
            }
            i12 += iN;
        }
        if (!"cenc".equals(strA) && !"cbc1".equals(strA) && !"cens".equals(strA) && !"cbcs".equals(strA)) {
            return null;
        }
        i6.n.a(numValueOf != null, "frma atom is mandatory");
        i6.n.a(i13 != -1, "schi atom is mandatory");
        p pVarT = t(a0Var, i13, i14, strA);
        i6.n.a(pVarT != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (p) m0.j(pVarT));
    }

    @Nullable
    public static Pair<long[], long[]> h(a.C0933a c0933a) {
        a.b bVarG = c0933a.g(1701606260);
        if (bVarG == null) {
            return null;
        }
        a0 a0Var = bVarG.f77833b;
        a0Var.P(8);
        int iC = q6.a.c(a0Var.n());
        int iH = a0Var.H();
        long[] jArr = new long[iH];
        long[] jArr2 = new long[iH];
        for (int i10 = 0; i10 < iH; i10++) {
            jArr[i10] = iC == 1 ? a0Var.I() : a0Var.F();
            jArr2[i10] = iC == 1 ? a0Var.w() : a0Var.n();
            if (a0Var.z() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            a0Var.Q(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static C0934b i(a0 a0Var, int i10) {
        a0Var.P(i10 + 8 + 4);
        a0Var.Q(1);
        j(a0Var);
        a0Var.Q(2);
        int iD = a0Var.D();
        if ((iD & 128) != 0) {
            a0Var.Q(2);
        }
        if ((iD & 64) != 0) {
            a0Var.Q(a0Var.D());
        }
        if ((iD & 32) != 0) {
            a0Var.Q(2);
        }
        a0Var.Q(1);
        j(a0Var);
        String strF = u.f(a0Var.D());
        if ("audio/mpeg".equals(strF) || "audio/vnd.dts".equals(strF) || "audio/vnd.dts.hd".equals(strF)) {
            return new C0934b(strF, null, -1L, -1L);
        }
        a0Var.Q(4);
        long jF = a0Var.F();
        long jF2 = a0Var.F();
        a0Var.Q(1);
        int iJ = j(a0Var);
        byte[] bArr = new byte[iJ];
        a0Var.j(bArr, 0, iJ);
        return new C0934b(strF, bArr, jF2 > 0 ? jF2 : -1L, jF > 0 ? jF : -1L);
    }

    public static int j(a0 a0Var) {
        int iD = a0Var.D();
        int i10 = iD & 127;
        while ((iD & 128) == 128) {
            iD = a0Var.D();
            i10 = (i10 << 7) | (iD & 127);
        }
        return i10;
    }

    public static int k(a0 a0Var) {
        a0Var.P(16);
        return a0Var.n();
    }

    @Nullable
    public static Metadata l(a0 a0Var, int i10) {
        a0Var.Q(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var.e() < i10) {
            Metadata.Entry entryC = h.c(a0Var);
            if (entryC != null) {
                arrayList.add(entryC);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Pair<Long, String> m(a0 a0Var) {
        a0Var.P(8);
        int iC = q6.a.c(a0Var.n());
        a0Var.Q(iC == 0 ? 8 : 16);
        long jF = a0Var.F();
        a0Var.Q(iC == 0 ? 4 : 8);
        int iJ = a0Var.J();
        return Pair.create(Long.valueOf(jF), "" + ((char) (((iJ >> 10) & 31) + 96)) + ((char) (((iJ >> 5) & 31) + 96)) + ((char) ((iJ & 31) + 96)));
    }

    @Nullable
    public static Metadata n(a.C0933a c0933a) {
        a.b bVarG = c0933a.g(1751411826);
        a.b bVarG2 = c0933a.g(1801812339);
        a.b bVarG3 = c0933a.g(1768715124);
        if (bVarG == null || bVarG2 == null || bVarG3 == null || k(bVarG.f77833b) != 1835299937) {
            return null;
        }
        a0 a0Var = bVarG2.f77833b;
        a0Var.P(12);
        int iN = a0Var.n();
        String[] strArr = new String[iN];
        for (int i10 = 0; i10 < iN; i10++) {
            int iN2 = a0Var.n();
            a0Var.Q(4);
            strArr[i10] = a0Var.A(iN2 - 8);
        }
        a0 a0Var2 = bVarG3.f77833b;
        a0Var2.P(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var2.a() > 8) {
            int iE = a0Var2.e();
            int iN3 = a0Var2.n();
            int iN4 = a0Var2.n() - 1;
            if (iN4 < 0 || iN4 >= iN) {
                s7.q.i("AtomParsers", "Skipped metadata with unknown key index: " + iN4);
            } else {
                MdtaMetadataEntry mdtaMetadataEntryF = h.f(a0Var2, iE + iN3, strArr[iN4]);
                if (mdtaMetadataEntryF != null) {
                    arrayList.add(mdtaMetadataEntryF);
                }
            }
            a0Var2.P(iE + iN3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static void o(a0 a0Var, int i10, int i11, int i12, d dVar) {
        a0Var.P(i11 + 8 + 8);
        if (i10 == 1835365492) {
            a0Var.x();
            String strX = a0Var.x();
            if (strX != null) {
                dVar.f77849b = new m.b().R(i12).e0(strX).E();
            }
        }
    }

    public static long p(a0 a0Var) {
        a0Var.P(8);
        a0Var.Q(q6.a.c(a0Var.n()) != 0 ? 16 : 8);
        return a0Var.F();
    }

    public static float q(a0 a0Var, int i10) {
        a0Var.P(i10 + 8);
        return a0Var.H() / a0Var.H();
    }

    @Nullable
    public static byte[] r(a0 a0Var, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            a0Var.P(i12);
            int iN = a0Var.n();
            if (a0Var.n() == 1886547818) {
                return Arrays.copyOfRange(a0Var.d(), i12, iN + i12);
            }
            i12 += iN;
        }
        return null;
    }

    @Nullable
    public static Pair<Integer, p> s(a0 a0Var, int i10, int i11) throws ParserException {
        Pair<Integer, p> pairG;
        int iE = a0Var.e();
        while (iE - i10 < i11) {
            a0Var.P(iE);
            int iN = a0Var.n();
            i6.n.a(iN > 0, "childAtomSize must be positive");
            if (a0Var.n() == 1936289382 && (pairG = g(a0Var, iE, iN)) != null) {
                return pairG;
            }
            iE += iN;
        }
        return null;
    }

    @Nullable
    public static p t(a0 a0Var, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            a0Var.P(i14);
            int iN = a0Var.n();
            if (a0Var.n() == 1952804451) {
                int iC = q6.a.c(a0Var.n());
                a0Var.Q(1);
                if (iC == 0) {
                    a0Var.Q(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int iD = a0Var.D();
                    i12 = iD & 15;
                    i13 = (iD & 240) >> 4;
                }
                boolean z10 = a0Var.D() == 1;
                int iD2 = a0Var.D();
                byte[] bArr2 = new byte[16];
                a0Var.j(bArr2, 0, 16);
                if (z10 && iD2 == 0) {
                    int iD3 = a0Var.D();
                    bArr = new byte[iD3];
                    a0Var.j(bArr, 0, iD3);
                }
                return new p(z10, str, iD2, bArr2, i13, i12, bArr);
            }
            i14 += iN;
        }
    }

    @Nullable
    public static Metadata u(a0 a0Var, int i10) {
        a0Var.Q(12);
        while (a0Var.e() < i10) {
            int iE = a0Var.e();
            int iN = a0Var.n();
            if (a0Var.n() == 1935766900) {
                if (iN < 14) {
                    return null;
                }
                a0Var.Q(5);
                int iD = a0Var.D();
                if (iD != 12 && iD != 13) {
                    return null;
                }
                float f10 = iD == 12 ? 240.0f : 120.0f;
                a0Var.Q(1);
                return new Metadata(new SmtaMetadataEntry(f10, a0Var.D()));
            }
            a0Var.P(iE + iN);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0426 A[EDGE_INSN: B:210:0x0426->B:169:0x0426 BREAK  A[LOOP:2: B:152:0x03c5->B:168:0x041f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q6.r v(q6.o r38, q6.a.C0933a r39, i6.v r40) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instruction units count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.b.v(q6.o, q6.a$a, i6.v):q6.r");
    }

    public static d w(a0 a0Var, int i10, int i11, String str, @Nullable DrmInitData drmInitData, boolean z10) throws ParserException {
        int i12;
        a0Var.P(12);
        int iN = a0Var.n();
        d dVar = new d(iN);
        for (int i13 = 0; i13 < iN; i13++) {
            int iE = a0Var.e();
            int iN2 = a0Var.n();
            i6.n.a(iN2 > 0, "childAtomSize must be positive");
            int iN3 = a0Var.n();
            if (iN3 == 1635148593 || iN3 == 1635148595 || iN3 == 1701733238 || iN3 == 1831958048 || iN3 == 1836070006 || iN3 == 1752589105 || iN3 == 1751479857 || iN3 == 1932670515 || iN3 == 1211250227 || iN3 == 1987063864 || iN3 == 1987063865 || iN3 == 1635135537 || iN3 == 1685479798 || iN3 == 1685479729 || iN3 == 1685481573 || iN3 == 1685481521) {
                i12 = iE;
                D(a0Var, iN3, i12, iN2, i10, i11, drmInitData, dVar, i13);
            } else if (iN3 == 1836069985 || iN3 == 1701733217 || iN3 == 1633889587 || iN3 == 1700998451 || iN3 == 1633889588 || iN3 == 1835823201 || iN3 == 1685353315 || iN3 == 1685353317 || iN3 == 1685353320 || iN3 == 1685353324 || iN3 == 1685353336 || iN3 == 1935764850 || iN3 == 1935767394 || iN3 == 1819304813 || iN3 == 1936684916 || iN3 == 1953984371 || iN3 == 778924082 || iN3 == 778924083 || iN3 == 1835557169 || iN3 == 1835560241 || iN3 == 1634492771 || iN3 == 1634492791 || iN3 == 1970037111 || iN3 == 1332770163 || iN3 == 1716281667) {
                i12 = iE;
                f(a0Var, iN3, iE, iN2, i10, str, z10, drmInitData, dVar, i13);
            } else {
                if (iN3 == 1414810956 || iN3 == 1954034535 || iN3 == 2004251764 || iN3 == 1937010800 || iN3 == 1664495672) {
                    x(a0Var, iN3, iE, iN2, i10, str, dVar);
                } else if (iN3 == 1835365492) {
                    o(a0Var, iN3, iE, i10, dVar);
                } else if (iN3 == 1667329389) {
                    dVar.f77849b = new m.b().R(i10).e0("application/x-camera-motion").E();
                }
                i12 = iE;
            }
            a0Var.P(i12 + iN2);
        }
        return dVar;
    }

    public static void x(a0 a0Var, int i10, int i11, int i12, int i13, String str, d dVar) {
        a0Var.P(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        ImmutableList immutableListOf = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                a0Var.j(bArr, 0, i14);
                immutableListOf = ImmutableList.of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                dVar.f77851d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        dVar.f77849b = new m.b().R(i13).e0(str2).V(str).i0(j10).T(immutableListOf).E();
    }

    public static g y(a0 a0Var) {
        boolean z10;
        a0Var.P(8);
        int iC = q6.a.c(a0Var.n());
        a0Var.Q(iC == 0 ? 8 : 16);
        int iN = a0Var.n();
        a0Var.Q(4);
        int iE = a0Var.e();
        int i10 = iC == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            }
            if (a0Var.d()[iE + i12] != -1) {
                z10 = false;
                break;
            }
            i12++;
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            a0Var.Q(i10);
        } else {
            long jF = iC == 0 ? a0Var.F() : a0Var.I();
            if (jF != 0) {
                j10 = jF;
            }
        }
        a0Var.Q(16);
        int iN2 = a0Var.n();
        int iN3 = a0Var.n();
        a0Var.Q(4);
        int iN4 = a0Var.n();
        int iN5 = a0Var.n();
        if (iN2 == 0 && iN3 == 65536 && iN4 == -65536 && iN5 == 0) {
            i11 = 90;
        } else if (iN2 == 0 && iN3 == -65536 && iN4 == 65536 && iN5 == 0) {
            i11 = 270;
        } else if (iN2 == -65536 && iN3 == 0 && iN4 == 0 && iN5 == -65536) {
            i11 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
        }
        return new g(iN, j10, i11);
    }

    @Nullable
    public static o z(a.C0933a c0933a, a.b bVar, long j10, @Nullable DrmInitData drmInitData, boolean z10, boolean z11) throws ParserException {
        a.b bVar2;
        long j11;
        long[] jArr;
        long[] jArr2;
        a.C0933a c0933aF;
        Pair<long[], long[]> pairH;
        a.C0933a c0933a2 = (a.C0933a) s7.a.e(c0933a.f(1835297121));
        int iD = d(k(((a.b) s7.a.e(c0933a2.g(1751411826))).f77833b));
        if (iD == -1) {
            return null;
        }
        g gVarY = y(((a.b) s7.a.e(c0933a.g(1953196132))).f77833b);
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = gVarY.f77861b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long jP = p(bVar2.f77833b);
        long jF0 = j11 != -9223372036854775807L ? m0.F0(j11, 1000000L, jP) : -9223372036854775807L;
        a.C0933a c0933a3 = (a.C0933a) s7.a.e(((a.C0933a) s7.a.e(c0933a2.f(1835626086))).f(1937007212));
        Pair<Long, String> pairM = m(((a.b) s7.a.e(c0933a2.g(1835296868))).f77833b);
        d dVarW = w(((a.b) s7.a.e(c0933a3.g(1937011556))).f77833b, gVarY.f77860a, gVarY.f77862c, (String) pairM.second, drmInitData, z11);
        if (z10 || (c0933aF = c0933a.f(1701082227)) == null || (pairH = h(c0933aF)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairH.first;
            jArr2 = (long[]) pairH.second;
            jArr = jArr3;
        }
        if (dVarW.f77849b == null) {
            return null;
        }
        return new o(gVarY.f77860a, iD, ((Long) pairM.first).longValue(), jP, jF0, dVarW.f77849b, dVarW.f77851d, dVarW.f77848a, dVarW.f77850c, jArr, jArr2);
    }
}
