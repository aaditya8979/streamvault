package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2484cb implements Runnable {
    public final /* synthetic */ C15093r A00;

    public RunnableC2484cb(C15093r c15093r) {
        this.A00 = c15093r;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            ((G2) this.A00).A09.A4b(((G2) this.A00).A0A.A7o());
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
