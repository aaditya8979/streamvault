package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
class CompactLinkedHashSet<E> extends CompactHashSet<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int[] f23134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int[] f23135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int f23136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient int f23137i;

    public CompactLinkedHashSet() {
    }

    public CompactLinkedHashSet(int i10) {
        super(i10);
    }

    public static <E> CompactLinkedHashSet<E> create() {
        return new CompactLinkedHashSet<>();
    }

    public static <E> CompactLinkedHashSet<E> create(Collection<? extends E> collection) {
        CompactLinkedHashSet<E> compactLinkedHashSetCreateWithExpectedSize = createWithExpectedSize(collection.size());
        compactLinkedHashSetCreateWithExpectedSize.addAll(collection);
        return compactLinkedHashSetCreateWithExpectedSize;
    }

    @SafeVarargs
    public static <E> CompactLinkedHashSet<E> create(E... eArr) {
        CompactLinkedHashSet<E> compactLinkedHashSetCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(compactLinkedHashSetCreateWithExpectedSize, eArr);
        return compactLinkedHashSetCreateWithExpectedSize;
    }

    public static <E> CompactLinkedHashSet<E> createWithExpectedSize(int i10) {
        return new CompactLinkedHashSet<>(i10);
    }

    @Override // com.google.common.collect.CompactHashSet
    public int adjustAfterRemove(int i10, int i11) {
        return i10 >= size() ? i11 : i10;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int allocArrays() {
        int iAllocArrays = super.allocArrays();
        this.f23134f = new int[iAllocArrays];
        this.f23135g = new int[iAllocArrays];
        return iAllocArrays;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        this.f23136h = -2;
        this.f23137i = -2;
        int[] iArr = this.f23134f;
        if (iArr != null && this.f23135g != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f23135g, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashSet
    public Set<E> convertToHashFloodingResistantImplementation() {
        Set<E> setConvertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.f23134f = null;
        this.f23135g = null;
        return setConvertToHashFloodingResistantImplementation;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int firstEntryIndex() {
        return this.f23136h;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int getSuccessor(int i10) {
        return t()[i10] - 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void init(int i10) {
        super.init(i10);
        this.f23136h = -2;
        this.f23137i = -2;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void insertEntry(int i10, E e10, int i11, int i12) {
        super.insertEntry(i10, e10, i11, i12);
        v(this.f23137i, i10);
        v(i10, -2);
    }

    @Override // com.google.common.collect.CompactHashSet
    public void moveLastEntry(int i10, int i11) {
        int size = size() - 1;
        super.moveLastEntry(i10, i11);
        v(r(i10), getSuccessor(i10));
        if (i10 < size) {
            v(r(size), i10);
            v(i10, getSuccessor(size));
        }
        s()[size] = 0;
        t()[size] = 0;
    }

    public final int r(int i10) {
        return s()[i10] - 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void resizeEntries(int i10) {
        super.resizeEntries(i10);
        this.f23134f = Arrays.copyOf(s(), i10);
        this.f23135g = Arrays.copyOf(t(), i10);
    }

    public final int[] s() {
        int[] iArr = this.f23134f;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int[] t() {
        int[] iArr = this.f23135g;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return d2.f(this);
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) d2.g(this, tArr);
    }

    public final void u(int i10, int i11) {
        s()[i10] = i11 + 1;
    }

    public final void v(int i10, int i11) {
        if (i10 == -2) {
            this.f23136h = i11;
        } else {
            w(i10, i11);
        }
        if (i11 == -2) {
            this.f23137i = i10;
        } else {
            u(i11, i10);
        }
    }

    public final void w(int i10, int i11) {
        t()[i10] = i11 + 1;
    }
}
