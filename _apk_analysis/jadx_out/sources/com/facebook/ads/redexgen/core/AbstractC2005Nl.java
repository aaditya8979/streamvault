package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2005Nl {

    @Nullable
    public static HandlerC2004Nk A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static HandlerC2004Nk A00(C2503cu c2503cu) {
        if (A00 == null) {
            A00 = new HandlerC2004Nk(c2503cu);
        }
        return A00;
    }

    public static void A01(C2503cu c2503cu) {
        if (UA.A0F(c2503cu)) {
            A03(c2503cu);
        }
    }

    public static void A02(C2503cu c2503cu) {
        if (UA.A0E(c2503cu)) {
            A03(c2503cu);
        }
    }

    public static void A03(C2503cu c2503cu) {
        if (A01.compareAndSet(false, true)) {
            XJ.A01.execute(new C2739go(c2503cu));
        }
    }
}
