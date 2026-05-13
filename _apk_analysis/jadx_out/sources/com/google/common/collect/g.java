package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: AbstractSequentialIterator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class g<T> extends r2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f23407b;

    public g(T t10) {
        this.f23407b = t10;
    }

    public abstract T a(T t10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23407b != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t10 = this.f23407b;
        if (t10 == null) {
            throw new NoSuchElementException();
        }
        this.f23407b = a(t10);
        return t10;
    }
}
