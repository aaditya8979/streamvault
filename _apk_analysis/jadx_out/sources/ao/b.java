package ao;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b<T> implements i<T>, c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i<T> f5180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5181b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f5182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5183c;

        public a(b<T> bVar) {
            this.f5182b = bVar.f5180a.iterator();
            this.f5183c = bVar.f5181b;
        }

        public final void a() {
            while (this.f5183c > 0 && this.f5182b.hasNext()) {
                this.f5182b.next();
                this.f5183c--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f5182b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.f5182b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull i<? extends T> iVar, int i10) {
        tn.p.k(iVar, "sequence");
        this.f5180a = iVar;
        this.f5181b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // ao.c
    @NotNull
    public i<T> a(int i10) {
        int i11 = this.f5181b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f5180a, i11);
    }

    @Override // ao.c
    @NotNull
    public i<T> b(int i10) {
        int i11 = this.f5181b;
        int i12 = i11 + i10;
        return i12 < 0 ? new w(this, i10) : new v(this.f5180a, i11, i12);
    }

    @Override // ao.i
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
