package tn;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayIterator.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a<T> implements Iterator<T>, un.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final T[] f85339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85340c;

    public a(@NotNull T[] tArr) {
        p.k(tArr, "array");
        this.f85339b = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f85340c < this.f85339b.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f85339b;
            int i10 = this.f85340c;
            this.f85340c = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f85340c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
