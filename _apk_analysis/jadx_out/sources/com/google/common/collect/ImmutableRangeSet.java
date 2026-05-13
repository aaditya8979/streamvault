package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.SortedLists;
import com.google.common.primitives.Ints;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes6.dex */
public final class ImmutableRangeSet<C extends Comparable> extends f<C> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ImmutableRangeSet<Comparable<?>> f23192d = new ImmutableRangeSet<>(ImmutableList.of());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImmutableRangeSet<Comparable<?>> f23193e = new ImmutableRangeSet<>(ImmutableList.of(Range.all()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient ImmutableList<Range<C>> f23194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient ImmutableRangeSet<C> f23195c;

    public final class AsSet extends ImmutableSortedSet<C> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public transient Integer f23196d;
        private final DiscreteDomain<C> domain;

        public class a extends AbstractIterator<C> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Iterator<Range<C>> f23197d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Iterator<C> f23198e = Iterators.g();

            public a() {
                this.f23197d = ImmutableRangeSet.this.f23194b.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public C a() {
                while (!this.f23198e.hasNext()) {
                    if (!this.f23197d.hasNext()) {
                        return (C) b();
                    }
                    this.f23198e = ContiguousSet.create(this.f23197d.next(), AsSet.this.domain).iterator();
                }
                return this.f23198e.next();
            }
        }

        public class b extends AbstractIterator<C> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Iterator<Range<C>> f23200d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Iterator<C> f23201e = Iterators.g();

            public b() {
                this.f23200d = ImmutableRangeSet.this.f23194b.reverse().iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public C a() {
                while (!this.f23201e.hasNext()) {
                    if (!this.f23200d.hasNext()) {
                        return (C) b();
                    }
                    this.f23201e = ContiguousSet.create(this.f23200d.next(), AsSet.this.domain).descendingIterator();
                }
                return this.f23201e.next();
            }
        }

        public AsSet(DiscreteDomain<C> discreteDomain) {
            super(Ordering.natural());
            this.domain = discreteDomain;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return ImmutableRangeSet.this.contains((Comparable) obj);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> createDescendingSet() {
            return new DescendingImmutableSortedSet(this);
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        public r2<C> descendingIterator() {
            return new b();
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> headSetImpl(C c10, boolean z10) {
            return subSet(Range.upTo(c10, BoundType.forBoolean(z10)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSortedSet
        public int indexOf(Object obj) {
            if (!contains(obj)) {
                return -1;
            }
            Objects.requireNonNull(obj);
            Comparable comparable = (Comparable) obj;
            long size = 0;
            r2 it = ImmutableRangeSet.this.f23194b.iterator();
            while (it.hasNext()) {
                Range range = (Range) it.next();
                if (range.contains(comparable)) {
                    return Ints.m(size + ((long) ContiguousSet.create(range, this.domain).indexOf(comparable)));
                }
                size += (long) ContiguousSet.create(range, this.domain).size();
            }
            throw new AssertionError("impossible");
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return ImmutableRangeSet.this.f23194b.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public r2<C> iterator() {
            return new a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Integer numValueOf = this.f23196d;
            if (numValueOf == null) {
                long size = 0;
                r2 it = ImmutableRangeSet.this.f23194b.iterator();
                while (it.hasNext()) {
                    size += (long) ContiguousSet.create((Range) it.next(), this.domain).size();
                    if (size >= 2147483647L) {
                        break;
                    }
                }
                numValueOf = Integer.valueOf(Ints.m(size));
                this.f23196d = numValueOf;
            }
            return numValueOf.intValue();
        }

        public ImmutableSortedSet<C> subSet(Range<C> range) {
            return ImmutableRangeSet.this.subRangeSet((Range) range).asSet(this.domain);
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> subSetImpl(C c10, boolean z10, C c11, boolean z11) {
            return (z10 || z11 || Range.compareOrThrow(c10, c11) != 0) ? subSet(Range.range(c10, BoundType.forBoolean(z10), c11, BoundType.forBoolean(z11))) : ImmutableSortedSet.of();
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> tailSetImpl(C c10, boolean z10) {
            return subSet(Range.downTo(c10, BoundType.forBoolean(z10)));
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return ImmutableRangeSet.this.f23194b.toString();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new AsSetSerializedForm(ImmutableRangeSet.this.f23194b, this.domain);
        }
    }

    public static class AsSetSerializedForm<C extends Comparable> implements Serializable {
        private final DiscreteDomain<C> domain;
        private final ImmutableList<Range<C>> ranges;

        public AsSetSerializedForm(ImmutableList<Range<C>> immutableList, DiscreteDomain<C> discreteDomain) {
            this.ranges = immutableList;
            this.domain = discreteDomain;
        }

        public Object readResolve() {
            return new ImmutableRangeSet(this.ranges).asSet(this.domain);
        }
    }

    public final class ComplementRanges extends ImmutableList<Range<C>> {
        private final boolean positiveBoundedAbove;
        private final boolean positiveBoundedBelow;
        private final int size;

        /* JADX WARN: Multi-variable type inference failed */
        public ComplementRanges() {
            boolean zHasLowerBound = ((Range) ImmutableRangeSet.this.f23194b.get(0)).hasLowerBound();
            this.positiveBoundedBelow = zHasLowerBound;
            boolean zHasUpperBound = ((Range) y1.f(ImmutableRangeSet.this.f23194b)).hasUpperBound();
            this.positiveBoundedAbove = zHasUpperBound;
            int size = ImmutableRangeSet.this.f23194b.size() - 1;
            size = zHasLowerBound ? size + 1 : size;
            this.size = zHasUpperBound ? size + 1 : size;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public Range<C> get(int i10) {
            y7.l.k(i10, this.size);
            return Range.create(this.positiveBoundedBelow ? i10 == 0 ? Cut.belowAll() : ((Range) ImmutableRangeSet.this.f23194b.get(i10 - 1)).upperBound : ((Range) ImmutableRangeSet.this.f23194b.get(i10)).upperBound, (this.positiveBoundedAbove && i10 == this.size + (-1)) ? Cut.aboveAll() : ((Range) ImmutableRangeSet.this.f23194b.get(i10 + (!this.positiveBoundedBelow ? 1 : 0))).lowerBound);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class SerializedForm<C extends Comparable> implements Serializable {
        private final ImmutableList<Range<C>> ranges;

        public SerializedForm(ImmutableList<Range<C>> immutableList) {
            this.ranges = immutableList;
        }

        public Object readResolve() {
            return this.ranges.isEmpty() ? ImmutableRangeSet.of() : this.ranges.equals(ImmutableList.of(Range.all())) ? ImmutableRangeSet.all() : new ImmutableRangeSet(this.ranges);
        }
    }

    public static class a<C extends Comparable<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Range<C>> f23203a = Lists.i();

        public a<C> a(Range<C> range) {
            y7.l.i(!range.isEmpty(), "range must not be empty, but was %s", range);
            this.f23203a.add(range);
            return this;
        }

        public a<C> b(Iterable<Range<C>> iterable) {
            Iterator<Range<C>> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public ImmutableRangeSet<C> c() {
            ImmutableList.a aVar = new ImmutableList.a(this.f23203a.size());
            Collections.sort(this.f23203a, Range.rangeLexOrdering());
            g2 g2VarQ = Iterators.q(this.f23203a.iterator());
            while (g2VarQ.hasNext()) {
                Range rangeSpan = (Range) g2VarQ.next();
                while (g2VarQ.hasNext()) {
                    Range<C> range = (Range) g2VarQ.peek();
                    if (rangeSpan.isConnected(range)) {
                        y7.l.j(rangeSpan.intersection(range).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", rangeSpan, range);
                        rangeSpan = rangeSpan.span((Range) g2VarQ.next());
                    }
                }
                aVar.a(rangeSpan);
            }
            ImmutableList immutableListM = aVar.m();
            return immutableListM.isEmpty() ? ImmutableRangeSet.of() : (immutableListM.size() == 1 && ((Range) y1.i(immutableListM)).equals(Range.all())) ? ImmutableRangeSet.all() : new ImmutableRangeSet<>(immutableListM);
        }

        public a<C> d(a<C> aVar) {
            b(aVar.f23203a);
            return this;
        }
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
        this.f23194b = immutableList;
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList, ImmutableRangeSet<C> immutableRangeSet) {
        this.f23194b = immutableList;
        this.f23195c = immutableRangeSet;
    }

    public static <C extends Comparable> ImmutableRangeSet<C> all() {
        return f23193e;
    }

    public static <C extends Comparable<?>> a<C> builder() {
        return new a<>();
    }

    public static <C extends Comparable> ImmutableRangeSet<C> copyOf(i2<C> i2Var) {
        y7.l.m(i2Var);
        if (i2Var.isEmpty()) {
            return of();
        }
        if (i2Var.encloses(Range.all())) {
            return all();
        }
        if (i2Var instanceof ImmutableRangeSet) {
            ImmutableRangeSet<C> immutableRangeSet = (ImmutableRangeSet) i2Var;
            if (!immutableRangeSet.isPartialView()) {
                return immutableRangeSet;
            }
        }
        return new ImmutableRangeSet<>(ImmutableList.copyOf((Collection) i2Var.asRanges()));
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> copyOf(Iterable<Range<C>> iterable) {
        return new a().b(iterable).c();
    }

    public static <C extends Comparable> ImmutableRangeSet<C> of() {
        return f23192d;
    }

    public static <C extends Comparable> ImmutableRangeSet<C> of(Range<C> range) {
        y7.l.m(range);
        return range.isEmpty() ? of() : range.equals(Range.all()) ? all() : new ImmutableRangeSet<>(ImmutableList.of(range));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> Collector<Range<E>, ?, ImmutableRangeSet<E>> toImmutableRangeSet() {
        return i1.O();
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> unionOf(Iterable<Range<C>> iterable) {
        return copyOf(TreeRangeSet.create(iterable));
    }

    public final ImmutableList<Range<C>> a(final Range<C> range) {
        if (this.f23194b.isEmpty() || range.isEmpty()) {
            return ImmutableList.of();
        }
        if (range.encloses(span())) {
            return this.f23194b;
        }
        final int iB = range.hasLowerBound() ? SortedLists.b(this.f23194b, Range.upperBoundFn(), range.lowerBound, SortedLists.KeyPresentBehavior.FIRST_AFTER, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : 0;
        final int iB2 = (range.hasUpperBound() ? SortedLists.b(this.f23194b, Range.lowerBoundFn(), range.upperBound, SortedLists.KeyPresentBehavior.FIRST_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : this.f23194b.size()) - iB;
        return iB2 == 0 ? ImmutableList.of() : (ImmutableList<Range<C>>) new ImmutableList<Range<C>>() { // from class: com.google.common.collect.ImmutableRangeSet.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            public Range<C> get(int i10) {
                y7.l.k(i10, iB2);
                return (i10 == 0 || i10 == iB2 + (-1)) ? ((Range) ImmutableRangeSet.this.f23194b.get(i10 + iB)).intersection(range) : (Range) ImmutableRangeSet.this.f23194b.get(i10 + iB);
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return iB2;
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.f
    @Deprecated
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.f
    @Deprecated
    public void addAll(i2<C> i2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.f
    @Deprecated
    public void addAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: asDescendingSetOfRanges, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Range<C>> m4288asDescendingSetOfRanges() {
        return this.f23194b.isEmpty() ? ImmutableSet.of() : new RegularImmutableSortedSet(this.f23194b.reverse(), Range.rangeLexOrdering().reverse());
    }

    @Override // com.google.common.collect.i2
    public ImmutableSet<Range<C>> asRanges() {
        return this.f23194b.isEmpty() ? ImmutableSet.of() : new RegularImmutableSortedSet(this.f23194b, Range.rangeLexOrdering());
    }

    public ImmutableSortedSet<C> asSet(DiscreteDomain<C> discreteDomain) {
        y7.l.m(discreteDomain);
        if (isEmpty()) {
            return ImmutableSortedSet.of();
        }
        Range<C> rangeCanonical = span().canonical(discreteDomain);
        if (!rangeCanonical.hasLowerBound()) {
            throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!rangeCanonical.hasUpperBound()) {
            try {
                discreteDomain.maxValue();
            } catch (NoSuchElementException unused) {
                throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new AsSet(discreteDomain);
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.i2
    public ImmutableRangeSet<C> complement() {
        ImmutableRangeSet<C> immutableRangeSet = this.f23195c;
        if (immutableRangeSet != null) {
            return immutableRangeSet;
        }
        if (this.f23194b.isEmpty()) {
            ImmutableRangeSet<C> immutableRangeSetAll = all();
            this.f23195c = immutableRangeSetAll;
            return immutableRangeSetAll;
        }
        if (this.f23194b.size() == 1 && this.f23194b.get(0).equals(Range.all())) {
            ImmutableRangeSet<C> immutableRangeSetOf = of();
            this.f23195c = immutableRangeSetOf;
            return immutableRangeSetOf;
        }
        ImmutableRangeSet<C> immutableRangeSet2 = new ImmutableRangeSet<>(new ComplementRanges(), this);
        this.f23195c = immutableRangeSet2;
        return immutableRangeSet2;
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    public ImmutableRangeSet<C> difference(i2<C> i2Var) {
        TreeRangeSet treeRangeSetCreate = TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(i2Var);
        return copyOf(treeRangeSetCreate);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.i2
    public boolean encloses(Range<C> range) {
        int iC = SortedLists.c(this.f23194b, Range.lowerBoundFn(), range.lowerBound, Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        return iC != -1 && this.f23194b.get(iC).encloses(range);
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ boolean enclosesAll(i2 i2Var) {
        return super.enclosesAll(i2Var);
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ImmutableRangeSet<C> intersection(i2<C> i2Var) {
        TreeRangeSet treeRangeSetCreate = TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(i2Var.complement());
        return copyOf(treeRangeSetCreate);
    }

    @Override // com.google.common.collect.f
    public boolean intersects(Range<C> range) {
        int iC = SortedLists.c(this.f23194b, Range.lowerBoundFn(), range.lowerBound, Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        if (iC < this.f23194b.size() && this.f23194b.get(iC).isConnected(range) && !this.f23194b.get(iC).intersection(range).isEmpty()) {
            return true;
        }
        if (iC > 0) {
            int i10 = iC - 1;
            if (this.f23194b.get(i10).isConnected(range) && !this.f23194b.get(i10).intersection(range).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.i2
    public boolean isEmpty() {
        return this.f23194b.isEmpty();
    }

    public boolean isPartialView() {
        return this.f23194b.isPartialView();
    }

    @Override // com.google.common.collect.f
    public Range<C> rangeContaining(C c10) {
        int iC = SortedLists.c(this.f23194b, Range.lowerBoundFn(), Cut.belowValue(c10), Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iC == -1) {
            return null;
        }
        Range<C> range = this.f23194b.get(iC);
        if (range.contains(c10)) {
            return range;
        }
        return null;
    }

    @Override // com.google.common.collect.f
    @Deprecated
    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.i2
    @Deprecated
    public void removeAll(i2<C> i2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.f
    @Deprecated
    public void removeAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    public Range<C> span() {
        if (this.f23194b.isEmpty()) {
            throw new NoSuchElementException();
        }
        return Range.create(this.f23194b.get(0).lowerBound, this.f23194b.get(r1.size() - 1).upperBound);
    }

    @Override // com.google.common.collect.i2
    public ImmutableRangeSet<C> subRangeSet(Range<C> range) {
        if (!isEmpty()) {
            Range<C> rangeSpan = span();
            if (range.encloses(rangeSpan)) {
                return this;
            }
            if (range.isConnected(rangeSpan)) {
                return new ImmutableRangeSet<>(a(range));
            }
        }
        return of();
    }

    public ImmutableRangeSet<C> union(i2<C> i2Var) {
        return unionOf(y1.d(asRanges(), i2Var.asRanges()));
    }

    public Object writeReplace() {
        return new SerializedForm(this.f23194b);
    }
}
