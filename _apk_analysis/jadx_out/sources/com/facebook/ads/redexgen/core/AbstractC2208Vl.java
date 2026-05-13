package com.facebook.ads.redexgen.core;

import com.ironsource.mediationsdk.demandOnly.b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2208Vl {
    public static final Set<Object> A00 = Collections.newSetFromMap(new WeakHashMap());
    public static final AtomicBoolean A01 = new AtomicBoolean(true);
    public static final AtomicReference<InterfaceC2206Vj> A02 = new AtomicReference<>();

    public static void A00(Throwable th2, Object obj) throws Throwable {
        if (!A01.get()) {
            throw th2;
        }
        A00.add(obj);
        W0.A00().AAo(b.C0397b.f32458i, th2);
        InterfaceC2206Vj interfaceC2206Vj = A02.get();
        if (interfaceC2206Vj != null) {
            interfaceC2206Vj.AHp(th2, obj);
        }
    }

    public static void A01(boolean z10, InterfaceC2206Vj interfaceC2206Vj) {
        A01.set(z10);
        A02.set(interfaceC2206Vj);
    }

    public static boolean A02(Object obj) {
        return A00.contains(obj);
    }
}
