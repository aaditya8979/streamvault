package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2639f9 implements Runnable {
    public final /* synthetic */ C1707Bw A00;

    public RunnableC2639f9(C1707Bw c1707Bw) {
        this.A00 = c1707Bw;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            C1707Bw.A03(this.A00);
            throw null;
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
