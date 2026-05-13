package bn;

import com.ironsource.C3978d4;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UShortArray.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class q implements Collection<p>, un.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final short[] f5632b;

    /* JADX INFO: compiled from: UShortArray.kt */
    public static final class a implements Iterator<p>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final short[] f5633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5634c;

        public a(@NotNull short[] sArr) {
            tn.p.k(sArr, "array");
            this.f5633b = sArr;
        }

        public short a() {
            int i10 = this.f5634c;
            short[] sArr = this.f5633b;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f5634c));
            }
            this.f5634c = i10 + 1;
            return p.b(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5634c < this.f5633b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ p next() {
            return p.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ q(short[] sArr) {
        this.f5632b = sArr;
    }

    public static final /* synthetic */ q a(short[] sArr) {
        return new q(sArr);
    }

    @NotNull
    public static short[] f(int i10) {
        return g(new short[i10]);
    }

    @NotNull
    public static short[] g(@NotNull short[] sArr) {
        tn.p.k(sArr, C3978d4.a.f31215k);
        return sArr;
    }

    public static boolean j(short[] sArr, short s10) {
        return cn.r.Q(sArr, s10);
    }

    public static boolean l(short[] sArr, @NotNull Collection<p> collection) {
        tn.p.k(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!((obj instanceof p) && cn.r.Q(sArr, ((p) obj).f()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean m(short[] sArr, Object obj) {
        return (obj instanceof q) && tn.p.f(sArr, ((q) obj).v());
    }

    public static final short n(short[] sArr, int i10) {
        return p.b(sArr[i10]);
    }

    public static int p(short[] sArr) {
        return sArr.length;
    }

    public static int q(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean r(short[] sArr) {
        return sArr.length == 0;
    }

    @NotNull
    public static Iterator<p> s(short[] sArr) {
        return new a(sArr);
    }

    public static final void t(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    public static String u(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(p pVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends p> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof p) {
            return h(((p) obj).f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        tn.p.k(collection, "elements");
        return l(this.f5632b, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m(this.f5632b, obj);
    }

    public boolean h(short s10) {
        return j(this.f5632b, s10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return q(this.f5632b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f5632b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<p> iterator() {
        return s(this.f5632b);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return p(this.f5632b);
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
        return u(this.f5632b);
    }

    public final /* synthetic */ short[] v() {
        return this.f5632b;
    }
}
