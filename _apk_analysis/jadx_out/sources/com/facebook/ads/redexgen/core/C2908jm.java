package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2908jm implements KJ {
    public static byte[] A06;
    public static String[] A07 = {"fELf", "CRtzdmwc22mVTvWtUEGrb2L89Zsi6Y", "N3iDT79zWT", "QE0dTL1WJBlTTMSZUybObct7Yruejf", "2s0f3KF", "nKh6xiyrNv58iMY1QpFjB2stIkByl4C1", "EQbEmjPFrv4Ln5yY3rHDWiHWauO7RbEC", "22fQYQCo1Sa4pTb3FTlk"};
    public int A00;
    public int A01;
    public H1 A03;
    public boolean A04;
    public final C4J A05 = new C4J(10);
    public long A02 = -9223372036854775807L;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 3);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-73, -36, -26, -42, -44, -27, -41, -36, ExifInterface.MARKER_APP1, -38, -109, -36, ExifInterface.MARKER_APP1, -23, -44, -33, -36, -41, -109, -68, -73, -90, -109, -25, -44, -38, -91, -64, -113, -82, -63, -67, -64, -63, -50, -120, -105, -105, -109, -112, -118, -120, -101, -112, -106, -107, 86, -112, -117, 90};
        String[] strArr = A07;
        if (strArr[0].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[0] = "lwVQ";
        strArr2[7] = "W4X85THKeh5ui5hEjPAl";
        A06 = bArr;
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A52(C4J c4j) {
        C3M.A02(this.A03);
        if (this.A04) {
            int iA07 = c4j.A07();
            if (this.A00 < 10) {
                int iMin = Math.min(iA07, 10 - this.A00);
                System.arraycopy(c4j.A0l(), c4j.A09(), this.A05.A0l(), this.A00, iMin);
                if (this.A00 + iMin == 10) {
                    this.A05.A0f(0);
                    int iA0I = this.A05.A0I();
                    String[] strArr = A07;
                    if (strArr[5].charAt(9) != strArr[6].charAt(9)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A07;
                    strArr2[3] = "8jY5LvW7YbHaTZ44u3JYImlIbCOMqh";
                    strArr2[1] = "1oUslOQnEnplG8ZTymW4i1r8pTNeUj";
                    if (73 != iA0I || 68 != this.A05.A0I() || 51 != this.A05.A0I()) {
                        AnonymousClass44.A07(A00(26, 9, 89), A00(0, 26, 112));
                        this.A04 = false;
                        return;
                    } else {
                        this.A05.A0g(3);
                        this.A01 = this.A05.A0H() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA07, this.A01 - this.A00);
            this.A03.AI7(c4j, iMin2);
            int i10 = this.A00;
            if (A07[2].length() == 7) {
                this.A00 = i10 + iMin2;
            } else {
                A07[2] = "dnD6Rrkwc9mF5nVn4sILdynL2747n3";
                this.A00 = i10 + iMin2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A5U(GY gy, C1921Ke c1921Ke) {
        c1921Ke.A05();
        this.A03 = gy.AJh(c1921Ke.A03(), 5);
        this.A03.A6W(new C2D().A0y(c1921Ke.A04()).A11(A00(35, 15, 36)).A14());
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG5() {
        C3M.A02(this.A03);
        if (this.A04 && this.A01 != 0 && this.A00 == this.A01) {
            if (this.A02 != -9223372036854775807L) {
                this.A03.AIA(this.A02, 1, this.A01, 0, null);
            }
            this.A04 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG6(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.A04 = true;
        if (j10 != -9223372036854775807L) {
            this.A02 = j10;
        }
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AIL() {
        this.A04 = false;
        this.A02 = -9223372036854775807L;
    }
}
