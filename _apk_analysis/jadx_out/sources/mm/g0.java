package mm;

/* JADX INFO: compiled from: ObservableFilter.java */
/* JADX INFO: loaded from: classes11.dex */
public final class g0<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.q<? super T> f74428c;

    /* JADX INFO: compiled from: ObservableFilter.java */
    public static final class a<T> extends hm.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final dm.q<? super T> f74429g;

        public a(xl.r<? super T> rVar, dm.q<? super T> qVar) {
            super(rVar);
            this.f74429g = qVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // xl.r
        public void onNext(T t10) {
            if (this.f63524f != 0) {
                this.f63520b.onNext(null);
                return;
            }
            try {
                if (this.f74429g.test(t10)) {
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
            } while (!this.f74429g.test(tPoll));
            return tPoll;
        }

        @Override // gm.d
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public g0(xl.p<T> pVar, dm.q<? super T> qVar) {
        super(pVar);
        this.f74428c = qVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74428c));
    }
}
