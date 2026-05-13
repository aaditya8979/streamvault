package z6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import s7.a0;
import s7.m0;
import s7.q;
import s7.z;
import v6.c;
import v6.e;

/* JADX INFO: compiled from: Id3Decoder.java */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f98242b = new a() { // from class: z6.a
        @Override // z6.b.a
        public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            return b.z(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final a f98243a;

    /* JADX INFO: compiled from: Id3Decoder.java */
    public interface a {
        boolean evaluate(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: renamed from: z6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Id3Decoder.java */
    public static final class C1117b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f98244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f98245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f98246c;

        public C1117b(int i10, boolean z10, int i11) {
            this.f98244a = i10;
            this.f98245b = z10;
            this.f98246c = i11;
        }
    }

    public b() {
        this(null);
    }

    public b(@Nullable a aVar) {
        this.f98243a = aVar;
    }

    public static int A(a0 a0Var, int i10) {
        byte[] bArrD = a0Var.d();
        int iE = a0Var.e();
        int i11 = iE;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iE + i10) {
                return i10;
            }
            if ((bArrD[i11] & 255) == 255 && bArrD[i12] == 0) {
                System.arraycopy(bArrD, i11 + 2, bArrD, i12, (i10 - (i11 - iE)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[PHI: r3
      0x0079: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:40:0x0086, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean B(s7.a0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.e()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.n()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.F()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.J()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.G()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.G()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.P(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.P(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = r4
            goto L74
        L73:
            r3 = r6
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = r6
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L98
            r1.P(r2)
            return r6
        L98:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.P(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.Q(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.P(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.P(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.b.B(s7.a0, int, int, boolean):boolean");
    }

    public static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? m0.f79492f : Arrays.copyOfRange(bArr, i10, i11);
    }

    public static ApicFrame f(a0 a0Var, int i10, int i11) throws UnsupportedEncodingException {
        int iY;
        String str;
        int iD = a0Var.D();
        String strV = v(iD);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        a0Var.j(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + y7.a.e(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iY = 2;
        } else {
            iY = y(bArr, 0);
            String strE = y7.a.e(new String(bArr, 0, iY, "ISO-8859-1"));
            if (strE.indexOf(47) == -1) {
                str = "image/" + strE;
            } else {
                str = strE;
            }
        }
        int i13 = bArr[iY + 1] & 255;
        int i14 = iY + 2;
        int iX = x(bArr, i14, iD);
        return new ApicFrame(str, new String(bArr, i14, iX - i14, strV), i13, d(bArr, iX + u(iD), i12));
    }

    public static BinaryFrame g(a0 a0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        a0Var.j(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterFrame h(a0 a0Var, int i10, int i11, boolean z10, int i12, @Nullable a aVar) throws UnsupportedEncodingException {
        int iE = a0Var.e();
        int iY = y(a0Var.d(), iE);
        String str = new String(a0Var.d(), iE, iY - iE, "ISO-8859-1");
        a0Var.P(iY + 1);
        int iN = a0Var.n();
        int iN2 = a0Var.n();
        long jF = a0Var.F();
        long j10 = jF == 4294967295L ? -1L : jF;
        long jF2 = a0Var.F();
        long j11 = jF2 == 4294967295L ? -1L : jF2;
        ArrayList arrayList = new ArrayList();
        int i13 = iE + i10;
        while (a0Var.e() < i13) {
            Id3Frame id3FrameK = k(i11, a0Var, z10, i12, aVar);
            if (id3FrameK != null) {
                arrayList.add(id3FrameK);
            }
        }
        return new ChapterFrame(str, iN, iN2, j10, j11, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame i(a0 a0Var, int i10, int i11, boolean z10, int i12, @Nullable a aVar) throws UnsupportedEncodingException {
        int iE = a0Var.e();
        int iY = y(a0Var.d(), iE);
        String str = new String(a0Var.d(), iE, iY - iE, "ISO-8859-1");
        a0Var.P(iY + 1);
        int iD = a0Var.D();
        boolean z11 = (iD & 2) != 0;
        boolean z12 = (iD & 1) != 0;
        int iD2 = a0Var.D();
        String[] strArr = new String[iD2];
        for (int i13 = 0; i13 < iD2; i13++) {
            int iE2 = a0Var.e();
            int iY2 = y(a0Var.d(), iE2);
            strArr[i13] = new String(a0Var.d(), iE2, iY2 - iE2, "ISO-8859-1");
            a0Var.P(iY2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iE + i10;
        while (a0Var.e() < i14) {
            Id3Frame id3FrameK = k(i11, a0Var, z10, i12, aVar);
            if (id3FrameK != null) {
                arrayList.add(id3FrameK);
            }
        }
        return new ChapterTocFrame(str, z11, z12, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @Nullable
    public static CommentFrame j(a0 a0Var, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int iD = a0Var.D();
        String strV = v(iD);
        byte[] bArr = new byte[3];
        a0Var.j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        a0Var.j(bArr2, 0, i11);
        int iX = x(bArr2, 0, iD);
        String str2 = new String(bArr2, 0, iX, strV);
        int iU = iX + u(iD);
        return new CommentFrame(str, str2, p(bArr2, iU, x(bArr2, iU, iD), strV));
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ea A[Catch: all -> 0x012e, UnsupportedEncodingException -> 0x0218, TryCatch #0 {UnsupportedEncodingException -> 0x0218, blocks: (B:91:0x011c, B:159:0x01f4, B:93:0x0124, B:102:0x013d, B:104:0x0145, B:112:0x015f, B:121:0x0177, B:132:0x0192, B:139:0x01a4, B:145:0x01b3, B:150:0x01cb, B:156:0x01e5, B:157:0x01ea), top: B:169:0x0112, outer: #1 }] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame k(int r19, s7.a0 r20, boolean r21, int r22, @androidx.annotation.Nullable z6.b.a r23) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.b.k(int, s7.a0, boolean, int, z6.b$a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    public static GeobFrame l(a0 a0Var, int i10) throws UnsupportedEncodingException {
        int iD = a0Var.D();
        String strV = v(iD);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.j(bArr, 0, i11);
        int iY = y(bArr, 0);
        String str = new String(bArr, 0, iY, "ISO-8859-1");
        int i12 = iY + 1;
        int iX = x(bArr, i12, iD);
        String strP = p(bArr, i12, iX, strV);
        int iU = iX + u(iD);
        int iX2 = x(bArr, iU, iD);
        return new GeobFrame(str, strP, p(bArr, iU, iX2, strV), d(bArr, iX2 + u(iD), i11));
    }

    @Nullable
    public static C1117b m(a0 a0Var) {
        if (a0Var.a() < 10) {
            q.i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iG = a0Var.G();
        boolean z10 = false;
        if (iG != 4801587) {
            q.i("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iG)));
            return null;
        }
        int iD = a0Var.D();
        a0Var.Q(1);
        int iD2 = a0Var.D();
        int iC = a0Var.C();
        if (iD == 2) {
            if ((iD2 & 64) != 0) {
                q.i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iD == 3) {
            if ((iD2 & 64) != 0) {
                int iN = a0Var.n();
                a0Var.Q(iN);
                iC -= iN + 4;
            }
        } else {
            if (iD != 4) {
                q.i("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iD);
                return null;
            }
            if ((iD2 & 64) != 0) {
                int iC2 = a0Var.C();
                a0Var.Q(iC2 - 4);
                iC -= iC2;
            }
            if ((iD2 & 16) != 0) {
                iC -= 10;
            }
        }
        if (iD < 4 && (iD2 & 128) != 0) {
            z10 = true;
        }
        return new C1117b(iD, z10, iC);
    }

    public static MlltFrame n(a0 a0Var, int i10) {
        int iJ = a0Var.J();
        int iG = a0Var.G();
        int iG2 = a0Var.G();
        int iD = a0Var.D();
        int iD2 = a0Var.D();
        z zVar = new z();
        zVar.m(a0Var);
        int i11 = ((i10 - 10) * 8) / (iD + iD2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH = zVar.h(iD);
            int iH2 = zVar.h(iD2);
            iArr[i12] = iH;
            iArr2[i12] = iH2;
        }
        return new MlltFrame(iJ, iG, iG2, iArr, iArr2);
    }

    public static PrivFrame o(a0 a0Var, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        a0Var.j(bArr, 0, i10);
        int iY = y(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iY, "ISO-8859-1"), d(bArr, iY + 1, i10));
    }

    public static String p(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    @Nullable
    public static TextInformationFrame q(a0 a0Var, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iD = a0Var.D();
        String strV = v(iD);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.j(bArr, 0, i11);
        return new TextInformationFrame(str, null, new String(bArr, 0, x(bArr, 0, iD), strV));
    }

    @Nullable
    public static TextInformationFrame r(a0 a0Var, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iD = a0Var.D();
        String strV = v(iD);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.j(bArr, 0, i11);
        int iX = x(bArr, 0, iD);
        String str = new String(bArr, 0, iX, strV);
        int iU = iX + u(iD);
        return new TextInformationFrame("TXXX", str, p(bArr, iU, x(bArr, iU, iD), strV));
    }

    public static UrlLinkFrame s(a0 a0Var, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        a0Var.j(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, y(bArr, 0), "ISO-8859-1"));
    }

    @Nullable
    public static UrlLinkFrame t(a0 a0Var, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iD = a0Var.D();
        String strV = v(iD);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.j(bArr, 0, i11);
        int iX = x(bArr, 0, iD);
        String str = new String(bArr, 0, iX, strV);
        int iU = iX + u(iD);
        return new UrlLinkFrame("WXXX", str, p(bArr, iU, y(bArr, iU), "ISO-8859-1"));
    }

    public static int u(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static String v(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : C.UTF16_NAME;
    }

    public static String w(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int x(byte[] bArr, int i10, int i11) {
        int iY = y(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iY;
        }
        while (iY < bArr.length - 1) {
            if ((iY - i10) % 2 == 0 && bArr[iY + 1] == 0) {
                return iY;
            }
            iY = y(bArr, iY + 1);
        }
        return bArr.length;
    }

    public static int y(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static /* synthetic */ boolean z(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // v6.e
    @Nullable
    public Metadata b(c cVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    @Nullable
    public Metadata e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        a0 a0Var = new a0(bArr, i10);
        C1117b c1117bM = m(a0Var);
        if (c1117bM == null) {
            return null;
        }
        int iE = a0Var.e();
        int i11 = c1117bM.f98244a == 2 ? 6 : 10;
        int iA = c1117bM.f98246c;
        if (c1117bM.f98245b) {
            iA = A(a0Var, c1117bM.f98246c);
        }
        a0Var.O(iE + iA);
        boolean z10 = false;
        if (!B(a0Var, c1117bM.f98244a, i11, false)) {
            if (c1117bM.f98244a != 4 || !B(a0Var, 4, i11, true)) {
                q.i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + c1117bM.f98244a);
                return null;
            }
            z10 = true;
        }
        while (a0Var.a() >= i11) {
            Id3Frame id3FrameK = k(c1117bM.f98244a, a0Var, z10, i11, this.f98243a);
            if (id3FrameK != null) {
                arrayList.add(id3FrameK);
            }
        }
        return new Metadata(arrayList);
    }
}
