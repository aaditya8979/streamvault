package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2240Wt implements SS {
    public static C2240Wt A07;
    public static byte[] A08;
    public LL A00;
    public SJ A01;
    public SR A02;
    public InterfaceC2128Sh A03;
    public TP A04;
    public InterfaceC2176Ue A05;
    public InterfaceC1699Bn A06;

    static {
        A07();
    }

    public static InterfaceC2105Rj A00(C2503cu c2503cu, InterfaceC1699Bn interfaceC1699Bn) {
        if (!U7.A1m(c2503cu) || interfaceC1699Bn == null) {
            return null;
        }
        return AbstractC2106Rk.A00().A00(interfaceC1699Bn);
    }

    public static InterfaceC2128Sh A01(C2503cu c2503cu) {
        return AbstractC2129Si.A00().A00(c2503cu, new YJ());
    }

    public static synchronized C2240Wt A02() {
        if (A07 == null) {
            A07 = new C2240Wt();
        }
        return A07;
    }

    public static InterfaceC2608ed A03(C2503cu c2503cu) {
        if (U7.A1i(c2503cu)) {
            return C2626ev.A01(c2503cu);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.SS
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC1699Bn A97() {
        return this.A06;
    }

    public static InterfaceC1699Bn A05(C2503cu c2503cu, InterfaceC2128Sh interfaceC2128Sh, InterfaceC2608ed interfaceC2608ed) {
        if (!U7.A2e(c2503cu) || interfaceC2608ed == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC2648fI.A00().A00(c2503cu, interfaceC2128Sh, interfaceC2608ed, VZ.A04(c2503cu), new X8(new VR(c2503cu, A06(0, 0, 9), null, V6.A08, 0, new VB(), X7.A01(U7.A0N(c2503cu)), null, null, new C2761hB()), c2503cu), C2646fG.A00().A00());
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{15, 13, 13, 18, 13, 17, 14, 58, 13, 31, 45, 45, 35, 41, 40, -38, 30, 27, 46, 27, -38, 35, 40, 35, 46, 35, 27, 38, 35, 52, 31, 30, 28, 15, 26, 25, 28, 30, -3, 15, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    public static void A08() {
        VF.A05(A06(32, 28, 52), A06(8, 24, 68), A06(0, 8, 99));
    }

    public static void A09(C2503cu c2503cu, InterfaceC2105Rj interfaceC2105Rj) {
        if (!U7.A1m(c2503cu) || interfaceC2105Rj == null) {
            return;
        }
        AbstractC2103Rh.A00().A00(interfaceC2105Rj, c2503cu);
    }

    public static void A0A(C2503cu c2503cu, InterfaceC1699Bn interfaceC1699Bn) {
        if (!U7.A0m(c2503cu) || interfaceC1699Bn == null) {
            return;
        }
        new S4(c2503cu, interfaceC1699Bn, new S5(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C2503cu c2503cu, InterfaceC1699Bn interfaceC1699Bn) {
        if (interfaceC1699Bn == null) {
            return;
        }
        UB.A00(c2503cu, interfaceC1699Bn);
    }

    public final synchronized void A0C(C2503cu c2503cu) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c2503cu);
        this.A06 = A05(c2503cu, this.A03, A03(c2503cu));
        A09(c2503cu, A00(c2503cu, this.A06));
        A0A(c2503cu, this.A06);
        A0B(c2503cu, this.A06);
        if (this.A06 != null) {
            this.A06.A6V();
        }
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final US A6f(C2503cu c2503cu) {
        return VG.A01(c2503cu);
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized SR A6w(SQ sq2) {
        if (this.A02 == null) {
            this.A02 = new XI(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized SJ A78() {
        if (this.A01 == null) {
            this.A01 = new C2552di();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized InterfaceC2128Sh A7d(SQ sq2) {
        if (this.A03 == null) {
            this.A03 = A01(sq2.A02());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized InterfaceC2141Su A7f(SQ sq2) {
        return new C2302Zd(sq2);
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized ST A7p(final SQ sq2) {
        return new YI(sq2) { // from class: com.facebook.ads.redexgen.X.6K
            @Override // com.facebook.ads.redexgen.core.ST
            public final boolean A9e() {
                return CM.A09();
            }

            @Override // com.facebook.ads.redexgen.core.ST
            public final void ABq() {
                TK.A06(RB.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.ST
            public final void ACE() {
                TK.A07(RB.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.ST
            public final void ACe(C2503cu c2503cu) {
                AbstractC2005Nl.A01(c2503cu);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized LL A84(SQ sq2) {
        if (!U7.A13(sq2)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = LM.A00().A00(new YH(sq2));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized SV A8q(SQ sq2) {
        return new XN(sq2);
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final C2503cu A8r(Context context) {
        C2503cu c2503cuA00 = SP.A00();
        if (c2503cuA00 != null) {
            return c2503cuA00;
        }
        C2503cu c2503cu = new C2503cu(context, this);
        SP.A01(c2503cu);
        return c2503cu;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized InterfaceC2176Ue A8s(C2503cu c2503cu) {
        if (this.A05 == null) {
            this.A05 = new VO(c2503cu);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized TP A8y() {
        if (this.A04 == null) {
            this.A04 = new TP();
            A08();
        }
        return this.A04;
    }
}
