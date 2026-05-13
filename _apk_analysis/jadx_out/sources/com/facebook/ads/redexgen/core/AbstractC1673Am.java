package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC1673Am<E> extends AbstractC3068ma<E> implements List<E>, RandomAccess {
    public static byte[] A00 = null;
    public static String[] A01 = {"fHdUBkHaeOb", "RH", "RyMA6PTlrDF2m99nGPMPg2CjhSKVyaSQ", "ENegzNvFlexY3BR2RKk1z4PrLej5P8FF", "wggVriGK93MfFtYQABEEs6Hvem71Ew8R", "ul6RrA3f2JvHqPW8xA7h0PXskLz1uboQ", "Eo8bayYlVcx2q99x4ketqZKtcr", "wTUtZUDKElMjm9Nu5uZgljoHw4l"};
    public static final AF<Object> A02;
    public static final long serialVersionUID = -889275714;

    static {
        A0B();
        A02 = new C0W(C14431b.A02, 0);
    }

    public static <E> C14491h<E> A01() {
        return new C14491h<>();
    }

    private final AbstractC1673Am<E> A02(final int i10, int i11) {
        final int i12 = i11 - i10;
        return new AbstractC1673Am<E>(i10, i12) { // from class: com.facebook.ads.redexgen.X.1g
            public final transient int A00;
            public final transient int A01;

            {
                this.A01 = i10;
                this.A00 = i12;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
            public final int A0G() {
                return this.A02.A0H() + this.A01 + this.A00;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
            public final int A0H() {
                return this.A02.A0H() + this.A01;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
            public final boolean A0K() {
                return true;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
            @CheckForNull
            public final Object[] A0L() {
                return this.A02.A0L();
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1673Am, java.util.List
            /* JADX INFO: renamed from: A0M */
            public final AbstractC1673Am<E> subList(int i13, int i14) {
                AbstractC2871jA.A0B(i13, i14, this.A00);
                return this.A02.subList(this.A01 + i13, this.A01 + i14);
            }

            @Override // java.util.List
            public final E get(int i13) {
                AbstractC2871jA.A00(i13, this.A00);
                return this.A02.get(this.A01 + i13);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1673Am, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
            public final /* bridge */ /* synthetic */ Iterator iterator() {
                return iterator();
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1673Am, java.util.List
            public final /* bridge */ /* synthetic */ ListIterator listIterator() {
                return listIterator();
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1673Am, java.util.List
            public final /* bridge */ /* synthetic */ ListIterator listIterator(int i13) {
                return super.listIterator(i13);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.A00;
            }
        };
    }

    public static <E> AbstractC1673Am<E> A03() {
        return (AbstractC1673Am<E>) C14431b.A02;
    }

    public static <E> AbstractC1673Am<E> A04(E e10) {
        return A08(e10);
    }

    public static <E> AbstractC1673Am<E> A05(Collection<? extends E> collection) {
        if (!(collection instanceof AbstractC3068ma)) {
            return A08(collection.toArray());
        }
        AbstractC1673Am<E> abstractC1673AmA0J = ((AbstractC3068ma) collection).A0J();
        return abstractC1673AmA0J.A0K() ? A06(abstractC1673AmA0J.toArray()) : abstractC1673AmA0J;
    }

    public static <E> AbstractC1673Am<E> A06(Object[] objArr) {
        return A09(objArr, objArr.length);
    }

    public static <E> AbstractC1673Am<E> A07(E[] eArr) {
        return eArr.length == 0 ? A03() : A08((Object[]) eArr.clone());
    }

    public static <E> AbstractC1673Am<E> A08(Object... objArr) {
        return A06(AbstractC3181oR.A03(objArr));
    }

    public static <E> AbstractC1673Am<E> A09(Object[] objArr, int i10) {
        return i10 == 0 ? A03() : new C14431b(objArr, i10);
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[0].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[1] = "b9";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 22);
            i13++;
        }
    }

    public static void A0B() {
        A00 = new byte[]{120, 94, 72, 13, 126, 72, 95, 68, 76, 65, 68, 87, 72, 73, 107, 66, 95, 64};
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(A0A(0, 18, 59));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public int A0I(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    @Deprecated
    public final AbstractC1673Am<E> A0J() {
        return this;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public AbstractC1673Am<E> subList(int i10, int i11) {
        AbstractC2871jA.A0B(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? A03() : A02(i10, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final AbstractC3240pg<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final AF<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: A0P, reason: merged with bridge method [inline-methods] */
    public AF<E> listIterator(int i10) {
        AbstractC2871jA.A01(i10, size());
        return isEmpty() ? (AF<E>) A02 : new C0W(this, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        return AbstractC3136ng.A06(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC3136ng.A00(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC3136ng.A01(this, obj);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }
}
