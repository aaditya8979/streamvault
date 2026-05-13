package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3W, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3W {
    public boolean A00;
    public final C3T A01;

    public C3W() {
        this(C3T.A00);
    }

    public C3W(C3T c3t) {
        this.A01 = c3t;
    }

    public final synchronized void A00() throws InterruptedException {
        while (!this.A00) {
            wait();
        }
    }

    public final synchronized void A01() {
        boolean z10 = false;
        while (!this.A00) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean A02() {
        boolean z10;
        z10 = this.A00;
        this.A00 = false;
        return z10;
    }

    public final synchronized boolean A03() {
        return this.A00;
    }

    public final synchronized boolean A04() {
        if (this.A00) {
            return false;
        }
        this.A00 = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean A05(long j10) throws InterruptedException {
        if (j10 <= 0) {
            return this.A00;
        }
        long jA6B = this.A01.A6B();
        long j11 = jA6B + j10;
        if (j11 < jA6B) {
            A00();
        } else {
            while (!this.A00 && jA6B < j11) {
                wait(j11 - jA6B);
                jA6B = this.A01.A6B();
            }
        }
        return this.A00;
    }
}
