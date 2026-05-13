package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2056Pm {
    public static byte[] A03;
    public static String[] A04 = {"90ZggfNQsOg49XfX2Gw1SU3vAhU", "6e03JoSoFcAuCj0XHJ07P", "X2n0FB8CLVE6QonP7j41AEQOs", "oGNNWvZthHEo2sMGR9jx6vYqjxoachM9", "D9nn", "xFc2wx6BEzvoHtEzkiYe1GtwM37", "KcMIoFUA4KOHORJmTS9CHMjc27bv2njt", "Hz1lzGXaGkVdCftBSZ2HywJOuLsdaxmO"};
    public final InterfaceC2055Pl A01;
    public final C2054Pk A00 = new C2054Pk();
    public final List<View> A02 = new ArrayList();

    static {
        A02();
    }

    public C2056Pm(InterfaceC2055Pl interfaceC2055Pl) {
        this.A01 = interfaceC2055Pl;
    }

    private int A00(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iA7A = this.A01.A7A();
        int i11 = i10;
        while (i11 < iA7A) {
            int iA03 = i10 - (i11 - this.A00.A03(i11));
            if (iA03 == 0) {
                while (this.A00.A08(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iA03;
        }
        return -1;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-113, -125, -53, -52, -57, -57, -56, -47, -125, -49, -52, -42, -41, -99, -21, -23, -16, -32, -27, -34, -105, -21, -26, -105, -20, -27, -33, -32, -37, -36, -105, -40, -105, -19, -32, -36, -18, -105, -21, -33, -40, -21, -105, -18, -40, -22, -105, -27, -26, -21, -105, -33, -32, -37, -37, -36, -27, 43, 30, 26, 44, -43, 30, 40, -43, 35, 36, 41, -43, 22, -43, 24, 29, 30, 33, 25, ExifInterface.MARKER_APP1, -43, 24, 22, 35, 35, 36, 41, -43, 29, 30, 25, 26, -43};
    }

    private void A03(View view) {
        this.A02.add(view);
        this.A01.ADA(view);
    }

    private boolean A04(View view) {
        if (!this.A02.remove(view)) {
            return false;
        }
        this.A01.ADv(view);
        return true;
    }

    public final int A05() {
        return this.A01.A7A() - this.A02.size();
    }

    public final int A06() {
        return this.A01.A7A();
    }

    public final int A07(View view) {
        int iA9z = this.A01.A9z(view);
        if (iA9z == -1 || this.A00.A08(iA9z)) {
            return -1;
        }
        return iA9z - this.A00.A03(iA9z);
    }

    public final View A08(int i10) {
        int size = this.A02.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.A02.get(i11);
            AbstractC2076Qg abstractC2076QgA7D = this.A01.A7D(view);
            if (abstractC2076QgA7D.A0O() == i10 && !abstractC2076QgA7D.A0f() && !abstractC2076QgA7D.A0g()) {
                return view;
            }
        }
        return null;
    }

    public final View A09(int i10) {
        return this.A01.A79(A00(i10));
    }

    public final View A0A(int i10) {
        return this.A01.A79(i10);
    }

    public final void A0B() {
        this.A00.A04();
        for (int size = this.A02.size() - 1; size >= 0; size--) {
            this.A01.ADv(this.A02.get(size));
            this.A02.remove(size);
        }
        this.A01.AHg();
    }

    public final void A0C(int i10) {
        int iA00 = A00(i10);
        this.A00.A09(iA00);
        this.A01.A5o(iA00);
    }

    public final void A0D(int i10) {
        int iA00 = A00(i10);
        View viewA79 = this.A01.A79(iA00);
        if (viewA79 == null) {
            return;
        }
        if (this.A00.A09(iA00)) {
            A04(viewA79);
        }
        this.A01.AHm(iA00);
    }

    public final void A0E(View view) {
        int iA9z = this.A01.A9z(view);
        if (iA9z < 0) {
            throw new IllegalArgumentException(A01(57, 33, 85) + view);
        }
        this.A00.A06(iA9z);
        A03(view);
    }

    public final void A0F(View view) {
        int iA9z = this.A01.A9z(view);
        if (iA9z < 0) {
            return;
        }
        if (this.A00.A09(iA9z)) {
            A04(view);
        }
        this.A01.AHm(iA9z);
    }

    public final void A0G(View view) {
        int iA9z = this.A01.A9z(view);
        if (iA9z < 0) {
            throw new IllegalArgumentException(A01(57, 33, 85) + view);
        }
        if (!this.A00.A08(iA9z)) {
            throw new RuntimeException(A01(14, 43, 23) + view);
        }
        this.A00.A05(iA9z);
        if (A04[7].charAt(2) == 'x') {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[5] = "8IGbKDWrlSqGtsrcKzoZxkVKvdJ";
        strArr[0] = "U0TRNaLdUZe04yrOWBaiBfN34lF";
        A04(view);
    }

    public final void A0H(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iA7A = i10 < 0 ? this.A01.A7A() : A00(i10);
        this.A00.A07(iA7A, z10);
        if (z10) {
            A03(view);
        }
        this.A01.A4C(view, iA7A, layoutParams);
    }

    public final void A0I(View view, int i10, boolean z10) {
        int iA00;
        if (i10 < 0) {
            InterfaceC2055Pl interfaceC2055Pl = this.A01;
            String[] strArr = A04;
            if (strArr[5].length() == strArr[0].length()) {
                String[] strArr2 = A04;
                strArr2[1] = "WWxR4kuTyiSS3k1dOopZM";
                strArr2[2] = "jpAqbovCz6NUDLwJv0FYFncHe";
                iA00 = interfaceC2055Pl.A7A();
            }
            throw new RuntimeException();
        }
        iA00 = A00(i10);
        this.A00.A07(iA00, z10);
        if (A04[7].charAt(2) != 'x') {
            A04[4] = "lrFB";
            if (z10) {
                A03(view);
            }
            this.A01.addView(view, iA00);
            return;
        }
        throw new RuntimeException();
    }

    public final void A0J(View view, boolean z10) {
        A0I(view, -1, z10);
    }

    public final boolean A0K(View view) {
        return this.A02.contains(view);
    }

    public final boolean A0L(View view) {
        int iA9z = this.A01.A9z(view);
        if (iA9z == -1) {
            A04(view);
            return true;
        }
        if (!this.A00.A08(iA9z)) {
            return false;
        }
        this.A00.A09(iA9z);
        A04(view);
        this.A01.AHm(iA9z);
        return true;
    }

    public final String toString() {
        return this.A00.toString() + A01(0, 14, 3) + this.A02.size();
    }
}
