package xl;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.operators.single.SingleTakeUntil;
import io.reactivex.internal.operators.single.SingleToFlowable;
import io.reactivex.internal.operators.single.SingleToObservable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: Single.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t<T> implements v<T> {
    public static <T> t<T> f(Throwable th2) {
        fm.a.e(th2, "error is null");
        return g(Functions.k(th2));
    }

    public static <T> t<T> g(Callable<? extends Throwable> callable) {
        fm.a.e(callable, "errorSupplier is null");
        return tm.a.p(new nm.a(callable));
    }

    public static <T> t<T> s(e<T> eVar) {
        return tm.a.p(new jm.f(eVar, null));
    }

    public static <T> t<T> t(v<T> vVar) {
        fm.a.e(vVar, "source is null");
        return vVar instanceof t ? tm.a.p((t) vVar) : tm.a.p(new nm.b(vVar));
    }

    @Override // xl.v
    public final void c(u<? super T> uVar) {
        fm.a.e(uVar, "subscriber is null");
        u<? super T> uVarZ = tm.a.z(this, uVar);
        fm.a.e(uVarZ, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            m(uVarZ);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            cm.a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final T d() {
        hm.f fVar = new hm.f();
        c(fVar);
        return (T) fVar.a();
    }

    public final <R> t<R> e(w<? super T, ? extends R> wVar) {
        return t(((w) fm.a.e(wVar, "transformer is null")).apply(this));
    }

    public final <R> t<R> h(dm.o<? super T, ? extends R> oVar) {
        fm.a.e(oVar, "mapper is null");
        return tm.a.p(new nm.c(this, oVar));
    }

    public final t<T> i(s sVar) {
        fm.a.e(sVar, "scheduler is null");
        return tm.a.p(new SingleObserveOn(this, sVar));
    }

    public final t<T> j(dm.o<? super Throwable, ? extends v<? extends T>> oVar) {
        fm.a.e(oVar, "resumeFunctionInCaseOfError is null");
        return tm.a.p(new SingleResumeNext(this, oVar));
    }

    public final t<T> k(dm.o<? super e<Throwable>, ? extends ms.a<?>> oVar) {
        return s(q().l(oVar));
    }

    public final bm.b l(dm.g<? super T> gVar, dm.g<? super Throwable> gVar2) {
        fm.a.e(gVar, "onSuccess is null");
        fm.a.e(gVar2, "onError is null");
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(gVar, gVar2);
        c(consumerSingleObserver);
        return consumerSingleObserver;
    }

    public abstract void m(u<? super T> uVar);

    public final t<T> n(s sVar) {
        fm.a.e(sVar, "scheduler is null");
        return tm.a.p(new SingleSubscribeOn(this, sVar));
    }

    public final <E> t<T> o(ms.a<E> aVar) {
        fm.a.e(aVar, "other is null");
        return tm.a.p(new SingleTakeUntil(this, aVar));
    }

    public final <E> t<T> p(v<? extends E> vVar) {
        fm.a.e(vVar, "other is null");
        return o(new SingleToFlowable(vVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e<T> q() {
        return this instanceof gm.a ? ((gm.a) this).b() : tm.a.m(new SingleToFlowable(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k<T> r() {
        return this instanceof gm.b ? ((gm.b) this).a() : tm.a.o(new SingleToObservable(this));
    }
}
