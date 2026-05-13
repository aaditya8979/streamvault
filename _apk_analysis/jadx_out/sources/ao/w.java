package ao;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w<T> implements i<T>, c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i<T> f5224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5225b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<T> f5227c;

        public a(w<T> wVar) {
            this.f5226b = wVar.f5225b;
            this.f5227c = wVar.f5224a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5226b > 0 && this.f5227c.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i10 = this.f5226b;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f5226b = i10 - 1;
            return this.f5227c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(@NotNull i<? extends T> iVar, int i10) {
        tn.p.k(iVar, "sequence");
        this.f5224a = iVar;
        this.f5225b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // ao.c
    @NotNull
    public i<T> a(int i10) {
        int i11 = this.f5225b;
        return i10 >= i11 ? r.i() : new v(this.f5224a, i10, i11);
    }

    @Override // ao.c
    @NotNull
    public i<T> b(int i10) {
        return i10 >= this.f5225b ? this : new w(this.f5224a, i10);
    }

    @Override // ao.i
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
