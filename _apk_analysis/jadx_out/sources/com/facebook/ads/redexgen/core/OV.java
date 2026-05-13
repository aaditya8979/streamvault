package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: Add missing generic type declarations: [K] */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OV<K> implements Set<K> {
    public static String[] A01 = {"edFq1RSzVbogperxRnGO2mwS9T0C3jXY", "CE90aEI9KYNoN0DMFbwcn9PMt89CsnEy", "tPPb", "CijerYzHuYsgCporrbQrcy6DwpkaY1hX", "Nwp2N8bBhYR0nMsdl7Yct", "Yte1vUSgji4S3VNobeKxGdrgBkFaACT", "hyxYDNsU9Fu2EdzaavUXH", "kSbZdYOgqhrWj8RnTgPZsuZs4QqXHZoL"};
    public final /* synthetic */ OY A00;

    public OV(OY oy) {
        this.A00 = oy;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(@Nullable K k10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends K> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.A00.A0D();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(@Nullable Object obj) {
        return this.A00.A05(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return OY.A00(this.A00.A07(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return OY.A03(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i10 = 0;
        for (int iA04 = this.A00.A04() - 1; iA04 >= 0; iA04--) {
            int iHashCode = 0;
            Object objA0B = this.A00.A0B(iA04, 0);
            if (objA0B != null) {
                iHashCode = objA0B.hashCode();
            }
            i10 += iHashCode;
        }
        return i10;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.A04() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<K> iterator() {
        return new OT(this.A00, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int iA05 = this.A00.A05(obj);
        if (iA05 < 0) {
            return false;
        }
        this.A00.A0E(iA05);
        String[] strArr = A01;
        if (strArr[1].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[4] = "xtpBes5HGReh40nAQqVKY";
        strArr2[6] = "hpfnMqiRo4gFf5SPN0UOy";
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return OY.A01(this.A00.A07(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return OY.A02(this.A00.A07(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.A00.A04();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.A00.A0G(0);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.A00.A0H(tArr, 0);
    }
}
