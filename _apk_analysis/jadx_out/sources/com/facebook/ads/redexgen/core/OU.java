package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OU<K, V> implements Set<Map.Entry<K, V>> {
    public static String[] A01 = {"YtNF8b8ioPsgGgaDUde7WsjUMR00Jzoy", "ONmCOidcB6U5WZLM0OONVLfChSccD2jC", "SJu8u5Zh6YlgArwXrUirNpL4997vCJ", "nE4owr1wlu2VobktzduoSxTpcn75jZ1P", "qSRAP7Al4GPL3nfNBbzCOWjKh9ZAaoHj", "", "XO0jmWeq4", "JpA0oM1ow"};
    public final /* synthetic */ OY A00;

    public OU(OY oy) {
        this.A00 = oy;
    }

    private final boolean A00(@Nullable Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(@Nullable Object obj) {
        A00((Map.Entry) obj);
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        int iA04 = this.A00.A04();
        for (Map.Entry<K, V> entry : collection) {
            this.A00.A0F(entry.getKey(), entry.getValue());
        }
        return iA04 != this.A00.A04();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.A00.A0D();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(@Nullable Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int iA05 = this.A00.A05(entry.getKey());
        if (iA05 < 0) {
            return false;
        }
        return OR.A04(this.A00.A0B(iA05, 1), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return OY.A03(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i10 = 0;
        for (int iA04 = this.A00.A04() - 1; iA04 >= 0; iA04--) {
            OY oy = this.A00;
            String[] strArr = A01;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "tAEwYau76";
            strArr2[7] = "8QLk4N8pE";
            int iHashCode = 0;
            Object objA0B = oy.A0B(iA04, 0);
            Object objA0B2 = this.A00.A0B(iA04, 1);
            int iHashCode2 = objA0B == null ? 0 : objA0B.hashCode();
            if (objA0B2 != null) {
                iHashCode = objA0B2.hashCode();
            }
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.A04() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new OW(this.A00);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.A00.A04();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        throw new UnsupportedOperationException();
    }
}
