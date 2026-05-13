package cn;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes12.dex */
public class t0<T> extends d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<T> f6762b;

    /* JADX INFO: compiled from: ReversedViews.kt */
    public static final class a implements ListIterator<T>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ListIterator<T> f6763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t0<T> f6764c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t0<? extends T> t0Var, int i10) {
            this.f6764c = t0Var;
            this.f6763b = t0Var.f6762b.listIterator(c0.b0(t0Var, i10));
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f6763b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f6763b.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f6763b.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return c0.a0(this.f6764c, this.f6763b.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f6763b.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return c0.a0(this.f6764c, this.f6763b.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t0(@NotNull List<? extends T> list) {
        tn.p.k(list, "delegate");
        this.f6762b = list;
    }

    @Override // cn.d, java.util.List
    public T get(int i10) {
        return this.f6762b.get(c0.Z(this, i10));
    }

    @Override // cn.d, cn.b
    public int getSize() {
        return this.f6762b.size();
    }

    @Override // cn.d, cn.b, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // cn.d, java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // cn.d, java.util.List
    @NotNull
    public ListIterator<T> listIterator(int i10) {
        return new a(this, i10);
    }
}
