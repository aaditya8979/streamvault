package xl;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.internal.operators.flowable.FlowableTakeUntil;
import io.reactivex.internal.operators.flowable.FlowableTimer;
import io.reactivex.internal.subscribers.StrictSubscriber;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Flowable.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e<T> implements ms.a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f86983b = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static int b() {
        return f86983b;
    }

    public static <T> e<T> c() {
        return tm.a.m(jm.b.f72491c);
    }

    public static <T> e<T> d(Throwable th2) {
        fm.a.e(th2, "throwable is null");
        return e(Functions.k(th2));
    }

    public static <T> e<T> e(Callable<? extends Throwable> callable) {
        fm.a.e(callable, "errorSupplier is null");
        return tm.a.m(new jm.c(callable));
    }

    public static e<Long> p(long j10, TimeUnit timeUnit) {
        return q(j10, timeUnit, vm.a.a());
    }

    public static e<Long> q(long j10, TimeUnit timeUnit, s sVar) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return tm.a.m(new FlowableTimer(Math.max(0L, j10), timeUnit, sVar));
    }

    @Override // ms.a
    public final void a(ms.b<? super T> bVar) {
        if (bVar instanceof f) {
            m((f) bVar);
        } else {
            fm.a.e(bVar, "s is null");
            m(new StrictSubscriber(bVar));
        }
    }

    public final <R> e<R> f(dm.o<? super T, ? extends ms.a<? extends R>> oVar) {
        return g(oVar, false, b(), b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> e<R> g(dm.o<? super T, ? extends ms.a<? extends R>> oVar, boolean z10, int i10, int i11) {
        fm.a.e(oVar, "mapper is null");
        fm.a.f(i10, "maxConcurrency");
        fm.a.f(i11, "bufferSize");
        if (!(this instanceof gm.f)) {
            return tm.a.m(new FlowableFlatMap(this, oVar, z10, i10, i11));
        }
        Object objCall = ((gm.f) this).call();
        return objCall == null ? c() : jm.e.a(objCall, oVar);
    }

    public final e<T> h() {
        return i(b(), false, true);
    }

    public final e<T> i(int i10, boolean z10, boolean z11) {
        fm.a.f(i10, "bufferSize");
        return tm.a.m(new FlowableOnBackpressureBuffer(this, i10, z11, z10, Functions.f71326c));
    }

    public final e<T> j() {
        return tm.a.m(new FlowableOnBackpressureDrop(this));
    }

    public final e<T> k() {
        return tm.a.m(new FlowableOnBackpressureLatest(this));
    }

    public final e<T> l(dm.o<? super e<Throwable>, ? extends ms.a<?>> oVar) {
        fm.a.e(oVar, "handler is null");
        return tm.a.m(new FlowableRetryWhen(this, oVar));
    }

    public final void m(f<? super T> fVar) {
        fm.a.e(fVar, "s is null");
        try {
            ms.b<? super T> bVarV = tm.a.v(this, fVar);
            fm.a.e(bVarV, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            n(bVarV);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            cm.a.b(th2);
            tm.a.s(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void n(ms.b<? super T> bVar);

    public final <U> e<T> o(ms.a<U> aVar) {
        fm.a.e(aVar, "other is null");
        return tm.a.m(new FlowableTakeUntil(this, aVar));
    }
}
