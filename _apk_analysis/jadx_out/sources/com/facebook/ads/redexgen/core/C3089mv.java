package com.facebook.ads.redexgen.core;

import java.math.RoundingMode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3089mv implements InterfaceC16228d {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public C3089mv(C16308o c16308o) {
        this.A02 = c16308o.A02;
        this.A01 = c16308o.A01;
        this.A05 = c16308o.A05;
        this.A04 = c16308o.A04;
        this.A03 = c16308o.A03;
        this.A00 = c16308o.A00;
    }

    public static int A00(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    private final int A01(int i10) {
        return AD.A03((((long) this.A03) * ((long) A00(i10))) / 1000000);
    }

    private final int A02(int i10, int i11) {
        int i12 = this.A04;
        if (i10 == 5) {
            i12 *= this.A00;
        }
        return AD.A03((((long) i12) * ((long) (i11 != -1 ? C9D.A00(i11, 8, RoundingMode.CEILING) : A00(i10)))) / 1000000);
    }

    public static int A03(int i10, int i11, int i12) {
        return AD.A03(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    private final int A04(int i10, int i11, int i12) {
        return AbstractC15184a.A07(this.A05 * i10, A03(this.A02, i11, i12), A03(this.A01, i11, i12));
    }

    private final int A05(int i10, int i11, int i12, int i13, int i14, int i15) {
        switch (i12) {
            case 0:
                return A04(i10, i14, i13);
            case 1:
                return A01(i11);
            case 2:
                return A02(i11, i15);
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16228d
    public final int A6x(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (((double) A05(i10, i11, i12, i13, i14, i15)) * d10)) + i13) - 1) / i13) * i13;
    }
}
