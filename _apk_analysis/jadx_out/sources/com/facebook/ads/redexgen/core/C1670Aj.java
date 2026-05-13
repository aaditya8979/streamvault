package com.facebook.ads.redexgen.core;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1670Aj<T> extends AbstractC3240pg<T> {
    public T A00;

    public C1670Aj(T t10) {
        this.A00 = t10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t10 = this.A00;
        this.A00 = null;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException();
    }
}
