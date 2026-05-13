package ao;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class g<T> implements i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final sn.a<T> f5199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final sn.l<T, T> f5200b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f5201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5202c = -2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g<T> f5203d;

        public a(g<T> gVar) {
            this.f5203d = gVar;
        }

        public final void a() {
            T t10;
            if (this.f5202c == -2) {
                t10 = (T) this.f5203d.f5199a.invoke();
            } else {
                sn.l lVar = this.f5203d.f5200b;
                T t11 = this.f5201b;
                tn.p.h(t11);
                t10 = (T) lVar.invoke(t11);
            }
            this.f5201b = t10;
            this.f5202c = t10 == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f5202c < 0) {
                a();
            }
            return this.f5202c == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f5202c < 0) {
                a();
            }
            if (this.f5202c == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f5201b;
            tn.p.i(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f5202c = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull sn.a<? extends T> aVar, @NotNull sn.l<? super T, ? extends T> lVar) {
        tn.p.k(aVar, "getInitialValue");
        tn.p.k(lVar, "getNextValue");
        this.f5199a = aVar;
        this.f5200b = lVar;
    }

    @Override // ao.i
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
