package ao;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class x<T> implements i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i<T> f5228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final sn.l<T, Boolean> f5229b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f5230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5231c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f5232d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x<T> f5233e;

        public a(x<T> xVar) {
            this.f5233e = xVar;
            this.f5230b = xVar.f5228a.iterator();
        }

        public final void a() {
            if (this.f5230b.hasNext()) {
                T next = this.f5230b.next();
                if (((Boolean) this.f5233e.f5229b.invoke(next)).booleanValue()) {
                    this.f5231c = 1;
                    this.f5232d = next;
                    return;
                }
            }
            this.f5231c = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f5231c == -1) {
                a();
            }
            return this.f5231c == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f5231c == -1) {
                a();
            }
            if (this.f5231c == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f5232d;
            this.f5232d = null;
            this.f5231c = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(@NotNull i<? extends T> iVar, @NotNull sn.l<? super T, Boolean> lVar) {
        tn.p.k(iVar, "sequence");
        tn.p.k(lVar, "predicate");
        this.f5228a = iVar;
        this.f5229b = lVar;
    }

    @Override // ao.i
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
