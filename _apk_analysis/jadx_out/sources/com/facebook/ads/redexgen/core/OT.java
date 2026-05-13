package com.facebook.ads.redexgen.core;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OT<T> implements Iterator<T> {
    public int A00;
    public int A01;
    public boolean A02 = false;
    public final int A03;
    public final /* synthetic */ OY A04;

    public OT(OY oy, int i10) {
        this.A04 = oy;
        this.A03 = i10;
        this.A01 = oy.A04();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 < this.A01;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T t10 = (T) this.A04.A0B(this.A00, this.A03);
        this.A00++;
        this.A02 = true;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.A02) {
            throw new IllegalStateException();
        }
        this.A00--;
        this.A01--;
        this.A02 = false;
        this.A04.A0E(this.A00);
    }
}
