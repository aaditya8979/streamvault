package ao;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class f<T, R, E> implements i<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i<T> f5192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final sn.l<T, R> f5193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final sn.l<R, Iterator<E>> f5194c;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<E>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f5195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<? extends E> f5196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f<T, R, E> f5198e;

        public a(f<T, R, E> fVar) {
            this.f5198e = fVar;
            this.f5195b = fVar.f5192a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it = this.f5196c;
            if (it != null && it.hasNext()) {
                this.f5197d = 1;
                return true;
            }
            while (this.f5195b.hasNext()) {
                Iterator<? extends E> it2 = (Iterator) this.f5198e.f5194c.invoke(this.f5198e.f5193b.invoke(this.f5195b.next()));
                if (it2.hasNext()) {
                    this.f5196c = it2;
                    this.f5197d = 1;
                    return true;
                }
            }
            this.f5197d = 2;
            this.f5196c = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f5197d;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public E next() {
            int i10 = this.f5197d;
            if (i10 == 2) {
                throw new NoSuchElementException();
            }
            if (i10 == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.f5197d = 0;
            Iterator<? extends E> it = this.f5196c;
            tn.p.h(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull i<? extends T> iVar, @NotNull sn.l<? super T, ? extends R> lVar, @NotNull sn.l<? super R, ? extends Iterator<? extends E>> lVar2) {
        tn.p.k(iVar, "sequence");
        tn.p.k(lVar, "transformer");
        tn.p.k(lVar2, "iterator");
        this.f5192a = iVar;
        this.f5193b = lVar;
        this.f5194c = lVar2;
    }

    @Override // ao.i
    @NotNull
    public Iterator<E> iterator() {
        return new a(this);
    }
}
