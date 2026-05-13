package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC14501i<K, V> extends BD<K, V> implements Serializable {
    public static byte[] A02 = null;
    public static String[] A03 = {"8r4g5TVHuPTTEnOtjBSYLe2NoPZev3PL", "ZANRIcgacCs2MrGdQFs4BnSQ4f0OwMHM", "INAFHP4NB26l7mhFzzAYwDEUO08LdW1T", "w9HTcMerj5Ucor1CBa36675WVQ4LimP", "S0p05mXNQ0J7ss", "bhB1flpiQfpMN0", "TPylgZWOdIZWygeLq1OgLn1DVzZt4taa", "Gp6xvn2xjKoLwUaOKBIxtDMJneYJVeH8"};
    public static final long serialVersionUID = 2447537837011683357L;
    public transient int A00;
    public transient Map<K, Collection<V>> A01;

    static {
        A08();
    }

    public AbstractC14501i(Map<K, Collection<V>> map) {
        AbstractC2871jA.A0C(map.isEmpty());
        this.A01 = map;
    }

    public static /* synthetic */ int A00(AbstractC14501i abstractC14501i) {
        int i10 = abstractC14501i.A00;
        abstractC14501i.A00 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A01(AbstractC14501i abstractC14501i) {
        int i10 = abstractC14501i.A00;
        abstractC14501i.A00 = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int A02(AbstractC14501i abstractC14501i, int i10) {
        int i11 = abstractC14501i.A00 + i10;
        abstractC14501i.A00 = i11;
        return i11;
    }

    public static /* synthetic */ int A03(AbstractC14501i abstractC14501i, int i10) {
        int i11 = abstractC14501i.A00 - i10;
        abstractC14501i.A00 = i11;
        return i11;
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static <E> Iterator<E> A05(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public static void A08() {
        A02 = new byte[]{56, 19, 1, 86, 53, 25, 26, 26, 19, 21, 2, 31, 25, 24, 86, 0, 31, 25, 26, 23, 2, 19, 18, 86, 2, 30, 19, 86, 53, 25, 26, 26, 19, 21, 2, 31, 25, 24, 86, 5, 6, 19, 21};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(@CheckForNull Object obj) {
        Collection collection = (Collection) AbstractC3154nz.A06(this.A01, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.A00 -= size;
        }
    }

    @Override // com.facebook.ads.redexgen.core.BD
    public final Collection<V> A0B() {
        return new C2942kK(this);
    }

    @Override // com.facebook.ads.redexgen.core.BD
    public Iterator<V> A0C() {
        return new BH(this);
    }

    public abstract Collection<V> A0D();

    public Collection<V> A0E(@ParametricNullness K k10) {
        return A0D();
    }

    public abstract Collection<V> A0F(@ParametricNullness K k10, Collection<V> collection);

    public abstract <E> Collection<E> A0G(Collection<E> collection);

    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/List<TV;>;Lcom/facebook/ads/redexgen/X/1i<TK;TV;>.WrappedCollection;)Ljava/util/List<TV;>; */
    public final List A0H(@ParametricNullness Object obj, @CheckForNull List list, C2939kH c2939kH) {
        return list instanceof RandomAccess ? new C14521k(this, obj, list, c2939kH) : new BE(this, obj, list, c2939kH);
    }

    public Map<K, Collection<V>> A0I() {
        return this.A01;
    }

    public final Map<K, Collection<V>> A0J() {
        if (this.A01 instanceof NavigableMap) {
            return new C0Y(this, (NavigableMap) this.A01);
        }
        boolean z10 = this.A01 instanceof SortedMap;
        if (A03[2].charAt(31) == 'o') {
            throw new RuntimeException();
        }
        A03[3] = "NCYt1eTwLWbpcysHbDqNMrCxO6pYN55";
        return z10 ? new C14511j(this, (SortedMap) this.A01) : new BG(this, this.A01);
    }

    public final Set<K> A0K() {
        return this.A01 instanceof NavigableMap ? new C0I(this, (NavigableMap) this.A01) : this.A01 instanceof SortedMap ? new C0X(this, (SortedMap) this.A01) : new C14531l(this, this.A01);
    }

    public final void A0L(Map<K, Collection<V>> map) {
        this.A01 = map;
        this.A00 = 0;
        for (Collection<V> collection : map.values()) {
            AbstractC2871jA.A0C(!collection.isEmpty());
            this.A00 += collection.size();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3169oE
    public boolean AGU(@ParametricNullness K k10, @ParametricNullness V v10) {
        Collection<V> collection = this.A01.get(k10);
        if (collection == null) {
            Collection<V> collectionA0E = A0E(k10);
            if (!collectionA0E.add(v10)) {
                throw new AssertionError(A04(0, 43, 58));
            }
            this.A00++;
            this.A01.put(k10, collectionA0E);
            return true;
        }
        if (!collection.add(v10)) {
            return false;
        }
        int i10 = this.A00 + 1;
        if (A03[2].charAt(31) == 'o') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "qdqPg3EJJL9zSp";
        strArr[5] = "JvkYzNNxKsGyOY";
        this.A00 = i10;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3169oE
    public void clear() {
        Iterator<Collection<V>> it = this.A01.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.A01.clear();
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3169oE
    public int size() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.BD, com.facebook.ads.redexgen.core.InterfaceC3169oE
    public Collection<V> values() {
        return super.values();
    }
}
