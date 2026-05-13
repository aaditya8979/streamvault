package mm;

/* JADX INFO: compiled from: ObservableDoAfterNext.java */
/* JADX INFO: loaded from: classes6.dex */
public final class y<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.g<? super T> f74796c;

    /* JADX INFO: compiled from: ObservableDoAfterNext.java */
    public static final class a<T> extends hm.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final dm.g<? super T> f74797g;

        public a(xl.r<? super T> rVar, dm.g<? super T> gVar) {
            super(rVar);
            this.f74797g = gVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // xl.r
        public void onNext(T t10) {
            this.f63520b.onNext((Object) t10);
            if (this.f63524f == 0) {
                try {
                    this.f74797g.accept(t10);
                } catch (Throwable th2) {
                    c(th2);
                }
            }
        }

        @Override // gm.h
        public T poll() throws Exception {
            T tPoll = this.f63522d.poll();
            if (tPoll != null) {
                this.f74797g.accept(tPoll);
            }
            return tPoll;
        }

        @Override // gm.d
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public y(xl.p<T> pVar, dm.g<? super T> gVar) {
        super(pVar);
        this.f74796c = gVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74796c));
    }
}
