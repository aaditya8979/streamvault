package cn;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Iterators.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j0<T> implements Iterator<h0<? extends T>>, un.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Iterator<T> f6745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6746c;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(@NotNull Iterator<? extends T> it) {
        tn.p.k(it, "iterator");
        this.f6745b = it;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h0<T> next() {
        int i10 = this.f6746c;
        this.f6746c = i10 + 1;
        if (i10 < 0) {
            w.w();
        }
        return new h0<>(i10, this.f6745b.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6745b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
