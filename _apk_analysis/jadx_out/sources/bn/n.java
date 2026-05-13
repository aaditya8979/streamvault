package bn;

import com.ironsource.C3978d4;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ULongArray.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class n implements Collection<m>, un.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final long[] f5626b;

    /* JADX INFO: compiled from: ULongArray.kt */
    public static final class a implements Iterator<m>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final long[] f5627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5628c;

        public a(@NotNull long[] jArr) {
            tn.p.k(jArr, "array");
            this.f5627b = jArr;
        }

        public long a() {
            int i10 = this.f5628c;
            long[] jArr = this.f5627b;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f5628c));
            }
            this.f5628c = i10 + 1;
            return m.b(jArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5628c < this.f5627b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ m next() {
            return m.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ n(long[] jArr) {
        this.f5626b = jArr;
    }

    public static final /* synthetic */ n a(long[] jArr) {
        return new n(jArr);
    }

    @NotNull
    public static long[] f(int i10) {
        return g(new long[i10]);
    }

    @NotNull
    public static long[] g(@NotNull long[] jArr) {
        tn.p.k(jArr, C3978d4.a.f31215k);
        return jArr;
    }

    public static boolean j(long[] jArr, long j10) {
        return cn.r.O(jArr, j10);
    }

    public static boolean l(long[] jArr, @NotNull Collection<m> collection) {
        tn.p.k(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!((obj instanceof m) && cn.r.O(jArr, ((m) obj).f()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean m(long[] jArr, Object obj) {
        return (obj instanceof n) && tn.p.f(jArr, ((n) obj).v());
    }

    public static final long n(long[] jArr, int i10) {
        return m.b(jArr[i10]);
    }

    public static int p(long[] jArr) {
        return jArr.length;
    }

    public static int q(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean r(long[] jArr) {
        return jArr.length == 0;
    }

    @NotNull
    public static Iterator<m> s(long[] jArr) {
        return new a(jArr);
    }

    public static final void t(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    public static String u(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends m> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof m) {
            return h(((m) obj).f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        tn.p.k(collection, "elements");
        return l(this.f5626b, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m(this.f5626b, obj);
    }

    public boolean h(long j10) {
        return j(this.f5626b, j10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return q(this.f5626b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f5626b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<m> iterator() {
        return s(this.f5626b);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return p(this.f5626b);
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
        return u(this.f5626b);
    }

    public final /* synthetic */ long[] v() {
        return this.f5626b;
    }
}
