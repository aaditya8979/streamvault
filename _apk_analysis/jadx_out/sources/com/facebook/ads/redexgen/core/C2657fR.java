package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2657fR {
    public static byte[] A02;
    public static String[] A03 = {"lJVeP2IR7ua2", "jEDUnDrnc1QBGJRRXgI1zLNGeQAVlRB5", "4J1evWwVBwsv6j2jE3cxdE8l4EvJqUWx", "hbOpPbm2Lvz8WBi4M4lcAmyYP20RrxkZ", "42MJRsHMkke9vUn", "N1ePHibZvm11p1YoQp9n3cvTSohhnC86", "pzMHmXStxFGPpObuVYX1kVlrzXN", "JuJmyZjKd3poC4Sz8wRazc2gW2"};
    public static final String A04;
    public final InterfaceC2105Rj A00;
    public final SF A01;

    static {
        A02();
        A04 = C2657fR.class.getSimpleName();
    }

    public C2657fR(InterfaceC2105Rj interfaceC2105Rj, C2503cu c2503cu) {
        this.A00 = interfaceC2105Rj;
        this.A00.A3s(new C2659fT(this));
        this.A01 = new SF(c2503cu);
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            Locale locale = Locale.US;
            InterfaceC2105Rj interfaceC2105Rj = this.A00;
            if (A03[2].charAt(7) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "B9WAOcp3zNbG4sQr12bKZPkRro";
            strArr[6] = "6ENVq9NVFWRAnG6rhAVuoXedHs5";
            String.format(locale, A00(0, 20, 44), Integer.valueOf(interfaceC2105Rj.A6p().size()));
        }
        for (InterfaceC2108Rm interfaceC2108Rm : this.A00.A6p()) {
            switch (C2104Ri.A00[interfaceC2108Rm.A9G().ordinal()]) {
                case 1:
                    A04(interfaceC2108Rm.getUrl());
                    break;
                case 2:
                    A06(interfaceC2108Rm.getUrl());
                    break;
                case 3:
                    A05(interfaceC2108Rm.getUrl());
                    break;
            }
        }
        this.A01.A0X(new C2658fS(this), new S8(A00(81, 36, 123), A00(125, 7, 50)));
    }

    public static void A02() {
        A02 = new byte[]{81, 115, 100, 109, 110, 96, 101, 104, 111, 102, 33, 36, 101, 33, 96, 114, 114, 100, 117, 114, 60, 30, 9, 0, 3, 13, 8, 5, 2, 11, 76, 5, 1, 13, 11, 9, 86, 76, 73, 31, 118, 84, 67, 74, 73, 71, 66, 79, 72, 65, 6, 75, 71, 84, 77, 83, 86, 28, 6, 3, 85, 86, 116, 99, 106, 105, 103, 98, 111, 104, 97, 38, 112, 111, 98, 99, 105, 60, 38, 35, 117, 50, 101, 48, 48, 96, 97, 98, 98, 123, 52, 110, 101, 100, 123, 103, 103, 51, 111, 123, 55, 100, 55, 101, 123, 100, 55, 100, 55, 51, 100, 50, 52, 53, 53, 51, 98, 55, 53, 34, 33, 34, 51, 36, 47, 106, 113, 116, 113, 112, 104, 113};
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 65), str);
        }
        SD sd2 = new SD(str, -1, -1, A00(81, 36, 123), A00(125, 7, 50));
        sd2.A02 = A00(117, 8, 106);
        this.A01.A0c(sd2);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 11), str);
        }
        SB sb2 = new SB(str, A00(81, 36, 123), A00(125, 7, 50));
        sb2.A04 = true;
        sb2.A02 = A00(117, 8, 106);
        this.A01.A0Y(sb2);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 43), str);
        }
        SB sb2 = new SB(str, A00(81, 36, 123), A00(125, 7, 50));
        sb2.A04 = false;
        sb2.A02 = A00(117, 8, 106);
        this.A01.A0b(sb2);
    }
}
