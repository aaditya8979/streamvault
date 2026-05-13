package nm;

import dm.o;
import xl.t;
import xl.u;
import xl.v;

/* JADX INFO: compiled from: SingleMap.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c<T, R> extends t<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v<? extends T> f75909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<? super T, ? extends R> f75910b;

    /* JADX INFO: compiled from: SingleMap.java */
    public static final class a<T, R> implements u<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u<? super R> f75911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o<? super T, ? extends R> f75912c;

        public a(u<? super R> uVar, o<? super T, ? extends R> oVar) {
            this.f75911b = uVar;
            this.f75912c = oVar;
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            this.f75911b.onError(th2);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            this.f75911b.onSubscribe(bVar);
        }

        @Override // xl.u
        public void onSuccess(T t10) {
            try {
                this.f75911b.onSuccess(fm.a.e(this.f75912c.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                cm.a.b(th2);
                onError(th2);
            }
        }
    }

    public c(v<? extends T> vVar, o<? super T, ? extends R> oVar) {
        this.f75909a = vVar;
        this.f75910b = oVar;
    }

    @Override // xl.t
    public void m(u<? super R> uVar) {
        this.f75909a.c(new a(uVar, this.f75910b));
    }
}
