package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.view.Surface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2584eF {
    public static byte[] A02;
    public final C9V A00;
    public final C3012lf A01 = new C3012lf();

    static {
        A02();
    }

    public C2584eF(C2529dL c2529dL) {
        this.A00 = AbstractC15695z.A00(new C3122nS(c2529dL), new AnonymousClass92(new C3038m5(this.A01)), new C3125nV(), this.A01);
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A01(C3192od c3192od) {
        boolean z10 = c3192od instanceof C9Y;
        String strA00 = A00(36, 2, 118);
        String strA002 = A00(0, 14, 108);
        if (!z10) {
            return A00(41, 14, 99) + c3192od.getMessage() + strA002 + c3192od.getCause() + strA00;
        }
        C9Y c9y = (C9Y) c3192od;
        return A00(55, 11, 8) + c9y.A03 + A00(14, 22, 98) + c9y.A02 + strA002 + c9y.getCause() + strA00;
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, 16, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A7W();
    }

    public final long A07() {
        return this.A00.A7k();
    }

    public final C2582eD A08() {
        C3206or c3206orA0K = this.A00.A0K();
        if (c3206orA0K == null) {
            return null;
        }
        return new C2582eD(c3206orA0K.A0L, c3206orA0K.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f10) {
        this.A00.A0M(f10);
    }

    public final void A0D(long j10) {
        this.A00.A04(j10);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C2503cu c2503cu, Uri uri) {
        if (U7.A2r(c2503cu, A03())) {
            this.A00.A0Q(new AnonymousClass99(C2588eJ.A06(c2503cu).A0H(c2503cu)).A04(uri));
        } else {
            this.A00.A0Q(new AnonymousClass99(new C3140nk(c2503cu, AbstractC15184a.A0j(c2503cu, A00(38, 3, 100)), this.A01)).A04(uri));
        }
    }

    public final void A0G(InterfaceC2581eC interfaceC2581eC) {
        this.A00.A0O(new CR(this, interfaceC2581eC));
    }

    public final void A0H(final InterfaceC2583eE interfaceC2583eE) {
        this.A00.A0P(new InterfaceC3111nH() { // from class: com.facebook.ads.redexgen.X.27
            @Override // com.facebook.ads.redexgen.core.InterfaceC15274j
            public final void AFq(int i10, int i11, int i12, float f10) {
                interfaceC2583eE.AFq(i10, i11, i12, f10);
            }
        });
    }

    public final void A0I(boolean z10) {
        this.A00.A0S(z10);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
