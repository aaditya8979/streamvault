package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2304Zf implements Runnable {
    public final /* synthetic */ C2305Zg A00;
    public final /* synthetic */ InterfaceC2306Zh A01;

    public RunnableC2304Zf(C2305Zg c2305Zg, InterfaceC2306Zh interfaceC2306Zh) {
        this.A00 = c2305Zg;
        this.A01 = interfaceC2306Zh;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            this.A01.ACO();
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
