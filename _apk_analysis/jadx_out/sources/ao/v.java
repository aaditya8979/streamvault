package ao;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class v<T> implements i<T>, c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i<T> f5218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5220c;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f5221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ v<T> f5223d;

        public a(v<T> vVar) {
            this.f5223d = vVar;
            this.f5221b = vVar.f5218a.iterator();
        }

        public final void a() {
            while (this.f5222c < this.f5223d.f5219b && this.f5221b.hasNext()) {
                this.f5221b.next();
                this.f5222c++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f5222c < this.f5223d.f5220c && this.f5221b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (this.f5222c >= this.f5223d.f5220c) {
                throw new NoSuchElementException();
            }
            this.f5222c++;
            return this.f5221b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(@NotNull i<? extends T> iVar, int i10, int i11) {
        tn.p.k(iVar, "sequence");
        this.f5218a = iVar;
        this.f5219b = i10;
        this.f5220c = i11;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        }
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
    }

    @Override // ao.c
    @NotNull
    public i<T> a(int i10) {
        return i10 >= f() ? r.i() : new v(this.f5218a, this.f5219b + i10, this.f5220c);
    }

    @Override // ao.c
    @NotNull
    public i<T> b(int i10) {
        if (i10 >= f()) {
            return this;
        }
        i<T> iVar = this.f5218a;
        int i11 = this.f5219b;
        return new v(iVar, i11, i10 + i11);
    }

    public final int f() {
        return this.f5220c - this.f5219b;
    }

    @Override // ao.i
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
