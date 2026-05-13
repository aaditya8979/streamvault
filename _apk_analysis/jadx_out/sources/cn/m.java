package cn;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ArrayDeque.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class m<E> extends h<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f6749e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Object[] f6750f = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Object[] f6752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6753d;

    /* JADX INFO: compiled from: ArrayDeque.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public m() {
        this.f6752c = f6750f;
    }

    public m(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f6750f;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i10);
            }
            objArr = new Object[i10];
        }
        this.f6752c = objArr;
    }

    public final void a(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f6752c.length;
        while (i10 < length && it.hasNext()) {
            this.f6752c[i10] = it.next();
            i10++;
        }
        int i11 = this.f6751b;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f6752c[i12] = it.next();
        }
        this.f6753d = size() + collection.size();
    }

    @Override // cn.h, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        d.Companion.c(i10, size());
        if (i10 == size()) {
            addLast(e10);
            return;
        }
        if (i10 == 0) {
            addFirst(e10);
            return;
        }
        q();
        h(size() + 1);
        int iP = p(this.f6751b + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iG = g(iP);
            int iG2 = g(this.f6751b);
            int i11 = this.f6751b;
            if (iG >= i11) {
                Object[] objArr = this.f6752c;
                objArr[iG2] = objArr[i11];
                p.l(objArr, objArr, i11, i11 + 1, iG + 1);
            } else {
                Object[] objArr2 = this.f6752c;
                p.l(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f6752c;
                objArr3[objArr3.length - 1] = objArr3[0];
                p.l(objArr3, objArr3, 0, 1, iG + 1);
            }
            this.f6752c[iG] = e10;
            this.f6751b = iG2;
        } else {
            int iP2 = p(this.f6751b + size());
            if (iP < iP2) {
                Object[] objArr4 = this.f6752c;
                p.l(objArr4, objArr4, iP + 1, iP, iP2);
            } else {
                Object[] objArr5 = this.f6752c;
                p.l(objArr5, objArr5, 1, 0, iP2);
                Object[] objArr6 = this.f6752c;
                objArr6[0] = objArr6[objArr6.length - 1];
                p.l(objArr6, objArr6, iP + 1, iP, objArr6.length - 1);
            }
            this.f6752c[iP] = e10;
        }
        this.f6753d = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, @NotNull Collection<? extends E> collection) {
        tn.p.k(collection, "elements");
        d.Companion.c(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        q();
        h(size() + collection.size());
        int iP = p(this.f6751b + size());
        int iP2 = p(this.f6751b + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f6751b;
            int length = i11 - size;
            if (iP2 < i11) {
                Object[] objArr = this.f6752c;
                p.l(objArr, objArr, length, i11, objArr.length);
                if (size >= iP2) {
                    Object[] objArr2 = this.f6752c;
                    p.l(objArr2, objArr2, objArr2.length - size, 0, iP2);
                } else {
                    Object[] objArr3 = this.f6752c;
                    p.l(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f6752c;
                    p.l(objArr4, objArr4, 0, size, iP2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f6752c;
                p.l(objArr5, objArr5, length, i11, iP2);
            } else {
                Object[] objArr6 = this.f6752c;
                length += objArr6.length;
                int i12 = iP2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    p.l(objArr6, objArr6, length, i11, iP2);
                } else {
                    p.l(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f6752c;
                    p.l(objArr7, objArr7, 0, this.f6751b + length2, iP2);
                }
            }
            this.f6751b = length;
            a(n(iP2 - size), collection);
        } else {
            int i13 = iP2 + size;
            if (iP2 < iP) {
                int i14 = size + iP;
                Object[] objArr8 = this.f6752c;
                if (i14 <= objArr8.length) {
                    p.l(objArr8, objArr8, i13, iP2, iP);
                } else if (i13 >= objArr8.length) {
                    p.l(objArr8, objArr8, i13 - objArr8.length, iP2, iP);
                } else {
                    int length3 = iP - (i14 - objArr8.length);
                    p.l(objArr8, objArr8, 0, length3, iP);
                    Object[] objArr9 = this.f6752c;
                    p.l(objArr9, objArr9, i13, iP2, length3);
                }
            } else {
                Object[] objArr10 = this.f6752c;
                p.l(objArr10, objArr10, size, 0, iP);
                Object[] objArr11 = this.f6752c;
                if (i13 >= objArr11.length) {
                    p.l(objArr11, objArr11, i13 - objArr11.length, iP2, objArr11.length);
                } else {
                    p.l(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f6752c;
                    p.l(objArr12, objArr12, i13, iP2, objArr12.length - size);
                }
            }
            a(iP2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        tn.p.k(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        q();
        h(size() + collection.size());
        a(p(this.f6751b + size()), collection);
        return true;
    }

    public final void addFirst(E e10) {
        q();
        h(size() + 1);
        int iG = g(this.f6751b);
        this.f6751b = iG;
        this.f6752c[iG] = e10;
        this.f6753d = size() + 1;
    }

    public final void addLast(E e10) {
        q();
        h(size() + 1);
        this.f6752c[p(this.f6751b + size())] = e10;
        this.f6753d = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            q();
            o(this.f6751b, p(this.f6751b + size()));
        }
        this.f6751b = 0;
        this.f6753d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void f(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f6752c;
        p.l(objArr2, objArr, 0, this.f6751b, objArr2.length);
        Object[] objArr3 = this.f6752c;
        int length = objArr3.length;
        int i11 = this.f6751b;
        p.l(objArr3, objArr, length - i11, 0, i11);
        this.f6751b = 0;
        this.f6752c = objArr;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f6752c[this.f6751b];
    }

    public final int g(int i10) {
        return i10 == 0 ? r.c0(this.f6752c) : i10 - 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        d.Companion.b(i10, size());
        return (E) this.f6752c[p(this.f6751b + i10)];
    }

    @Override // cn.h
    public int getSize() {
        return this.f6753d;
    }

    public final void h(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f6752c;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f6750f) {
            this.f6752c = new Object[zn.n.e(i10, 10)];
        } else {
            f(d.Companion.e(objArr.length, i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iP = p(this.f6751b + size());
        int length = this.f6751b;
        if (length < iP) {
            while (length < iP) {
                if (tn.p.f(obj, this.f6752c[length])) {
                    i10 = this.f6751b;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iP) {
            return -1;
        }
        int length2 = this.f6752c.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iP; i11++) {
                    if (tn.p.f(obj, this.f6752c[i11])) {
                        length = i11 + this.f6752c.length;
                        i10 = this.f6751b;
                    }
                }
                return -1;
            }
            if (tn.p.f(obj, this.f6752c[length])) {
                i10 = this.f6751b;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Nullable
    public final E j() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f6752c[this.f6751b];
    }

    public final int l(int i10) {
        if (i10 == r.c0(this.f6752c)) {
            return 0;
        }
        return i10 + 1;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f6752c[p(this.f6751b + w.o(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iC0;
        int i10;
        int iP = p(this.f6751b + size());
        int i11 = this.f6751b;
        if (i11 < iP) {
            iC0 = iP - 1;
            if (i11 <= iC0) {
                while (!tn.p.f(obj, this.f6752c[iC0])) {
                    if (iC0 != i11) {
                        iC0--;
                    }
                }
                i10 = this.f6751b;
                return iC0 - i10;
            }
            return -1;
        }
        if (i11 > iP) {
            int i12 = iP - 1;
            while (true) {
                if (-1 >= i12) {
                    iC0 = r.c0(this.f6752c);
                    int i13 = this.f6751b;
                    if (i13 <= iC0) {
                        while (!tn.p.f(obj, this.f6752c[iC0])) {
                            if (iC0 != i13) {
                                iC0--;
                            }
                        }
                        i10 = this.f6751b;
                    }
                } else {
                    if (tn.p.f(obj, this.f6752c[i12])) {
                        iC0 = i12 + this.f6752c.length;
                        i10 = this.f6751b;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    @Nullable
    public final E m() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f6752c[p(this.f6751b + w.o(this))];
    }

    public final int n(int i10) {
        return i10 < 0 ? i10 + this.f6752c.length : i10;
    }

    public final void o(int i10, int i11) {
        if (i10 < i11) {
            p.v(this.f6752c, null, i10, i11);
            return;
        }
        Object[] objArr = this.f6752c;
        p.v(objArr, null, i10, objArr.length);
        p.v(this.f6752c, null, 0, i11);
    }

    public final int p(int i10) {
        Object[] objArr = this.f6752c;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final void q() {
        ((AbstractList) this).modCount++;
    }

    @Nullable
    public final E r() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<?> collection) {
        int iP;
        tn.p.k(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f6752c.length == 0) == false) {
                int iP2 = p(this.f6751b + size());
                int i10 = this.f6751b;
                if (i10 < iP2) {
                    iP = i10;
                    while (i10 < iP2) {
                        Object obj = this.f6752c[i10];
                        if (!collection.contains(obj)) {
                            this.f6752c[iP] = obj;
                            iP++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    p.v(this.f6752c, null, iP, iP2);
                } else {
                    int length = this.f6752c.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f6752c;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!collection.contains(obj2)) {
                            this.f6752c[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    iP = p(i11);
                    for (int i12 = 0; i12 < iP2; i12++) {
                        Object[] objArr2 = this.f6752c;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!collection.contains(obj3)) {
                            this.f6752c[iP] = obj3;
                            iP = l(iP);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    q();
                    this.f6753d = n(iP - this.f6751b);
                }
            }
        }
        return z10;
    }

    @Override // cn.h
    public E removeAt(int i10) {
        d.Companion.b(i10, size());
        if (i10 == w.o(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        q();
        int iP = p(this.f6751b + i10);
        E e10 = (E) this.f6752c[iP];
        if (i10 < (size() >> 1)) {
            int i11 = this.f6751b;
            if (iP >= i11) {
                Object[] objArr = this.f6752c;
                p.l(objArr, objArr, i11 + 1, i11, iP);
            } else {
                Object[] objArr2 = this.f6752c;
                p.l(objArr2, objArr2, 1, 0, iP);
                Object[] objArr3 = this.f6752c;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f6751b;
                p.l(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f6752c;
            int i13 = this.f6751b;
            objArr4[i13] = null;
            this.f6751b = l(i13);
        } else {
            int iP2 = p(this.f6751b + w.o(this));
            if (iP <= iP2) {
                Object[] objArr5 = this.f6752c;
                p.l(objArr5, objArr5, iP, iP + 1, iP2 + 1);
            } else {
                Object[] objArr6 = this.f6752c;
                p.l(objArr6, objArr6, iP, iP + 1, objArr6.length);
                Object[] objArr7 = this.f6752c;
                objArr7[objArr7.length - 1] = objArr7[0];
                p.l(objArr7, objArr7, 0, 1, iP2 + 1);
            }
            this.f6752c[iP2] = null;
        }
        this.f6753d = size() - 1;
        return e10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        q();
        Object[] objArr = this.f6752c;
        int i10 = this.f6751b;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.f6751b = l(i10);
        this.f6753d = size() - 1;
        return e10;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        q();
        int iP = p(this.f6751b + w.o(this));
        Object[] objArr = this.f6752c;
        E e10 = (E) objArr[iP];
        objArr[iP] = null;
        this.f6753d = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        d.Companion.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            remove(i10);
            return;
        }
        q();
        if (i10 < size() - i11) {
            t(i10, i11);
            int iP = p(this.f6751b + i12);
            o(this.f6751b, iP);
            this.f6751b = iP;
        } else {
            u(i10, i11);
            int iP2 = p(this.f6751b + size());
            o(n(iP2 - i12), iP2);
        }
        this.f6753d = size() - i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<?> collection) {
        int iP;
        tn.p.k(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f6752c.length == 0) == false) {
                int iP2 = p(this.f6751b + size());
                int i10 = this.f6751b;
                if (i10 < iP2) {
                    iP = i10;
                    while (i10 < iP2) {
                        Object obj = this.f6752c[i10];
                        if (collection.contains(obj)) {
                            this.f6752c[iP] = obj;
                            iP++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    p.v(this.f6752c, null, iP, iP2);
                } else {
                    int length = this.f6752c.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f6752c;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (collection.contains(obj2)) {
                            this.f6752c[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    iP = p(i11);
                    for (int i12 = 0; i12 < iP2; i12++) {
                        Object[] objArr2 = this.f6752c;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (collection.contains(obj3)) {
                            this.f6752c[iP] = obj3;
                            iP = l(iP);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    q();
                    this.f6753d = n(iP - this.f6751b);
                }
            }
        }
        return z10;
    }

    @Nullable
    public final E s() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // cn.h, java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        d.Companion.b(i10, size());
        int iP = p(this.f6751b + i10);
        Object[] objArr = this.f6752c;
        E e11 = (E) objArr[iP];
        objArr[iP] = e10;
        return e11;
    }

    public final void t(int i10, int i11) {
        int iP = p(this.f6751b + (i10 - 1));
        int iP2 = p(this.f6751b + (i11 - 1));
        while (i10 > 0) {
            int i12 = iP + 1;
            int iMin = Math.min(i10, Math.min(i12, iP2 + 1));
            Object[] objArr = this.f6752c;
            int i13 = iP2 - iMin;
            int i14 = iP - iMin;
            p.l(objArr, objArr, i13 + 1, i14 + 1, i12);
            iP = n(i14);
            iP2 = n(i13);
            i10 -= iMin;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        tn.p.k(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) n.a(tArr, size());
        }
        int iP = p(this.f6751b + size());
        int i10 = this.f6751b;
        if (i10 < iP) {
            p.p(this.f6752c, tArr, 0, i10, iP, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f6752c;
            p.l(objArr, tArr, 0, this.f6751b, objArr.length);
            Object[] objArr2 = this.f6752c;
            p.l(objArr2, tArr, objArr2.length - this.f6751b, 0, iP);
        }
        return (T[]) v.f(size(), tArr);
    }

    public final void u(int i10, int i11) {
        int iP = p(this.f6751b + i11);
        int iP2 = p(this.f6751b + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f6752c;
            i11 = Math.min(size, Math.min(objArr.length - iP, objArr.length - iP2));
            Object[] objArr2 = this.f6752c;
            int i12 = iP + i11;
            p.l(objArr2, objArr2, iP2, iP, i12);
            iP = p(i12);
            iP2 = p(iP2 + i11);
        }
    }
}
