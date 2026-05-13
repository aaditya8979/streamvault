package ao;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e<T> implements i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i<T> f5185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final sn.l<T, Boolean> f5187c;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f5188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5189c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f5190d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e<T> f5191e;

        public a(e<T> eVar) {
            this.f5191e = eVar;
            this.f5188b = eVar.f5185a.iterator();
        }

        public final void a() {
            while (this.f5188b.hasNext()) {
                T next = this.f5188b.next();
                if (((Boolean) this.f5191e.f5187c.invoke(next)).booleanValue() == this.f5191e.f5186b) {
                    this.f5190d = next;
                    this.f5189c = 1;
                    return;
                }
            }
            this.f5189c = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f5189c == -1) {
                a();
            }
            return this.f5189c == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f5189c == -1) {
                a();
            }
            if (this.f5189c == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f5190d;
            this.f5190d = null;
            this.f5189c = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull i<? extends T> iVar, boolean z10, @NotNull sn.l<? super T, Boolean> lVar) {
        tn.p.k(iVar, "sequence");
        tn.p.k(lVar, "predicate");
        this.f5185a = iVar;
        this.f5186b = z10;
        this.f5187c = lVar;
    }

    @Override // ao.i
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
