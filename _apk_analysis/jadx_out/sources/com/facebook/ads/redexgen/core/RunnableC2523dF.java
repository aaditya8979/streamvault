package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2523dF implements Runnable {
    public final /* synthetic */ C1767Ef A00;

    public RunnableC2523dF(C1767Ef c1767Ef) {
        this.A00 = c1767Ef;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0B() == 0) {
                return;
            }
            this.A00.A05.scrollBy(this.A00.A01, 0);
            this.A00.A04.postDelayed(this, 16L);
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
