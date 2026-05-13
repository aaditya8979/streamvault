package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3214p0 implements C1S {
    public static byte[] A06;
    public static String[] A07 = {"HSHJbKu4LLVwlp8kAtKM", "V6sGPCPiRhBLh6", "pDYVgvWCLxIG9LT", "RWHl9GQtcXYH3V7mNtlpSVait36OCwJs", "0F7", "tg3oN59jNUBk8XSE4kwfd", "NBkHOFenkRKh7SKHrVJVIcIm0kDLsOxD", "OSER18TpRPMUQAQSprsMKIJx0xqzVeT1"};
    public static final C3214p0 A08;
    public static final C1R<C3214p0> A09;
    public static final C3215p1 A0A;
    public static final String A0B;
    public static final String A0C;
    public static final String A0D;
    public static final String A0E;
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Object A04;

    @MetaExoPlayerCustomization("Change back to private after AdsMediaSource fully upgraded")
    public final C3215p1[] A05;

    static {
        A03();
        A08 = new C3214p0(null, new C3215p1[0], 0L, -9223372036854775807L, 0);
        A0A = new C3215p1(0L).A06(0);
        A0B = AbstractC15184a.A0h(1);
        A0C = AbstractC15184a.A0h(2);
        A0D = AbstractC15184a.A0h(3);
        A0E = AbstractC15184a.A0h(4);
        A09 = new C1R() { // from class: com.facebook.ads.redexgen.X.p3
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                return C3214p0.A00(bundle);
            }
        };
    }

    public C3214p0(Object obj, C3215p1[] c3215p1Arr, long j10, long j11, int i10) {
        this.A04 = obj;
        this.A02 = j10;
        this.A03 = j11;
        this.A00 = c3215p1Arr.length + i10;
        this.A05 = c3215p1Arr;
        this.A01 = i10;
    }

    public static C3214p0 A00(Bundle bundle) {
        C3215p1[] c3215p1Arr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A0B);
        if (parcelableArrayList == null) {
            c3215p1Arr = new C3215p1[0];
        } else {
            c3215p1Arr = new C3215p1[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                c3215p1Arr[i10] = (C3215p1) C3215p1.A09.A6X((Bundle) parcelableArrayList.get(i10));
            }
        }
        return new C3214p0(null, c3215p1Arr, bundle.getLong(A0C, A08.A02), bundle.getLong(A0D, A08.A03), bundle.getInt(A0E, A08.A01));
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] ^ i12;
            String[] strArr = A07;
            if (strArr[5].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "7EQT2aPGHNOftenQ9VAvD";
            strArr2[1] = "79Hg5O6oUNL8gh";
            bArrCopyOfRange[i13] = (byte) (i14 ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{70, 74, 63, 51, 114, 119, 84, 97, 124, 102, 99, 96, 46, 72, 116, 120, 57, 60, 10, 61, 43, 45, 53, 61, 8, 55, 43, 49, 44, 49, 55, 54, 13, 43, 101, 47, 35, 98, 103, 112, 62, 88, 13, 1, 69, 84, 83, 64, 85, 72, 78, 79, 116, 82, 28, 1, 36, 16, 44, 33, 57, 34, 33, 35, 43, 19, 52, 33, 52, 37, 104, 33, 36, 51, 9, 36, 125, 80, 36, 29, 24, 84, 15, 8, 29, 8, 25, 65, 91, 94, 125, 72, 85, 79, 74, 18, 78, 83, 87, 95, 111, 73, 7};
    }

    private boolean A04(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = A07(i10).A03;
        if (j12 != Long.MIN_VALUE) {
            return j10 < j12;
        }
        if (A07[3].charAt(17) != 't') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[5] = "6w59Aw8BMojzvOgPymJyT";
        strArr[1] = "Ceso9EO8QL9NfZ";
        return j11 == -9223372036854775807L || j10 < j11;
    }

    public final int A05(long j10, long j11) {
        if (j10 == Long.MIN_VALUE || (j11 != -9223372036854775807L && j10 >= j11)) {
            return -1;
        }
        int i10 = this.A01;
        while (i10 < this.A00 && ((A07(i10).A03 != Long.MIN_VALUE && A07(i10).A03 <= j10) || !A07(i10).A08())) {
            i10++;
        }
        if (i10 < this.A00) {
            return i10;
        }
        return -1;
    }

    public final int A06(long j10, long j11) {
        int i10 = this.A00 - 1;
        while (i10 >= 0 && A04(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !A07(i10).A07()) {
            return -1;
        }
        return i10;
    }

    public final C3215p1 A07(int i10) {
        return i10 < this.A01 ? A0A : this.A05[i10 - this.A01];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3214p0 c3214p0 = (C3214p0) obj;
        if (AbstractC15184a.A1E(this.A04, c3214p0.A04) && this.A00 == c3214p0.A00 && this.A02 == c3214p0.A02 && this.A03 == c3214p0.A03 && this.A01 == c3214p0.A01) {
            C3215p1[] c3215p1Arr = this.A05;
            String[] strArr = A07;
            if (strArr[5].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "16faulxPxX0sTjyZsuY2d";
            strArr2[1] = "99yT7gYz4zzQy1";
            if (Arrays.equals(c3215p1Arr, c3214p0.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.A00 * 31) + (this.A04 == null ? 0 : this.A04.hashCode())) * 31) + ((int) this.A02)) * 31) + ((int) this.A03)) * 31) + this.A01) * 31) + Arrays.hashCode(this.A05);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A02(55, 22, 92));
        sb2.append(this.A04);
        sb2.append(A02(14, 21, 68));
        sb2.append(this.A02);
        sb2.append(A02(2, 12, 15));
        int i10 = 0;
        while (true) {
            C3215p1[] c3215p1Arr = this.A05;
            String[] strArr = A07;
            if (strArr[0].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[0] = "HwwbQlKsFzrVvgzZA70k";
            strArr2[2] = "CWSfdfe0R8gD4PU";
            int length = c3215p1Arr.length;
            String strA02 = A02(77, 2, 17);
            if (i10 >= length) {
                sb2.append(strA02);
                return sb2.toString();
            }
            sb2.append(A02(88, 15, 38));
            sb2.append(this.A05[i10].A03);
            sb2.append(A02(35, 7, 31));
            int i11 = 0;
            while (true) {
                int length2 = this.A05[i10].A05.length;
                String strA022 = A02(0, 2, 118);
                if (i11 < length2) {
                    sb2.append(A02(79, 9, 96));
                    switch (this.A05[i10].A05[i11]) {
                        case 0:
                            sb2.append('_');
                            break;
                        case 1:
                            sb2.append('R');
                            break;
                        case 2:
                            sb2.append('S');
                            break;
                        case 3:
                            sb2.append('P');
                            break;
                        case 4:
                            sb2.append('!');
                            break;
                        default:
                            sb2.append('?');
                            break;
                    }
                    sb2.append(A02(42, 13, 61));
                    sb2.append(this.A05[i10].A06[i11]);
                    sb2.append(')');
                    if (i11 < this.A05[i10].A05.length - 1) {
                        sb2.append(strA022);
                    }
                    i11++;
                } else {
                    sb2.append(strA02);
                    String[] strArr3 = A07;
                    if (strArr3[5].length() == strArr3[1].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A07;
                    strArr4[0] = "tpRIwkkikLxaZqXNkXQj";
                    strArr4[2] = "ureQIhKfJpTfNVp";
                    if (i10 < this.A05.length - 1) {
                        sb2.append(strA022);
                    }
                    i10++;
                }
            }
        }
    }
}
