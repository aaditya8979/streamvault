package mm;

/* JADX INFO: compiled from: ObservableFromArray.java */
/* JADX INFO: loaded from: classes5.dex */
public final class i0<T> extends xl.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T[] f74447b;

    /* JADX INFO: compiled from: ObservableFromArray.java */
    public static final class a<T> extends hm.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T[] f74449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f74450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f74452f;

        public a(xl.r<? super T> rVar, T[] tArr) {
            this.f74448b = rVar;
            this.f74449c = tArr;
        }

        public void a() {
            T[] tArr = this.f74449c;
            int length = tArr.length;
            for (int i10 = 0; i10 < length && !isDisposed(); i10++) {
                T t10 = tArr[i10];
                if (t10 == null) {
                    this.f74448b.onError(new NullPointerException("The " + i10 + "th element is null"));
                    return;
                }
                this.f74448b.onNext(t10);
            }
            if (isDisposed()) {
                return;
            }
            this.f74448b.onComplete();
        }

        @Override // gm.h
        public void clear() {
            this.f74450d = this.f74449c.length;
        }

        @Override // bm.b
        public void dispose() {
            this.f74452f = true;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74452f;
        }

        @Override // gm.h
        public boolean isEmpty() {
            return this.f74450d == this.f74449c.length;
        }

        @Override // gm.h
        public T poll() {
            int i10 = this.f74450d;
            T[] tArr = this.f74449c;
            if (i10 == tArr.length) {
                return null;
            }
            this.f74450d = i10 + 1;
            return (T) fm.a.e(tArr[i10], "The array element is null");
        }

        @Override // gm.d
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f74451e = true;
            return 1;
        }
    }

    public i0(T[] tArr) {
        this.f74447b = tArr;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        a aVar = new a(rVar, this.f74447b);
        rVar.onSubscribe(aVar);
        if (aVar.f74451e) {
            return;
        }
        aVar.a();
    }
}
