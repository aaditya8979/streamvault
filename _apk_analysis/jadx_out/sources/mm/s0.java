package mm;

import io.reactivex.internal.functions.Functions;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ObservableInternalHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class s0 {

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class a<T> implements Callable<rm.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.k<T> f74643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f74644c;

        public a(xl.k<T> kVar, int i10) {
            this.f74643b = kVar;
            this.f74644c = i10;
        }

        @Override // java.util.concurrent.Callable
        public rm.a<T> call() {
            return this.f74643b.replay(this.f74644c);
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class b<T> implements Callable<rm.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.k<T> f74645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f74646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f74647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TimeUnit f74648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final xl.s f74649f;

        public b(xl.k<T> kVar, int i10, long j10, TimeUnit timeUnit, xl.s sVar) {
            this.f74645b = kVar;
            this.f74646c = i10;
            this.f74647d = j10;
            this.f74648e = timeUnit;
            this.f74649f = sVar;
        }

        @Override // java.util.concurrent.Callable
        public rm.a<T> call() {
            return this.f74645b.replay(this.f74646c, this.f74647d, this.f74648e, this.f74649f);
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class c<T, U> implements dm.o<T, xl.p<U>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.o<? super T, ? extends Iterable<? extends U>> f74650b;

        public c(dm.o<? super T, ? extends Iterable<? extends U>> oVar) {
            this.f74650b = oVar;
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xl.p<U> apply(T t10) throws Exception {
            return new l0((Iterable) fm.a.e(this.f74650b.apply(t10), "The mapper returned a null Iterable"));
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class d<U, R, T> implements dm.o<U, R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.c<? super T, ? super U, ? extends R> f74651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f74652c;

        public d(dm.c<? super T, ? super U, ? extends R> cVar, T t10) {
            this.f74651b = cVar;
            this.f74652c = t10;
        }

        @Override // dm.o
        public R apply(U u10) throws Exception {
            return this.f74651b.apply(this.f74652c, u10);
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class e<T, R, U> implements dm.o<T, xl.p<R>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.c<? super T, ? super U, ? extends R> f74653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.o<? super T, ? extends xl.p<? extends U>> f74654c;

        public e(dm.c<? super T, ? super U, ? extends R> cVar, dm.o<? super T, ? extends xl.p<? extends U>> oVar) {
            this.f74653b = cVar;
            this.f74654c = oVar;
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xl.p<R> apply(T t10) throws Exception {
            return new w0((xl.p) fm.a.e(this.f74654c.apply(t10), "The mapper returned a null ObservableSource"), new d(this.f74653b, t10));
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class f<T, U> implements dm.o<T, xl.p<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.o<? super T, ? extends xl.p<U>> f74655b;

        public f(dm.o<? super T, ? extends xl.p<U>> oVar) {
            this.f74655b = oVar;
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xl.p<T> apply(T t10) throws Exception {
            return new o1((xl.p) fm.a.e(this.f74655b.apply(t10), "The itemDelay returned a null ObservableSource"), 1L).map(Functions.l(t10)).defaultIfEmpty(t10);
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class g<T> implements dm.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<T> f74656b;

        public g(xl.r<T> rVar) {
            this.f74656b = rVar;
        }

        @Override // dm.a
        public void run() throws Exception {
            this.f74656b.onComplete();
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class h<T> implements dm.g<Throwable> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<T> f74657b;

        public h(xl.r<T> rVar) {
            this.f74657b = rVar;
        }

        @Override // dm.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) throws Exception {
            this.f74657b.onError(th2);
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class i<T> implements dm.g<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<T> f74658b;

        public i(xl.r<T> rVar) {
            this.f74658b = rVar;
        }

        @Override // dm.g
        public void accept(T t10) throws Exception {
            this.f74658b.onNext(t10);
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class j<T> implements Callable<rm.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.k<T> f74659b;

        public j(xl.k<T> kVar) {
            this.f74659b = kVar;
        }

        @Override // java.util.concurrent.Callable
        public rm.a<T> call() {
            return this.f74659b.replay();
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class k<T, R> implements dm.o<xl.k<T>, xl.p<R>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.o<? super xl.k<T>, ? extends xl.p<R>> f74660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xl.s f74661c;

        public k(dm.o<? super xl.k<T>, ? extends xl.p<R>> oVar, xl.s sVar) {
            this.f74660b = oVar;
            this.f74661c = sVar;
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xl.p<R> apply(xl.k<T> kVar) throws Exception {
            return xl.k.wrap((xl.p) fm.a.e(this.f74660b.apply(kVar), "The selector returned a null ObservableSource")).observeOn(this.f74661c);
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class l<T, S> implements dm.c<S, xl.d<T>, S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dm.b<S, xl.d<T>> f74662a;

        public l(dm.b<S, xl.d<T>> bVar) {
            this.f74662a = bVar;
        }

        @Override // dm.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, xl.d<T> dVar) throws Exception {
            this.f74662a.accept(s10, dVar);
            return s10;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class m<T, S> implements dm.c<S, xl.d<T>, S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dm.g<xl.d<T>> f74663a;

        public m(dm.g<xl.d<T>> gVar) {
            this.f74663a = gVar;
        }

        @Override // dm.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, xl.d<T> dVar) throws Exception {
            this.f74663a.accept(dVar);
            return s10;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class n<T> implements Callable<rm.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.k<T> f74664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f74665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TimeUnit f74666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final xl.s f74667e;

        public n(xl.k<T> kVar, long j10, TimeUnit timeUnit, xl.s sVar) {
            this.f74664b = kVar;
            this.f74665c = j10;
            this.f74666d = timeUnit;
            this.f74667e = sVar;
        }

        @Override // java.util.concurrent.Callable
        public rm.a<T> call() {
            return this.f74664b.replay(this.f74665c, this.f74666d, this.f74667e);
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class o<T, R> implements dm.o<List<xl.p<? extends T>>, xl.p<? extends R>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.o<? super Object[], ? extends R> f74668b;

        public o(dm.o<? super Object[], ? extends R> oVar) {
            this.f74668b = oVar;
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xl.p<? extends R> apply(List<xl.p<? extends T>> list) {
            return xl.k.zipIterable(list, this.f74668b, false, xl.k.bufferSize());
        }
    }

    public static <T, U> dm.o<T, xl.p<U>> a(dm.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return new c(oVar);
    }

    public static <T, U, R> dm.o<T, xl.p<R>> b(dm.o<? super T, ? extends xl.p<? extends U>> oVar, dm.c<? super T, ? super U, ? extends R> cVar) {
        return new e(cVar, oVar);
    }

    public static <T, U> dm.o<T, xl.p<T>> c(dm.o<? super T, ? extends xl.p<U>> oVar) {
        return new f(oVar);
    }

    public static <T> dm.a d(xl.r<T> rVar) {
        return new g(rVar);
    }

    public static <T> dm.g<Throwable> e(xl.r<T> rVar) {
        return new h(rVar);
    }

    public static <T> dm.g<T> f(xl.r<T> rVar) {
        return new i(rVar);
    }

    public static <T> Callable<rm.a<T>> g(xl.k<T> kVar) {
        return new j(kVar);
    }

    public static <T> Callable<rm.a<T>> h(xl.k<T> kVar, int i10) {
        return new a(kVar, i10);
    }

    public static <T> Callable<rm.a<T>> i(xl.k<T> kVar, int i10, long j10, TimeUnit timeUnit, xl.s sVar) {
        return new b(kVar, i10, j10, timeUnit, sVar);
    }

    public static <T> Callable<rm.a<T>> j(xl.k<T> kVar, long j10, TimeUnit timeUnit, xl.s sVar) {
        return new n(kVar, j10, timeUnit, sVar);
    }

    public static <T, R> dm.o<xl.k<T>, xl.p<R>> k(dm.o<? super xl.k<T>, ? extends xl.p<R>> oVar, xl.s sVar) {
        return new k(oVar, sVar);
    }

    public static <T, S> dm.c<S, xl.d<T>, S> l(dm.b<S, xl.d<T>> bVar) {
        return new l(bVar);
    }

    public static <T, S> dm.c<S, xl.d<T>, S> m(dm.g<xl.d<T>> gVar) {
        return new m(gVar);
    }

    public static <T, R> dm.o<List<xl.p<? extends T>>, xl.p<? extends R>> n(dm.o<? super Object[], ? extends R> oVar) {
        return new o(oVar);
    }
}
