package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.ApicFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.BinaryFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.CommentFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.GeobFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.PrivFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.UrlLinkFrame;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C16268i extends AbstractC2976l4 {
    public static byte[] A01;
    public static String[] A02 = {"dfkl9gE5OREu5AXL5lY0ohuUUe3SXBJr", "hKeIXQ7stisHjmNWZz70dNldldiAaQvi", "Ev47ZYJBP4qmoN0JeJrCKxe3cHeEd2Mz", "un9uiXmeOTgIIo", "Wd16eevQjbu9Ian59LTBbcV1NeBW6y6R", "QoAdFFIsNXY7HGA7Qc965AL0CxX7pFDa", "35FvwnlVw7oPAj", "U3kKyqEMJJ2afey5JgaPdqN5tYmvQhts"};
    public static final InterfaceC1842Hc A03;
    public final InterfaceC1842Hc A00;

    static {
        A0N();
        A03 = new InterfaceC1842Hc() { // from class: com.facebook.ads.redexgen.X.ky
            @Override // com.facebook.ads.redexgen.core.InterfaceC1842Hc
            public final boolean A6I(int i10, int i11, int i12, int i13, int i14) {
                return C16268i.A0O(i10, i11, i12, i13, i14);
            }
        };
    }

    public C16268i() {
        this(null);
    }

    public C16268i(InterfaceC1842Hc interfaceC1842Hc) {
        this.A00 = interfaceC1842Hc;
    }

    public static int A00(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static int A01(C4J c4j, int i10) {
        byte[] bArrA0l = c4j.A0l();
        int iA09 = c4j.A09();
        for (int i11 = iA09; i11 + 1 < iA09 + i10; i11++) {
            if ((bArrA0l[i11] & 255) == 255 && bArrA0l[i11 + 1] == 0) {
                int i12 = i11 + 2;
                int i13 = i11 + 1;
                int i14 = (i10 - (i11 - iA09)) - 2;
                String[] strArr = A02;
                if (strArr[1].charAt(20) != strArr[7].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[1] = "XZV6e8MYnWgHLOD3ZLXsdTcFpPsY6V3F";
                strArr2[7] = "PRKMokf209xLCZShYH0Zduqvqdx50TVA";
                System.arraycopy(bArrA0l, i12, bArrA0l, i13, i14);
                i10--;
            }
        }
        return i10;
    }

    public static int A02(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int A03(byte[] bArr, int i10, int i11) {
        int iA02 = A02(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iA02;
        }
        while (iA02 < bArr.length - 1) {
            if ((iA02 - i10) % 2 == 0 && bArr[iA02 + 1] == 0) {
                return iA02;
            }
            iA02 = A02(bArr, iA02 + 1);
        }
        return bArr.length;
    }

    public static ApicFrame A04(C4J c4j, int i10, int i11) {
        int iA02;
        String strA01;
        int iA0I = c4j.A0I();
        Charset charsetA0M = A0M(iA0I);
        byte[] bArr = new byte[i10 - 1];
        c4j.A0k(bArr, 0, i10 - 1);
        String strA0J = A0J(402, 6, 90);
        if (i11 == 2) {
            iA02 = 2;
            strA01 = strA0J + AbstractC2836iY.A01(new String(bArr, 0, 3, AbstractC2838ia.A01));
            if (A0J(418, 9, 47).equals(strA01)) {
                strA01 = A0J(408, 10, 122);
            }
        } else {
            iA02 = A02(bArr, 0);
            strA01 = AbstractC2836iY.A01(new String(bArr, 0, iA02, AbstractC2838ia.A01));
            if (strA01.indexOf(47) == -1) {
                strA01 = strA0J + strA01;
            }
        }
        int i12 = bArr[iA02 + 1] & 255;
        int i13 = iA02 + 2;
        int iA03 = A03(bArr, i13, iA0I);
        return new ApicFrame(strA01, new String(bArr, i13, iA03 - i13, charsetA0M), i12, A0Q(bArr, A00(iA0I) + iA03, bArr.length));
    }

    public static BinaryFrame A05(C4J c4j, int i10, String str) {
        byte[] bArr = new byte[i10];
        c4j.A0k(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterFrame A06(C4J c4j, int i10, int i11, boolean z10, int i12, InterfaceC1842Hc interfaceC1842Hc) {
        int iA09 = c4j.A09();
        int iA02 = A02(c4j.A0l(), iA09);
        String str = new String(c4j.A0l(), iA09, iA02 - iA09, AbstractC2838ia.A01);
        c4j.A0f(iA02 + 1);
        int iA0C = c4j.A0C();
        int iA0C2 = c4j.A0C();
        long jA0Q = c4j.A0Q();
        if (jA0Q == 4294967295L) {
            jA0Q = -1;
        }
        long jA0Q2 = c4j.A0Q();
        if (jA0Q2 == 4294967295L) {
            jA0Q2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = iA09 + i10;
        while (true) {
            int iA092 = c4j.A09();
            if (A02[5].charAt(22) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "yxJytYiELIVuKxluLLGjsQCljTQ6t8ax";
            strArr[0] = "riKuEgzQ5i9bwl4lr9MCLXtR5zTvU4EY";
            if (iA092 >= i13) {
                return new ChapterFrame(str, iA0C, iA0C2, jA0Q, jA0Q2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
            }
            Id3Frame id3FrameA0B = A0B(i11, c4j, z10, i12, interfaceC1842Hc);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
    }

    public static ChapterTocFrame A07(C4J c4j, int i10, int i11, boolean z10, int i12, InterfaceC1842Hc interfaceC1842Hc) {
        int iA09 = c4j.A09();
        int iA02 = A02(c4j.A0l(), iA09);
        String str = new String(c4j.A0l(), iA09, iA02 - iA09, AbstractC2838ia.A01);
        c4j.A0f(iA02 + 1);
        int iA0I = c4j.A0I();
        boolean z11 = (iA0I & 2) != 0;
        boolean z12 = (iA0I & 1) != 0;
        int iA0I2 = c4j.A0I();
        String[] strArr = new String[iA0I2];
        for (int i13 = 0; i13 < iA0I2; i13++) {
            int iA092 = c4j.A09();
            int iA022 = A02(c4j.A0l(), iA092);
            strArr[i13] = new String(c4j.A0l(), iA092, iA022 - iA092, AbstractC2838ia.A01);
            c4j.A0f(iA022 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iA09 + i10;
        while (c4j.A09() < i14) {
            Id3Frame id3FrameA0B = A0B(i11, c4j, z10, i12, interfaceC1842Hc);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        return new ChapterTocFrame(str, z11, z12, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame A08(C4J c4j, int i10) {
        if (i10 < 4) {
            return null;
        }
        int iA0I = c4j.A0I();
        Charset charsetA0M = A0M(iA0I);
        byte[] bArr = new byte[3];
        c4j.A0k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        byte[] bArr2 = new byte[i10 - 4];
        c4j.A0k(bArr2, 0, i10 - 4);
        int iA03 = A03(bArr2, 0, iA0I);
        String str2 = new String(bArr2, 0, iA03, charsetA0M);
        int iA00 = A00(iA0I) + iA03;
        return new CommentFrame(str, str2, A0L(bArr2, iA00, A03(bArr2, iA00, iA0I), charsetA0M));
    }

    public static GeobFrame A09(C4J c4j, int i10) {
        int iA0I = c4j.A0I();
        Charset charsetA0M = A0M(iA0I);
        byte[] bArr = new byte[i10 - 1];
        c4j.A0k(bArr, 0, i10 - 1);
        int iA02 = A02(bArr, 0);
        String str = new String(bArr, 0, iA02, AbstractC2838ia.A01);
        int i11 = iA02 + 1;
        int iA03 = A03(bArr, i11, iA0I);
        String strA0L = A0L(bArr, i11, iA03, charsetA0M);
        int iA00 = A00(iA0I) + iA03;
        int iA032 = A03(bArr, iA00, iA0I);
        return new GeobFrame(str, strA0L, A0L(bArr, iA00, iA032, charsetA0M), A0Q(bArr, A00(iA0I) + iA032, bArr.length));
    }

    public static C1843Hd A0A(C4J c4j) {
        int iA07 = c4j.A07();
        String strA0J = A0J(170, 10, 14);
        if (iA07 < 10) {
            AnonymousClass44.A07(strA0J, A0J(30, 31, 108));
            return null;
        }
        int iA0K = c4j.A0K();
        boolean z10 = false;
        if (iA0K != 4801587) {
            AnonymousClass44.A07(strA0J, A0J(348, 50, 47) + String.format(A0J(0, 4, 50), Integer.valueOf(iA0K)));
            return null;
        }
        int iA0I = c4j.A0I();
        c4j.A0g(1);
        int iA0I2 = c4j.A0I();
        int iA0H = c4j.A0H();
        if (iA0I == 2) {
            if ((iA0I2 & 64) != 0) {
                AnonymousClass44.A07(strA0J, A0J(BaseTransientBottomBar.ANIMATION_FADE_DURATION, 68, 11));
                return null;
            }
        } else if (iA0I == 3) {
            if ((iA0I2 & 64) != 0) {
                int iA0C = c4j.A0C();
                c4j.A0g(iA0C);
                iA0H -= iA0C + 4;
            }
        } else {
            if (iA0I != 4) {
                AnonymousClass44.A07(strA0J, A0J(248, 46, 54) + iA0I);
                return null;
            }
            if ((iA0I2 & 64) != 0) {
                int iA0H2 = c4j.A0H();
                c4j.A0g(iA0H2 - 4);
                iA0H -= iA0H2;
            }
            if ((iA0I2 & 16) != 0) {
                iA0H -= 10;
            }
        }
        if (iA0I < 4 && (iA0I2 & 128) != 0) {
            z10 = true;
        }
        return new C1843Hd(iA0I, z10, iA0H);
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0232 A[Catch: all -> 0x0273, TryCatch #0 {all -> 0x0273, blocks: (B:99:0x0169, B:168:0x023c, B:101:0x0171, B:108:0x0187, B:110:0x018f, B:118:0x01a9, B:127:0x01c1, B:138:0x01db, B:145:0x01ec, B:152:0x01fd, B:158:0x0214, B:165:0x022d, B:166:0x0232), top: B:174:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame A0B(int r21, com.facebook.ads.redexgen.core.C4J r22, boolean r23, int r24, com.facebook.ads.redexgen.core.InterfaceC1842Hc r25) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C16268i.A0B(int, com.facebook.ads.redexgen.X.4J, boolean, int, com.facebook.ads.redexgen.X.Hc):com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame");
    }

    public static MlltFrame A0C(C4J c4j, int i10) {
        int iA0M = c4j.A0M();
        int iA0K = c4j.A0K();
        int iA0K2 = c4j.A0K();
        int iA0I = c4j.A0I();
        int iA0I2 = c4j.A0I();
        C4I c4i = new C4I();
        c4i.A0C(c4j);
        int i11 = ((i10 - 10) * 8) / (iA0I + iA0I2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iA04 = c4i.A04(iA0I);
            int iA042 = c4i.A04(iA0I2);
            iArr[i12] = iA04;
            iArr2[i12] = iA042;
            if (A02[5].charAt(22) == 'F') {
                throw new RuntimeException();
            }
            A02[4] = "fcLz7frwMRu6ITyb";
        }
        return new MlltFrame(iA0M, iA0K, iA0K2, iArr, iArr2);
    }

    public static PrivFrame A0D(C4J c4j, int i10) {
        byte[] bArr = new byte[i10];
        c4j.A0k(bArr, 0, i10);
        int iA02 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iA02, AbstractC2838ia.A01), A0Q(bArr, iA02 + 1, bArr.length));
    }

    public static TextInformationFrame A0E(C4J c4j, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iA0I = c4j.A0I();
        byte[] bArr = new byte[i10 - 1];
        c4j.A0k(bArr, 0, i10 - 1);
        int iA03 = A03(bArr, 0, iA0I);
        return new TextInformationFrame(A0J(344, 4, 103), new String(bArr, 0, iA03, A0M(iA0I)), A0I(bArr, iA0I, A00(iA0I) + iA03));
    }

    public static TextInformationFrame A0F(C4J c4j, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int iA0I = c4j.A0I();
        byte[] bArr = new byte[i10 - 1];
        c4j.A0k(bArr, 0, i10 - 1);
        return new TextInformationFrame(str, null, A0I(bArr, iA0I, 0));
    }

    public static UrlLinkFrame A0G(C4J c4j, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iA0I = c4j.A0I();
        byte[] bArr = new byte[i10 - 1];
        c4j.A0k(bArr, 0, i10 - 1);
        int iA03 = A03(bArr, 0, iA0I);
        String str = new String(bArr, 0, iA03, A0M(iA0I));
        int iA00 = A00(iA0I) + iA03;
        return new UrlLinkFrame(A0J(398, 4, 35), str, A0L(bArr, iA00, A02(bArr, iA00), AbstractC2838ia.A01));
    }

    public static UrlLinkFrame A0H(C4J c4j, int i10, String str) {
        byte[] bArr = new byte[i10];
        c4j.A0k(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), AbstractC2838ia.A01));
    }

    public static AbstractC1673Am<String> A0I(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        String strA0J = A0J(0, 0, 108);
        if (i11 >= length) {
            return AbstractC1673Am.A04(strA0J);
        }
        C14491h c14491hA01 = AbstractC1673Am.A01();
        int iA03 = A03(bArr, i11, i10);
        while (i11 < iA03) {
            c14491hA01.A04(new String(bArr, i11, iA03 - i11, A0M(i10)));
            i11 = iA03 + A00(i10);
            iA03 = A03(bArr, i11, i10);
        }
        AbstractC1673Am<String> abstractC1673AmA05 = c14491hA01.A05();
        return abstractC1673AmA05.isEmpty() ? AbstractC1673Am.A04(strA0J) : abstractC1673AmA05;
    }

    public static String A0J(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A0K(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, A0J(4, 6, 69), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, A0J(10, 8, 1), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static String A0L(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? A0J(0, 0, 108) : new String(bArr, i10, i11 - i10, charset);
    }

    public static Charset A0M(int i10) {
        switch (i10) {
            case 1:
                return AbstractC2838ia.A03;
            case 2:
                return AbstractC2838ia.A04;
            case 3:
                return AbstractC2838ia.A06;
            default:
                Charset charset = AbstractC2838ia.A01;
                if (A02[5].charAt(22) == 'F') {
                    throw new RuntimeException();
                }
                A02[5] = "KvSqsioCKy57forlhJv7i4SYYwwKGyHr";
                return charset;
        }
    }

    public static void A0N() {
        A01 = new byte[]{26, 15, 9, 103, 109, 43, 109, 43, 109, 43, 41, 111, 41, 111, 41, 111, 41, 111, 6, 10, 76, 88, 75, 71, 79, 121, 67, 80, 79, 23, 37, 0, 21, 0, 65, 21, 14, 14, 65, 18, 9, 14, 19, 21, 65, 21, 14, 65, 3, 4, 65, 0, 15, 65, 40, 37, 82, 65, 21, 0, 6, 76, 107, 99, 102, 111, 110, ExifInterface.START_CODE, 126, 101, ExifInterface.START_CODE, 110, 111, 105, 101, 110, 111, ExifInterface.START_CODE, 108, 120, 107, 103, 111, 48, ExifInterface.START_CODE, 99, 110, 55, 114, 85, 93, 88, 81, 80, 20, 64, 91, 20, 66, 85, 88, 93, 80, 85, 64, 81, 20, 125, 112, 7, 20, 64, 85, 83, 20, 67, 93, 64, 92, 20, 89, 85, 94, 91, 70, 98, 81, 70, 71, 93, 91, 90, 9, 39, 19, 0, 12, 4, 65, 18, 8, 27, 4, 65, 4, 25, 2, 4, 4, 5, 18, 65, 19, 4, 12, 0, 8, 15, 8, 15, 6, 65, 21, 0, 6, 65, 5, 0, 21, 0, 74, 103, 48, 71, 102, 96, 108, 103, 102, 113, 85, 109, 111, 118, 118, 99, 98, 38, 79, 66, 53, 38, 114, 103, 97, 38, 113, 111, 114, 110, 38, 107, 103, 108, 105, 116, 80, 99, 116, 117, 111, 105, 104, 59, 52, 38, 103, 104, 98, 38, 115, 104, 98, 99, 96, 111, 104, 99, 98, 38, 101, 105, 107, 118, 116, 99, 117, 117, 111, 105, 104, 38, 117, 101, 110, 99, 107, 99, 104, 80, 82, 75, 75, 94, 95, 27, 114, 127, 8, 27, 79, 90, 92, 27, 76, 82, 79, 83, 27, 78, 85, 72, 78, 75, 75, 84, 73, 79, 94, 95, 27, 86, 90, 81, 84, 73, 109, 94, 73, 72, 82, 84, 85, 6, ExifInterface.START_CODE, 18, 16, 9, 9, 16, 23, 30, 89, 12, 23, 10, 12, 9, 9, 22, 11, 13, 28, 29, 89, 26, 22, 20, 9, 11, 28, 10, 10, 28, 29, 89, 22, 11, 89, 28, 23, 26, 11, 0, 9, 13, 28, 29, 89, 31, 11, 24, 20, 28, 62, 50, 50, 50, 119, 76, 71, 90, 82, 71, 65, 86, 71, 70, 2, 68, 75, 80, 81, 86, 2, 86, 74, 80, 71, 71, 2, 64, 91, 86, 71, 81, 2, 77, 68, 2, 107, 102, 17, 2, 86, 67, 69, 2, 74, 71, 67, 70, 71, 80, 24, 2, 18, 90, 121, 118, 118, 118, 62, 58, 54, 48, 50, 120, 30, 26, 22, 16, 18, 88, 29, 7, 18, 16, 75, 79, 67, 69, 71, 13, 72, 82, 69};
    }

    public static /* synthetic */ boolean A0O(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0060 A[EDGE_INSN: B:84:0x0060->B:23:0x0060 BREAK  A[LOOP:0: B:77:0x0006->B:67:0x0108], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0P(com.facebook.ads.redexgen.core.C4J r18, int r19, int r20, boolean r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C16268i.A0P(com.facebook.ads.redexgen.X.4J, int, int, boolean):boolean");
    }

    public static byte[] A0Q(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? AbstractC15184a.A07 : Arrays.copyOfRange(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2976l4
    public final Metadata A0R(C16348z c16348z, ByteBuffer byteBuffer) {
        return A0S(byteBuffer.array(), byteBuffer.limit());
    }

    public final Metadata A0S(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        C4J c4j = new C4J(bArr, i10);
        C1843Hd c1843HdA0A = A0A(c4j);
        if (c1843HdA0A == null) {
            return null;
        }
        int iA09 = c4j.A09();
        int i11 = c1843HdA0A.A01 == 2 ? 6 : 10;
        int iA01 = c1843HdA0A.A00;
        if (c1843HdA0A.A02) {
            iA01 = A01(c4j, c1843HdA0A.A00);
        }
        c4j.A0e(iA09 + iA01);
        boolean z10 = false;
        if (!A0P(c4j, c1843HdA0A.A01, i11, false)) {
            if (c1843HdA0A.A01 != 4 || !A0P(c4j, 4, i11, true)) {
                AnonymousClass44.A07(A0J(170, 10, 14), A0J(88, 45, 57) + c1843HdA0A.A01);
                return null;
            }
            z10 = true;
        }
        while (c4j.A07() >= i11) {
            Id3Frame id3FrameA0B = A0B(c1843HdA0A.A01, c4j, z10, i11, this.A00);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        return new Metadata(arrayList);
    }
}
