package mm;

/* JADX INFO: compiled from: ObservableDistinctUntilChanged.java */
/* JADX INFO: loaded from: classes6.dex */
public final class x<T, K> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.o<? super T, K> f74774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dm.d<? super K, ? super K> f74775d;

    /* JADX INFO: compiled from: ObservableDistinctUntilChanged.java */
    public static final class a<T, K> extends hm.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final dm.o<? super T, K> f74776g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final dm.d<? super K, ? super K> f74777h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public K f74778i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f74779j;

        public a(xl.r<? super T> rVar, dm.o<? super T, K> oVar, dm.d<? super K, ? super K> dVar) {
            super(rVar);
            this.f74776g = oVar;
            this.f74777h = dVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // xl.r
        public void onNext(T t10) {
            if (this.f63523e) {
                return;
            }
            if (this.f63524f != 0) {
                this.f63520b.onNext((Object) t10);
                return;
            }
            try {
                K kApply = this.f74776g.apply(t10);
                if (this.f74779j) {
                    boolean zTest = this.f74777h.test(this.f74778i, kApply);
                    this.f74778i = kApply;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.f74779j = true;
                    this.f74778i = kApply;
                }
                this.f63520b.onNext((Object) t10);
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // gm.h
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.f63522d.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f74776g.apply(tPoll);
                if (!this.f74779j) {
                    this.f74779j = true;
                    this.f74778i = kApply;
                    return tPoll;
                }
                if (!this.f74777h.test(this.f74778i, kApply)) {
                    this.f74778i = kApply;
                    return tPoll;
                }
                this.f74778i = kApply;
            }
        }

        @Override // gm.d
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public x(xl.p<T> pVar, dm.o<? super T, K> oVar, dm.d<? super K, ? super K> dVar) {
        super(pVar);
        this.f74774c = oVar;
        this.f74775d = dVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74774c, this.f74775d));
    }
}
