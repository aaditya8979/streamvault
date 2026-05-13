package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC3247pn implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C3246pm A01;
    public final /* synthetic */ Exception A02;

    public RunnableC3247pn(C3246pm c3246pm, int i10, Exception exc) {
        this.A01 = c3246pm;
        this.A00 = i10;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            try {
                if (this.A01.A01) {
                    if (A8.A07 && this.A01.A08()) {
                        this.A01.A0C();
                    } else {
                        this.A01.A05(this.A01.A05.AC6());
                        this.A01.A04.postDelayed(this.A01.A0A, this.A00);
                    }
                }
            } catch (Exception e10) {
                e10.initCause(this.A02);
                throw e10;
            }
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
