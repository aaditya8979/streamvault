package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2949kR implements GX {
    public static byte[] A03;
    public static String[] A04 = {"IFBRawCVF0AWJOiiVagp2bzm1iWWQKSj", "auHMqC8YUXWsvqiTg7", "x05hwyQceYKgfv4KdHsaZDzMFYGIFABO", "EiWauAjA92n8uYBsDF1eTop4V9uY", "nHLlm8XHOjaWHtwU5p4BIc0GM3UweWlu", "dBwF9hq9j3gGLabp", "n4a5QuSOEmxq5i2DA2", "Zy0ftHIbrTR5qGqkd"};
    public static final InterfaceC1815Gb A05;
    public GY A00;
    public AbstractC1890Iz A01;
    public boolean A02;

    static {
        A02();
        A05 = new InterfaceC1815Gb() { // from class: com.facebook.ads.redexgen.X.kS
            @Override // com.facebook.ads.redexgen.core.InterfaceC1815Gb
            public final GX[] A5F() {
                return C2949kR.A04();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1815Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC1814Ga.A01(this, uri, map);
            }
        };
    }

    public static C4J A00(C4J c4j) {
        c4j.A0f(0);
        return c4j;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[3].length() == 20) {
                throw new RuntimeException();
            }
            A04[3] = "IEdap1c7a0gADNuxefg";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 36);
            i13++;
        }
    }

    public static void A02() {
        A03 = new byte[]{96, 71, 79, 74, 67, 66, 6, 82, 73, 6, 66, 67, 82, 67, 84, 75, 79, 72, 67, 6, 68, 79, 82, 85, 82, 84, 67, 71, 75, 6, 82, 95, 86, 67};
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private boolean A03(InterfaceC2995lN interfaceC2995lN) throws IOException {
        C1886Iv c1886Iv = new C1886Iv();
        if (!c1886Iv.A05(interfaceC2995lN, true) || (c1886Iv.A04 & 2) != 2) {
            return false;
        }
        int iMin = Math.min(c1886Iv.A00, 8);
        C4J c4j = new C4J(iMin);
        interfaceC2995lN.AG9(c4j.A0l(), 0, iMin);
        if (C2951kT.A01(A00(c4j))) {
            this.A01 = new C2951kT();
        } else if (C2946kO.A06(A00(c4j))) {
            this.A01 = new C2946kO();
        } else {
            if (!C2948kQ.A02(A00(c4j))) {
                return false;
            }
            this.A01 = new C2948kQ();
        }
        return true;
    }

    public static /* synthetic */ GX[] A04() {
        return new GX[]{new C2949kR()};
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A00 = gy;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2995lN interfaceC2995lN, C1833Gt c1833Gt) throws IOException {
        C3M.A02(this.A00);
        if (this.A01 == null) {
            if (!A03(interfaceC2995lN)) {
                throw C14742i.A01(A01(0, 34, 2), null);
            }
            interfaceC2995lN.AI1();
        }
        boolean z10 = this.A02;
        if (A04[0].charAt(6) == 'U') {
            throw new RuntimeException();
        }
        A04[5] = "ISTJLhLpuA8o4P7J";
        if (!z10) {
            H1 h1AJh = this.A00.AJh(0, 1);
            this.A00.A6G();
            this.A01.A08(this.A00, h1AJh);
            this.A02 = true;
        }
        return this.A01.A04(interfaceC2995lN, c1833Gt);
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        if (this.A01 != null) {
            this.A01.A07(j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2995lN interfaceC2995lN) throws IOException {
        try {
            return A03(interfaceC2995lN);
        } catch (C14742i unused) {
            return false;
        }
    }
}
