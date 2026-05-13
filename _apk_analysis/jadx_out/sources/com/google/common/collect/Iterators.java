package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class Iterators {

    public enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            j1.e(false);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends r2<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterator f23222b;

        public a(Iterator it) {
            this.f23222b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23222b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return (T) this.f23222b.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> extends AbstractIterator<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Iterator f23223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ y7.m f23224e;

        public b(Iterator it, y7.m mVar) {
            this.f23223d = it;
            this.f23224e = mVar;
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
        public T a() {
            while (this.f23223d.hasNext()) {
                T t10 = (T) this.f23223d.next();
                if (this.f23224e.apply(t10)) {
                    return t10;
                }
            }
            return b();
        }
    }

    public static final class c<T> extends com.google.common.collect.a<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final s2<Object> f23225e = new c(new Object[0], 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final T[] f23226d;

        public c(T[] tArr, int i10) {
            super(tArr.length, i10);
            this.f23226d = tArr;
        }

        @Override // com.google.common.collect.a
        public T a(int i10) {
            return this.f23226d[i10];
        }
    }

    public static class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<? extends T> f23227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<? extends T> f23228c = Iterators.g();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator<? extends Iterator<? extends T>> f23229d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Deque<Iterator<? extends Iterator<? extends T>>> f23230e;

        public d(Iterator<? extends Iterator<? extends T>> it) {
            this.f23229d = (Iterator) y7.l.m(it);
        }

        public final Iterator<? extends Iterator<? extends T>> a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f23229d;
                if (it != null && it.hasNext()) {
                    return this.f23229d;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f23230e;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f23229d = this.f23230e.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) y7.l.m(this.f23228c)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> itA = a();
                this.f23229d = itA;
                if (itA == null) {
                    return false;
                }
                Iterator<? extends T> next = itA.next();
                this.f23228c = next;
                if (next instanceof d) {
                    d dVar = (d) next;
                    this.f23228c = dVar.f23228c;
                    if (this.f23230e == null) {
                        this.f23230e = new ArrayDeque();
                    }
                    this.f23230e.addFirst(this.f23229d);
                    if (dVar.f23230e != null) {
                        while (!dVar.f23230e.isEmpty()) {
                            this.f23230e.addFirst(dVar.f23230e.removeLast());
                        }
                    }
                    this.f23229d = dVar.f23229d;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.f23228c;
            this.f23227b = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.f23227b;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f23227b = null;
        }
    }

    public static class e<E> implements g2<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<? extends E> f23231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f23232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public E f23233d;

        public e(Iterator<? extends E> it) {
            this.f23231b = (Iterator) y7.l.m(it);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23232c || this.f23231b.hasNext();
        }

        @Override // com.google.common.collect.g2, java.util.Iterator
        public E next() {
            if (!this.f23232c) {
                return this.f23231b.next();
            }
            E e10 = (E) c2.a(this.f23233d);
            this.f23232c = false;
            this.f23233d = null;
            return e10;
        }

        @Override // com.google.common.collect.g2
        public E peek() {
            if (!this.f23232c) {
                this.f23233d = this.f23231b.next();
                this.f23232c = true;
            }
            return (E) c2.a(this.f23233d);
        }

        @Override // java.util.Iterator
        public void remove() {
            y7.l.s(!this.f23232c, "Can't remove after you've peeked at next");
            this.f23231b.remove();
        }
    }

    public static final class f<T> extends r2<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Object f23234c = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f23235b;

        public f(T t10) {
            this.f23235b = t10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23235b != f23234c;
        }

        @Override // java.util.Iterator
        public T next() {
            T t10 = (T) this.f23235b;
            Object obj = f23234c;
            if (t10 == obj) {
                throw new NoSuchElementException();
            }
            this.f23235b = obj;
            return t10;
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        y7.l.m(collection);
        y7.l.m(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static <T> boolean b(Iterator<T> it, y7.m<? super T> mVar) {
        return p(it, mVar) != -1;
    }

    public static void c(Iterator<?> it) {
        y7.l.m(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> Iterator<T> d(Iterator<? extends Iterator<? extends T>> it) {
        return new d(it);
    }

    public static boolean e(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !y7.i.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static <T> r2<T> g() {
        return h();
    }

    public static <T> s2<T> h() {
        return (s2<T>) c.f23225e;
    }

    public static <T> Iterator<T> i() {
        return EmptyModifiableIterator.INSTANCE;
    }

    public static <T> r2<T> j(Iterator<T> it, y7.m<? super T> mVar) {
        y7.l.m(it);
        y7.l.m(mVar);
        return new b(it, mVar);
    }

    public static <T> T k(Iterator<T> it, y7.m<? super T> mVar) {
        y7.l.m(it);
        y7.l.m(mVar);
        while (it.hasNext()) {
            T next = it.next();
            if (mVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T l(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T m(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? (T) l(it) : t10;
    }

    public static <T> T n(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    public static <T> T o(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static <T> int p(Iterator<T> it, y7.m<? super T> mVar) {
        y7.l.n(mVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (mVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> g2<T> q(Iterator<? extends T> it) {
        return it instanceof e ? (e) it : new e(it);
    }

    public static <T> T r(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static boolean s(Iterator<?> it, Collection<?> collection) {
        y7.l.m(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean t(Iterator<T> it, y7.m<? super T> mVar) {
        y7.l.m(mVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (mVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean u(Iterator<?> it, Collection<?> collection) {
        y7.l.m(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> r2<T> v(T t10) {
        return new f(t10);
    }

    public static int w(Iterator<?> it) {
        long j10 = 0;
        while (it.hasNext()) {
            it.next();
            j10++;
        }
        return Ints.m(j10);
    }

    public static String x(Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            z10 = false;
            sb2.append(it.next());
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static <T> r2<T> y(Iterator<? extends T> it) {
        y7.l.m(it);
        return it instanceof r2 ? (r2) it : new a(it);
    }
}
