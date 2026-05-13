package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1T<E> extends AG<E> implements SortedSet<E> {
    public C1T(SortedSet<E> sortedSet, InterfaceC2872jB<? super E> interfaceC2872jB) {
        super(sortedSet, interfaceC2872jB);
    }

    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator<? super E> comparator() {
        return ((SortedSet) this.A01).comparator();
    }

    @Override // java.util.SortedSet
    @ParametricNullness
    public final E first() {
        return (E) AbstractC3115nL.A06(this.A01.iterator(), this.A00);
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> headSet(@ParametricNullness E e10) {
        return new C1T(((SortedSet) this.A01).headSet(e10), this.A00);
    }

    @Override // java.util.SortedSet
    @ParametricNullness
    public E last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.A01;
        while (true) {
            E e10 = (Object) sortedSetHeadSet.last();
            if (this.A00.A44(e10)) {
                return e10;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(e10);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> subSet(@ParametricNullness E e10, @ParametricNullness E e11) {
        return new C1T(((SortedSet) this.A01).subSet(e10, e11), this.A00);
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> tailSet(@ParametricNullness E e10) {
        return new C1T(((SortedSet) this.A01).tailSet(e10), this.A00);
    }
}
