package com.google.common.collect;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    private final boolean accessOrder;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient int f23132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient int f23133j;
    public transient long[] links;

    public CompactLinkedHashMap() {
        this(3);
    }

    public CompactLinkedHashMap(int i10) {
        this(i10, false);
    }

    public CompactLinkedHashMap(int i10, boolean z10) {
        super(i10);
        this.accessOrder = z10;
    }

    public static <K, V> CompactLinkedHashMap<K, V> create() {
        return new CompactLinkedHashMap<>();
    }

    public static <K, V> CompactLinkedHashMap<K, V> createWithExpectedSize(int i10) {
        return new CompactLinkedHashMap<>(i10);
    }

    public final void A(int i10, int i11) {
        x(i10, (v(i10) & (-4294967296L)) | (((long) (i11 + 1)) & 4294967295L));
    }

    @Override // com.google.common.collect.CompactHashMap
    public void accessEntry(int i10) {
        if (this.accessOrder) {
            z(u(i10), getSuccessor(i10));
            z(this.f23133j, i10);
            z(i10, -2);
            incrementModCount();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    public int adjustAfterRemove(int i10, int i11) {
        return i10 >= size() ? i11 : i10;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int allocArrays() {
        int iAllocArrays = super.allocArrays();
        this.links = new long[iAllocArrays];
        return iAllocArrays;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        this.f23132i = -2;
        this.f23133j = -2;
        long[] jArr = this.links;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashMap
    public Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> mapConvertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.links = null;
        return mapConvertToHashFloodingResistantImplementation;
    }

    @Override // com.google.common.collect.CompactHashMap
    public Map<K, V> createHashFloodingResistantDelegate(int i10) {
        return new LinkedHashMap(i10, 1.0f, this.accessOrder);
    }

    @Override // com.google.common.collect.CompactHashMap
    public int firstEntryIndex() {
        return this.f23132i;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int getSuccessor(int i10) {
        return ((int) v(i10)) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void init(int i10) {
        super.init(i10);
        this.f23132i = -2;
        this.f23133j = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void insertEntry(int i10, K k10, V v10, int i11, int i12) {
        super.insertEntry(i10, k10, v10, i11, i12);
        z(this.f23133j, i10);
        z(i10, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void moveLastEntry(int i10, int i11) {
        int size = size() - 1;
        super.moveLastEntry(i10, i11);
        z(u(i10), getSuccessor(i10));
        if (i10 < size) {
            z(u(size), i10);
            z(i10, getSuccessor(size));
        }
        x(size, 0L);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void resizeEntries(int i10) {
        super.resizeEntries(i10);
        this.links = Arrays.copyOf(w(), i10);
    }

    public final int u(int i10) {
        return ((int) (v(i10) >>> 32)) - 1;
    }

    public final long v(int i10) {
        return w()[i10];
    }

    public final long[] w() {
        long[] jArr = this.links;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    public final void x(int i10, long j10) {
        w()[i10] = j10;
    }

    public final void y(int i10, int i11) {
        x(i10, (v(i10) & 4294967295L) | (((long) (i11 + 1)) << 32));
    }

    public final void z(int i10, int i11) {
        if (i10 == -2) {
            this.f23132i = i11;
        } else {
            A(i10, i11);
        }
        if (i11 == -2) {
            this.f23133j = i10;
        } else {
            y(i11, i10);
        }
    }
}
