package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3014lh implements EO {
    public int A00;
    public int A01;
    public int A02;
    public EM[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;

    public C3014lh(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public C3014lh(boolean z10, int i10, int i11) {
        C3M.A07(i10 > 0);
        C3M.A07(i11 >= 0);
        this.A05 = z10;
        this.A04 = i10;
        this.A01 = i11;
        this.A03 = new EM[i11 + 100];
        if (i11 <= 0) {
            this.A06 = null;
            return;
        }
        this.A06 = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.A03[i12] = new EM(this.A06, i12 * i10);
        }
    }

    public final synchronized int A00() {
        return this.A00 * this.A04;
    }

    public final synchronized void A01() {
        if (this.A05) {
            A02(0);
        }
    }

    public final synchronized void A02(int i10) {
        boolean z10 = i10 < this.A02;
        this.A02 = i10;
        if (z10) {
            AJi();
        }
    }

    @Override // com.facebook.ads.redexgen.core.EO
    public final synchronized EM A41() {
        EM em2;
        this.A00++;
        if (this.A01 > 0) {
            EM[] emArr = this.A03;
            int i10 = this.A01 - 1;
            this.A01 = i10;
            em2 = (EM) C3M.A01(emArr[i10]);
            this.A03[this.A01] = null;
        } else {
            em2 = new EM(new byte[this.A04], 0);
            if (this.A00 > this.A03.length) {
                this.A03 = (EM[]) Arrays.copyOf(this.A03, this.A03.length * 2);
            }
        }
        return em2;
    }

    @Override // com.facebook.ads.redexgen.core.EO
    public final int A8A() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.EO
    public final synchronized void AGt(EM em2) {
        EM[] emArr = this.A03;
        int i10 = this.A01;
        this.A01 = i10 + 1;
        emArr[i10] = em2;
        this.A00--;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.EO
    public final synchronized void AGu(EN en2) {
        while (en2 != null) {
            EM[] emArr = this.A03;
            int i10 = this.A01;
            this.A01 = i10 + 1;
            emArr[i10] = en2.A6m();
            this.A00--;
            en2 = en2.AC3();
        }
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.EO
    public final synchronized void AJi() {
        int iMax = Math.max(0, AbstractC15184a.A05(this.A02, this.A04) - this.A00);
        if (iMax >= this.A01) {
            return;
        }
        if (this.A06 != null) {
            int i10 = 0;
            int i11 = this.A01 - 1;
            while (i10 <= i11) {
                EM em2 = (EM) C3M.A01(this.A03[i10]);
                if (em2.A01 == this.A06) {
                    i10++;
                } else {
                    EM em3 = (EM) C3M.A01(this.A03[i11]);
                    if (em3.A01 != this.A06) {
                        i11--;
                    } else {
                        this.A03[i10] = em3;
                        this.A03[i11] = em2;
                        i11--;
                        i10++;
                    }
                }
            }
            iMax = Math.max(iMax, i10);
            if (iMax >= this.A01) {
                return;
            }
        }
        Arrays.fill(this.A03, iMax, this.A01, (Object) null);
        this.A01 = iMax;
    }
}
