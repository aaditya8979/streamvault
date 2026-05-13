package z4;

import a6.k0;
import a6.m;
import a6.s;
import a6.t;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.metadata.id3.ApicFrame;
import com.google.android.exoplayer.metadata.id3.BinaryFrame;
import com.google.android.exoplayer.metadata.id3.ChapterFrame;
import com.google.android.exoplayer.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer.metadata.id3.CommentFrame;
import com.google.android.exoplayer.metadata.id3.GeobFrame;
import com.google.android.exoplayer.metadata.id3.Id3Frame;
import com.google.android.exoplayer.metadata.id3.MlltFrame;
import com.google.android.exoplayer.metadata.id3.PrivFrame;
import com.google.android.exoplayer.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer.metadata.id3.UrlLinkFrame;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import w4.c;

/* JADX INFO: compiled from: Id3Decoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements w4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f98192b = new a() { // from class: z4.a
        @Override // z4.b.a
        public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            return b.y(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final a f98193a;

    /* JADX INFO: compiled from: Id3Decoder.java */
    public interface a {
        boolean evaluate(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: renamed from: z4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Id3Decoder.java */
    public static final class C1116b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f98194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f98195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f98196c;

        public C1116b(int i10, boolean z10, int i11) {
            this.f98194a = i10;
            this.f98195b = z10;
            this.f98196c = i11;
        }
    }

    public b() {
        this(null);
    }

    public b(@Nullable a aVar) {
        this.f98193a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[PHI: r3
      0x0079: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:40:0x0086, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A(a6.t r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.c()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.j()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.A()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.E()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.B()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.B()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.L(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.L(r2)
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
            r1.L(r2)
            return r6
        L98:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.L(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.M(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.L(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.L(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.b.A(a6.t, int, int, boolean):boolean");
    }

    public static byte[] c(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? k0.f3579f : Arrays.copyOfRange(bArr, i10, i11);
    }

    public static ApicFrame e(t tVar, int i10, int i11) throws UnsupportedEncodingException {
        int iX;
        String str;
        int iY = tVar.y();
        String strU = u(iY);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        tVar.h(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + k0.K0(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iX = 2;
        } else {
            iX = x(bArr, 0);
            String strK0 = k0.K0(new String(bArr, 0, iX, "ISO-8859-1"));
            if (strK0.indexOf(47) == -1) {
                str = "image/" + strK0;
            } else {
                str = strK0;
            }
        }
        int i13 = bArr[iX + 1] & 255;
        int i14 = iX + 2;
        int iW = w(bArr, i14, iY);
        return new ApicFrame(str, new String(bArr, i14, iW - i14, strU), i13, c(bArr, iW + t(iY), i12));
    }

    public static BinaryFrame f(t tVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        tVar.h(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterFrame g(t tVar, int i10, int i11, boolean z10, int i12, @Nullable a aVar) throws UnsupportedEncodingException {
        int iC = tVar.c();
        int iX = x(tVar.f3620a, iC);
        String str = new String(tVar.f3620a, iC, iX - iC, "ISO-8859-1");
        tVar.L(iX + 1);
        int iJ = tVar.j();
        int iJ2 = tVar.j();
        long jA = tVar.A();
        long j10 = jA == 4294967295L ? -1L : jA;
        long jA2 = tVar.A();
        long j11 = jA2 == 4294967295L ? -1L : jA2;
        ArrayList arrayList = new ArrayList();
        int i13 = iC + i10;
        while (tVar.c() < i13) {
            Id3Frame id3FrameJ = j(i11, tVar, z10, i12, aVar);
            if (id3FrameJ != null) {
                arrayList.add(id3FrameJ);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, iJ, iJ2, j10, j11, id3FrameArr);
    }

    public static ChapterTocFrame h(t tVar, int i10, int i11, boolean z10, int i12, @Nullable a aVar) throws UnsupportedEncodingException {
        int iC = tVar.c();
        int iX = x(tVar.f3620a, iC);
        String str = new String(tVar.f3620a, iC, iX - iC, "ISO-8859-1");
        tVar.L(iX + 1);
        int iY = tVar.y();
        boolean z11 = (iY & 2) != 0;
        boolean z12 = (iY & 1) != 0;
        int iY2 = tVar.y();
        String[] strArr = new String[iY2];
        for (int i13 = 0; i13 < iY2; i13++) {
            int iC2 = tVar.c();
            int iX2 = x(tVar.f3620a, iC2);
            strArr[i13] = new String(tVar.f3620a, iC2, iX2 - iC2, "ISO-8859-1");
            tVar.L(iX2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iC + i10;
        while (tVar.c() < i14) {
            Id3Frame id3FrameJ = j(i11, tVar, z10, i12, aVar);
            if (id3FrameJ != null) {
                arrayList.add(id3FrameJ);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z11, z12, strArr, id3FrameArr);
    }

    @Nullable
    public static CommentFrame i(t tVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int iY = tVar.y();
        String strU = u(iY);
        byte[] bArr = new byte[3];
        tVar.h(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        tVar.h(bArr2, 0, i11);
        int iW = w(bArr2, 0, iY);
        String str2 = new String(bArr2, 0, iW, strU);
        int iT = iW + t(iY);
        return new CommentFrame(str, str2, o(bArr2, iT, w(bArr2, iT, iY), strU));
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
    public static com.google.android.exoplayer.metadata.id3.Id3Frame j(int r19, a6.t r20, boolean r21, int r22, @androidx.annotation.Nullable z4.b.a r23) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.b.j(int, a6.t, boolean, int, z4.b$a):com.google.android.exoplayer.metadata.id3.Id3Frame");
    }

    public static GeobFrame k(t tVar, int i10) throws UnsupportedEncodingException {
        int iY = tVar.y();
        String strU = u(iY);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        tVar.h(bArr, 0, i11);
        int iX = x(bArr, 0);
        String str = new String(bArr, 0, iX, "ISO-8859-1");
        int i12 = iX + 1;
        int iW = w(bArr, i12, iY);
        String strO = o(bArr, i12, iW, strU);
        int iT = iW + t(iY);
        int iW2 = w(bArr, iT, iY);
        return new GeobFrame(str, strO, o(bArr, iT, iW2, strU), c(bArr, iW2 + t(iY), i11));
    }

    @Nullable
    public static C1116b l(t tVar) {
        if (tVar.a() < 10) {
            m.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iB = tVar.B();
        boolean z10 = false;
        if (iB != 4801587) {
            m.h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iB)));
            return null;
        }
        int iY = tVar.y();
        tVar.M(1);
        int iY2 = tVar.y();
        int iX = tVar.x();
        if (iY == 2) {
            if ((iY2 & 64) != 0) {
                m.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iY == 3) {
            if ((iY2 & 64) != 0) {
                int iJ = tVar.j();
                tVar.M(iJ);
                iX -= iJ + 4;
            }
        } else {
            if (iY != 4) {
                m.h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iY);
                return null;
            }
            if ((iY2 & 64) != 0) {
                int iX2 = tVar.x();
                tVar.M(iX2 - 4);
                iX -= iX2;
            }
            if ((iY2 & 16) != 0) {
                iX -= 10;
            }
        }
        if (iY < 4 && (iY2 & 128) != 0) {
            z10 = true;
        }
        return new C1116b(iY, z10, iX);
    }

    public static MlltFrame m(t tVar, int i10) {
        int iE = tVar.E();
        int iB = tVar.B();
        int iB2 = tVar.B();
        int iY = tVar.y();
        int iY2 = tVar.y();
        s sVar = new s();
        sVar.l(tVar);
        int i11 = ((i10 - 10) * 8) / (iY + iY2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH = sVar.h(iY);
            int iH2 = sVar.h(iY2);
            iArr[i12] = iH;
            iArr2[i12] = iH2;
        }
        return new MlltFrame(iE, iB, iB2, iArr, iArr2);
    }

    public static PrivFrame n(t tVar, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        tVar.h(bArr, 0, i10);
        int iX = x(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iX, "ISO-8859-1"), c(bArr, iX + 1, i10));
    }

    public static String o(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    @Nullable
    public static TextInformationFrame p(t tVar, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iY = tVar.y();
        String strU = u(iY);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        tVar.h(bArr, 0, i11);
        return new TextInformationFrame(str, null, new String(bArr, 0, w(bArr, 0, iY), strU));
    }

    @Nullable
    public static TextInformationFrame q(t tVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iY = tVar.y();
        String strU = u(iY);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        tVar.h(bArr, 0, i11);
        int iW = w(bArr, 0, iY);
        String str = new String(bArr, 0, iW, strU);
        int iT = iW + t(iY);
        return new TextInformationFrame("TXXX", str, o(bArr, iT, w(bArr, iT, iY), strU));
    }

    public static UrlLinkFrame r(t tVar, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        tVar.h(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, x(bArr, 0), "ISO-8859-1"));
    }

    @Nullable
    public static UrlLinkFrame s(t tVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iY = tVar.y();
        String strU = u(iY);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        tVar.h(bArr, 0, i11);
        int iW = w(bArr, 0, iY);
        String str = new String(bArr, 0, iW, strU);
        int iT = iW + t(iY);
        return new UrlLinkFrame("WXXX", str, o(bArr, iT, x(bArr, iT), "ISO-8859-1"));
    }

    public static int t(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static String u(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : C.UTF16_NAME;
    }

    public static String v(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int w(byte[] bArr, int i10, int i11) {
        int iX = x(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iX;
        }
        while (iX < bArr.length - 1) {
            if (iX % 2 == 0 && bArr[iX + 1] == 0) {
                return iX;
            }
            iX = x(bArr, iX + 1);
        }
        return bArr.length;
    }

    public static int x(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static /* synthetic */ boolean y(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    public static int z(t tVar, int i10) {
        byte[] bArr = tVar.f3620a;
        int iC = tVar.c();
        int i11 = iC;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iC + i10) {
                return i10;
            }
            if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i10 - (i11 - iC)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    @Override // w4.a
    @Nullable
    public Metadata a(c cVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a6.a.e(cVar.f63711c);
        return d(byteBuffer.array(), byteBuffer.limit());
    }

    @Nullable
    public Metadata d(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        t tVar = new t(bArr, i10);
        C1116b c1116bL = l(tVar);
        if (c1116bL == null) {
            return null;
        }
        int iC = tVar.c();
        int i11 = c1116bL.f98194a == 2 ? 6 : 10;
        int iZ = c1116bL.f98196c;
        if (c1116bL.f98195b) {
            iZ = z(tVar, c1116bL.f98196c);
        }
        tVar.K(iC + iZ);
        boolean z10 = false;
        if (!A(tVar, c1116bL.f98194a, i11, false)) {
            if (c1116bL.f98194a != 4 || !A(tVar, 4, i11, true)) {
                m.h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + c1116bL.f98194a);
                return null;
            }
            z10 = true;
        }
        while (tVar.a() >= i11) {
            Id3Frame id3FrameJ = j(c1116bL.f98194a, tVar, z10, i11, this.f98193a);
            if (id3FrameJ != null) {
                arrayList.add(id3FrameJ);
            }
        }
        return new Metadata(arrayList);
    }
}
