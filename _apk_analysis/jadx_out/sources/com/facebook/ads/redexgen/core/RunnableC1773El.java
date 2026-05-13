package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RunnableC1773El implements Runnable {
    public final InterfaceC1772Ek A00;

    public RunnableC1773El(InterfaceC1772Ek interfaceC1772Ek) {
        this.A00 = interfaceC1772Ek;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            this.A00.AE4();
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
