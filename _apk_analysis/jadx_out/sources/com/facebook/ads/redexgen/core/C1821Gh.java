package com.facebook.ads.redexgen.core;

import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1821Gh {
    public static byte[] A0C;
    public static String[] A0D = {"Hy9erbcn1CD2Cs5ZlmG25MdtXf", "HOFQhwFeFgK1hjIc7qCVfLVKe4hb2KPj", "rEWyESjnSr6bXcR3qBgtsTRMI2K9qdSB", "BvL17bJBTlRgAjITBDDuBrnomI", "AZrfJovBkJndynqGcgKN1LZzk8fHrrw4", "fdLmSfOckTno1kV1pYqKvwBW8a156Tx5", "emxoz2tvvjMM3L", "p0b9qfAXEvDLZmNF0KID"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final C1820Gg A0A;
    public final Metadata A0B;

    static {
        A04();
    }

    public C1821Gh(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, C1820Gg c1820Gg, Metadata metadata) {
        this.A05 = i10;
        this.A03 = i11;
        this.A06 = i12;
        this.A04 = i13;
        this.A07 = i14;
        this.A08 = A01(i14);
        this.A02 = i15;
        this.A00 = i16;
        this.A01 = A00(i16);
        this.A09 = j10;
        this.A0A = c1820Gg;
        this.A0B = metadata;
    }

    public C1821Gh(byte[] bArr, int i10) {
        C4I c4i = new C4I(bArr);
        c4i.A08(i10 * 8);
        this.A05 = c4i.A04(16);
        this.A03 = c4i.A04(16);
        this.A06 = c4i.A04(24);
        this.A04 = c4i.A04(24);
        this.A07 = c4i.A04(20);
        this.A08 = A01(this.A07);
        this.A02 = c4i.A04(3) + 1;
        this.A00 = c4i.A04(5) + 1;
        this.A01 = A00(this.A00);
        this.A09 = c4i.A05(36);
        this.A0A = null;
        this.A0B = null;
    }

    public static int A00(int i10) {
        switch (i10) {
            case 8:
                if (A0D[6].length() != 28) {
                    String[] strArr = A0D;
                    strArr[5] = "V04NPWFEbILAkvleA9Xxz0FwJQ4eDV3p";
                    strArr[4] = "3QJh7HKROfuZmn4fVSBdYwrM5PNWxwSf";
                    return 1;
                }
                String[] strArr2 = A0D;
                strArr2[3] = "IuGfV3sFLU7aLzdayuZ51nmzsb";
                strArr2[0] = "kvaRWCMq8GtPZOTZqMfFBSkWA2";
                return 1;
            case 12:
                return 2;
            case 16:
                return 4;
            case 20:
                if (A0D[7].length() != 20) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0D;
                strArr3[3] = "GVm7TyTvdgGXuIF1m2KSKJr8Vg";
                strArr3[0] = "pCX2CyoVa54AgSUVxisn2xa5Aw";
                return 5;
            case 24:
                return 6;
            default:
                return -1;
        }
    }

    public static int A01(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private final Metadata A02(Metadata metadata) {
        return this.A0B == null ? metadata : this.A0B.A04(metadata);
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{11, 31, 14, 3, 5, 69, 12, 6, 11, 9};
    }

    public final long A05() {
        if (this.A04 > 0) {
            return ((((long) this.A04) + ((long) this.A06)) / 2) + 1;
        }
        return (((((long) this.A02) * ((this.A05 != this.A03 || this.A05 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : this.A05)) * ((long) this.A00)) / 8) + 64;
    }

    public final long A06() {
        if (this.A09 == 0) {
            return -9223372036854775807L;
        }
        return (this.A09 * 1000000) / ((long) this.A07);
    }

    public final long A07(long j10) {
        return AbstractC15184a.A0T((((long) this.A07) * j10) / 1000000, 0L, this.A09 - 1);
    }

    public final C3206or A08(byte[] bArr, Metadata metadata) {
        bArr[4] = -128;
        return new C2D().A11(A03(0, 10, 87)).A0h(this.A04 > 0 ? this.A04 : -1).A0b(this.A02).A0m(this.A07).A12(Collections.singletonList(bArr)).A0v(A02(metadata)).A14();
    }

    public final C1821Gh A09(C1820Gg c1820Gg) {
        return new C1821Gh(this.A05, this.A03, this.A06, this.A04, this.A07, this.A02, this.A00, this.A09, c1820Gg, this.A0B);
    }

    public final C1821Gh A0A(List<PictureFrame> list) {
        return new C1821Gh(this.A05, this.A03, this.A06, this.A04, this.A07, this.A02, this.A00, this.A09, this.A0A, A02(new Metadata(list)));
    }

    public final C1821Gh A0B(List<String> list) {
        return new C1821Gh(this.A05, this.A03, this.A06, this.A04, this.A07, this.A02, this.A00, this.A09, this.A0A, A02(H8.A02(list)));
    }
}
