package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@DoNotMock("Use ImmutableMap.of or another implementation")
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3077mj<K, V> implements Map<K, V>, Serializable {
    public static byte[] A03 = null;
    public static String[] A04 = {"vKCQqMCBbbLRNayk93g", "pkt0IymnSuuTvT2UABZ", "PNc8ARlkPwYFJqJCIOuFP53ZqzL63Ot9", "eX2I8z36J32Go", "gIGV4Wf8BZM4VYT7BzYv5KONe75pspBB", "tYe4jTWn6nAHNSv3aqiqFSpTtkmDAUnf", "8sr0nS9u8yYglBLPy9xKZ", "QmruhXeOtXDmPURP7V7IzoRRfHSq4IXC"};
    public static final Map.Entry<?, ?>[] A05;
    public static final long serialVersionUID = 912559;

    @CheckForNull
    @LazyInit
    public transient AbstractC3068ma<V> A00;

    @CheckForNull
    @LazyInit
    public transient AbstractC1672Al<Map.Entry<K, V>> A01;

    @CheckForNull
    @LazyInit
    public transient AbstractC1672Al<K> A02;

    static {
        A08();
        A05 = new Map.Entry[0];
    }

    public static <K, V> C3075mh<K, V> A03() {
        return new C3075mh<>();
    }

    public static <K, V> AbstractC3077mj<K, V> A04() {
        AbstractC3077mj<K, V> abstractC3077mj = (AbstractC3077mj<K, V>) AL.A04;
        if (A04[4].charAt(3) != 'V') {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[0] = "QWSx7KQEMPZzsm7sYqB";
        strArr[1] = "rV1plHJifYQu2yuYFjd";
        return abstractC3077mj;
    }

    public static <K, V> AbstractC3077mj<K, V> A05(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C3075mh c3075mh = new C3075mh(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        c3075mh.A04(iterable);
        return c3075mh.A07();
    }

    public static <K, V> AbstractC3077mj<K, V> A06(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC3077mj) && !(map instanceof SortedMap)) {
            AbstractC3077mj<K, V> abstractC3077mj = (AbstractC3077mj) map;
            if (!abstractC3077mj.A0F()) {
                return abstractC3077mj;
            }
        }
        return A05(map.entrySet());
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A03 = new byte[]{103, -123, 119, 50, 101, 119, -124, 123, 115, 126, 123, -116, 119, 118, 88, -127, -124, 127};
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(A07(0, 18, 8));
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: A09, reason: merged with bridge method [inline-methods] */
    public AbstractC3068ma<V> values() {
        AbstractC3068ma<V> abstractC3068maA0A = this.A00;
        if (abstractC3068maA0A == null) {
            abstractC3068maA0A = A0A();
            if (A04[3].length() == 23) {
                throw new RuntimeException();
            }
            A04[6] = "23ujWmcydF5ICCpn56C";
            this.A00 = abstractC3068maA0A;
        }
        return abstractC3068maA0A;
    }

    public abstract AbstractC3068ma<V> A0A();

    @Override // java.util.Map
    /* JADX INFO: renamed from: A0B, reason: merged with bridge method [inline-methods] */
    public AbstractC1672Al<Map.Entry<K, V>> entrySet() {
        AbstractC1672Al<Map.Entry<K, V>> abstractC1672Al = this.A01;
        if (abstractC1672Al != null) {
            return abstractC1672Al;
        }
        AbstractC1672Al<Map.Entry<K, V>> abstractC1672AlA0D = A0D();
        this.A01 = abstractC1672AlA0D;
        return abstractC1672AlA0D;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: A0C, reason: merged with bridge method [inline-methods] */
    public AbstractC1672Al<K> keySet() {
        AbstractC1672Al<K> abstractC1672Al = this.A02;
        if (abstractC1672Al != null) {
            return abstractC1672Al;
        }
        AbstractC1672Al<K> abstractC1672AlA0E = A0E();
        this.A02 = abstractC1672AlA0E;
        return abstractC1672AlA0E;
    }

    public abstract AbstractC1672Al<Map.Entry<K, V>> A0D();

    public abstract AbstractC1672Al<K> A0E();

    public abstract boolean A0F();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object obj) {
        return AbstractC3154nz.A0B(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    @Override // java.util.Map
    public int hashCode() {
        return AbstractC3209ou.A00(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return AbstractC3154nz.A08(this);
    }
}
