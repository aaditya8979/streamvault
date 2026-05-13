package ao;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class y<T, R> implements i<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i<T> f5234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final sn.l<T, R> f5235b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f5236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y<T, R> f5237c;

        public a(y<T, R> yVar) {
            this.f5237c = yVar;
            this.f5236b = yVar.f5234a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5236b.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.f5237c.f5235b.invoke(this.f5236b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(@NotNull i<? extends T> iVar, @NotNull sn.l<? super T, ? extends R> lVar) {
        tn.p.k(iVar, "sequence");
        tn.p.k(lVar, "transformer");
        this.f5234a = iVar;
        this.f5235b = lVar;
    }

    @NotNull
    public final <E> i<E> e(@NotNull sn.l<? super R, ? extends Iterator<? extends E>> lVar) {
        tn.p.k(lVar, "iterator");
        return new f(this.f5234a, this.f5235b, lVar);
    }

    @Override // ao.i
    @NotNull
    public Iterator<R> iterator() {
        return new a(this);
    }
}
