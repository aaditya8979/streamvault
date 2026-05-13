package cn;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class u0<T> extends d<T> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object[] f6765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6768e;

    /* JADX INFO: compiled from: SlidingWindow.kt */
    public static final class a extends c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6770c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u0<T> f6771d;

        public a(u0<T> u0Var) {
            this.f6771d = u0Var;
            this.f6769b = u0Var.size();
            this.f6770c = u0Var.f6767d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // cn.c
        public void computeNext() {
            if (this.f6769b == 0) {
                done();
                return;
            }
            setNext(this.f6771d.f6765b[this.f6770c]);
            this.f6770c = (this.f6770c + 1) % this.f6771d.f6766c;
            this.f6769b--;
        }
    }

    public u0(int i10) {
        this(new Object[i10], 0);
    }

    public u0(@NotNull Object[] objArr, int i10) {
        tn.p.k(objArr, "buffer");
        this.f6765b = objArr;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        }
        if (i10 <= objArr.length) {
            this.f6766c = objArr.length;
            this.f6768e = i10;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + objArr.length).toString());
    }

    @Override // cn.d, java.util.List
    public T get(int i10) {
        d.Companion.b(i10, size());
        return (T) this.f6765b[(this.f6767d + i10) % this.f6766c];
    }

    @Override // cn.d, cn.b
    /* JADX INFO: renamed from: getSize */
    public int get_size() {
        return this.f6768e;
    }

    @Override // cn.d, cn.b, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final void j(T t10) {
        if (m()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f6765b[(this.f6767d + size()) % this.f6766c] = t10;
        this.f6768e = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final u0<T> l(int i10) {
        Object[] array;
        int i11 = this.f6766c;
        int iJ = zn.n.j(i11 + (i11 >> 1) + 1, i10);
        if (this.f6767d == 0) {
            array = Arrays.copyOf(this.f6765b, iJ);
            tn.p.j(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iJ]);
        }
        return new u0<>(array, size());
    }

    public final boolean m() {
        return size() == this.f6766c;
    }

    public final void n(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
        if (!(i10 <= size())) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        }
        if (i10 > 0) {
            int i11 = this.f6767d;
            int i12 = (i11 + i10) % this.f6766c;
            if (i11 > i12) {
                p.v(this.f6765b, null, i11, this.f6766c);
                p.v(this.f6765b, null, 0, i12);
            } else {
                p.v(this.f6765b, null, i11, i12);
            }
            this.f6767d = i12;
            this.f6768e = size() - i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cn.b, java.util.Collection
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // cn.b, java.util.Collection
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        tn.p.k(tArr, "array");
        int length = tArr.length;
        Object[] objArr = tArr;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(tArr, size());
            tn.p.j(objArr2, "copyOf(...)");
            objArr = objArr2;
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f6767d; i11 < size && i12 < this.f6766c; i12++) {
            objArr[i11] = this.f6765b[i12];
            i11++;
        }
        while (i11 < size) {
            objArr[i11] = this.f6765b[i10];
            i11++;
            i10++;
        }
        return (T[]) v.f(size, objArr);
    }
}
