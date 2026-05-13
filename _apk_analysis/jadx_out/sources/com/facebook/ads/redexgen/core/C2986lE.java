package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2986lE implements GP {
    public static String[] A03 = {"Qzrb2NyX11iip4M0Dun9HjrVhDBjGiaF", "S4lxERGEQHczdoRlIRLlXReEKfWFWSGc", "txU8e6wljbe290bqTydjfEMDFUDvEmx5", "ZB68ibpDVF3DEFIIdRwQIG37zRUG2jhG", "NKfzuQ6LKFKezVni40AKhLW9Qs", "gUOm4cnsv29C5J2bDVOWEpGrIAhYUn7e", "xRx4EoAOCCZ90h8tA3pJ1YmFxzetviZR", "6LlO7okteSZZNTbDPWq3J1SHLhykMwkf"};
    public final int A00;
    public final C1816Gc A01;
    public final C1821Gh A02;

    public C2986lE(C1821Gh c1821Gh, int i10) {
        this.A02 = c1821Gh;
        this.A00 = i10;
        this.A01 = new C1816Gc();
    }

    private long A00(InterfaceC2995lN interfaceC2995lN) throws IOException {
        while (interfaceC2995lN.A8a() < interfaceC2995lN.A8G() - 6 && !AbstractC1817Gd.A09(interfaceC2995lN, this.A02, this.A00, this.A01)) {
            String[] strArr = A03;
            if (strArr[1].charAt(7) == strArr[7].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "MdA2mB0qiCN7NKRKcBY3aVGEnEzRIKP4";
            strArr2[3] = "Kp5wPJFyOGMB7tBJUi3Fl7WX9iQtExSk";
            interfaceC2995lN.A3z(1);
        }
        if (interfaceC2995lN.A8a() < interfaceC2995lN.A8G() - 6) {
            return this.A01.A00;
        }
        interfaceC2995lN.A3z((int) (interfaceC2995lN.A8G() - interfaceC2995lN.A8a()));
        return this.A02.A09;
    }

    @Override // com.facebook.ads.redexgen.core.GP
    public final /* synthetic */ void AFA() {
    }

    @Override // com.facebook.ads.redexgen.core.GP
    public final GN AIC(InterfaceC2995lN interfaceC2995lN, long j10) throws IOException {
        long jA8f = interfaceC2995lN.A8f();
        long jA00 = A00(interfaceC2995lN);
        long jA8a = interfaceC2995lN.A8a();
        interfaceC2995lN.A3z(Math.max(6, this.A02.A06));
        long jA002 = A00(interfaceC2995lN);
        return (jA00 > j10 || jA002 <= j10) ? jA002 <= j10 ? GN.A05(jA002, interfaceC2995lN.A8a()) : GN.A04(jA00, jA8f) : GN.A03(jA8a);
    }
}
