package ao;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class h<T1, T2, V> implements i<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i<T1> f5204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final i<T2> f5205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final sn.p<T1, T2, V> f5206c;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<V>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T1> f5207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<T2> f5208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h<T1, T2, V> f5209d;

        public a(h<T1, T2, V> hVar) {
            this.f5209d = hVar;
            this.f5207b = hVar.f5204a.iterator();
            this.f5208c = hVar.f5205b.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5207b.hasNext() && this.f5208c.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) this.f5209d.f5206c.mo2invoke(this.f5207b.next(), this.f5208c.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull sn.p<? super T1, ? super T2, ? extends V> pVar) {
        tn.p.k(iVar, "sequence1");
        tn.p.k(iVar2, "sequence2");
        tn.p.k(pVar, "transform");
        this.f5204a = iVar;
        this.f5205b = iVar2;
        this.f5206c = pVar;
    }

    @Override // ao.i
    @NotNull
    public Iterator<V> iterator() {
        return new a(this);
    }
}
