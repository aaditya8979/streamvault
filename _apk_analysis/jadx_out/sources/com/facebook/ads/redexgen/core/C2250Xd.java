package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2250Xd {
    public static C2250Xd A02;
    public final C2030Om A00;
    public final C2252Xf A01;

    public C2250Xd(C2529dL c2529dL, Executor executor, TE te2) {
        this.A01 = new C2252Xf(c2529dL);
        this.A00 = new C2030Om(executor, te2, c2529dL);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C2529dL c2529dL, Executor executor, TE te2) {
        if (U7.A1X(c2529dL)) {
            if (A02 != null) {
                A02.A02(te2);
            } else {
                A02 = new C2250Xd(c2529dL, executor, te2);
                A02.A00();
            }
        }
    }

    private void A02(TE te2) {
        this.A00.A07(te2);
    }
}
