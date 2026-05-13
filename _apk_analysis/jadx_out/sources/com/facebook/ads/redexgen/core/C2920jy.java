package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2920jy implements GX {
    public static String[] A03 = {"MPtFkEiIPrQJk6C68eapJqoHhp6zbLCW", "P1eCuU1JvuL46IL3Xh4EOSVLMCcJCOjT", "W4WpROs4sm5j6Tf0ztR0Y16lEj4WGQ", "4wLB1kD6U2fJ8LvWKaQYimBngFnzynrL", "j1g6H1G7HHWswscQmxGermXRDRDROF5f", "vYNShvJ8K3s57yIlGqGLfJHMZKUSU02I", "LyEFdcIU17ooQUQ0BZMXWJLXZvdofmIX", "P7XGal"};
    public static final InterfaceC1815Gb A04 = new InterfaceC1815Gb() { // from class: com.facebook.ads.redexgen.X.jz
        @Override // com.facebook.ads.redexgen.core.InterfaceC1815Gb
        public final GX[] A5F() {
            return C2920jy.A00();
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC1815Gb
        public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
            return AbstractC1814Ga.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final C2919jx A02 = new C2919jx();
    public final C4J A01 = new C4J(16384);

    public static /* synthetic */ GX[] A00() {
        return new GX[]{new C2920jy()};
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A02.A5U(gy, new C1921Ke(0, 1));
        gy.A6G();
        gy.AIN(new C2990lI(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2995lN interfaceC2995lN, C1833Gt c1833Gt) throws IOException {
        int i10 = interfaceC2995lN.read(this.A01.A0l(), 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        this.A01.A0f(0);
        this.A01.A0e(i10);
        if (!this.A00) {
            this.A02.AG6(0L, 4);
            this.A00 = true;
        }
        this.A02.A52(this.A01);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        this.A00 = false;
        this.A02.AIL();
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2995lN interfaceC2995lN) throws IOException {
        C4J c4j = new C4J(10);
        int i10 = 0;
        while (true) {
            byte[] bArrA0l = c4j.A0l();
            if (A03[3].charAt(10) != 'f') {
                throw new RuntimeException();
            }
            A03[3] = "dKI30oOFAvfBQiacazr45UFgS6k9aj5a";
            interfaceC2995lN.AG9(bArrA0l, 0, 10);
            c4j.A0f(0);
            if (c4j.A0K() != 4801587) {
                interfaceC2995lN.AI1();
                interfaceC2995lN.A3z(i10);
                int i11 = i10;
                int i12 = 0;
                while (true) {
                    interfaceC2995lN.AG9(c4j.A0l(), 0, 7);
                    c4j.A0f(0);
                    int iA0M = c4j.A0M();
                    if (iA0M == 44096 || iA0M == 44097) {
                        i12++;
                        if (i12 >= 4) {
                            return true;
                        }
                        int iA02 = GI.A02(c4j.A0l(), iA0M);
                        if (iA02 == -1) {
                            return false;
                        }
                        interfaceC2995lN.A3z(iA02 - 7);
                    } else {
                        i12 = 0;
                        interfaceC2995lN.AI1();
                        i11++;
                        if (i11 - i10 >= 8192) {
                            return false;
                        }
                        interfaceC2995lN.A3z(i11);
                    }
                }
            } else {
                c4j.A0g(3);
                int iA0H = c4j.A0H();
                i10 += iA0H + 10;
                interfaceC2995lN.A3z(iA0H);
            }
        }
    }
}
