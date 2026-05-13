package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Or, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2035Or<T> extends AbstractRunnableC2216Vt {
    public final WeakReference<T> A00;

    public AbstractC2035Or(T t10) {
        this.A00 = new WeakReference<>(t10);
    }

    public final T A08() {
        return this.A00.get();
    }
}
