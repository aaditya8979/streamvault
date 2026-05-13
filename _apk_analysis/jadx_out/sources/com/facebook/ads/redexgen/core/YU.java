package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YU implements InterfaceC2206Vj {
    @Override // com.facebook.ads.redexgen.core.InterfaceC2206Vj
    public final void AHp(Throwable th2, Object obj) {
        if (obj instanceof SM) {
            C2529dL c2529dLA6e = ((SM) obj).A6e();
            if (c2529dLA6e != null) {
                c2529dLA6e.A0Q(th2);
                return;
            }
            return;
        }
        if (obj instanceof View) {
            Context context = ((View) obj).getContext();
            if (context instanceof C2529dL) {
                ((C2529dL) context).A0Q(th2);
            }
        }
    }
}
