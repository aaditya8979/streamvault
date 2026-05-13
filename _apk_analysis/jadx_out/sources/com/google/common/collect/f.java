package com.google.common.collect;

import java.lang.Comparable;
import java.util.Iterator;

/* JADX INFO: compiled from: AbstractRangeSet.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class f<C extends Comparable> implements i2<C> {
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    public void addAll(i2<C> i2Var) {
        addAll(i2Var.asRanges());
    }

    public void addAll(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public void clear() {
        remove(Range.all());
    }

    public boolean contains(C c10) {
        return rangeContaining(c10) != null;
    }

    @Override // com.google.common.collect.i2
    public abstract boolean encloses(Range<C> range);

    public boolean enclosesAll(i2<C> i2Var) {
        return enclosesAll(i2Var.asRanges());
    }

    public boolean enclosesAll(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it = iterable.iterator();
        while (it.hasNext()) {
            if (!encloses(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i2) {
            return asRanges().equals(((i2) obj).asRanges());
        }
        return false;
    }

    public final int hashCode() {
        return asRanges().hashCode();
    }

    public boolean intersects(Range<C> range) {
        return !subRangeSet(range).isEmpty();
    }

    @Override // com.google.common.collect.i2
    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    public abstract Range<C> rangeContaining(C c10);

    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.i2
    public void removeAll(i2<C> i2Var) {
        removeAll(i2Var.asRanges());
    }

    public void removeAll(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final String toString() {
        return asRanges().toString();
    }
}
