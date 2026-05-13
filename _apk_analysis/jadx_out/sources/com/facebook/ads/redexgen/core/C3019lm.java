package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3019lm<E> extends AbstractCollection<E> {
    public static String[] A02 = {"psRx", "PaE", "QiZgSeBrDq6phMoyY15Rwd7xkYcWmlyn", "uVAvG1n4qY9Qm2x2Wwx", "SVY", "R4BVVGRseyt6VeG7R8", "WLKIpS44UKGOH0fPOaMwAxdsVmPqX8", "BDwHYCW9PjOYM7xnzaTutUE85f87LOy"};
    public final InterfaceC2872jB<? super E> A00;
    public final Collection<E> A01;

    public C3019lm(Collection<E> collection, InterfaceC2872jB<? super E> interfaceC2872jB) {
        this.A01 = collection;
        this.A00 = interfaceC2872jB;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(@ParametricNullness E e10) {
        AbstractC2871jA.A0C(this.A00.A44(e10));
        return this.A01.add(e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A02;
            if (strArr[3].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "Kot";
            strArr2[0] = "MSwZ";
            if (!zHasNext) {
                return this.A01.addAll(collection);
            }
            AbstractC2871jA.A0C(this.A00.A44(it.next()));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        AbstractC3108nE.A03(this.A01, this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (AbstractC3023lq.A03(this.A01, obj)) {
            return this.A00.A44(obj);
        }
        String[] strArr = A02;
        if (strArr[6].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A02[7] = "9iIPWTKMkBhlqzWY";
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return AbstractC3023lq.A04(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return !AbstractC3108nE.A02(this.A01, this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return AbstractC3115nL.A01(this.A01.iterator(), this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        if (contains(obj)) {
            Collection<E> collection = this.A01;
            if (A02[2].charAt(1) == 'w') {
                throw new RuntimeException();
            }
            A02[2] = "9yXQ23WyWLgHpbgnupjKfVlvAqZ13eIO";
            if (collection.remove(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        boolean z10 = false;
        Iterator<E> it = this.A01.iterator();
        while (it.hasNext()) {
            E next = it.next();
            if (this.A00.A44(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        Iterator<E> it = this.A01.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A02;
            if (strArr[6].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A02[7] = "eduZnFsmDO9t4YELThQVy46ccpCSsmF";
            if (!zHasNext) {
                return z10;
            }
            E next = it.next();
            if (this.A00.A44(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i10 = 0;
        Iterator<E> it = this.A01.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A02[7].length() == 13) {
                throw new RuntimeException();
            }
            A02[7] = "AcviO2YMuORzBgOxIFInwgIFg";
            if (!zHasNext) {
                return i10;
            }
            boolean zA44 = this.A00.A44(it.next());
            String[] strArr = A02;
            if (strArr[3].length() != strArr[1].length()) {
                A02[7] = "u87jus";
                if (zA44) {
                    i10++;
                }
            } else if (zA44) {
                i10++;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3136ng.A05(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC3136ng.A05(iterator()).toArray(tArr);
    }
}
