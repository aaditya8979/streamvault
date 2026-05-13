package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2999lS implements InterfaceC1836Gw {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final boolean A06;

    public C2999lS(long j10, long j11, int i10, int i11, boolean z10) {
        this.A05 = j10;
        this.A04 = j11;
        this.A01 = i11 == -1 ? 1 : i11;
        this.A00 = i10;
        this.A06 = z10;
        if (j10 == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
        } else {
            this.A02 = j10 - j11;
            this.A03 = A01(j10, j11, i10);
        }
    }

    private long A00(long j10) {
        long jMin = (((((long) this.A00) * j10) / 8000000) / ((long) this.A01)) * ((long) this.A01);
        if (this.A02 != -1) {
            jMin = Math.min(jMin, this.A02 - ((long) this.A01));
        }
        return this.A04 + Math.max(jMin, 0L);
    }

    public static long A01(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / ((long) i10);
    }

    public final long A02(long j10) {
        return A01(j10, this.A04, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final long A7l() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final C1835Gv A8t(long j10) {
        if (this.A02 == -1 && !this.A06) {
            return new C1835Gv(new C1837Gx(0L, this.A04));
        }
        long jA00 = A00(j10);
        long jA02 = A02(jA00);
        C1837Gx c1837Gx = new C1837Gx(jA02, jA00);
        if (this.A02 == -1 || jA02 >= j10 || ((long) this.A01) + jA00 >= this.A05) {
            return new C1835Gv(c1837Gx);
        }
        long j11 = ((long) this.A01) + jA00;
        return new C1835Gv(c1837Gx, new C1837Gx(A02(j11), j11));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final boolean AAa() {
        return this.A02 != -1 || this.A06;
    }
}
