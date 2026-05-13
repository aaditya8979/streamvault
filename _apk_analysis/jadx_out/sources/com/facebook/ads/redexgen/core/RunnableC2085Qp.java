package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2085Qp implements Runnable {
    public final /* synthetic */ C2086Qq A00;

    public RunnableC2085Qp(C2086Qq c2086Qq) {
        this.A00 = c2086Qq;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05 = 0L;
            this.A00.A06 = false;
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
