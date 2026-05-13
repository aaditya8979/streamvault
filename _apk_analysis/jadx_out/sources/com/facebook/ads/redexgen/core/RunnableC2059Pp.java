package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2059Pp implements Runnable {
    public final /* synthetic */ C15796j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC2059Pp(C15796j c15796j, ArrayList arrayList) {
        this.A00 = c15796j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            this.A00.A0d((AbstractC2076Qg) it.next());
        }
        this.A01.clear();
        this.A00.A01.remove(this.A01);
    }
}
