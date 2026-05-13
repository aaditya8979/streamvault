package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC3025ls<T> implements Iterator<T> {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ C3028lv A03;

    public AbstractC3025ls(C3028lv c3028lv) {
        this.A03 = c3028lv;
        this.A01 = this.A03.A03;
        this.A00 = this.A03.A0a();
        this.A02 = -1;
    }

    public /* synthetic */ AbstractC3025ls(C3028lv c3028lv, B9 b92) {
        this(c3028lv);
    }

    private void A01() {
        if (this.A03.A03 != this.A01) {
            throw new ConcurrentModificationException();
        }
    }

    private final void A02() {
        this.A01 += 32;
    }

    @ParametricNullness
    public abstract T A03(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 >= 0;
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        A01();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.A02 = this.A00;
        T tA03 = A03(this.A00);
        this.A00 = this.A03.A0b(this.A00);
        return tA03;
    }

    @Override // java.util.Iterator
    public final void remove() {
        A01();
        AbstractC3018ll.A04(this.A02 >= 0);
        A02();
        this.A03.remove(this.A03.A0E(this.A02));
        this.A00 = this.A03.A0c(this.A00, this.A02);
        this.A02 = -1;
    }
}
