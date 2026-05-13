package kotlin.collections.builders;

import cn.d;
import cn.h;
import cn.v;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ListBuilder<E> extends h<E> implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f73204b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ListBuilder f73205c;

    @NotNull
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    /* JADX INFO: compiled from: ListBuilder.kt */
    public static final class BuilderSubList<E> extends h<E> implements RandomAccess, Serializable {

        @NotNull
        private E[] backing;
        private int length;
        private final int offset;

        @Nullable
        private final BuilderSubList<E> parent;

        @NotNull
        private final ListBuilder<E> root;

        /* JADX INFO: compiled from: ListBuilder.kt */
        public static final class a<E> implements ListIterator<E>, un.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final BuilderSubList<E> f73206b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f73207c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f73208d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f73209e;

            public a(@NotNull BuilderSubList<E> builderSubList, int i10) {
                p.k(builderSubList, "list");
                this.f73206b = builderSubList;
                this.f73207c = i10;
                this.f73208d = -1;
                this.f73209e = ((AbstractList) builderSubList).modCount;
            }

            public final void a() {
                if (((AbstractList) ((BuilderSubList) this.f73206b).root).modCount != this.f73209e) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(E e10) {
                a();
                BuilderSubList<E> builderSubList = this.f73206b;
                int i10 = this.f73207c;
                this.f73207c = i10 + 1;
                builderSubList.add(i10, e10);
                this.f73208d = -1;
                this.f73209e = ((AbstractList) this.f73206b).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f73207c < ((BuilderSubList) this.f73206b).length;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f73207c > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                a();
                if (this.f73207c >= ((BuilderSubList) this.f73206b).length) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f73207c;
                this.f73207c = i10 + 1;
                this.f73208d = i10;
                return (E) ((BuilderSubList) this.f73206b).backing[((BuilderSubList) this.f73206b).offset + this.f73208d];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f73207c;
            }

            @Override // java.util.ListIterator
            public E previous() {
                a();
                int i10 = this.f73207c;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f73207c = i11;
                this.f73208d = i11;
                return (E) ((BuilderSubList) this.f73206b).backing[((BuilderSubList) this.f73206b).offset + this.f73208d];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f73207c - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a();
                int i10 = this.f73208d;
                if (!(i10 != -1)) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                this.f73206b.remove(i10);
                this.f73207c = this.f73208d;
                this.f73208d = -1;
                this.f73209e = ((AbstractList) this.f73206b).modCount;
            }

            @Override // java.util.ListIterator
            public void set(E e10) {
                a();
                int i10 = this.f73208d;
                if (!(i10 != -1)) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                this.f73206b.set(i10, e10);
            }
        }

        public BuilderSubList(@NotNull E[] eArr, int i10, int i11, @Nullable BuilderSubList<E> builderSubList, @NotNull ListBuilder<E> listBuilder) {
            p.k(eArr, "backing");
            p.k(listBuilder, "root");
            this.backing = eArr;
            this.offset = i10;
            this.length = i11;
            this.parent = builderSubList;
            this.root = listBuilder;
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (l()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        public final void a(int i10, Collection<? extends E> collection, int i11) {
            m();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.a(i10, collection, i11);
            } else {
                this.root.a(i10, collection, i11);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += i11;
        }

        @Override // cn.h, java.util.AbstractList, java.util.List
        public void add(int i10, E e10) {
            h();
            g();
            d.Companion.c(i10, this.length);
            f(this.offset + i10, e10);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E e10) {
            h();
            g();
            f(this.offset + this.length, e10);
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, @NotNull Collection<? extends E> collection) {
            p.k(collection, "elements");
            h();
            g();
            d.Companion.c(i10, this.length);
            int size = collection.size();
            a(this.offset + i10, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(@NotNull Collection<? extends E> collection) {
            p.k(collection, "elements");
            h();
            g();
            int size = collection.size();
            a(this.offset + this.length, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            h();
            g();
            o(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@Nullable Object obj) {
            g();
            return obj == this || ((obj instanceof List) && j((List) obj));
        }

        public final void f(int i10, E e10) {
            m();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.f(i10, e10);
            } else {
                this.root.f(i10, e10);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        public final void g() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i10) {
            g();
            d.Companion.b(i10, this.length);
            return this.backing[this.offset + i10];
        }

        @Override // cn.h
        public int getSize() {
            g();
            return this.length;
        }

        public final void h() {
            if (l()) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            g();
            return dn.b.i(this.backing, this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            g();
            for (int i10 = 0; i10 < this.length; i10++) {
                if (p.f(this.backing[this.offset + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            g();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @NotNull
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        public final boolean j(List<?> list) {
            return dn.b.h(this.backing, this.offset, this.length, list);
        }

        public final boolean l() {
            return ((ListBuilder) this.root).isReadOnly;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            g();
            for (int i10 = this.length - 1; i10 >= 0; i10--) {
                if (p.f(this.backing[this.offset + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator(int i10) {
            g();
            d.Companion.c(i10, this.length);
            return new a(this, i10);
        }

        public final void m() {
            ((AbstractList) this).modCount++;
        }

        public final E n(int i10) {
            m();
            BuilderSubList<E> builderSubList = this.parent;
            this.length--;
            return builderSubList != null ? builderSubList.n(i10) : (E) this.root.o(i10);
        }

        public final void o(int i10, int i11) {
            if (i11 > 0) {
                m();
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.o(i10, i11);
            } else {
                this.root.p(i10, i11);
            }
            this.length -= i11;
        }

        public final int p(int i10, int i11, Collection<? extends E> collection, boolean z10) {
            BuilderSubList<E> builderSubList = this.parent;
            int iP = builderSubList != null ? builderSubList.p(i10, i11, collection, z10) : this.root.q(i10, i11, collection, z10);
            if (iP > 0) {
                m();
            }
            this.length -= iP;
            return iP;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            h();
            g();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(@NotNull Collection<?> collection) {
            p.k(collection, "elements");
            h();
            g();
            return p(this.offset, this.length, collection, false) > 0;
        }

        @Override // cn.h
        public E removeAt(int i10) {
            h();
            g();
            d.Companion.b(i10, this.length);
            return n(this.offset + i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(@NotNull Collection<?> collection) {
            p.k(collection, "elements");
            h();
            g();
            return p(this.offset, this.length, collection, true) > 0;
        }

        @Override // cn.h, java.util.AbstractList, java.util.List
        public E set(int i10, E e10) {
            h();
            g();
            d.Companion.b(i10, this.length);
            E[] eArr = this.backing;
            int i11 = this.offset;
            E e11 = eArr[i11 + i10];
            eArr[i11 + i10] = e10;
            return e11;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public List<E> subList(int i10, int i11) {
            d.Companion.d(i10, i11, this.length);
            return new BuilderSubList(this.backing, this.offset + i10, i11 - i10, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public Object[] toArray() {
            g();
            E[] eArr = this.backing;
            int i10 = this.offset;
            return cn.p.s(eArr, i10, this.length + i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public <T> T[] toArray(@NotNull T[] tArr) {
            p.k(tArr, "array");
            g();
            int length = tArr.length;
            int i10 = this.length;
            if (length >= i10) {
                E[] eArr = this.backing;
                int i11 = this.offset;
                cn.p.l(eArr, tArr, 0, i11, i10 + i11);
                return (T[]) v.f(this.length, tArr);
            }
            E[] eArr2 = this.backing;
            int i12 = this.offset;
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr2, i12, i10 + i12, tArr.getClass());
            p.j(tArr2, "copyOfRange(...)");
            return tArr2;
        }

        @Override // java.util.AbstractCollection
        @NotNull
        public String toString() {
            g();
            return dn.b.j(this.backing, this.offset, this.length, this);
        }
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    public static final class b<E> implements ListIterator<E>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ListBuilder<E> f73210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f73211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f73212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f73213e;

        public b(@NotNull ListBuilder<E> listBuilder, int i10) {
            p.k(listBuilder, "list");
            this.f73210b = listBuilder;
            this.f73211c = i10;
            this.f73212d = -1;
            this.f73213e = ((AbstractList) listBuilder).modCount;
        }

        public final void a() {
            if (((AbstractList) this.f73210b).modCount != this.f73213e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            a();
            ListBuilder<E> listBuilder = this.f73210b;
            int i10 = this.f73211c;
            this.f73211c = i10 + 1;
            listBuilder.add(i10, e10);
            this.f73212d = -1;
            this.f73213e = ((AbstractList) this.f73210b).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f73211c < ((ListBuilder) this.f73210b).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f73211c > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            a();
            if (this.f73211c >= ((ListBuilder) this.f73210b).length) {
                throw new NoSuchElementException();
            }
            int i10 = this.f73211c;
            this.f73211c = i10 + 1;
            this.f73212d = i10;
            return (E) ((ListBuilder) this.f73210b).backing[this.f73212d];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f73211c;
        }

        @Override // java.util.ListIterator
        public E previous() {
            a();
            int i10 = this.f73211c;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f73211c = i11;
            this.f73212d = i11;
            return (E) ((ListBuilder) this.f73210b).backing[this.f73212d];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f73211c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i10 = this.f73212d;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f73210b.remove(i10);
            this.f73211c = this.f73212d;
            this.f73212d = -1;
            this.f73213e = ((AbstractList) this.f73210b).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            a();
            int i10 = this.f73212d;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f73210b.set(i10, e10);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        f73205c = listBuilder;
    }

    public ListBuilder() {
        this(0, 1, null);
    }

    public ListBuilder(int i10) {
        this.backing = (E[]) dn.b.d(i10);
    }

    public /* synthetic */ ListBuilder(int i10, int i11, i iVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public final void a(int i10, Collection<? extends E> collection, int i11) {
        n();
        m(i10, i11);
        Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.backing[i10 + i12] = it.next();
        }
    }

    @Override // cn.h, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        g();
        d.Companion.c(i10, this.length);
        f(i10, e10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        g();
        f(this.length, e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, @NotNull Collection<? extends E> collection) {
        p.k(collection, "elements");
        g();
        d.Companion.c(i10, this.length);
        int size = collection.size();
        a(i10, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        p.k(collection, "elements");
        g();
        int size = collection.size();
        a(this.length, collection, size);
        return size > 0;
    }

    @NotNull
    public final List<E> build() {
        g();
        this.isReadOnly = true;
        return this.length > 0 ? this : f73205c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        g();
        p(0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof List) && h((List) obj));
    }

    public final void f(int i10, E e10) {
        n();
        m(i10, 1);
        this.backing[i10] = e10;
    }

    public final void g() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        d.Companion.b(i10, this.length);
        return this.backing[i10];
    }

    @Override // cn.h
    public int getSize() {
        return this.length;
    }

    public final boolean h(List<?> list) {
        return dn.b.h(this.backing, 0, this.length, list);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return dn.b.i(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.length; i10++) {
            if (p.f(this.backing[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    public final void j(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (i10 > eArr.length) {
            this.backing = (E[]) dn.b.e(this.backing, d.Companion.e(eArr.length, i10));
        }
    }

    public final void l(int i10) {
        j(this.length + i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.length - 1; i10 >= 0; i10--) {
            if (p.f(this.backing[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i10) {
        d.Companion.c(i10, this.length);
        return new b(this, i10);
    }

    public final void m(int i10, int i11) {
        l(i11);
        E[] eArr = this.backing;
        cn.p.l(eArr, eArr, i10 + i11, i10, this.length);
        this.length += i11;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    public final E o(int i10) {
        n();
        E[] eArr = this.backing;
        E e10 = eArr[i10];
        cn.p.l(eArr, eArr, i10, i10 + 1, this.length);
        dn.b.f(this.backing, this.length - 1);
        this.length--;
        return e10;
    }

    public final void p(int i10, int i11) {
        if (i11 > 0) {
            n();
        }
        E[] eArr = this.backing;
        cn.p.l(eArr, eArr, i10, i10 + i11, this.length);
        E[] eArr2 = this.backing;
        int i12 = this.length;
        dn.b.g(eArr2, i12 - i11, i12);
        this.length -= i11;
    }

    public final int q(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.backing[i14]) == z10) {
                E[] eArr = this.backing;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.backing;
        cn.p.l(eArr2, eArr2, i10 + i13, i11 + i10, this.length);
        E[] eArr3 = this.backing;
        int i16 = this.length;
        dn.b.g(eArr3, i16 - i15, i16);
        if (i15 > 0) {
            n();
        }
        this.length -= i15;
        return i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        g();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<?> collection) {
        p.k(collection, "elements");
        g();
        return q(0, this.length, collection, false) > 0;
    }

    @Override // cn.h
    public E removeAt(int i10) {
        g();
        d.Companion.b(i10, this.length);
        return o(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<?> collection) {
        p.k(collection, "elements");
        g();
        return q(0, this.length, collection, true) > 0;
    }

    @Override // cn.h, java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        g();
        d.Companion.b(i10, this.length);
        E[] eArr = this.backing;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int i10, int i11) {
        d.Companion.d(i10, i11, this.length);
        return new BuilderSubList(this.backing, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return cn.p.s(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        p.k(tArr, "array");
        int length = tArr.length;
        int i10 = this.length;
        if (length >= i10) {
            cn.p.l(this.backing, tArr, 0, 0, i10);
            return (T[]) v.f(this.length, tArr);
        }
        T[] tArr2 = (T[]) Arrays.copyOfRange(this.backing, 0, i10, tArr.getClass());
        p.j(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        return dn.b.j(this.backing, 0, this.length, this);
    }
}
