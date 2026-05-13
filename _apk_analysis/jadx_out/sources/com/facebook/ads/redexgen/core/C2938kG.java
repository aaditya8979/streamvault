package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2938kG<V> implements Iterator<V> {
    public final Collection<V> A00;
    public final Iterator<V> A01;
    public final /* synthetic */ C2939kH A02;

    public C2938kG(C2939kH c2939kH) {
        this.A02 = c2939kH;
        this.A00 = this.A02.A00;
        this.A01 = AbstractC14501i.A05(c2939kH.A00);
    }

    public C2938kG(C2939kH c2939kH, Iterator<V> it) {
        this.A02 = c2939kH;
        this.A00 = this.A02.A00;
        this.A01 = it;
    }

    private final void A01() {
        this.A02.A04();
        if (this.A02.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
    }

    public final Iterator<V> A02() {
        A01();
        return this.A01;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        A01();
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final V next() {
        A01();
        return this.A01.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A01.remove();
        AbstractC14501i.A01(this.A02.A04);
        this.A02.A05();
    }
}
