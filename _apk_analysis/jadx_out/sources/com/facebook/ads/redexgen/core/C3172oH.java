package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3172oH implements C1S {
    public static byte[] A05;
    public static final C1R<C3172oH> A06;
    public static final String A07;
    public static final String A08;
    public int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final C3206or[] A04;

    static {
        A05();
        A07 = AbstractC15184a.A0h(0);
        A08 = AbstractC15184a.A0h(1);
        A06 = new C1R() { // from class: com.facebook.ads.redexgen.X.oI
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                return C3172oH.A01(bundle);
            }
        };
    }

    public C3172oH(String str, C3206or... c3206orArr) {
        C3M.A07(c3206orArr.length > 0);
        this.A03 = str;
        this.A04 = c3206orArr;
        this.A01 = c3206orArr.length;
        int iA01 = AbstractC14732h.A01(c3206orArr[0].A0W);
        this.A02 = iA01 == -1 ? AbstractC14732h.A01(c3206orArr[0].A0S) : iA01;
        A04();
    }

    public C3172oH(C3206or... c3206orArr) {
        this(A02(0, 0, 114), c3206orArr);
    }

    public static int A00(int i10) {
        return i10 | 16384;
    }

    public static /* synthetic */ C3172oH A01(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A07);
        return new C3172oH(bundle.getString(A08, A02(0, 0, 114)), (C3206or[]) (parcelableArrayList == null ? MetaExoPlayerCustomizedCollections.A01() : C3S.A01(C3206or.A0b, parcelableArrayList)).toArray(new C3206or[0]));
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A03(String str) {
        return (str == null || str.equals(A02(96, 3, 71))) ? A02(0, 0, 114) : str;
    }

    private void A04() {
        String strA03 = A03(this.A04[0].A0V);
        int iA00 = A00(this.A04[0].A0E);
        for (int i10 = 1; i10 < this.A04.length; i10++) {
            if (!strA03.equals(A03(this.A04[i10].A0V))) {
                A06(A02(77, 9, 81), this.A04[0].A0V, this.A04[i10].A0V, i10);
                return;
            } else {
                if (iA00 != A00(this.A04[i10].A0E)) {
                    A06(A02(86, 10, 85), Integer.toBinaryString(this.A04[0].A0E), Integer.toBinaryString(this.A04[i10].A0E), i10);
                    return;
                }
            }
        }
    }

    public static void A05() {
        A05 = new byte[]{95, 28, 16, 18, 29, 22, 17, 26, 27, 95, 22, 17, 95, 16, 17, 26, 95, 43, 13, 30, 28, 20, 56, 13, 16, 10, 15, 69, 95, 88, 100, 99, 107, 55, 49, 34, 32, 40, 99, 112, 119, 127, 35, 37, 54, 52, 60, 119, 103, 126, 119, 54, 57, 51, 119, 112, 62, 106, 71, 72, 72, 75, 92, 75, 64, 90, 14, 22, 48, 35, 33, 41, 5, 48, 45, 55, 50, 50, 63, 48, 57, 43, 63, 57, 59, 45, 40, 53, 54, 63, 122, 60, 54, 59, 61, 41, 61, 38, 44};
    }

    public static void A06(String str, String str2, String str3, int i10) {
        AnonymousClass44.A08(A02(67, 10, 77), A02(0, 0, 114), new IllegalStateException(A02(57, 10, 33) + str + A02(0, 30, 112) + str2 + A02(39, 17, 88) + str3 + A02(30, 9, 76) + i10 + A02(56, 1, 24)));
    }

    public final int A07(C3206or c3206or) {
        for (int i10 = 0; i10 < this.A04.length; i10++) {
            if (c3206or == this.A04[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public final C3206or A08(int i10) {
        return this.A04[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3172oH c3172oH = (C3172oH) obj;
        return this.A03.equals(c3172oH.A03) && Arrays.equals(this.A04, c3172oH.A04);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (((17 * 31) + this.A03.hashCode()) * 31) + Arrays.hashCode(this.A04);
        }
        return this.A00;
    }
}
