package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9F implements InterfaceC3054mM, InterfaceC3055mN {
    public static String[] A06 = {"JXRw8dEnvO1Lr4g7cFUS0dvQrSj2gCrD", "hvHNuBxl", "xmWilmV3z2eIIj1", "UUtHfwhImwRJiupXWlBcpFq10hKf2hZ3", "Gjwbiw3zcCnfnivX0C6Z4KLegMayRhyW", "PFLAFIzQgEofbdrT2htWxpP7W2gVOOgi", "405rypbMY6P", "HWuA8Rz9jBHRgd5bymvhijPSyV36G6mN"};
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC3055mN A03;
    public C3058mQ[] A04 = new C3058mQ[0];
    public final InterfaceC3054mM A05;

    public C9F(InterfaceC3054mM interfaceC3054mM, boolean z10, long j10, long j11) {
        this.A05 = interfaceC3054mM;
        this.A02 = z10 ? j10 : -9223372036854775807L;
        this.A01 = j10;
        this.A00 = j11;
    }

    private C7I A00(long j10, C7I c7i) {
        long jA0T = AbstractC15184a.A0T(c7i.A01, 0L, j10 - this.A01);
        long jA0T2 = AbstractC15184a.A0T(c7i.A00, 0L, this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j10);
        if (jA0T == c7i.A01) {
            long j11 = c7i.A00;
            if (A06[6].length() != 11) {
                throw new RuntimeException();
            }
            A06[0] = "SySHx2FlEzism2SEaRZKk1Ki9OIwKCgL";
            if (jA0T2 == j11) {
                return c7i;
            }
        }
        return new C7I(jA0T, jA0T2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1730Cu
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ACs(InterfaceC3054mM interfaceC3054mM) {
        ((InterfaceC3055mN) C3M.A01(this.A03)).ACs(this);
    }

    public static boolean A02(long j10, InterfaceC3016lj[] interfaceC3016ljArr) {
        if (j10 != 0) {
            for (InterfaceC3016lj interfaceC3016lj : interfaceC3016ljArr) {
                if (interfaceC3016lj != null) {
                    C3206or c3206orA8u = interfaceC3016lj.A8u();
                    if (!AbstractC14732h.A0G(c3206orA8u.A0W, c3206orA8u.A0R)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1731Cv
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4k(long j10) {
        this.A05.A4k(j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final boolean A54(long j10) {
        return this.A05.A54(j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final void A5s(long j10, boolean z10) {
        this.A05.A5s(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final long A6j(long j10, C7I c7i) {
        if (j10 == this.A01) {
            return this.A01;
        }
        return this.A05.A6j(j10, A00(j10, c7i));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1731Cv
    @MetaExoPlayerCustomization("Added in D9949576 for unstall buffer")
    public final long A6y(long j10) {
        return this.A05.A6y(j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final long A70() {
        long jA70 = this.A05.A70();
        if (jA70 == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && jA70 >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return jA70;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final long A8T() {
        long jA8T = this.A05.A8T();
        if (jA8T != Long.MIN_VALUE) {
            long j10 = this.A00;
            if (A06[0].charAt(29) != 'C') {
                throw new RuntimeException();
            }
            A06[0] = "QBPPyRyowan8CCGBQiXIHMf03VOUOCSC";
            if (j10 == Long.MIN_VALUE || jA8T < this.A00) {
                return jA8T;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final C3043mA A9E() {
        return this.A05.A9E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final void ABt() throws IOException {
        if (0 != 0) {
            throw null;
        }
        this.A05.ABt();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3055mN
    public final void AEk(InterfaceC3054mM interfaceC3054mM) {
        if (0 != 0) {
            return;
        }
        ((InterfaceC3055mN) C3M.A01(this.A03)).AEk(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final void AGL(InterfaceC3055mN interfaceC3055mN, long j10) {
        this.A03 = interfaceC3055mN;
        this.A05.AGL(this, j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final long AGg() {
        if (A03()) {
            long j10 = this.A02;
            this.A02 = -9223372036854775807L;
            long jAGg = AGg();
            return jAGg != -9223372036854775807L ? jAGg : j10;
        }
        InterfaceC3054mM interfaceC3054mM = this.A05;
        if (A06[2].length() == 0) {
            throw new RuntimeException();
        }
        A06[6] = "ABWUoGiNBoa";
        long jAGg2 = interfaceC3054mM.AGg();
        if (jAGg2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        C3M.A08(jAGg2 >= this.A01);
        if (this.A00 != Long.MIN_VALUE && jAGg2 > this.A00) {
            z10 = false;
        }
        C3M.A08(z10);
        return jAGg2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final void AGm(long j10) {
        this.A05.AGm(j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final long AIO(@MetaExoPlayerCustomization long j10, boolean z10) {
        this.A02 = -9223372036854775807L;
        boolean z11 = false;
        for (C3058mQ c3058mQ : this.A04) {
            if (c3058mQ != null) {
                c3058mQ.A00();
            }
        }
        long jAIO = this.A05.AIO(j10, z10);
        if (jAIO == j10 || (jAIO >= this.A01 && (this.A00 == Long.MIN_VALUE || jAIO <= this.A00))) {
            z11 = true;
        }
        C3M.A08(z11);
        return jAIO;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AIP(com.facebook.ads.redexgen.core.InterfaceC3016lj[] r18, boolean[] r19, com.facebook.ads.redexgen.core.InterfaceC1727Cr[] r20, boolean[] r21, long r22) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C9F.AIP(com.facebook.ads.redexgen.X.lj[], boolean[], com.facebook.ads.redexgen.X.Cr[], boolean[], long):long");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1731Cv
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AIs(boolean z10) {
        this.A05.AIs(z10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1731Cv
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AJq(byte b10) {
        this.A05.AJq(b10);
    }
}
