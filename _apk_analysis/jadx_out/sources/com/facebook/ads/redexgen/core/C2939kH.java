package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2939kH<V> extends AbstractCollection<V> {
    public static String[] A05 = {"rqzSAKJ", "Uo9MABssBS", "mR3bTKcN7ZIAbRFpbr7LAtSCi4h3sTdh", "ulxkUHqusQ2hc", "jTRt3NctDptZQmGsUWy4", "uonWZoVLan", "T3ZzXYv3r2YYUNfl", "kcTFJWPVSfF4RZcKupXan"};
    public Collection<V> A00;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/1i<TK;TV;>.WrappedCollection; */
    @CheckForNull
    public final C2939kH A01;

    @ParametricNullness
    public final K A02;

    @CheckForNull
    public final Collection<V> A03;
    public final /* synthetic */ AbstractC14501i A04;

    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/Collection<TV;>;Lcom/facebook/ads/redexgen/X/1i<TK;TV;>.WrappedCollection;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C2939kH(@ParametricNullness AbstractC14501i abstractC14501i, @CheckForNull Object obj, Collection collection, C2939kH c2939kH) {
        this.A04 = abstractC14501i;
        this.A02 = obj;
        this.A00 = collection;
        this.A01 = c2939kH;
        this.A03 = c2939kH == null ? null : c2939kH.A02();
    }

    /* JADX WARN: Incorrect inner types in method signature: ()Lcom/facebook/ads/redexgen/X/1i<TK;TV;>.WrappedCollection; */
    @CheckForNull
    public final C2939kH A00() {
        return this.A01;
    }

    @ParametricNullness
    public final K A01() {
        return this.A02;
    }

    public final Collection<V> A02() {
        return this.A00;
    }

    public final void A03() {
        if (this.A01 == null) {
            this.A04.A01.put(this.A02, this.A00);
            return;
        }
        C2939kH c2939kH = this.A01;
        String[] strArr = A05;
        if (strArr[5].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A05[7] = "7Y1hqBLSL7LmfxEryJAxk";
        c2939kH.A03();
    }

    public final void A04() {
        Collection<V> collection;
        if (this.A01 != null) {
            this.A01.A04();
            if (this.A01.A02() != this.A03) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.A00.isEmpty() || (collection = (Collection) this.A04.A01.get(this.A02)) == null) {
                return;
            }
            this.A00 = collection;
        }
    }

    public final void A05() {
        if (this.A01 != null) {
            this.A01.A05();
        } else if (this.A00.isEmpty()) {
            this.A04.A01.remove(this.A02);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(@ParametricNullness V v10) {
        A04();
        boolean zIsEmpty = this.A00.isEmpty();
        boolean zAdd = this.A00.add(v10);
        if (zAdd) {
            AbstractC14501i.A00(this.A04);
            if (zIsEmpty) {
                A03();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        if (collection.isEmpty()) {
            if (A05[1].length() != 10) {
                throw new RuntimeException();
            }
            A05[3] = "QAr";
            return false;
        }
        int size = size();
        boolean zAddAll = this.A00.addAll(collection);
        if (zAddAll) {
            AbstractC14501i.A02(this.A04, this.A00.size() - size);
            if (size == 0) {
                A03();
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.A00.clear();
        AbstractC14501i.A03(this.A04, size);
        A05();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        A04();
        return this.A00.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        A04();
        return this.A00.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        A04();
        boolean zEquals = this.A00.equals(obj);
        if (A05[2].charAt(26) == 'z') {
            throw new RuntimeException();
        }
        A05[1] = "HgkJ6BYskp";
        return zEquals;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        A04();
        return this.A00.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        A04();
        return new C2938kG(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        A04();
        boolean zRemove = this.A00.remove(obj);
        if (zRemove) {
            AbstractC14501i.A01(this.A04);
            A05();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.A00.removeAll(collection);
        if (zRemoveAll) {
            AbstractC14501i.A02(this.A04, this.A00.size() - size);
            A05();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        AbstractC2871jA.A04(collection);
        int size = size();
        boolean zRetainAll = this.A00.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.A00.size();
            AbstractC14501i abstractC14501i = this.A04;
            int i10 = size2 - size;
            String[] strArr = A05;
            if (strArr[0].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "TlQ3bLp";
            strArr2[4] = "xplS7Hw4TBXGB9jePVjO";
            AbstractC14501i.A02(abstractC14501i, i10);
            A05();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        A04();
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        A04();
        return this.A00.toString();
    }
}
