package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2357aY implements Runnable {
    public final /* synthetic */ C1914Jx A00;

    public RunnableC2357aY(C1914Jx c1914Jx) {
        this.A00 = c1914Jx;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A02 = true;
            if (((AbstractC2363ae) this.A00).A06.A0E() != null) {
                ((AbstractC2363ae) this.A00).A06.A0E().AFE(true);
            }
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
