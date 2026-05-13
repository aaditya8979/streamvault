package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2453c6 implements Runnable {
    public final /* synthetic */ C15314n A00;

    public RunnableC2453c6(C15314n c15314n) {
        this.A00 = c15314n;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A07 = true;
            this.A00.A0M.AFE(true);
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
