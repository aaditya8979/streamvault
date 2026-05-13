package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    public static final double HASH_FLOODING_FPP = 0.001d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Object f23124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int[] f23125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f23126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f23127e;
    public transient Object[] elements;

    public class a implements Iterator<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23130d = -1;

        public a() {
            this.f23128b = CompactHashSet.this.f23126d;
            this.f23129c = CompactHashSet.this.firstEntryIndex();
        }

        public final void a() {
            if (CompactHashSet.this.f23126d != this.f23128b) {
                throw new ConcurrentModificationException();
            }
        }

        public void b() {
            this.f23128b += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23129c >= 0;
        }

        @Override // java.util.Iterator
        public E next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f23129c;
            this.f23130d = i10;
            E e10 = (E) CompactHashSet.this.f(i10);
            this.f23129c = CompactHashSet.this.getSuccessor(this.f23129c);
            return e10;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            j1.e(this.f23130d >= 0);
            b();
            CompactHashSet compactHashSet = CompactHashSet.this;
            compactHashSet.remove(compactHashSet.f(this.f23130d));
            this.f23129c = CompactHashSet.this.adjustAfterRemove(this.f23129c, this.f23130d);
            this.f23130d = -1;
        }
    }

    public CompactHashSet() {
        init(3);
    }

    public CompactHashSet(int i10) {
        init(i10);
    }

    public static <E> CompactHashSet<E> create() {
        return new CompactHashSet<>();
    }

    public static <E> CompactHashSet<E> create(Collection<? extends E> collection) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(collection.size());
        compactHashSetCreateWithExpectedSize.addAll(collection);
        return compactHashSetCreateWithExpectedSize;
    }

    @SafeVarargs
    public static <E> CompactHashSet<E> create(E... eArr) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(compactHashSetCreateWithExpectedSize, eArr);
        return compactHashSetCreateWithExpectedSize;
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int i10) {
        return new CompactHashSet<>(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Invalid size: " + i10);
        }
        init(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.add(e10);
        }
        int[] iArrJ = j();
        Object[] objArrI = i();
        int i10 = this.f23127e;
        int i11 = i10 + 1;
        int iC = v1.c(e10);
        int iH = h();
        int i12 = iC & iH;
        int iH2 = l1.h(l(), i12);
        if (iH2 != 0) {
            int iB = l1.b(iC, iH);
            int i13 = 0;
            while (true) {
                int i14 = iH2 - 1;
                int i15 = iArrJ[i14];
                if (l1.b(i15, iH) == iB && y7.i.a(e10, objArrI[i14])) {
                    return false;
                }
                int iC2 = l1.c(i15, iH);
                i13++;
                if (iC2 != 0) {
                    iH2 = iC2;
                } else {
                    if (i13 >= 9) {
                        return convertToHashFloodingResistantImplementation().add(e10);
                    }
                    if (i11 > iH) {
                        iH = n(iH, l1.e(iH), iC, i10);
                    } else {
                        iArrJ[i14] = l1.d(i15, i11, iH);
                    }
                }
            }
        } else if (i11 > iH) {
            iH = n(iH, l1.e(iH), iC, i10);
        } else {
            l1.i(l(), i12, i11);
        }
        m(i11);
        insertEntry(i10, e10, iC, iH);
        this.f23127e = i11;
        incrementModCount();
        return true;
    }

    public int adjustAfterRemove(int i10, int i11) {
        return i10 - 1;
    }

    public int allocArrays() {
        y7.l.s(needsAllocArrays(), "Arrays already allocated");
        int i10 = this.f23126d;
        int iJ = l1.j(i10);
        this.f23124b = l1.a(iJ);
        q(iJ - 1);
        this.f23125c = new int[i10];
        this.elements = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            this.f23126d = Ints.f(size(), 3, 1073741823);
            setDelegateOrNull.clear();
            this.f23124b = null;
            this.f23127e = 0;
            return;
        }
        Arrays.fill(i(), 0, this.f23127e, (Object) null);
        l1.g(l());
        Arrays.fill(j(), 0, this.f23127e, 0);
        this.f23127e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.contains(obj);
        }
        int iC = v1.c(obj);
        int iH = h();
        int iH2 = l1.h(l(), iC & iH);
        if (iH2 == 0) {
            return false;
        }
        int iB = l1.b(iC, iH);
        do {
            int i10 = iH2 - 1;
            int iG = g(i10);
            if (l1.b(iG, iH) == iB && y7.i.a(obj, f(i10))) {
                return true;
            }
            iH2 = l1.c(iG, iH);
        } while (iH2 != 0);
        return false;
    }

    public Set<E> convertToHashFloodingResistantImplementation() {
        Set<E> setE = e(h() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            setE.add(f(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.f23124b = setE;
        this.f23125c = null;
        this.elements = null;
        incrementModCount();
        return setE;
    }

    public Set<E> delegateOrNull() {
        Object obj = this.f23124b;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public final Set<E> e(int i10) {
        return new LinkedHashSet(i10, 1.0f);
    }

    public final E f(int i10) {
        return (E) i()[i10];
    }

    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    public final int g(int i10) {
        return j()[i10];
    }

    public int getSuccessor(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f23127e) {
            return i11;
        }
        return -1;
    }

    public final int h() {
        return (1 << (this.f23126d & 31)) - 1;
    }

    public final Object[] i() {
        Object[] objArr = this.elements;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void incrementModCount() {
        this.f23126d += 32;
    }

    public void init(int i10) {
        y7.l.e(i10 >= 0, "Expected size must be >= 0");
        this.f23126d = Ints.f(i10, 1, 1073741823);
    }

    public void insertEntry(int i10, E e10, int i11, int i12) {
        p(i10, l1.d(i11, 0, i12));
        o(i10, e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isUsingHashFloodingResistance() {
        return delegateOrNull() != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.iterator() : new a();
    }

    public final int[] j() {
        int[] iArr = this.f23125c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object l() {
        Object obj = this.f23124b;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final void m(int i10) {
        int iMin;
        int length = j().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        resizeEntries(iMin);
    }

    public void moveLastEntry(int i10, int i11) {
        Object objL = l();
        int[] iArrJ = j();
        Object[] objArrI = i();
        int size = size() - 1;
        if (i10 >= size) {
            objArrI[i10] = null;
            iArrJ[i10] = 0;
            return;
        }
        Object obj = objArrI[size];
        objArrI[i10] = obj;
        objArrI[size] = null;
        iArrJ[i10] = iArrJ[size];
        iArrJ[size] = 0;
        int iC = v1.c(obj) & i11;
        int iH = l1.h(objL, iC);
        int i12 = size + 1;
        if (iH == i12) {
            l1.i(objL, iC, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrJ[i13];
            int iC2 = l1.c(i14, i11);
            if (iC2 == i12) {
                iArrJ[i13] = l1.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC2;
        }
    }

    public final int n(int i10, int i11, int i12, int i13) {
        Object objA = l1.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            l1.i(objA, i12 & i14, i13 + 1);
        }
        Object objL = l();
        int[] iArrJ = j();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = l1.h(objL, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrJ[i16];
                int iB = l1.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = l1.h(objA, i18);
                l1.i(objA, i18, iH);
                iArrJ[i16] = l1.d(iB, iH2, i14);
                iH = l1.c(i17, i10);
            }
        }
        this.f23124b = objA;
        q(i14);
        return i14;
    }

    public boolean needsAllocArrays() {
        return this.f23124b == null;
    }

    public final void o(int i10, E e10) {
        i()[i10] = e10;
    }

    public final void p(int i10, int i11) {
        j()[i10] = i11;
    }

    public final void q(int i10) {
        this.f23126d = l1.d(this.f23126d, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.remove(obj);
        }
        int iH = h();
        int iF = l1.f(obj, null, iH, l(), j(), i(), null);
        if (iF == -1) {
            return false;
        }
        moveLastEntry(iF, iH);
        this.f23127e--;
        incrementModCount();
        return true;
    }

    public void resizeEntries(int i10) {
        this.f23125c = Arrays.copyOf(j(), i10);
        this.elements = Arrays.copyOf(i(), i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.size() : this.f23127e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (needsAllocArrays()) {
            return new Object[0];
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.toArray() : Arrays.copyOf(i(), this.f23127e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (!needsAllocArrays()) {
            Set<E> setDelegateOrNull = delegateOrNull();
            return setDelegateOrNull != null ? (T[]) setDelegateOrNull.toArray(tArr) : (T[]) d2.h(i(), 0, this.f23127e, tArr);
        }
        if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            Set<E> setE = e(size());
            setE.addAll(setDelegateOrNull);
            this.f23124b = setE;
            return;
        }
        int i10 = this.f23127e;
        if (i10 < j().length) {
            resizeEntries(i10);
        }
        int iJ = l1.j(i10);
        int iH = h();
        if (iJ < iH) {
            n(iH, iJ, 0, 0);
        }
    }
}
