package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class W0 {
    public static final AtomicReference<InterfaceC2222Vz> A00 = new AtomicReference<>(null);

    public static InterfaceC2222Vz A00() {
        InterfaceC2222Vz interfaceC2222Vz = A00.get();
        return interfaceC2222Vz == null ? new PR() : interfaceC2222Vz;
    }

    public static void A01(InterfaceC2222Vz interfaceC2222Vz) {
        A00.set(interfaceC2222Vz);
    }
}
