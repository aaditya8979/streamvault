package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes12.dex */
public class TreeRangeSet<C extends Comparable<?>> extends f<C> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Set<Range<C>> f23343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Set<Range<C>> f23344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient i2<C> f23345d;
    public final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;

    public final class Complement extends TreeRangeSet<C> {
        public Complement() {
            super(new c(TreeRangeSet.this.rangesByLowerBound));
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public void add(Range<C> range) {
            TreeRangeSet.this.remove(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.i2
        public i2<C> complement() {
            return TreeRangeSet.this;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public boolean contains(C c10) {
            return !TreeRangeSet.this.contains(c10);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public void remove(Range<C> range) {
            TreeRangeSet.this.add(range);
        }
    }

    public final class SubRangeSet extends TreeRangeSet<C> {
        private final Range<C> restriction;

        /* JADX WARN: Illegal instructions before constructor call */
        public SubRangeSet(Range<C> range) {
            super(new e(Range.all(), range, TreeRangeSet.this.rangesByLowerBound));
            this.restriction = range;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public void add(Range<C> range) {
            y7.l.j(this.restriction.encloses(range), "Cannot add range %s to subRangeSet(%s)", range, this.restriction);
            TreeRangeSet.this.add(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public void clear() {
            TreeRangeSet.this.remove(this.restriction);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public boolean contains(C c10) {
            return this.restriction.contains(c10) && TreeRangeSet.this.contains(c10);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f, com.google.common.collect.i2
        public boolean encloses(Range<C> range) {
            Range rangeA;
            return (this.restriction.isEmpty() || !this.restriction.encloses(range) || (rangeA = TreeRangeSet.this.a(range)) == null || rangeA.intersection(this.restriction).isEmpty()) ? false : true;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public Range<C> rangeContaining(C c10) {
            Range<C> rangeRangeContaining;
            if (this.restriction.contains(c10) && (rangeRangeContaining = TreeRangeSet.this.rangeContaining(c10)) != null) {
                return rangeRangeContaining.intersection(this.restriction);
            }
            return null;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public void remove(Range<C> range) {
            if (range.isConnected(this.restriction)) {
                TreeRangeSet.this.remove(range.intersection(this.restriction));
            }
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.i2
        public i2<C> subRangeSet(Range<C> range) {
            return range.encloses(this.restriction) ? this : range.isConnected(this.restriction) ? new SubRangeSet(this.restriction.intersection(range)) : ImmutableRangeSet.of();
        }
    }

    public final class b extends o1<Range<C>> implements Set<Range<C>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Collection<Range<C>> f23346c;

        public b(TreeRangeSet treeRangeSet, Collection<Range<C>> collection) {
            this.f23346c = collection;
        }

        @Override // com.google.common.collect.o1, com.google.common.collect.r1
        /* JADX INFO: renamed from: delegate */
        public Collection<Range<C>> g() {
            return this.f23346c;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.d(this);
        }
    }

    public static final class c<C extends Comparable<?>> extends com.google.common.collect.e<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NavigableMap<Cut<C>, Range<C>> f23347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NavigableMap<Cut<C>, Range<C>> f23348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Range<Cut<C>> f23349d;

        public class a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Cut<C> f23350d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Cut f23351e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ g2 f23352f;

            public a(Cut cut, g2 g2Var) {
                this.f23351e = cut;
                this.f23352f = g2Var;
                this.f23350d = cut;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                Range rangeCreate;
                if (c.this.f23349d.upperBound.isLessThan(this.f23350d) || this.f23350d == Cut.aboveAll()) {
                    return (Map.Entry) b();
                }
                if (this.f23352f.hasNext()) {
                    Range range = (Range) this.f23352f.next();
                    rangeCreate = Range.create(this.f23350d, range.lowerBound);
                    this.f23350d = range.upperBound;
                } else {
                    rangeCreate = Range.create(this.f23350d, Cut.aboveAll());
                    this.f23350d = Cut.aboveAll();
                }
                return Maps.e(rangeCreate.lowerBound, rangeCreate);
            }
        }

        public class b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Cut<C> f23354d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Cut f23355e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ g2 f23356f;

            public b(Cut cut, g2 g2Var) {
                this.f23355e = cut;
                this.f23356f = g2Var;
                this.f23354d = cut;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                if (this.f23354d == Cut.belowAll()) {
                    return (Map.Entry) b();
                }
                if (this.f23356f.hasNext()) {
                    Range range = (Range) this.f23356f.next();
                    Range rangeCreate = Range.create(range.upperBound, this.f23354d);
                    this.f23354d = range.lowerBound;
                    if (c.this.f23349d.lowerBound.isLessThan(rangeCreate.lowerBound)) {
                        return Maps.e(rangeCreate.lowerBound, rangeCreate);
                    }
                } else if (c.this.f23349d.lowerBound.isLessThan(Cut.belowAll())) {
                    Range rangeCreate2 = Range.create(Cut.belowAll(), this.f23354d);
                    this.f23354d = Cut.belowAll();
                    return Maps.e(Cut.belowAll(), rangeCreate2);
                }
                return (Map.Entry) b();
            }
        }

        public c(NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this(navigableMap, Range.all());
        }

        public c(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f23347b = navigableMap;
            this.f23348c = new d(navigableMap);
            this.f23349d = range;
        }

        @Override // com.google.common.collect.Maps.e
        public Iterator<Map.Entry<Cut<C>, Range<C>>> a() {
            Collection<Range<C>> collectionValues;
            Cut cutBelowAll;
            if (this.f23349d.hasLowerBound()) {
                collectionValues = this.f23348c.tailMap((Cut) this.f23349d.lowerEndpoint(), this.f23349d.lowerBoundType() == BoundType.CLOSED).values();
            } else {
                collectionValues = this.f23348c.values();
            }
            g2 g2VarQ = Iterators.q(collectionValues.iterator());
            if (this.f23349d.contains(Cut.belowAll()) && (!g2VarQ.hasNext() || ((Range) g2VarQ.peek()).lowerBound != Cut.belowAll())) {
                cutBelowAll = Cut.belowAll();
            } else {
                if (!g2VarQ.hasNext()) {
                    return Iterators.g();
                }
                cutBelowAll = ((Range) g2VarQ.next()).upperBound;
            }
            return new a(cutBelowAll, g2VarQ);
        }

        @Override // com.google.common.collect.e
        public Iterator<Map.Entry<Cut<C>, Range<C>>> b() {
            Cut<C> cutHigherKey;
            g2 g2VarQ = Iterators.q(this.f23348c.headMap(this.f23349d.hasUpperBound() ? (Cut) this.f23349d.upperEndpoint() : Cut.aboveAll(), this.f23349d.hasUpperBound() && this.f23349d.upperBoundType() == BoundType.CLOSED).descendingMap().values().iterator());
            if (g2VarQ.hasNext()) {
                cutHigherKey = ((Range) g2VarQ.peek()).upperBound == Cut.aboveAll() ? ((Range) g2VarQ.next()).lowerBound : this.f23347b.higherKey(((Range) g2VarQ.peek()).upperBound);
            } else {
                if (!this.f23349d.contains(Cut.belowAll()) || this.f23347b.containsKey(Cut.belowAll())) {
                    return Iterators.g();
                }
                cutHigherKey = this.f23347b.higherKey(Cut.belowAll());
            }
            return new b((Cut) y7.g.a(cutHigherKey, Cut.aboveAll()), g2VarQ);
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Range<C> get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    Map.Entry<Cut<C>, Range<C>> entryFirstEntry = tailMap(cut, true).firstEntry();
                    if (entryFirstEntry != null && entryFirstEntry.getKey().equals(cut)) {
                        return entryFirstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z10) {
            return h(Range.upTo(cut, BoundType.forBoolean(z10)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z10, Cut<C> cut2, boolean z11) {
            return h(Range.range(cut, BoundType.forBoolean(z10), cut2, BoundType.forBoolean(z11)));
        }

        public final NavigableMap<Cut<C>, Range<C>> h(Range<Cut<C>> range) {
            if (!this.f23349d.isConnected(range)) {
                return ImmutableSortedMap.of();
            }
            return new c(this.f23347b, range.intersection(this.f23349d));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z10) {
            return h(Range.downTo(cut, BoundType.forBoolean(z10)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.w(a());
        }
    }

    public static final class d<C extends Comparable<?>> extends com.google.common.collect.e<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NavigableMap<Cut<C>, Range<C>> f23358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Range<Cut<C>> f23359c;

        public class a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator f23360d;

            public a(Iterator it) {
                this.f23360d = it;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                if (!this.f23360d.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f23360d.next();
                return d.this.f23359c.upperBound.isLessThan(range.upperBound) ? (Map.Entry) b() : Maps.e(range.upperBound, range);
            }
        }

        public class b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g2 f23362d;

            public b(g2 g2Var) {
                this.f23362d = g2Var;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                if (!this.f23362d.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f23362d.next();
                return d.this.f23359c.lowerBound.isLessThan(range.upperBound) ? Maps.e(range.upperBound, range) : (Map.Entry) b();
            }
        }

        public d(NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.f23358b = navigableMap;
            this.f23359c = Range.all();
        }

        public d(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f23358b = navigableMap;
            this.f23359c = range;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.Maps.e
        public Iterator<Map.Entry<Cut<C>, Range<C>>> a() {
            Map.Entry<Cut<C>, Range<C>> entryLowerEntry;
            Iterator<Range<C>> it = (this.f23359c.hasLowerBound() && (entryLowerEntry = this.f23358b.lowerEntry((Cut) this.f23359c.lowerEndpoint())) != null) ? this.f23359c.lowerBound.isLessThan(entryLowerEntry.getValue().upperBound) ? this.f23358b.tailMap(entryLowerEntry.getKey(), true).values().iterator() : this.f23358b.tailMap((Cut) this.f23359c.lowerEndpoint(), true).values().iterator() : this.f23358b.values().iterator();
            return new a(it);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.e
        public Iterator<Map.Entry<Cut<C>, Range<C>>> b() {
            g2 g2VarQ = Iterators.q((this.f23359c.hasUpperBound() ? this.f23358b.headMap((Cut) this.f23359c.upperEndpoint(), false).descendingMap().values() : this.f23358b.descendingMap().values()).iterator());
            if (g2VarQ.hasNext() && this.f23359c.upperBound.isLessThan(((Range) g2VarQ.peek()).upperBound)) {
                g2VarQ.next();
            }
            return new b(g2VarQ);
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Range<C> get(Object obj) {
            Map.Entry<Cut<C>, Range<C>> entryLowerEntry;
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    if (this.f23359c.contains(cut) && (entryLowerEntry = this.f23358b.lowerEntry(cut)) != null && entryLowerEntry.getValue().upperBound.equals(cut)) {
                        return entryLowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z10) {
            return h(Range.upTo(cut, BoundType.forBoolean(z10)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z10, Cut<C> cut2, boolean z11) {
            return h(Range.range(cut, BoundType.forBoolean(z10), cut2, BoundType.forBoolean(z11)));
        }

        public final NavigableMap<Cut<C>, Range<C>> h(Range<Cut<C>> range) {
            return range.isConnected(this.f23359c) ? new d(this.f23358b, range.intersection(this.f23359c)) : ImmutableSortedMap.of();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f23359c.equals(Range.all()) ? this.f23358b.isEmpty() : !a().hasNext();
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z10) {
            return h(Range.downTo(cut, BoundType.forBoolean(z10)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f23359c.equals(Range.all()) ? this.f23358b.size() : Iterators.w(a());
        }
    }

    public static final class e<C extends Comparable<?>> extends com.google.common.collect.e<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Range<Cut<C>> f23364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Range<C> f23365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final NavigableMap<Cut<C>, Range<C>> f23366d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final NavigableMap<Cut<C>, Range<C>> f23367e;

        public class a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator f23368d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Cut f23369e;

            public a(Iterator it, Cut cut) {
                this.f23368d = it;
                this.f23369e = cut;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                if (!this.f23368d.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f23368d.next();
                if (this.f23369e.isLessThan(range.lowerBound)) {
                    return (Map.Entry) b();
                }
                Range rangeIntersection = range.intersection(e.this.f23365c);
                return Maps.e(rangeIntersection.lowerBound, rangeIntersection);
            }
        }

        public class b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator f23371d;

            public b(Iterator it) {
                this.f23371d = it;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                if (!this.f23371d.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f23371d.next();
                if (e.this.f23365c.lowerBound.compareTo((Cut) range.upperBound) >= 0) {
                    return (Map.Entry) b();
                }
                Range rangeIntersection = range.intersection(e.this.f23365c);
                return e.this.f23364b.contains(rangeIntersection.lowerBound) ? Maps.e(rangeIntersection.lowerBound, rangeIntersection) : (Map.Entry) b();
            }
        }

        public e(Range<Cut<C>> range, Range<C> range2, NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.f23364b = (Range) y7.l.m(range);
            this.f23365c = (Range) y7.l.m(range2);
            this.f23366d = (NavigableMap) y7.l.m(navigableMap);
            this.f23367e = new d(navigableMap);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.Maps.e
        public Iterator<Map.Entry<Cut<C>, Range<C>>> a() {
            Iterator<Range<C>> it;
            if (!this.f23365c.isEmpty() && !this.f23364b.upperBound.isLessThan(this.f23365c.lowerBound)) {
                if (this.f23364b.lowerBound.isLessThan(this.f23365c.lowerBound)) {
                    it = this.f23367e.tailMap(this.f23365c.lowerBound, false).values().iterator();
                } else {
                    it = this.f23366d.tailMap((Cut) this.f23364b.lowerBound.endpoint(), this.f23364b.lowerBoundType() == BoundType.CLOSED).values().iterator();
                }
                return new a(it, (Cut) Ordering.natural().min(this.f23364b.upperBound, Cut.belowValue(this.f23365c.upperBound)));
            }
            return Iterators.g();
        }

        @Override // com.google.common.collect.e
        public Iterator<Map.Entry<Cut<C>, Range<C>>> b() {
            if (this.f23365c.isEmpty()) {
                return Iterators.g();
            }
            Cut cut = (Cut) Ordering.natural().min(this.f23364b.upperBound, Cut.belowValue(this.f23365c.upperBound));
            return new b(this.f23366d.headMap((Cut) cut.endpoint(), cut.typeAsUpperBound() == BoundType.CLOSED).descendingMap().values().iterator());
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Range<C> get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    if (this.f23364b.contains(cut) && cut.compareTo((Cut) this.f23365c.lowerBound) >= 0 && cut.compareTo((Cut) this.f23365c.upperBound) < 0) {
                        if (cut.equals(this.f23365c.lowerBound)) {
                            Range range = (Range) Maps.s(this.f23366d.floorEntry(cut));
                            if (range != null && range.upperBound.compareTo((Cut) this.f23365c.lowerBound) > 0) {
                                return range.intersection(this.f23365c);
                            }
                        } else {
                            Range<C> range2 = this.f23366d.get(cut);
                            if (range2 != null) {
                                return range2.intersection(this.f23365c);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z10) {
            return j(Range.upTo(cut, BoundType.forBoolean(z10)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z10, Cut<C> cut2, boolean z11) {
            return j(Range.range(cut, BoundType.forBoolean(z10), cut2, BoundType.forBoolean(z11)));
        }

        public final NavigableMap<Cut<C>, Range<C>> j(Range<Cut<C>> range) {
            return !range.isConnected(this.f23364b) ? ImmutableSortedMap.of() : new e(this.f23364b.intersection(range), this.f23365c, this.f23366d);
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z10) {
            return j(Range.downTo(cut, BoundType.forBoolean(z10)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.w(a());
        }
    }

    public TreeRangeSet(NavigableMap<Cut<C>, Range<C>> navigableMap) {
        this.rangesByLowerBound = navigableMap;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
        return new TreeRangeSet<>(new TreeMap());
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(i2<C> i2Var) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(i2Var);
        return treeRangeSetCreate;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> iterable) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(iterable);
        return treeRangeSetCreate;
    }

    public final Range<C> a(Range<C> range) {
        y7.l.m(range);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        if (entryFloorEntry == null || !entryFloorEntry.getValue().encloses(range)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.common.collect.f
    public void add(Range<C> range) {
        y7.l.m(range);
        if (range.isEmpty()) {
            return;
        }
        Cut<C> cut = range.lowerBound;
        Cut<C> cut2 = range.upperBound;
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(cut);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo((Cut) cut) >= 0) {
                if (value.upperBound.compareTo((Cut) cut2) >= 0) {
                    cut2 = value.upperBound;
                }
                cut = value.lowerBound;
            }
        }
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(cut2);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (value2.upperBound.compareTo((Cut) cut2) >= 0) {
                cut2 = value2.upperBound;
            }
        }
        this.rangesByLowerBound.subMap(cut, cut2).clear();
        b(Range.create(cut, cut2));
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ void addAll(i2 i2Var) {
        super.addAll(i2Var);
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
        super.addAll(iterable);
    }

    public Set<Range<C>> asDescendingSetOfRanges() {
        Set<Range<C>> set = this.f23344c;
        if (set != null) {
            return set;
        }
        b bVar = new b(this, this.rangesByLowerBound.descendingMap().values());
        this.f23344c = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.i2
    public Set<Range<C>> asRanges() {
        Set<Range<C>> set = this.f23343b;
        if (set != null) {
            return set;
        }
        b bVar = new b(this, this.rangesByLowerBound.values());
        this.f23343b = bVar;
        return bVar;
    }

    public final void b(Range<C> range) {
        if (range.isEmpty()) {
            this.rangesByLowerBound.remove(range.lowerBound);
        } else {
            this.rangesByLowerBound.put(range.lowerBound, range);
        }
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.i2
    public i2<C> complement() {
        i2<C> i2Var = this.f23345d;
        if (i2Var != null) {
            return i2Var;
        }
        Complement complement = new Complement();
        this.f23345d = complement;
        return complement;
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.i2
    public boolean encloses(Range<C> range) {
        y7.l.m(range);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        return entryFloorEntry != null && entryFloorEntry.getValue().encloses(range);
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

    @Override // com.google.common.collect.f
    public boolean intersects(Range<C> range) {
        y7.l.m(range);
        Map.Entry<Cut<C>, Range<C>> entryCeilingEntry = this.rangesByLowerBound.ceilingEntry(range.lowerBound);
        if (entryCeilingEntry != null && entryCeilingEntry.getValue().isConnected(range) && !entryCeilingEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        return (entryLowerEntry == null || !entryLowerEntry.getValue().isConnected(range) || entryLowerEntry.getValue().intersection(range).isEmpty()) ? false : true;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.i2
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.f
    public Range<C> rangeContaining(C c10) {
        y7.l.m(c10);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(Cut.belowValue(c10));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().contains(c10)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.common.collect.f
    public void remove(Range<C> range) {
        y7.l.m(range);
        if (range.isEmpty()) {
            return;
        }
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo((Cut) range.lowerBound) >= 0) {
                if (range.hasUpperBound() && value.upperBound.compareTo((Cut) range.upperBound) >= 0) {
                    b(Range.create(range.upperBound, value.upperBound));
                }
                b(Range.create(value.lowerBound, range.lowerBound));
            }
        }
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.upperBound);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (range.hasUpperBound() && value2.upperBound.compareTo((Cut) range.upperBound) >= 0) {
                b(Range.create(range.upperBound, value2.upperBound));
            }
        }
        this.rangesByLowerBound.subMap(range.lowerBound, range.upperBound).clear();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.i2
    public /* bridge */ /* synthetic */ void removeAll(i2 i2Var) {
        super.removeAll(i2Var);
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
        super.removeAll(iterable);
    }

    public Range<C> span() {
        Map.Entry<Cut<C>, Range<C>> entryFirstEntry = this.rangesByLowerBound.firstEntry();
        Map.Entry<Cut<C>, Range<C>> entryLastEntry = this.rangesByLowerBound.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return Range.create(entryFirstEntry.getValue().lowerBound, entryLastEntry.getValue().upperBound);
    }

    @Override // com.google.common.collect.i2
    public i2<C> subRangeSet(Range<C> range) {
        return range.equals(Range.all()) ? this : new SubRangeSet(range);
    }
}
