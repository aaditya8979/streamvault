package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EC {
    public final int A00;
    public final C3043mA A01;
    public final int[] A02;
    public final int[] A03;
    public final C3043mA[] A04;
    public final String[] A05;
    public final int[][][] A06;

    public EC(String[] strArr, int[] iArr, C3043mA[] c3043mAArr, int[] iArr2, int[][][] iArr3, C3043mA c3043mA) {
        this.A05 = strArr;
        this.A03 = iArr;
        this.A04 = c3043mAArr;
        this.A06 = iArr3;
        this.A02 = iArr2;
        this.A01 = c3043mA;
        this.A00 = iArr.length;
    }

    private final int A00(int i10, int i11, int i12) {
        return this.A06[i10][i11][i12];
    }

    private final int A01(int i10, int i11, int[] iArr) {
        int i12 = 0;
        int iMin = 16;
        boolean z10 = false;
        String str = null;
        int i13 = 0;
        while (i13 < iArr.length) {
            String str2 = this.A04[i10].A05(i11).A08(iArr[i13]).A0W;
            int i14 = i12 + 1;
            if (i12 == 0) {
                str = str2;
            } else {
                z10 = (!AbstractC15184a.A1E(str, str2)) | z10;
            }
            iMin = Math.min(iMin, AnonymousClass76.A01(this.A06[i10][i11][i13]));
            i13++;
            i12 = i14;
        }
        return z10 ? Math.min(iMin, this.A02[i10]) : iMin;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03(int i10) {
        return this.A03[i10];
    }

    public final int A04(int i10, int i11, int i12) {
        return AnonymousClass76.A03(A00(i10, i11, i12));
    }

    public final int A05(int i10, int i11, boolean z10) {
        int i12 = this.A04[i10].A05(i11).A01;
        int[] iArr = new int[i12];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int iA04 = A04(i10, i11, i14);
            if (iA04 == 4 || (z10 && iA04 == 3)) {
                iArr[i13] = i14;
                i13++;
            }
        }
        return A01(i10, i11, Arrays.copyOf(iArr, i13));
    }

    public final C3043mA A06() {
        return this.A01;
    }

    public final C3043mA A07(int i10) {
        return this.A04[i10];
    }
}
