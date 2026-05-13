package mm;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableDistinct.java */
/* JADX INFO: loaded from: classes6.dex */
public final class w<T, K> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.o<? super T, K> f74725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable<? extends Collection<? super K>> f74726d;

    /* JADX INFO: compiled from: ObservableDistinct.java */
    public static final class a<T, K> extends hm.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Collection<? super K> f74727g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final dm.o<? super T, K> f74728h;

        public a(xl.r<? super T> rVar, dm.o<? super T, K> oVar, Collection<? super K> collection) {
            super(rVar);
            this.f74728h = oVar;
            this.f74727g = collection;
        }

        @Override // hm.a, gm.h
        public void clear() {
            this.f74727g.clear();
            super.clear();
        }

        @Override // hm.a, xl.r
        public void onComplete() {
            if (this.f63523e) {
                return;
            }
            this.f63523e = true;
            this.f74727g.clear();
            this.f63520b.onComplete();
        }

        @Override // hm.a, xl.r
        public void onError(Throwable th2) {
            if (this.f63523e) {
                tm.a.s(th2);
                return;
            }
            this.f63523e = true;
            this.f74727g.clear();
            this.f63520b.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // xl.r
        public void onNext(T t10) {
            if (this.f63523e) {
                return;
            }
            if (this.f63524f != 0) {
                this.f63520b.onNext(null);
                return;
            }
            try {
                if (this.f74727g.add(fm.a.e(this.f74728h.apply(t10), "The keySelector returned a null key"))) {
                    this.f63520b.onNext((Object) t10);
                }
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // gm.h
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f63522d.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f74727g.add((Object) fm.a.e(this.f74728h.apply(tPoll), "The keySelector returned a null key")));
            return tPoll;
        }

        @Override // gm.d
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public w(xl.p<T> pVar, dm.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        super(pVar);
        this.f74725c = oVar;
        this.f74726d = callable;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        try {
            this.f74327b.subscribe(new a(rVar, this.f74725c, (Collection) fm.a.e(this.f74726d.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            cm.a.b(th2);
            EmptyDisposable.error(th2, rVar);
        }
    }
}
