package cn;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractList.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d<E> extends cn.b<E> implements List<E> {

    @NotNull
    public static final a Companion = new a(null);
    private static final int maxArraySize = 2147483639;

    /* JADX INFO: compiled from: AbstractList.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }

        public final int e(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - d.maxArraySize <= 0) {
                return i12;
            }
            if (i11 > d.maxArraySize) {
                return Integer.MAX_VALUE;
            }
            return d.maxArraySize;
        }

        public final boolean f(@NotNull Collection<?> collection, @NotNull Collection<?> collection2) {
            tn.p.k(collection, "c");
            tn.p.k(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!tn.p.f(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(@NotNull Collection<?> collection) {
            tn.p.k(collection, "c");
            Iterator<?> it = collection.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    public class b implements Iterator<E>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6728b;

        public b() {
        }

        public final int a() {
            return this.f6728b;
        }

        public final void b(int i10) {
            this.f6728b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6728b < d.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            d<E> dVar = d.this;
            int i10 = this.f6728b;
            this.f6728b = i10 + 1;
            return dVar.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    public class c extends d<E>.b implements ListIterator<E> {
        public c(int i10) {
            super();
            d.Companion.c(i10, d.this.size());
            b(i10);
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            d<E> dVar = d.this;
            b(a() - 1);
            return dVar.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: cn.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractList.kt */
    public static final class C0130d<E> extends d<E> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final d<E> f6731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6733d;

        /* JADX WARN: Multi-variable type inference failed */
        public C0130d(@NotNull d<? extends E> dVar, int i10, int i11) {
            tn.p.k(dVar, "list");
            this.f6731b = dVar;
            this.f6732c = i10;
            d.Companion.d(i10, i11, dVar.size());
            this.f6733d = i11 - i10;
        }

        @Override // cn.d, java.util.List
        public E get(int i10) {
            d.Companion.b(i10, this.f6733d);
            return this.f6731b.get(this.f6732c + i10);
        }

        @Override // cn.d, cn.b
        public int getSize() {
            return this.f6733d;
        }
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.f(this, (Collection) obj);
        }
        return false;
    }

    public abstract E get(int i10);

    @Override // cn.b
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.g(this);
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (tn.p.f(it.next(), obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // cn.b, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (tn.p.f(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @NotNull
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @NotNull
    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public List<E> subList(int i10, int i11) {
        return new C0130d(this, i10, i11);
    }
}
