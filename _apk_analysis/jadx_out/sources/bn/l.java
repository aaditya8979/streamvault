package bn;

import com.ironsource.C3978d4;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UIntArray.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class l implements Collection<k>, un.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final int[] f5621b;

    /* JADX INFO: compiled from: UIntArray.kt */
    public static final class a implements Iterator<k>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final int[] f5622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5623c;

        public a(@NotNull int[] iArr) {
            tn.p.k(iArr, "array");
            this.f5622b = iArr;
        }

        public int a() {
            int i10 = this.f5623c;
            int[] iArr = this.f5622b;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f5623c));
            }
            this.f5623c = i10 + 1;
            return k.b(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5623c < this.f5622b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ k next() {
            return k.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ l(int[] iArr) {
        this.f5621b = iArr;
    }

    public static final /* synthetic */ l a(int[] iArr) {
        return new l(iArr);
    }

    @NotNull
    public static int[] f(int i10) {
        return g(new int[i10]);
    }

    @NotNull
    public static int[] g(@NotNull int[] iArr) {
        tn.p.k(iArr, C3978d4.a.f31215k);
        return iArr;
    }

    public static boolean j(int[] iArr, int i10) {
        return cn.r.N(iArr, i10);
    }

    public static boolean l(int[] iArr, @NotNull Collection<k> collection) {
        tn.p.k(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!((obj instanceof k) && cn.r.N(iArr, ((k) obj).f()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean m(int[] iArr, Object obj) {
        return (obj instanceof l) && tn.p.f(iArr, ((l) obj).v());
    }

    public static final int n(int[] iArr, int i10) {
        return k.b(iArr[i10]);
    }

    public static int p(int[] iArr) {
        return iArr.length;
    }

    public static int q(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean r(int[] iArr) {
        return iArr.length == 0;
    }

    @NotNull
    public static Iterator<k> s(int[] iArr) {
        return new a(iArr);
    }

    public static final void t(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    public static String u(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends k> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof k) {
            return h(((k) obj).f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        tn.p.k(collection, "elements");
        return l(this.f5621b, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m(this.f5621b, obj);
    }

    public boolean h(int i10) {
        return j(this.f5621b, i10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return q(this.f5621b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f5621b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<k> iterator() {
        return s(this.f5621b);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return p(this.f5621b);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return tn.h.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        tn.p.k(tArr, "array");
        return (T[]) tn.h.b(this, tArr);
    }

    public String toString() {
        return u(this.f5621b);
    }

    public final /* synthetic */ int[] v() {
        return this.f5621b;
    }
}
