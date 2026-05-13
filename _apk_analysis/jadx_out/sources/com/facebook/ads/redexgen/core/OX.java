package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OX<V> implements Collection<V> {
    public static String[] A01 = {"B65p9FaUvzrFNvwuG6LjFu3dW8", "xEYdbkQkXJmqNi6lUscBQUgiZa7D0Dxz", "kpPcM5P9PMrcR9maJ", "lIn8lLeU70LUHRqRy8hC6rghr0456Bk3", "xAyovFCLcJcKz6S3I", "BHkXiShRs9wapcYGvvb8XQo", "e883n5N2Jnnmw9lqw", "xzZfUck7bISpz3H6ivOii"};
    public final /* synthetic */ OY A00;

    public OX(OY oy) {
        this.A00 = oy;
    }

    @Override // java.util.Collection
    public final boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.A00.A0D();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.A06(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.A00.A04() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new OT(this.A00, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        int iA06 = this.A00.A06(obj);
        if (iA06 < 0) {
            return false;
        }
        this.A00.A0E(iA06);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int iA04 = this.A00.A04();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < iA04) {
            OY oy = this.A00;
            String[] strArr = A01;
            if (strArr[4].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "8TyfarL1WEatJJNOns6yk";
            strArr2[2] = "ZFPu54ieTgZ9QJdC5";
            if (collection.contains(oy.A0B(i10, 1))) {
                this.A00.A0E(i10);
                i10--;
                iA04--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int iA04 = this.A00.A04();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < iA04) {
            if (!collection.contains(this.A00.A0B(i10, 1))) {
                this.A00.A0E(i10);
                i10--;
                iA04--;
                String[] strArr = A01;
                if (strArr[4].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[7] = "W6fJV23d83VeGu0xKkUvg";
                strArr2[2] = "sGDul30tjAcSIzuwi";
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.A00.A04();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.A00.A0G(1);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.A00.A0H(tArr, 1);
    }
}
