package com.facebook.ads.redexgen.core;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2057Pn implements Runnable {
    public final /* synthetic */ C15796j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC2057Pn(C15796j c15796j, ArrayList arrayList) {
        this.A00 = c15796j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (C2066Pw c2066Pw : this.A01) {
            this.A00.A0e(c2066Pw.A04, c2066Pw.A00, c2066Pw.A01, c2066Pw.A02, c2066Pw.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
