package mm;

/* JADX INFO: compiled from: ObservableMap.java */
/* JADX INFO: loaded from: classes10.dex */
public final class w0<T, U> extends mm.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.o<? super T, ? extends U> f74729c;

    /* JADX INFO: compiled from: ObservableMap.java */
    public static final class a<T, U> extends hm.a<T, U> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final dm.o<? super T, ? extends U> f74730g;

        public a(xl.r<? super U> rVar, dm.o<? super T, ? extends U> oVar) {
            super(rVar);
            this.f74730g = oVar;
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
                this.f63520b.onNext((Object) fm.a.e(this.f74730g.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // gm.h
        public U poll() throws Exception {
            T tPoll = this.f63522d.poll();
            if (tPoll != null) {
                return (U) fm.a.e(this.f74730g.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // gm.d
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public w0(xl.p<T> pVar, dm.o<? super T, ? extends U> oVar) {
        super(pVar);
        this.f74729c = oVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super U> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74729c));
    }
}
