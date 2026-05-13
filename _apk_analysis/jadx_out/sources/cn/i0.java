package cn;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i0<T> implements Iterable<h0<? extends T>>, un.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final sn.a<Iterator<T>> f6744b;

    /* JADX WARN: Multi-variable type inference failed */
    public i0(@NotNull sn.a<? extends Iterator<? extends T>> aVar) {
        tn.p.k(aVar, "iteratorFactory");
        this.f6744b = aVar;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<h0<T>> iterator() {
        return new j0(this.f6744b.invoke());
    }
}
