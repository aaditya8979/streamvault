package xl;

import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ForEachWhileObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe;
import io.reactivex.internal.operators.mixed.ObservableConcatMapSingle;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle;
import io.reactivex.internal.operators.observable.BlockingObservableIterable;
import io.reactivex.internal.operators.observable.ObservableAmb;
import io.reactivex.internal.operators.observable.ObservableBuffer;
import io.reactivex.internal.operators.observable.ObservableBufferBoundary;
import io.reactivex.internal.operators.observable.ObservableCache;
import io.reactivex.internal.operators.observable.ObservableCombineLatest;
import io.reactivex.internal.operators.observable.ObservableConcatMap;
import io.reactivex.internal.operators.observable.ObservableConcatMapEager;
import io.reactivex.internal.operators.observable.ObservableConcatWithCompletable;
import io.reactivex.internal.operators.observable.ObservableConcatWithMaybe;
import io.reactivex.internal.operators.observable.ObservableConcatWithSingle;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.internal.operators.observable.ObservableDoFinally;
import io.reactivex.internal.operators.observable.ObservableFlatMap;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.observable.ObservableFlatMapMaybe;
import io.reactivex.internal.operators.observable.ObservableFlatMapSingle;
import io.reactivex.internal.operators.observable.ObservableGroupBy;
import io.reactivex.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.internal.operators.observable.ObservableInterval;
import io.reactivex.internal.operators.observable.ObservableIntervalRange;
import io.reactivex.internal.operators.observable.ObservableJoin;
import io.reactivex.internal.operators.observable.ObservableMergeWithCompletable;
import io.reactivex.internal.operators.observable.ObservableMergeWithMaybe;
import io.reactivex.internal.operators.observable.ObservableMergeWithSingle;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservablePublish;
import io.reactivex.internal.operators.observable.ObservablePublishSelector;
import io.reactivex.internal.operators.observable.ObservableRange;
import io.reactivex.internal.operators.observable.ObservableRangeLong;
import io.reactivex.internal.operators.observable.ObservableRepeat;
import io.reactivex.internal.operators.observable.ObservableRepeatUntil;
import io.reactivex.internal.operators.observable.ObservableRepeatWhen;
import io.reactivex.internal.operators.observable.ObservableReplay;
import io.reactivex.internal.operators.observable.ObservableRetryBiPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle;
import io.reactivex.internal.operators.observable.ObservableSkipLast;
import io.reactivex.internal.operators.observable.ObservableSkipLastTimed;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.internal.operators.observable.ObservableTakeLast;
import io.reactivex.internal.operators.observable.ObservableTakeLastTimed;
import io.reactivex.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed;
import io.reactivex.internal.operators.observable.ObservableThrottleLatest;
import io.reactivex.internal.operators.observable.ObservableTimeout;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.internal.operators.observable.ObservableTimer;
import io.reactivex.internal.operators.observable.ObservableUnsubscribeOn;
import io.reactivex.internal.operators.observable.ObservableUsing;
import io.reactivex.internal.operators.observable.ObservableWindow;
import io.reactivex.internal.operators.observable.ObservableWindowBoundary;
import io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier;
import io.reactivex.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.internal.operators.observable.ObservableWithLatestFromMany;
import io.reactivex.internal.operators.observable.ObservableZip;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.HashMapSupplier;
import io.reactivex.observers.TestObserver;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import mm.a0;
import mm.a1;
import mm.b1;
import mm.c0;
import mm.c1;
import mm.d0;
import mm.d1;
import mm.e0;
import mm.e1;
import mm.f0;
import mm.f1;
import mm.g0;
import mm.g1;
import mm.h0;
import mm.h1;
import mm.i0;
import mm.i1;
import mm.j0;
import mm.j1;
import mm.k0;
import mm.k1;
import mm.l0;
import mm.l1;
import mm.m0;
import mm.m1;
import mm.n0;
import mm.n1;
import mm.o0;
import mm.o1;
import mm.p0;
import mm.p1;
import mm.q0;
import mm.q1;
import mm.r0;
import mm.r1;
import mm.s0;
import mm.s1;
import mm.t0;
import mm.t1;
import mm.u0;
import mm.u1;
import mm.v0;
import mm.v1;
import mm.w0;
import mm.w1;
import mm.x;
import mm.x0;
import mm.x1;
import mm.y;
import mm.y0;
import mm.z;
import mm.z0;

/* JADX INFO: compiled from: Observable.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class k<T> implements p<T> {

    /* JADX INFO: compiled from: Observable.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86986a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f86986a = iArr;
            try {
                iArr[BackpressureStrategy.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86986a[BackpressureStrategy.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f86986a[BackpressureStrategy.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f86986a[BackpressureStrategy.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static <T> k<T> amb(Iterable<? extends p<? extends T>> iterable) {
        fm.a.e(iterable, "sources is null");
        return tm.a.o(new ObservableAmb(null, iterable));
    }

    public static <T> k<T> ambArray(p<? extends T>... pVarArr) {
        fm.a.e(pVarArr, "sources is null");
        int length = pVarArr.length;
        return length == 0 ? empty() : length == 1 ? wrap(pVarArr[0]) : tm.a.o(new ObservableAmb(pVarArr, null));
    }

    public static int bufferSize() {
        return e.b();
    }

    public static <T, R> k<R> combineLatest(dm.o<? super Object[], ? extends R> oVar, int i10, p<? extends T>... pVarArr) {
        return combineLatest(pVarArr, oVar, i10);
    }

    public static <T, R> k<R> combineLatest(Iterable<? extends p<? extends T>> iterable, dm.o<? super Object[], ? extends R> oVar) {
        return combineLatest(iterable, oVar, bufferSize());
    }

    public static <T, R> k<R> combineLatest(Iterable<? extends p<? extends T>> iterable, dm.o<? super Object[], ? extends R> oVar, int i10) {
        fm.a.e(iterable, "sources is null");
        fm.a.e(oVar, "combiner is null");
        fm.a.f(i10, "bufferSize");
        return tm.a.o(new ObservableCombineLatest(null, iterable, oVar, i10 << 1, false));
    }

    public static <T1, T2, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, dm.c<? super T1, ? super T2, ? extends R> cVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        return combineLatest(Functions.v(cVar), bufferSize(), pVar, pVar2);
    }

    public static <T1, T2, T3, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, dm.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        return combineLatest(Functions.w(hVar), bufferSize(), pVar, pVar2, pVar3);
    }

    public static <T1, T2, T3, T4, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, dm.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        fm.a.e(pVar4, "source4 is null");
        return combineLatest(Functions.x(iVar), bufferSize(), pVar, pVar2, pVar3, pVar4);
    }

    public static <T1, T2, T3, T4, T5, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, dm.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        fm.a.e(pVar4, "source4 is null");
        fm.a.e(pVar5, "source5 is null");
        return combineLatest(Functions.y(jVar), bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, dm.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        fm.a.e(pVar4, "source4 is null");
        fm.a.e(pVar5, "source5 is null");
        fm.a.e(pVar6, "source6 is null");
        return combineLatest(Functions.z(kVar), bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, p<? extends T7> pVar7, dm.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        fm.a.e(pVar4, "source4 is null");
        fm.a.e(pVar5, "source5 is null");
        fm.a.e(pVar6, "source6 is null");
        fm.a.e(pVar7, "source7 is null");
        return combineLatest(Functions.A(lVar), bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, p<? extends T7> pVar7, p<? extends T8> pVar8, dm.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        fm.a.e(pVar4, "source4 is null");
        fm.a.e(pVar5, "source5 is null");
        fm.a.e(pVar6, "source6 is null");
        fm.a.e(pVar7, "source7 is null");
        fm.a.e(pVar8, "source8 is null");
        return combineLatest(Functions.B(mVar), bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, p<? extends T7> pVar7, p<? extends T8> pVar8, p<? extends T9> pVar9, dm.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        fm.a.e(pVar4, "source4 is null");
        fm.a.e(pVar5, "source5 is null");
        fm.a.e(pVar6, "source6 is null");
        fm.a.e(pVar7, "source7 is null");
        fm.a.e(pVar8, "source8 is null");
        fm.a.e(pVar9, "source9 is null");
        return combineLatest(Functions.C(nVar), bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9);
    }

    public static <T, R> k<R> combineLatest(p<? extends T>[] pVarArr, dm.o<? super Object[], ? extends R> oVar) {
        return combineLatest(pVarArr, oVar, bufferSize());
    }

    public static <T, R> k<R> combineLatest(p<? extends T>[] pVarArr, dm.o<? super Object[], ? extends R> oVar, int i10) {
        fm.a.e(pVarArr, "sources is null");
        if (pVarArr.length == 0) {
            return empty();
        }
        fm.a.e(oVar, "combiner is null");
        fm.a.f(i10, "bufferSize");
        return tm.a.o(new ObservableCombineLatest(pVarArr, null, oVar, i10 << 1, false));
    }

    public static <T, R> k<R> combineLatestDelayError(dm.o<? super Object[], ? extends R> oVar, int i10, p<? extends T>... pVarArr) {
        return combineLatestDelayError(pVarArr, oVar, i10);
    }

    public static <T, R> k<R> combineLatestDelayError(Iterable<? extends p<? extends T>> iterable, dm.o<? super Object[], ? extends R> oVar) {
        return combineLatestDelayError(iterable, oVar, bufferSize());
    }

    public static <T, R> k<R> combineLatestDelayError(Iterable<? extends p<? extends T>> iterable, dm.o<? super Object[], ? extends R> oVar, int i10) {
        fm.a.e(iterable, "sources is null");
        fm.a.e(oVar, "combiner is null");
        fm.a.f(i10, "bufferSize");
        return tm.a.o(new ObservableCombineLatest(null, iterable, oVar, i10 << 1, true));
    }

    public static <T, R> k<R> combineLatestDelayError(p<? extends T>[] pVarArr, dm.o<? super Object[], ? extends R> oVar) {
        return combineLatestDelayError(pVarArr, oVar, bufferSize());
    }

    public static <T, R> k<R> combineLatestDelayError(p<? extends T>[] pVarArr, dm.o<? super Object[], ? extends R> oVar, int i10) {
        fm.a.f(i10, "bufferSize");
        fm.a.e(oVar, "combiner is null");
        return pVarArr.length == 0 ? empty() : tm.a.o(new ObservableCombineLatest(pVarArr, null, oVar, i10 << 1, true));
    }

    public static <T> k<T> concat(Iterable<? extends p<? extends T>> iterable) {
        fm.a.e(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(Functions.i(), bufferSize(), false);
    }

    public static <T> k<T> concat(p<? extends p<? extends T>> pVar) {
        return concat(pVar, bufferSize());
    }

    public static <T> k<T> concat(p<? extends p<? extends T>> pVar, int i10) {
        fm.a.e(pVar, "sources is null");
        fm.a.f(i10, "prefetch");
        return tm.a.o(new ObservableConcatMap(pVar, Functions.i(), i10, ErrorMode.IMMEDIATE));
    }

    public static <T> k<T> concat(p<? extends T> pVar, p<? extends T> pVar2) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        return concatArray(pVar, pVar2);
    }

    public static <T> k<T> concat(p<? extends T> pVar, p<? extends T> pVar2, p<? extends T> pVar3) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        return concatArray(pVar, pVar2, pVar3);
    }

    public static <T> k<T> concat(p<? extends T> pVar, p<? extends T> pVar2, p<? extends T> pVar3, p<? extends T> pVar4) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        fm.a.e(pVar4, "source4 is null");
        return concatArray(pVar, pVar2, pVar3, pVar4);
    }

    public static <T> k<T> concatArray(p<? extends T>... pVarArr) {
        return pVarArr.length == 0 ? empty() : pVarArr.length == 1 ? wrap(pVarArr[0]) : tm.a.o(new ObservableConcatMap(fromArray(pVarArr), Functions.i(), bufferSize(), ErrorMode.BOUNDARY));
    }

    public static <T> k<T> concatArrayDelayError(p<? extends T>... pVarArr) {
        return pVarArr.length == 0 ? empty() : pVarArr.length == 1 ? wrap(pVarArr[0]) : concatDelayError(fromArray(pVarArr));
    }

    public static <T> k<T> concatArrayEager(int i10, int i11, p<? extends T>... pVarArr) {
        return fromArray(pVarArr).concatMapEagerDelayError(Functions.i(), i10, i11, false);
    }

    public static <T> k<T> concatArrayEager(p<? extends T>... pVarArr) {
        return concatArrayEager(bufferSize(), bufferSize(), pVarArr);
    }

    public static <T> k<T> concatArrayEagerDelayError(int i10, int i11, p<? extends T>... pVarArr) {
        return fromArray(pVarArr).concatMapEagerDelayError(Functions.i(), i10, i11, true);
    }

    public static <T> k<T> concatArrayEagerDelayError(p<? extends T>... pVarArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), pVarArr);
    }

    public static <T> k<T> concatDelayError(Iterable<? extends p<? extends T>> iterable) {
        fm.a.e(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    public static <T> k<T> concatDelayError(p<? extends p<? extends T>> pVar) {
        return concatDelayError(pVar, bufferSize(), true);
    }

    public static <T> k<T> concatDelayError(p<? extends p<? extends T>> pVar, int i10, boolean z10) {
        fm.a.e(pVar, "sources is null");
        fm.a.f(i10, "prefetch is null");
        return tm.a.o(new ObservableConcatMap(pVar, Functions.i(), i10, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    public static <T> k<T> concatEager(Iterable<? extends p<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    public static <T> k<T> concatEager(Iterable<? extends p<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).concatMapEagerDelayError(Functions.i(), i10, i11, false);
    }

    public static <T> k<T> concatEager(p<? extends p<? extends T>> pVar) {
        return concatEager(pVar, bufferSize(), bufferSize());
    }

    public static <T> k<T> concatEager(p<? extends p<? extends T>> pVar, int i10, int i11) {
        return wrap(pVar).concatMapEager(Functions.i(), i10, i11);
    }

    public static <T> k<T> create(n<T> nVar) {
        fm.a.e(nVar, "source is null");
        return tm.a.o(new ObservableCreate(nVar));
    }

    public static <T> k<T> defer(Callable<? extends p<? extends T>> callable) {
        fm.a.e(callable, "supplier is null");
        return tm.a.o(new mm.r(callable));
    }

    private k<T> doOnEach(dm.g<? super T> gVar, dm.g<? super Throwable> gVar2, dm.a aVar, dm.a aVar2) {
        fm.a.e(gVar, "onNext is null");
        fm.a.e(gVar2, "onError is null");
        fm.a.e(aVar, "onComplete is null");
        fm.a.e(aVar2, "onAfterTerminate is null");
        return tm.a.o(new z(this, gVar, gVar2, aVar, aVar2));
    }

    public static <T> k<T> empty() {
        return tm.a.o(e0.f74406b);
    }

    public static <T> k<T> error(Throwable th2) {
        fm.a.e(th2, "e is null");
        return error((Callable<? extends Throwable>) Functions.k(th2));
    }

    public static <T> k<T> error(Callable<? extends Throwable> callable) {
        fm.a.e(callable, "errorSupplier is null");
        return tm.a.o(new f0(callable));
    }

    public static <T> k<T> fromArray(T... tArr) {
        fm.a.e(tArr, "items is null");
        return tArr.length == 0 ? empty() : tArr.length == 1 ? just(tArr[0]) : tm.a.o(new i0(tArr));
    }

    public static <T> k<T> fromCallable(Callable<? extends T> callable) {
        fm.a.e(callable, "supplier is null");
        return tm.a.o(new j0(callable));
    }

    public static <T> k<T> fromFuture(Future<? extends T> future) {
        fm.a.e(future, "future is null");
        return tm.a.o(new k0(future, 0L, null));
    }

    public static <T> k<T> fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        fm.a.e(future, "future is null");
        fm.a.e(timeUnit, "unit is null");
        return tm.a.o(new k0(future, j10, timeUnit));
    }

    public static <T> k<T> fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit, s sVar) {
        fm.a.e(sVar, "scheduler is null");
        return fromFuture(future, j10, timeUnit).subscribeOn(sVar);
    }

    public static <T> k<T> fromFuture(Future<? extends T> future, s sVar) {
        fm.a.e(sVar, "scheduler is null");
        return fromFuture(future).subscribeOn(sVar);
    }

    public static <T> k<T> fromIterable(Iterable<? extends T> iterable) {
        fm.a.e(iterable, "source is null");
        return tm.a.o(new l0(iterable));
    }

    public static <T> k<T> fromPublisher(ms.a<? extends T> aVar) {
        fm.a.e(aVar, "publisher is null");
        return tm.a.o(new m0(aVar));
    }

    public static <T> k<T> generate(dm.g<d<T>> gVar) {
        fm.a.e(gVar, "generator  is null");
        return generate(Functions.s(), s0.m(gVar), Functions.g());
    }

    public static <T, S> k<T> generate(Callable<S> callable, dm.b<S, d<T>> bVar) {
        fm.a.e(bVar, "generator  is null");
        return generate(callable, s0.l(bVar), Functions.g());
    }

    public static <T, S> k<T> generate(Callable<S> callable, dm.b<S, d<T>> bVar, dm.g<? super S> gVar) {
        fm.a.e(bVar, "generator  is null");
        return generate(callable, s0.l(bVar), gVar);
    }

    public static <T, S> k<T> generate(Callable<S> callable, dm.c<S, d<T>, S> cVar) {
        return generate(callable, cVar, Functions.g());
    }

    public static <T, S> k<T> generate(Callable<S> callable, dm.c<S, d<T>, S> cVar, dm.g<? super S> gVar) {
        fm.a.e(callable, "initialState is null");
        fm.a.e(cVar, "generator  is null");
        fm.a.e(gVar, "disposeState is null");
        return tm.a.o(new o0(callable, cVar, gVar));
    }

    public static k<Long> interval(long j10, long j11, TimeUnit timeUnit) {
        return interval(j10, j11, timeUnit, vm.a.a());
    }

    public static k<Long> interval(long j10, long j11, TimeUnit timeUnit, s sVar) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return tm.a.o(new ObservableInterval(Math.max(0L, j10), Math.max(0L, j11), timeUnit, sVar));
    }

    public static k<Long> interval(long j10, TimeUnit timeUnit) {
        return interval(j10, j10, timeUnit, vm.a.a());
    }

    public static k<Long> interval(long j10, TimeUnit timeUnit, s sVar) {
        return interval(j10, j10, timeUnit, sVar);
    }

    public static k<Long> intervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit) {
        return intervalRange(j10, j11, j12, j13, timeUnit, vm.a.a());
    }

    public static k<Long> intervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit, s sVar) {
        if (j11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return empty().delay(j12, timeUnit, sVar);
        }
        long j14 = j10 + (j11 - 1);
        if (j10 > 0 && j14 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return tm.a.o(new ObservableIntervalRange(j10, j14, Math.max(0L, j12), Math.max(0L, j13), timeUnit, sVar));
    }

    public static <T> k<T> just(T t10) {
        fm.a.e(t10, "The item is null");
        return tm.a.o(new io.reactivex.internal.operators.observable.a(t10));
    }

    public static <T> k<T> just(T t10, T t11) {
        fm.a.e(t10, "The first item is null");
        fm.a.e(t11, "The second item is null");
        return fromArray(t10, t11);
    }

    public static <T> k<T> just(T t10, T t11, T t12) {
        fm.a.e(t10, "The first item is null");
        fm.a.e(t11, "The second item is null");
        fm.a.e(t12, "The third item is null");
        return fromArray(t10, t11, t12);
    }

    public static <T> k<T> just(T t10, T t11, T t12, T t13) {
        fm.a.e(t10, "The first item is null");
        fm.a.e(t11, "The second item is null");
        fm.a.e(t12, "The third item is null");
        fm.a.e(t13, "The fourth item is null");
        return fromArray(t10, t11, t12, t13);
    }

    public static <T> k<T> just(T t10, T t11, T t12, T t13, T t14) {
        fm.a.e(t10, "The first item is null");
        fm.a.e(t11, "The second item is null");
        fm.a.e(t12, "The third item is null");
        fm.a.e(t13, "The fourth item is null");
        fm.a.e(t14, "The fifth item is null");
        return fromArray(t10, t11, t12, t13, t14);
    }

    public static <T> k<T> just(T t10, T t11, T t12, T t13, T t14, T t15) {
        fm.a.e(t10, "The first item is null");
        fm.a.e(t11, "The second item is null");
        fm.a.e(t12, "The third item is null");
        fm.a.e(t13, "The fourth item is null");
        fm.a.e(t14, "The fifth item is null");
        fm.a.e(t15, "The sixth item is null");
        return fromArray(t10, t11, t12, t13, t14, t15);
    }

    public static <T> k<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16) {
        fm.a.e(t10, "The first item is null");
        fm.a.e(t11, "The second item is null");
        fm.a.e(t12, "The third item is null");
        fm.a.e(t13, "The fourth item is null");
        fm.a.e(t14, "The fifth item is null");
        fm.a.e(t15, "The sixth item is null");
        fm.a.e(t16, "The seventh item is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16);
    }

    public static <T> k<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
        fm.a.e(t10, "The first item is null");
        fm.a.e(t11, "The second item is null");
        fm.a.e(t12, "The third item is null");
        fm.a.e(t13, "The fourth item is null");
        fm.a.e(t14, "The fifth item is null");
        fm.a.e(t15, "The sixth item is null");
        fm.a.e(t16, "The seventh item is null");
        fm.a.e(t17, "The eighth item is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17);
    }

    public static <T> k<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
        fm.a.e(t10, "The first item is null");
        fm.a.e(t11, "The second item is null");
        fm.a.e(t12, "The third item is null");
        fm.a.e(t13, "The fourth item is null");
        fm.a.e(t14, "The fifth item is null");
        fm.a.e(t15, "The sixth item is null");
        fm.a.e(t16, "The seventh item is null");
        fm.a.e(t17, "The eighth item is null");
        fm.a.e(t18, "The ninth item is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17, t18);
    }

    public static <T> k<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19) {
        fm.a.e(t10, "The first item is null");
        fm.a.e(t11, "The second item is null");
        fm.a.e(t12, "The third item is null");
        fm.a.e(t13, "The fourth item is null");
        fm.a.e(t14, "The fifth item is null");
        fm.a.e(t15, "The sixth item is null");
        fm.a.e(t16, "The seventh item is null");
        fm.a.e(t17, "The eighth item is null");
        fm.a.e(t18, "The ninth item is null");
        fm.a.e(t19, "The tenth item is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    public static <T> k<T> merge(Iterable<? extends p<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.i());
    }

    public static <T> k<T> merge(Iterable<? extends p<? extends T>> iterable, int i10) {
        return fromIterable(iterable).flatMap(Functions.i(), i10);
    }

    public static <T> k<T> merge(Iterable<? extends p<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(Functions.i(), false, i10, i11);
    }

    public static <T> k<T> merge(p<? extends p<? extends T>> pVar) {
        fm.a.e(pVar, "sources is null");
        return tm.a.o(new ObservableFlatMap(pVar, Functions.i(), false, Integer.MAX_VALUE, bufferSize()));
    }

    public static <T> k<T> merge(p<? extends p<? extends T>> pVar, int i10) {
        fm.a.e(pVar, "sources is null");
        fm.a.f(i10, "maxConcurrency");
        return tm.a.o(new ObservableFlatMap(pVar, Functions.i(), false, i10, bufferSize()));
    }

    public static <T> k<T> merge(p<? extends T> pVar, p<? extends T> pVar2) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        return fromArray(pVar, pVar2).flatMap(Functions.i(), false, 2);
    }

    public static <T> k<T> merge(p<? extends T> pVar, p<? extends T> pVar2, p<? extends T> pVar3) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        return fromArray(pVar, pVar2, pVar3).flatMap(Functions.i(), false, 3);
    }

    public static <T> k<T> merge(p<? extends T> pVar, p<? extends T> pVar2, p<? extends T> pVar3, p<? extends T> pVar4) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        fm.a.e(pVar4, "source4 is null");
        return fromArray(pVar, pVar2, pVar3, pVar4).flatMap(Functions.i(), false, 4);
    }

    public static <T> k<T> mergeArray(int i10, int i11, p<? extends T>... pVarArr) {
        return fromArray(pVarArr).flatMap(Functions.i(), false, i10, i11);
    }

    public static <T> k<T> mergeArray(p<? extends T>... pVarArr) {
        return fromArray(pVarArr).flatMap(Functions.i(), pVarArr.length);
    }

    public static <T> k<T> mergeArrayDelayError(int i10, int i11, p<? extends T>... pVarArr) {
        return fromArray(pVarArr).flatMap(Functions.i(), true, i10, i11);
    }

    public static <T> k<T> mergeArrayDelayError(p<? extends T>... pVarArr) {
        return fromArray(pVarArr).flatMap(Functions.i(), true, pVarArr.length);
    }

    public static <T> k<T> mergeDelayError(Iterable<? extends p<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.i(), true);
    }

    public static <T> k<T> mergeDelayError(Iterable<? extends p<? extends T>> iterable, int i10) {
        return fromIterable(iterable).flatMap(Functions.i(), true, i10);
    }

    public static <T> k<T> mergeDelayError(Iterable<? extends p<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(Functions.i(), true, i10, i11);
    }

    public static <T> k<T> mergeDelayError(p<? extends p<? extends T>> pVar) {
        fm.a.e(pVar, "sources is null");
        return tm.a.o(new ObservableFlatMap(pVar, Functions.i(), true, Integer.MAX_VALUE, bufferSize()));
    }

    public static <T> k<T> mergeDelayError(p<? extends p<? extends T>> pVar, int i10) {
        fm.a.e(pVar, "sources is null");
        fm.a.f(i10, "maxConcurrency");
        return tm.a.o(new ObservableFlatMap(pVar, Functions.i(), true, i10, bufferSize()));
    }

    public static <T> k<T> mergeDelayError(p<? extends T> pVar, p<? extends T> pVar2) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        return fromArray(pVar, pVar2).flatMap(Functions.i(), true, 2);
    }

    public static <T> k<T> mergeDelayError(p<? extends T> pVar, p<? extends T> pVar2, p<? extends T> pVar3) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        return fromArray(pVar, pVar2, pVar3).flatMap(Functions.i(), true, 3);
    }

    public static <T> k<T> mergeDelayError(p<? extends T> pVar, p<? extends T> pVar2, p<? extends T> pVar3, p<? extends T> pVar4) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        fm.a.e(pVar4, "source4 is null");
        return fromArray(pVar, pVar2, pVar3, pVar4).flatMap(Functions.i(), true, 4);
    }

    public static <T> k<T> never() {
        return tm.a.o(z0.f74811b);
    }

    public static k<Integer> range(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i11);
        }
        if (i11 == 0) {
            return empty();
        }
        if (i11 == 1) {
            return just(Integer.valueOf(i10));
        }
        if (((long) i10) + ((long) (i11 - 1)) <= 2147483647L) {
            return tm.a.o(new ObservableRange(i10, i11));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    public static k<Long> rangeLong(long j10, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return empty();
        }
        if (j11 == 1) {
            return just(Long.valueOf(j10));
        }
        long j12 = (j11 - 1) + j10;
        if (j10 <= 0 || j12 >= 0) {
            return tm.a.o(new ObservableRangeLong(j10, j11));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    public static <T> t<Boolean> sequenceEqual(p<? extends T> pVar, p<? extends T> pVar2) {
        return sequenceEqual(pVar, pVar2, fm.a.d(), bufferSize());
    }

    public static <T> t<Boolean> sequenceEqual(p<? extends T> pVar, p<? extends T> pVar2, int i10) {
        return sequenceEqual(pVar, pVar2, fm.a.d(), i10);
    }

    public static <T> t<Boolean> sequenceEqual(p<? extends T> pVar, p<? extends T> pVar2, dm.d<? super T, ? super T> dVar) {
        return sequenceEqual(pVar, pVar2, dVar, bufferSize());
    }

    public static <T> t<Boolean> sequenceEqual(p<? extends T> pVar, p<? extends T> pVar2, dm.d<? super T, ? super T> dVar, int i10) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(dVar, "isEqual is null");
        fm.a.f(i10, "bufferSize");
        return tm.a.p(new ObservableSequenceEqualSingle(pVar, pVar2, dVar, i10));
    }

    public static <T> k<T> switchOnNext(p<? extends p<? extends T>> pVar) {
        return switchOnNext(pVar, bufferSize());
    }

    public static <T> k<T> switchOnNext(p<? extends p<? extends T>> pVar, int i10) {
        fm.a.e(pVar, "sources is null");
        fm.a.f(i10, "bufferSize");
        return tm.a.o(new ObservableSwitchMap(pVar, Functions.i(), i10, false));
    }

    public static <T> k<T> switchOnNextDelayError(p<? extends p<? extends T>> pVar) {
        return switchOnNextDelayError(pVar, bufferSize());
    }

    public static <T> k<T> switchOnNextDelayError(p<? extends p<? extends T>> pVar, int i10) {
        fm.a.e(pVar, "sources is null");
        fm.a.f(i10, "prefetch");
        return tm.a.o(new ObservableSwitchMap(pVar, Functions.i(), i10, true));
    }

    private k<T> timeout0(long j10, TimeUnit timeUnit, p<? extends T> pVar, s sVar) {
        fm.a.e(timeUnit, "timeUnit is null");
        fm.a.e(sVar, "scheduler is null");
        return tm.a.o(new ObservableTimeoutTimed(this, j10, timeUnit, sVar, pVar));
    }

    private <U, V> k<T> timeout0(p<U> pVar, dm.o<? super T, ? extends p<V>> oVar, p<? extends T> pVar2) {
        fm.a.e(oVar, "itemTimeoutIndicator is null");
        return tm.a.o(new ObservableTimeout(this, pVar, oVar, pVar2));
    }

    public static k<Long> timer(long j10, TimeUnit timeUnit) {
        return timer(j10, timeUnit, vm.a.a());
    }

    public static k<Long> timer(long j10, TimeUnit timeUnit, s sVar) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return tm.a.o(new ObservableTimer(Math.max(j10, 0L), timeUnit, sVar));
    }

    public static <T> k<T> unsafeCreate(p<T> pVar) {
        fm.a.e(pVar, "source is null");
        fm.a.e(pVar, "onSubscribe is null");
        if (pVar instanceof k) {
            throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        return tm.a.o(new n0(pVar));
    }

    public static <T, D> k<T> using(Callable<? extends D> callable, dm.o<? super D, ? extends p<? extends T>> oVar, dm.g<? super D> gVar) {
        return using(callable, oVar, gVar, true);
    }

    public static <T, D> k<T> using(Callable<? extends D> callable, dm.o<? super D, ? extends p<? extends T>> oVar, dm.g<? super D> gVar, boolean z10) {
        fm.a.e(callable, "resourceSupplier is null");
        fm.a.e(oVar, "sourceSupplier is null");
        fm.a.e(gVar, "disposer is null");
        return tm.a.o(new ObservableUsing(callable, oVar, gVar, z10));
    }

    public static <T> k<T> wrap(p<T> pVar) {
        fm.a.e(pVar, "source is null");
        return pVar instanceof k ? tm.a.o((k) pVar) : tm.a.o(new n0(pVar));
    }

    public static <T, R> k<R> zip(Iterable<? extends p<? extends T>> iterable, dm.o<? super Object[], ? extends R> oVar) {
        fm.a.e(oVar, "zipper is null");
        fm.a.e(iterable, "sources is null");
        return tm.a.o(new ObservableZip(null, iterable, oVar, bufferSize(), false));
    }

    public static <T, R> k<R> zip(p<? extends p<? extends T>> pVar, dm.o<? super Object[], ? extends R> oVar) {
        fm.a.e(oVar, "zipper is null");
        fm.a.e(pVar, "sources is null");
        return tm.a.o(new t1(pVar, 16).flatMap(s0.n(oVar)));
    }

    public static <T1, T2, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, dm.c<? super T1, ? super T2, ? extends R> cVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        return zipArray(Functions.v(cVar), false, bufferSize(), pVar, pVar2);
    }

    public static <T1, T2, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, dm.c<? super T1, ? super T2, ? extends R> cVar, boolean z10) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        return zipArray(Functions.v(cVar), z10, bufferSize(), pVar, pVar2);
    }

    public static <T1, T2, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, dm.c<? super T1, ? super T2, ? extends R> cVar, boolean z10, int i10) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        return zipArray(Functions.v(cVar), z10, i10, pVar, pVar2);
    }

    public static <T1, T2, T3, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, dm.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        return zipArray(Functions.w(hVar), false, bufferSize(), pVar, pVar2, pVar3);
    }

    public static <T1, T2, T3, T4, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, dm.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        fm.a.e(pVar4, "source4 is null");
        return zipArray(Functions.x(iVar), false, bufferSize(), pVar, pVar2, pVar3, pVar4);
    }

    public static <T1, T2, T3, T4, T5, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, dm.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        fm.a.e(pVar4, "source4 is null");
        fm.a.e(pVar5, "source5 is null");
        return zipArray(Functions.y(jVar), false, bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, dm.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        fm.a.e(pVar4, "source4 is null");
        fm.a.e(pVar5, "source5 is null");
        fm.a.e(pVar6, "source6 is null");
        return zipArray(Functions.z(kVar), false, bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, p<? extends T7> pVar7, dm.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        fm.a.e(pVar4, "source4 is null");
        fm.a.e(pVar5, "source5 is null");
        fm.a.e(pVar6, "source6 is null");
        fm.a.e(pVar7, "source7 is null");
        return zipArray(Functions.A(lVar), false, bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, p<? extends T7> pVar7, p<? extends T8> pVar8, dm.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        fm.a.e(pVar4, "source4 is null");
        fm.a.e(pVar5, "source5 is null");
        fm.a.e(pVar6, "source6 is null");
        fm.a.e(pVar7, "source7 is null");
        fm.a.e(pVar8, "source8 is null");
        return zipArray(Functions.B(mVar), false, bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, p<? extends T7> pVar7, p<? extends T8> pVar8, p<? extends T9> pVar9, dm.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        fm.a.e(pVar, "source1 is null");
        fm.a.e(pVar2, "source2 is null");
        fm.a.e(pVar3, "source3 is null");
        fm.a.e(pVar4, "source4 is null");
        fm.a.e(pVar5, "source5 is null");
        fm.a.e(pVar6, "source6 is null");
        fm.a.e(pVar7, "source7 is null");
        fm.a.e(pVar8, "source8 is null");
        fm.a.e(pVar9, "source9 is null");
        return zipArray(Functions.C(nVar), false, bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9);
    }

    public static <T, R> k<R> zipArray(dm.o<? super Object[], ? extends R> oVar, boolean z10, int i10, p<? extends T>... pVarArr) {
        if (pVarArr.length == 0) {
            return empty();
        }
        fm.a.e(oVar, "zipper is null");
        fm.a.f(i10, "bufferSize");
        return tm.a.o(new ObservableZip(pVarArr, null, oVar, i10, z10));
    }

    public static <T, R> k<R> zipIterable(Iterable<? extends p<? extends T>> iterable, dm.o<? super Object[], ? extends R> oVar, boolean z10, int i10) {
        fm.a.e(oVar, "zipper is null");
        fm.a.e(iterable, "sources is null");
        fm.a.f(i10, "bufferSize");
        return tm.a.o(new ObservableZip(null, iterable, oVar, i10, z10));
    }

    public final t<Boolean> all(dm.q<? super T> qVar) {
        fm.a.e(qVar, "predicate is null");
        return tm.a.p(new mm.f(this, qVar));
    }

    public final k<T> ambWith(p<? extends T> pVar) {
        fm.a.e(pVar, "other is null");
        return ambArray(this, pVar);
    }

    public final t<Boolean> any(dm.q<? super T> qVar) {
        fm.a.e(qVar, "predicate is null");
        return tm.a.p(new mm.h(this, qVar));
    }

    public final <R> R as(l<T, ? extends R> lVar) {
        return (R) ((l) fm.a.e(lVar, "converter is null")).apply(this);
    }

    public final T blockingFirst() {
        hm.d dVar = new hm.d();
        subscribe(dVar);
        T tA = dVar.a();
        if (tA != null) {
            return tA;
        }
        throw new NoSuchElementException();
    }

    public final T blockingFirst(T t10) {
        hm.d dVar = new hm.d();
        subscribe(dVar);
        T tA = dVar.a();
        return tA != null ? tA : t10;
    }

    public final void blockingForEach(dm.g<? super T> gVar) {
        Iterator<T> it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                gVar.accept(it.next());
            } catch (Throwable th2) {
                cm.a.b(th2);
                ((bm.b) it).dispose();
                throw ExceptionHelper.d(th2);
            }
        }
    }

    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    public final Iterable<T> blockingIterable(int i10) {
        fm.a.f(i10, "bufferSize");
        return new BlockingObservableIterable(this, i10);
    }

    public final T blockingLast() {
        hm.e eVar = new hm.e();
        subscribe(eVar);
        T tA = eVar.a();
        if (tA != null) {
            return tA;
        }
        throw new NoSuchElementException();
    }

    public final T blockingLast(T t10) {
        hm.e eVar = new hm.e();
        subscribe(eVar);
        T tA = eVar.a();
        return tA != null ? tA : t10;
    }

    public final Iterable<T> blockingLatest() {
        return new mm.b(this);
    }

    public final Iterable<T> blockingMostRecent(T t10) {
        return new mm.c(this, t10);
    }

    public final Iterable<T> blockingNext() {
        return new mm.d(this);
    }

    public final T blockingSingle() {
        T tC = singleElement().c();
        if (tC != null) {
            return tC;
        }
        throw new NoSuchElementException();
    }

    public final T blockingSingle(T t10) {
        return single(t10).d();
    }

    public final void blockingSubscribe() {
        mm.i.a(this);
    }

    public final void blockingSubscribe(dm.g<? super T> gVar) {
        mm.i.b(this, gVar, Functions.f71329f, Functions.f71326c);
    }

    public final void blockingSubscribe(dm.g<? super T> gVar, dm.g<? super Throwable> gVar2) {
        mm.i.b(this, gVar, gVar2, Functions.f71326c);
    }

    public final void blockingSubscribe(dm.g<? super T> gVar, dm.g<? super Throwable> gVar2, dm.a aVar) {
        mm.i.b(this, gVar, gVar2, aVar);
    }

    public final void blockingSubscribe(r<? super T> rVar) {
        mm.i.c(this, rVar);
    }

    public final k<List<T>> buffer(int i10) {
        return buffer(i10, i10);
    }

    public final k<List<T>> buffer(int i10, int i11) {
        return (k<List<T>>) buffer(i10, i11, ArrayListSupplier.asCallable());
    }

    public final <U extends Collection<? super T>> k<U> buffer(int i10, int i11, Callable<U> callable) {
        fm.a.f(i10, "count");
        fm.a.f(i11, "skip");
        fm.a.e(callable, "bufferSupplier is null");
        return tm.a.o(new ObservableBuffer(this, i10, i11, callable));
    }

    public final <U extends Collection<? super T>> k<U> buffer(int i10, Callable<U> callable) {
        return buffer(i10, i10, callable);
    }

    public final k<List<T>> buffer(long j10, long j11, TimeUnit timeUnit) {
        return (k<List<T>>) buffer(j10, j11, timeUnit, vm.a.a(), ArrayListSupplier.asCallable());
    }

    public final k<List<T>> buffer(long j10, long j11, TimeUnit timeUnit, s sVar) {
        return (k<List<T>>) buffer(j10, j11, timeUnit, sVar, ArrayListSupplier.asCallable());
    }

    public final <U extends Collection<? super T>> k<U> buffer(long j10, long j11, TimeUnit timeUnit, s sVar, Callable<U> callable) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        fm.a.e(callable, "bufferSupplier is null");
        return tm.a.o(new mm.l(this, j10, j11, timeUnit, sVar, callable, Integer.MAX_VALUE, false));
    }

    public final k<List<T>> buffer(long j10, TimeUnit timeUnit) {
        return buffer(j10, timeUnit, vm.a.a(), Integer.MAX_VALUE);
    }

    public final k<List<T>> buffer(long j10, TimeUnit timeUnit, int i10) {
        return buffer(j10, timeUnit, vm.a.a(), i10);
    }

    public final k<List<T>> buffer(long j10, TimeUnit timeUnit, s sVar) {
        return (k<List<T>>) buffer(j10, timeUnit, sVar, Integer.MAX_VALUE, ArrayListSupplier.asCallable(), false);
    }

    public final k<List<T>> buffer(long j10, TimeUnit timeUnit, s sVar, int i10) {
        return (k<List<T>>) buffer(j10, timeUnit, sVar, i10, ArrayListSupplier.asCallable(), false);
    }

    public final <U extends Collection<? super T>> k<U> buffer(long j10, TimeUnit timeUnit, s sVar, int i10, Callable<U> callable, boolean z10) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        fm.a.e(callable, "bufferSupplier is null");
        fm.a.f(i10, "count");
        return tm.a.o(new mm.l(this, j10, j10, timeUnit, sVar, callable, i10, z10));
    }

    public final <B> k<List<T>> buffer(Callable<? extends p<B>> callable) {
        return (k<List<T>>) buffer(callable, ArrayListSupplier.asCallable());
    }

    public final <B, U extends Collection<? super T>> k<U> buffer(Callable<? extends p<B>> callable, Callable<U> callable2) {
        fm.a.e(callable, "boundarySupplier is null");
        fm.a.e(callable2, "bufferSupplier is null");
        return tm.a.o(new mm.j(this, callable, callable2));
    }

    public final <B> k<List<T>> buffer(p<B> pVar) {
        return (k<List<T>>) buffer(pVar, ArrayListSupplier.asCallable());
    }

    public final <B> k<List<T>> buffer(p<B> pVar, int i10) {
        fm.a.f(i10, "initialCapacity");
        return (k<List<T>>) buffer(pVar, Functions.e(i10));
    }

    public final <TOpening, TClosing> k<List<T>> buffer(p<? extends TOpening> pVar, dm.o<? super TOpening, ? extends p<? extends TClosing>> oVar) {
        return (k<List<T>>) buffer(pVar, oVar, ArrayListSupplier.asCallable());
    }

    public final <TOpening, TClosing, U extends Collection<? super T>> k<U> buffer(p<? extends TOpening> pVar, dm.o<? super TOpening, ? extends p<? extends TClosing>> oVar, Callable<U> callable) {
        fm.a.e(pVar, "openingIndicator is null");
        fm.a.e(oVar, "closingIndicator is null");
        fm.a.e(callable, "bufferSupplier is null");
        return tm.a.o(new ObservableBufferBoundary(this, pVar, oVar, callable));
    }

    public final <B, U extends Collection<? super T>> k<U> buffer(p<B> pVar, Callable<U> callable) {
        fm.a.e(pVar, "boundary is null");
        fm.a.e(callable, "bufferSupplier is null");
        return tm.a.o(new mm.k(this, pVar, callable));
    }

    public final k<T> cache() {
        return ObservableCache.b(this);
    }

    public final k<T> cacheWithInitialCapacity(int i10) {
        return ObservableCache.c(this, i10);
    }

    public final <U> k<U> cast(Class<U> cls) {
        fm.a.e(cls, "clazz is null");
        return (k<U>) map(Functions.d(cls));
    }

    public final <U> t<U> collect(Callable<? extends U> callable, dm.b<? super U, ? super T> bVar) {
        fm.a.e(callable, "initialValueSupplier is null");
        fm.a.e(bVar, "collector is null");
        return tm.a.p(new mm.n(this, callable, bVar));
    }

    public final <U> t<U> collectInto(U u10, dm.b<? super U, ? super T> bVar) {
        fm.a.e(u10, "initialValue is null");
        return collect(Functions.k(u10), bVar);
    }

    public final <R> k<R> compose(q<? super T, ? extends R> qVar) {
        return wrap(((q) fm.a.e(qVar, "composer is null")).apply(this));
    }

    public final <R> k<R> concatMap(dm.o<? super T, ? extends p<? extends R>> oVar) {
        return concatMap(oVar, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> k<R> concatMap(dm.o<? super T, ? extends p<? extends R>> oVar, int i10) {
        fm.a.e(oVar, "mapper is null");
        fm.a.f(i10, "prefetch");
        if (!(this instanceof gm.f)) {
            return tm.a.o(new ObservableConcatMap(this, oVar, i10, ErrorMode.IMMEDIATE));
        }
        Object objCall = ((gm.f) this).call();
        return objCall == null ? empty() : ObservableScalarXMap.a(objCall, oVar);
    }

    public final xl.a concatMapCompletable(dm.o<? super T, ? extends c> oVar) {
        return concatMapCompletable(oVar, 2);
    }

    public final xl.a concatMapCompletable(dm.o<? super T, ? extends c> oVar, int i10) {
        fm.a.e(oVar, "mapper is null");
        fm.a.f(i10, "capacityHint");
        return tm.a.l(new ObservableConcatMapCompletable(this, oVar, ErrorMode.IMMEDIATE, i10));
    }

    public final xl.a concatMapCompletableDelayError(dm.o<? super T, ? extends c> oVar) {
        return concatMapCompletableDelayError(oVar, true, 2);
    }

    public final xl.a concatMapCompletableDelayError(dm.o<? super T, ? extends c> oVar, boolean z10) {
        return concatMapCompletableDelayError(oVar, z10, 2);
    }

    public final xl.a concatMapCompletableDelayError(dm.o<? super T, ? extends c> oVar, boolean z10, int i10) {
        fm.a.e(oVar, "mapper is null");
        fm.a.f(i10, "prefetch");
        return tm.a.l(new ObservableConcatMapCompletable(this, oVar, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    public final <R> k<R> concatMapDelayError(dm.o<? super T, ? extends p<? extends R>> oVar) {
        return concatMapDelayError(oVar, bufferSize(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> k<R> concatMapDelayError(dm.o<? super T, ? extends p<? extends R>> oVar, int i10, boolean z10) {
        fm.a.e(oVar, "mapper is null");
        fm.a.f(i10, "prefetch");
        if (!(this instanceof gm.f)) {
            return tm.a.o(new ObservableConcatMap(this, oVar, i10, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
        }
        Object objCall = ((gm.f) this).call();
        return objCall == null ? empty() : ObservableScalarXMap.a(objCall, oVar);
    }

    public final <R> k<R> concatMapEager(dm.o<? super T, ? extends p<? extends R>> oVar) {
        return concatMapEager(oVar, Integer.MAX_VALUE, bufferSize());
    }

    public final <R> k<R> concatMapEager(dm.o<? super T, ? extends p<? extends R>> oVar, int i10, int i11) {
        fm.a.e(oVar, "mapper is null");
        fm.a.f(i10, "maxConcurrency");
        fm.a.f(i11, "prefetch");
        return tm.a.o(new ObservableConcatMapEager(this, oVar, ErrorMode.IMMEDIATE, i10, i11));
    }

    public final <R> k<R> concatMapEagerDelayError(dm.o<? super T, ? extends p<? extends R>> oVar, int i10, int i11, boolean z10) {
        fm.a.e(oVar, "mapper is null");
        fm.a.f(i10, "maxConcurrency");
        fm.a.f(i11, "prefetch");
        return tm.a.o(new ObservableConcatMapEager(this, oVar, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10, i11));
    }

    public final <R> k<R> concatMapEagerDelayError(dm.o<? super T, ? extends p<? extends R>> oVar, boolean z10) {
        return concatMapEagerDelayError(oVar, Integer.MAX_VALUE, bufferSize(), z10);
    }

    public final <U> k<U> concatMapIterable(dm.o<? super T, ? extends Iterable<? extends U>> oVar) {
        fm.a.e(oVar, "mapper is null");
        return tm.a.o(new h0(this, oVar));
    }

    public final <U> k<U> concatMapIterable(dm.o<? super T, ? extends Iterable<? extends U>> oVar, int i10) {
        fm.a.e(oVar, "mapper is null");
        fm.a.f(i10, "prefetch");
        return (k<U>) concatMap(s0.a(oVar), i10);
    }

    public final <R> k<R> concatMapMaybe(dm.o<? super T, ? extends i<? extends R>> oVar) {
        return concatMapMaybe(oVar, 2);
    }

    public final <R> k<R> concatMapMaybe(dm.o<? super T, ? extends i<? extends R>> oVar, int i10) {
        fm.a.e(oVar, "mapper is null");
        fm.a.f(i10, "prefetch");
        return tm.a.o(new ObservableConcatMapMaybe(this, oVar, ErrorMode.IMMEDIATE, i10));
    }

    public final <R> k<R> concatMapMaybeDelayError(dm.o<? super T, ? extends i<? extends R>> oVar) {
        return concatMapMaybeDelayError(oVar, true, 2);
    }

    public final <R> k<R> concatMapMaybeDelayError(dm.o<? super T, ? extends i<? extends R>> oVar, boolean z10) {
        return concatMapMaybeDelayError(oVar, z10, 2);
    }

    public final <R> k<R> concatMapMaybeDelayError(dm.o<? super T, ? extends i<? extends R>> oVar, boolean z10, int i10) {
        fm.a.e(oVar, "mapper is null");
        fm.a.f(i10, "prefetch");
        return tm.a.o(new ObservableConcatMapMaybe(this, oVar, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    public final <R> k<R> concatMapSingle(dm.o<? super T, ? extends v<? extends R>> oVar) {
        return concatMapSingle(oVar, 2);
    }

    public final <R> k<R> concatMapSingle(dm.o<? super T, ? extends v<? extends R>> oVar, int i10) {
        fm.a.e(oVar, "mapper is null");
        fm.a.f(i10, "prefetch");
        return tm.a.o(new ObservableConcatMapSingle(this, oVar, ErrorMode.IMMEDIATE, i10));
    }

    public final <R> k<R> concatMapSingleDelayError(dm.o<? super T, ? extends v<? extends R>> oVar) {
        return concatMapSingleDelayError(oVar, true, 2);
    }

    public final <R> k<R> concatMapSingleDelayError(dm.o<? super T, ? extends v<? extends R>> oVar, boolean z10) {
        return concatMapSingleDelayError(oVar, z10, 2);
    }

    public final <R> k<R> concatMapSingleDelayError(dm.o<? super T, ? extends v<? extends R>> oVar, boolean z10, int i10) {
        fm.a.e(oVar, "mapper is null");
        fm.a.f(i10, "prefetch");
        return tm.a.o(new ObservableConcatMapSingle(this, oVar, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    public final k<T> concatWith(c cVar) {
        fm.a.e(cVar, "other is null");
        return tm.a.o(new ObservableConcatWithCompletable(this, cVar));
    }

    public final k<T> concatWith(i<? extends T> iVar) {
        fm.a.e(iVar, "other is null");
        return tm.a.o(new ObservableConcatWithMaybe(this, iVar));
    }

    public final k<T> concatWith(p<? extends T> pVar) {
        fm.a.e(pVar, "other is null");
        return concat(this, pVar);
    }

    public final k<T> concatWith(v<? extends T> vVar) {
        fm.a.e(vVar, "other is null");
        return tm.a.o(new ObservableConcatWithSingle(this, vVar));
    }

    public final t<Boolean> contains(Object obj) {
        fm.a.e(obj, "element is null");
        return any(Functions.h(obj));
    }

    public final t<Long> count() {
        return tm.a.p(new mm.p(this));
    }

    public final k<T> debounce(long j10, TimeUnit timeUnit) {
        return debounce(j10, timeUnit, vm.a.a());
    }

    public final k<T> debounce(long j10, TimeUnit timeUnit, s sVar) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return tm.a.o(new ObservableDebounceTimed(this, j10, timeUnit, sVar));
    }

    public final <U> k<T> debounce(dm.o<? super T, ? extends p<U>> oVar) {
        fm.a.e(oVar, "debounceSelector is null");
        return tm.a.o(new mm.q(this, oVar));
    }

    public final k<T> defaultIfEmpty(T t10) {
        fm.a.e(t10, "defaultItem is null");
        return switchIfEmpty(just(t10));
    }

    public final k<T> delay(long j10, TimeUnit timeUnit) {
        return delay(j10, timeUnit, vm.a.a(), false);
    }

    public final k<T> delay(long j10, TimeUnit timeUnit, s sVar) {
        return delay(j10, timeUnit, sVar, false);
    }

    public final k<T> delay(long j10, TimeUnit timeUnit, s sVar, boolean z10) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return tm.a.o(new mm.s(this, j10, timeUnit, sVar, z10));
    }

    public final k<T> delay(long j10, TimeUnit timeUnit, boolean z10) {
        return delay(j10, timeUnit, vm.a.a(), z10);
    }

    public final <U> k<T> delay(dm.o<? super T, ? extends p<U>> oVar) {
        fm.a.e(oVar, "itemDelay is null");
        return (k<T>) flatMap(s0.c(oVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> k<T> delay(p<U> pVar, dm.o<? super T, ? extends p<V>> oVar) {
        return delaySubscription(pVar).delay(oVar);
    }

    public final k<T> delaySubscription(long j10, TimeUnit timeUnit) {
        return delaySubscription(j10, timeUnit, vm.a.a());
    }

    public final k<T> delaySubscription(long j10, TimeUnit timeUnit, s sVar) {
        return delaySubscription(timer(j10, timeUnit, sVar));
    }

    public final <U> k<T> delaySubscription(p<U> pVar) {
        fm.a.e(pVar, "other is null");
        return tm.a.o(new mm.t(this, pVar));
    }

    public final <T2> k<T2> dematerialize() {
        return tm.a.o(new mm.u(this));
    }

    public final k<T> distinct() {
        return distinct(Functions.i(), Functions.f());
    }

    public final <K> k<T> distinct(dm.o<? super T, K> oVar) {
        return distinct(oVar, Functions.f());
    }

    public final <K> k<T> distinct(dm.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        fm.a.e(oVar, "keySelector is null");
        fm.a.e(callable, "collectionSupplier is null");
        return tm.a.o(new mm.w(this, oVar, callable));
    }

    public final k<T> distinctUntilChanged() {
        return distinctUntilChanged(Functions.i());
    }

    public final k<T> distinctUntilChanged(dm.d<? super T, ? super T> dVar) {
        fm.a.e(dVar, "comparer is null");
        return tm.a.o(new x(this, Functions.i(), dVar));
    }

    public final <K> k<T> distinctUntilChanged(dm.o<? super T, K> oVar) {
        fm.a.e(oVar, "keySelector is null");
        return tm.a.o(new x(this, oVar, fm.a.d()));
    }

    public final k<T> doAfterNext(dm.g<? super T> gVar) {
        fm.a.e(gVar, "onAfterNext is null");
        return tm.a.o(new y(this, gVar));
    }

    public final k<T> doAfterTerminate(dm.a aVar) {
        fm.a.e(aVar, "onFinally is null");
        return doOnEach(Functions.g(), Functions.g(), Functions.f71326c, aVar);
    }

    public final k<T> doFinally(dm.a aVar) {
        fm.a.e(aVar, "onFinally is null");
        return tm.a.o(new ObservableDoFinally(this, aVar));
    }

    public final k<T> doOnComplete(dm.a aVar) {
        return doOnEach(Functions.g(), Functions.g(), aVar, Functions.f71326c);
    }

    public final k<T> doOnDispose(dm.a aVar) {
        return doOnLifecycle(Functions.g(), aVar);
    }

    public final k<T> doOnEach(dm.g<? super j<T>> gVar) {
        fm.a.e(gVar, "consumer is null");
        return doOnEach(Functions.r(gVar), Functions.q(gVar), Functions.p(gVar), Functions.f71326c);
    }

    public final k<T> doOnEach(r<? super T> rVar) {
        fm.a.e(rVar, "observer is null");
        return doOnEach(s0.f(rVar), s0.e(rVar), s0.d(rVar), Functions.f71326c);
    }

    public final k<T> doOnError(dm.g<? super Throwable> gVar) {
        dm.g<? super T> gVarG = Functions.g();
        dm.a aVar = Functions.f71326c;
        return doOnEach(gVarG, gVar, aVar, aVar);
    }

    public final k<T> doOnLifecycle(dm.g<? super bm.b> gVar, dm.a aVar) {
        fm.a.e(gVar, "onSubscribe is null");
        fm.a.e(aVar, "onDispose is null");
        return tm.a.o(new a0(this, gVar, aVar));
    }

    public final k<T> doOnNext(dm.g<? super T> gVar) {
        dm.g<? super Throwable> gVarG = Functions.g();
        dm.a aVar = Functions.f71326c;
        return doOnEach(gVar, gVarG, aVar, aVar);
    }

    public final k<T> doOnSubscribe(dm.g<? super bm.b> gVar) {
        return doOnLifecycle(gVar, Functions.f71326c);
    }

    public final k<T> doOnTerminate(dm.a aVar) {
        fm.a.e(aVar, "onTerminate is null");
        return doOnEach(Functions.g(), Functions.a(aVar), aVar, Functions.f71326c);
    }

    public final g<T> elementAt(long j10) {
        if (j10 >= 0) {
            return tm.a.n(new c0(this, j10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final t<T> elementAt(long j10, T t10) {
        if (j10 >= 0) {
            fm.a.e(t10, "defaultItem is null");
            return tm.a.p(new d0(this, j10, t10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final t<T> elementAtOrError(long j10) {
        if (j10 >= 0) {
            return tm.a.p(new d0(this, j10, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final k<T> filter(dm.q<? super T> qVar) {
        fm.a.e(qVar, "predicate is null");
        return tm.a.o(new g0(this, qVar));
    }

    public final t<T> first(T t10) {
        return elementAt(0L, t10);
    }

    public final g<T> firstElement() {
        return elementAt(0L);
    }

    public final t<T> firstOrError() {
        return elementAtOrError(0L);
    }

    public final <R> k<R> flatMap(dm.o<? super T, ? extends p<? extends R>> oVar) {
        return flatMap((dm.o) oVar, false);
    }

    public final <R> k<R> flatMap(dm.o<? super T, ? extends p<? extends R>> oVar, int i10) {
        return flatMap((dm.o) oVar, false, i10, bufferSize());
    }

    public final <U, R> k<R> flatMap(dm.o<? super T, ? extends p<? extends U>> oVar, dm.c<? super T, ? super U, ? extends R> cVar) {
        return flatMap(oVar, cVar, false, bufferSize(), bufferSize());
    }

    public final <U, R> k<R> flatMap(dm.o<? super T, ? extends p<? extends U>> oVar, dm.c<? super T, ? super U, ? extends R> cVar, int i10) {
        return flatMap(oVar, cVar, false, i10, bufferSize());
    }

    public final <U, R> k<R> flatMap(dm.o<? super T, ? extends p<? extends U>> oVar, dm.c<? super T, ? super U, ? extends R> cVar, boolean z10) {
        return flatMap(oVar, cVar, z10, bufferSize(), bufferSize());
    }

    public final <U, R> k<R> flatMap(dm.o<? super T, ? extends p<? extends U>> oVar, dm.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10) {
        return flatMap(oVar, cVar, z10, i10, bufferSize());
    }

    public final <U, R> k<R> flatMap(dm.o<? super T, ? extends p<? extends U>> oVar, dm.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10, int i11) {
        fm.a.e(oVar, "mapper is null");
        fm.a.e(cVar, "combiner is null");
        return flatMap(s0.b(oVar, cVar), z10, i10, i11);
    }

    public final <R> k<R> flatMap(dm.o<? super T, ? extends p<? extends R>> oVar, dm.o<? super Throwable, ? extends p<? extends R>> oVar2, Callable<? extends p<? extends R>> callable) {
        fm.a.e(oVar, "onNextMapper is null");
        fm.a.e(oVar2, "onErrorMapper is null");
        fm.a.e(callable, "onCompleteSupplier is null");
        return merge(new x0(this, oVar, oVar2, callable));
    }

    public final <R> k<R> flatMap(dm.o<? super T, ? extends p<? extends R>> oVar, dm.o<Throwable, ? extends p<? extends R>> oVar2, Callable<? extends p<? extends R>> callable, int i10) {
        fm.a.e(oVar, "onNextMapper is null");
        fm.a.e(oVar2, "onErrorMapper is null");
        fm.a.e(callable, "onCompleteSupplier is null");
        return merge(new x0(this, oVar, oVar2, callable), i10);
    }

    public final <R> k<R> flatMap(dm.o<? super T, ? extends p<? extends R>> oVar, boolean z10) {
        return flatMap(oVar, z10, Integer.MAX_VALUE);
    }

    public final <R> k<R> flatMap(dm.o<? super T, ? extends p<? extends R>> oVar, boolean z10, int i10) {
        return flatMap(oVar, z10, i10, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> k<R> flatMap(dm.o<? super T, ? extends p<? extends R>> oVar, boolean z10, int i10, int i11) {
        fm.a.e(oVar, "mapper is null");
        fm.a.f(i10, "maxConcurrency");
        fm.a.f(i11, "bufferSize");
        if (!(this instanceof gm.f)) {
            return tm.a.o(new ObservableFlatMap(this, oVar, z10, i10, i11));
        }
        Object objCall = ((gm.f) this).call();
        return objCall == null ? empty() : ObservableScalarXMap.a(objCall, oVar);
    }

    public final xl.a flatMapCompletable(dm.o<? super T, ? extends c> oVar) {
        return flatMapCompletable(oVar, false);
    }

    public final xl.a flatMapCompletable(dm.o<? super T, ? extends c> oVar, boolean z10) {
        fm.a.e(oVar, "mapper is null");
        return tm.a.l(new ObservableFlatMapCompletableCompletable(this, oVar, z10));
    }

    public final <U> k<U> flatMapIterable(dm.o<? super T, ? extends Iterable<? extends U>> oVar) {
        fm.a.e(oVar, "mapper is null");
        return tm.a.o(new h0(this, oVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> k<V> flatMapIterable(dm.o<? super T, ? extends Iterable<? extends U>> oVar, dm.c<? super T, ? super U, ? extends V> cVar) {
        fm.a.e(oVar, "mapper is null");
        fm.a.e(cVar, "resultSelector is null");
        return (k<V>) flatMap(s0.a(oVar), cVar, false, bufferSize(), bufferSize());
    }

    public final <R> k<R> flatMapMaybe(dm.o<? super T, ? extends i<? extends R>> oVar) {
        return flatMapMaybe(oVar, false);
    }

    public final <R> k<R> flatMapMaybe(dm.o<? super T, ? extends i<? extends R>> oVar, boolean z10) {
        fm.a.e(oVar, "mapper is null");
        return tm.a.o(new ObservableFlatMapMaybe(this, oVar, z10));
    }

    public final <R> k<R> flatMapSingle(dm.o<? super T, ? extends v<? extends R>> oVar) {
        return flatMapSingle(oVar, false);
    }

    public final <R> k<R> flatMapSingle(dm.o<? super T, ? extends v<? extends R>> oVar, boolean z10) {
        fm.a.e(oVar, "mapper is null");
        return tm.a.o(new ObservableFlatMapSingle(this, oVar, z10));
    }

    public final bm.b forEach(dm.g<? super T> gVar) {
        return subscribe(gVar);
    }

    public final bm.b forEachWhile(dm.q<? super T> qVar) {
        return forEachWhile(qVar, Functions.f71329f, Functions.f71326c);
    }

    public final bm.b forEachWhile(dm.q<? super T> qVar, dm.g<? super Throwable> gVar) {
        return forEachWhile(qVar, gVar, Functions.f71326c);
    }

    public final bm.b forEachWhile(dm.q<? super T> qVar, dm.g<? super Throwable> gVar, dm.a aVar) {
        fm.a.e(qVar, "onNext is null");
        fm.a.e(gVar, "onError is null");
        fm.a.e(aVar, "onComplete is null");
        ForEachWhileObserver forEachWhileObserver = new ForEachWhileObserver(qVar, gVar, aVar);
        subscribe(forEachWhileObserver);
        return forEachWhileObserver;
    }

    public final <K> k<rm.b<K, T>> groupBy(dm.o<? super T, ? extends K> oVar) {
        return (k<rm.b<K, T>>) groupBy(oVar, Functions.i(), false, bufferSize());
    }

    public final <K, V> k<rm.b<K, V>> groupBy(dm.o<? super T, ? extends K> oVar, dm.o<? super T, ? extends V> oVar2) {
        return groupBy(oVar, oVar2, false, bufferSize());
    }

    public final <K, V> k<rm.b<K, V>> groupBy(dm.o<? super T, ? extends K> oVar, dm.o<? super T, ? extends V> oVar2, boolean z10) {
        return groupBy(oVar, oVar2, z10, bufferSize());
    }

    public final <K, V> k<rm.b<K, V>> groupBy(dm.o<? super T, ? extends K> oVar, dm.o<? super T, ? extends V> oVar2, boolean z10, int i10) {
        fm.a.e(oVar, "keySelector is null");
        fm.a.e(oVar2, "valueSelector is null");
        fm.a.f(i10, "bufferSize");
        return tm.a.o(new ObservableGroupBy(this, oVar, oVar2, i10, z10));
    }

    public final <K> k<rm.b<K, T>> groupBy(dm.o<? super T, ? extends K> oVar, boolean z10) {
        return (k<rm.b<K, T>>) groupBy(oVar, Functions.i(), z10, bufferSize());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> k<R> groupJoin(p<? extends TRight> pVar, dm.o<? super T, ? extends p<TLeftEnd>> oVar, dm.o<? super TRight, ? extends p<TRightEnd>> oVar2, dm.c<? super T, ? super k<TRight>, ? extends R> cVar) {
        fm.a.e(pVar, "other is null");
        fm.a.e(oVar, "leftEnd is null");
        fm.a.e(oVar2, "rightEnd is null");
        fm.a.e(cVar, "resultSelector is null");
        return tm.a.o(new ObservableGroupJoin(this, pVar, oVar, oVar2, cVar));
    }

    public final k<T> hide() {
        return tm.a.o(new p0(this));
    }

    public final xl.a ignoreElements() {
        return tm.a.l(new r0(this));
    }

    public final t<Boolean> isEmpty() {
        return all(Functions.b());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> k<R> join(p<? extends TRight> pVar, dm.o<? super T, ? extends p<TLeftEnd>> oVar, dm.o<? super TRight, ? extends p<TRightEnd>> oVar2, dm.c<? super T, ? super TRight, ? extends R> cVar) {
        fm.a.e(pVar, "other is null");
        fm.a.e(oVar, "leftEnd is null");
        fm.a.e(oVar2, "rightEnd is null");
        fm.a.e(cVar, "resultSelector is null");
        return tm.a.o(new ObservableJoin(this, pVar, oVar, oVar2, cVar));
    }

    public final t<T> last(T t10) {
        fm.a.e(t10, "defaultItem is null");
        return tm.a.p(new u0(this, t10));
    }

    public final g<T> lastElement() {
        return tm.a.n(new t0(this));
    }

    public final t<T> lastOrError() {
        return tm.a.p(new u0(this, null));
    }

    public final <R> k<R> lift(o<? extends R, ? super T> oVar) {
        fm.a.e(oVar, "onLift is null");
        return tm.a.o(new v0(this, oVar));
    }

    public final <R> k<R> map(dm.o<? super T, ? extends R> oVar) {
        fm.a.e(oVar, "mapper is null");
        return tm.a.o(new w0(this, oVar));
    }

    public final k<j<T>> materialize() {
        return tm.a.o(new y0(this));
    }

    public final k<T> mergeWith(c cVar) {
        fm.a.e(cVar, "other is null");
        return tm.a.o(new ObservableMergeWithCompletable(this, cVar));
    }

    public final k<T> mergeWith(i<? extends T> iVar) {
        fm.a.e(iVar, "other is null");
        return tm.a.o(new ObservableMergeWithMaybe(this, iVar));
    }

    public final k<T> mergeWith(p<? extends T> pVar) {
        fm.a.e(pVar, "other is null");
        return merge(this, pVar);
    }

    public final k<T> mergeWith(v<? extends T> vVar) {
        fm.a.e(vVar, "other is null");
        return tm.a.o(new ObservableMergeWithSingle(this, vVar));
    }

    public final k<T> observeOn(s sVar) {
        return observeOn(sVar, false, bufferSize());
    }

    public final k<T> observeOn(s sVar, boolean z10) {
        return observeOn(sVar, z10, bufferSize());
    }

    public final k<T> observeOn(s sVar, boolean z10, int i10) {
        fm.a.e(sVar, "scheduler is null");
        fm.a.f(i10, "bufferSize");
        return tm.a.o(new ObservableObserveOn(this, sVar, z10, i10));
    }

    public final <U> k<U> ofType(Class<U> cls) {
        fm.a.e(cls, "clazz is null");
        return filter(Functions.j(cls)).cast(cls);
    }

    public final k<T> onErrorResumeNext(dm.o<? super Throwable, ? extends p<? extends T>> oVar) {
        fm.a.e(oVar, "resumeFunction is null");
        return tm.a.o(new a1(this, oVar, false));
    }

    public final k<T> onErrorResumeNext(p<? extends T> pVar) {
        fm.a.e(pVar, "next is null");
        return onErrorResumeNext(Functions.l(pVar));
    }

    public final k<T> onErrorReturn(dm.o<? super Throwable, ? extends T> oVar) {
        fm.a.e(oVar, "valueSupplier is null");
        return tm.a.o(new b1(this, oVar));
    }

    public final k<T> onErrorReturnItem(T t10) {
        fm.a.e(t10, "item is null");
        return onErrorReturn(Functions.l(t10));
    }

    public final k<T> onExceptionResumeNext(p<? extends T> pVar) {
        fm.a.e(pVar, "next is null");
        return tm.a.o(new a1(this, Functions.l(pVar), true));
    }

    public final k<T> onTerminateDetach() {
        return tm.a.o(new mm.v(this));
    }

    public final rm.a<T> publish() {
        return ObservablePublish.d(this);
    }

    public final <R> k<R> publish(dm.o<? super k<T>, ? extends p<R>> oVar) {
        fm.a.e(oVar, "selector is null");
        return tm.a.o(new ObservablePublishSelector(this, oVar));
    }

    public final g<T> reduce(dm.c<T, T, T> cVar) {
        fm.a.e(cVar, "reducer is null");
        return tm.a.n(new c1(this, cVar));
    }

    public final <R> t<R> reduce(R r10, dm.c<R, ? super T, R> cVar) {
        fm.a.e(r10, "seed is null");
        fm.a.e(cVar, "reducer is null");
        return tm.a.p(new d1(this, r10, cVar));
    }

    public final <R> t<R> reduceWith(Callable<R> callable, dm.c<R, ? super T, R> cVar) {
        fm.a.e(callable, "seedSupplier is null");
        fm.a.e(cVar, "reducer is null");
        return tm.a.p(new e1(this, callable, cVar));
    }

    public final k<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    public final k<T> repeat(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? empty() : tm.a.o(new ObservableRepeat(this, j10));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    public final k<T> repeatUntil(dm.e eVar) {
        fm.a.e(eVar, "stop is null");
        return tm.a.o(new ObservableRepeatUntil(this, eVar));
    }

    public final k<T> repeatWhen(dm.o<? super k<Object>, ? extends p<?>> oVar) {
        fm.a.e(oVar, "handler is null");
        return tm.a.o(new ObservableRepeatWhen(this, oVar));
    }

    public final rm.a<T> replay() {
        return ObservableReplay.h(this);
    }

    public final rm.a<T> replay(int i10) {
        fm.a.f(i10, "bufferSize");
        return ObservableReplay.d(this, i10);
    }

    public final rm.a<T> replay(int i10, long j10, TimeUnit timeUnit) {
        return replay(i10, j10, timeUnit, vm.a.a());
    }

    public final rm.a<T> replay(int i10, long j10, TimeUnit timeUnit, s sVar) {
        fm.a.f(i10, "bufferSize");
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return ObservableReplay.f(this, j10, timeUnit, sVar, i10);
    }

    public final rm.a<T> replay(int i10, s sVar) {
        fm.a.f(i10, "bufferSize");
        return ObservableReplay.j(replay(i10), sVar);
    }

    public final rm.a<T> replay(long j10, TimeUnit timeUnit) {
        return replay(j10, timeUnit, vm.a.a());
    }

    public final rm.a<T> replay(long j10, TimeUnit timeUnit, s sVar) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return ObservableReplay.e(this, j10, timeUnit, sVar);
    }

    public final rm.a<T> replay(s sVar) {
        fm.a.e(sVar, "scheduler is null");
        return ObservableReplay.j(replay(), sVar);
    }

    public final <R> k<R> replay(dm.o<? super k<T>, ? extends p<R>> oVar) {
        fm.a.e(oVar, "selector is null");
        return ObservableReplay.i(s0.g(this), oVar);
    }

    public final <R> k<R> replay(dm.o<? super k<T>, ? extends p<R>> oVar, int i10) {
        fm.a.e(oVar, "selector is null");
        fm.a.f(i10, "bufferSize");
        return ObservableReplay.i(s0.h(this, i10), oVar);
    }

    public final <R> k<R> replay(dm.o<? super k<T>, ? extends p<R>> oVar, int i10, long j10, TimeUnit timeUnit) {
        return replay(oVar, i10, j10, timeUnit, vm.a.a());
    }

    public final <R> k<R> replay(dm.o<? super k<T>, ? extends p<R>> oVar, int i10, long j10, TimeUnit timeUnit, s sVar) {
        fm.a.e(oVar, "selector is null");
        fm.a.f(i10, "bufferSize");
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return ObservableReplay.i(s0.i(this, i10, j10, timeUnit, sVar), oVar);
    }

    public final <R> k<R> replay(dm.o<? super k<T>, ? extends p<R>> oVar, int i10, s sVar) {
        fm.a.e(oVar, "selector is null");
        fm.a.e(sVar, "scheduler is null");
        fm.a.f(i10, "bufferSize");
        return ObservableReplay.i(s0.h(this, i10), s0.k(oVar, sVar));
    }

    public final <R> k<R> replay(dm.o<? super k<T>, ? extends p<R>> oVar, long j10, TimeUnit timeUnit) {
        return replay(oVar, j10, timeUnit, vm.a.a());
    }

    public final <R> k<R> replay(dm.o<? super k<T>, ? extends p<R>> oVar, long j10, TimeUnit timeUnit, s sVar) {
        fm.a.e(oVar, "selector is null");
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return ObservableReplay.i(s0.j(this, j10, timeUnit, sVar), oVar);
    }

    public final <R> k<R> replay(dm.o<? super k<T>, ? extends p<R>> oVar, s sVar) {
        fm.a.e(oVar, "selector is null");
        fm.a.e(sVar, "scheduler is null");
        return ObservableReplay.i(s0.g(this), s0.k(oVar, sVar));
    }

    public final k<T> retry() {
        return retry(Long.MAX_VALUE, Functions.c());
    }

    public final k<T> retry(long j10) {
        return retry(j10, Functions.c());
    }

    public final k<T> retry(long j10, dm.q<? super Throwable> qVar) {
        if (j10 >= 0) {
            fm.a.e(qVar, "predicate is null");
            return tm.a.o(new ObservableRetryPredicate(this, j10, qVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    public final k<T> retry(dm.d<? super Integer, ? super Throwable> dVar) {
        fm.a.e(dVar, "predicate is null");
        return tm.a.o(new ObservableRetryBiPredicate(this, dVar));
    }

    public final k<T> retry(dm.q<? super Throwable> qVar) {
        return retry(Long.MAX_VALUE, qVar);
    }

    public final k<T> retryUntil(dm.e eVar) {
        fm.a.e(eVar, "stop is null");
        return retry(Long.MAX_VALUE, Functions.t(eVar));
    }

    public final k<T> retryWhen(dm.o<? super k<Throwable>, ? extends p<?>> oVar) {
        fm.a.e(oVar, "handler is null");
        return tm.a.o(new ObservableRetryWhen(this, oVar));
    }

    public final void safeSubscribe(r<? super T> rVar) {
        fm.a.e(rVar, "s is null");
        if (rVar instanceof sm.d) {
            subscribe(rVar);
        } else {
            subscribe(new sm.d(rVar));
        }
    }

    public final k<T> sample(long j10, TimeUnit timeUnit) {
        return sample(j10, timeUnit, vm.a.a());
    }

    public final k<T> sample(long j10, TimeUnit timeUnit, s sVar) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return tm.a.o(new ObservableSampleTimed(this, j10, timeUnit, sVar, false));
    }

    public final k<T> sample(long j10, TimeUnit timeUnit, s sVar, boolean z10) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return tm.a.o(new ObservableSampleTimed(this, j10, timeUnit, sVar, z10));
    }

    public final k<T> sample(long j10, TimeUnit timeUnit, boolean z10) {
        return sample(j10, timeUnit, vm.a.a(), z10);
    }

    public final <U> k<T> sample(p<U> pVar) {
        fm.a.e(pVar, "sampler is null");
        return tm.a.o(new ObservableSampleWithObservable(this, pVar, false));
    }

    public final <U> k<T> sample(p<U> pVar, boolean z10) {
        fm.a.e(pVar, "sampler is null");
        return tm.a.o(new ObservableSampleWithObservable(this, pVar, z10));
    }

    public final k<T> scan(dm.c<T, T, T> cVar) {
        fm.a.e(cVar, "accumulator is null");
        return tm.a.o(new f1(this, cVar));
    }

    public final <R> k<R> scan(R r10, dm.c<R, ? super T, R> cVar) {
        fm.a.e(r10, "seed is null");
        return scanWith(Functions.k(r10), cVar);
    }

    public final <R> k<R> scanWith(Callable<R> callable, dm.c<R, ? super T, R> cVar) {
        fm.a.e(callable, "seedSupplier is null");
        fm.a.e(cVar, "accumulator is null");
        return tm.a.o(new g1(this, callable, cVar));
    }

    public final k<T> serialize() {
        return tm.a.o(new h1(this));
    }

    public final k<T> share() {
        return publish().c();
    }

    public final t<T> single(T t10) {
        fm.a.e(t10, "defaultItem is null");
        return tm.a.p(new j1(this, t10));
    }

    public final g<T> singleElement() {
        return tm.a.n(new i1(this));
    }

    public final t<T> singleOrError() {
        return tm.a.p(new j1(this, null));
    }

    public final k<T> skip(long j10) {
        return j10 <= 0 ? tm.a.o(this) : tm.a.o(new k1(this, j10));
    }

    public final k<T> skip(long j10, TimeUnit timeUnit) {
        return skipUntil(timer(j10, timeUnit));
    }

    public final k<T> skip(long j10, TimeUnit timeUnit, s sVar) {
        return skipUntil(timer(j10, timeUnit, sVar));
    }

    public final k<T> skipLast(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? tm.a.o(this) : tm.a.o(new ObservableSkipLast(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    public final k<T> skipLast(long j10, TimeUnit timeUnit) {
        return skipLast(j10, timeUnit, vm.a.c(), false, bufferSize());
    }

    public final k<T> skipLast(long j10, TimeUnit timeUnit, s sVar) {
        return skipLast(j10, timeUnit, sVar, false, bufferSize());
    }

    public final k<T> skipLast(long j10, TimeUnit timeUnit, s sVar, boolean z10) {
        return skipLast(j10, timeUnit, sVar, z10, bufferSize());
    }

    public final k<T> skipLast(long j10, TimeUnit timeUnit, s sVar, boolean z10, int i10) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        fm.a.f(i10, "bufferSize");
        return tm.a.o(new ObservableSkipLastTimed(this, j10, timeUnit, sVar, i10 << 1, z10));
    }

    public final k<T> skipLast(long j10, TimeUnit timeUnit, boolean z10) {
        return skipLast(j10, timeUnit, vm.a.c(), z10, bufferSize());
    }

    public final <U> k<T> skipUntil(p<U> pVar) {
        fm.a.e(pVar, "other is null");
        return tm.a.o(new l1(this, pVar));
    }

    public final k<T> skipWhile(dm.q<? super T> qVar) {
        fm.a.e(qVar, "predicate is null");
        return tm.a.o(new m1(this, qVar));
    }

    public final k<T> sorted() {
        return toList().r().map(Functions.m(Functions.n())).flatMapIterable(Functions.i());
    }

    public final k<T> sorted(Comparator<? super T> comparator) {
        fm.a.e(comparator, "sortFunction is null");
        return toList().r().map(Functions.m(comparator)).flatMapIterable(Functions.i());
    }

    public final k<T> startWith(Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    public final k<T> startWith(T t10) {
        fm.a.e(t10, "item is null");
        return concatArray(just(t10), this);
    }

    public final k<T> startWith(p<? extends T> pVar) {
        fm.a.e(pVar, "other is null");
        return concatArray(pVar, this);
    }

    public final k<T> startWithArray(T... tArr) {
        k kVarFromArray = fromArray(tArr);
        return kVarFromArray == empty() ? tm.a.o(this) : concatArray(kVarFromArray, this);
    }

    public final bm.b subscribe() {
        return subscribe(Functions.g(), Functions.f71329f, Functions.f71326c, Functions.g());
    }

    public final bm.b subscribe(dm.g<? super T> gVar) {
        return subscribe(gVar, Functions.f71329f, Functions.f71326c, Functions.g());
    }

    public final bm.b subscribe(dm.g<? super T> gVar, dm.g<? super Throwable> gVar2) {
        return subscribe(gVar, gVar2, Functions.f71326c, Functions.g());
    }

    public final bm.b subscribe(dm.g<? super T> gVar, dm.g<? super Throwable> gVar2, dm.a aVar) {
        return subscribe(gVar, gVar2, aVar, Functions.g());
    }

    public final bm.b subscribe(dm.g<? super T> gVar, dm.g<? super Throwable> gVar2, dm.a aVar, dm.g<? super bm.b> gVar3) {
        fm.a.e(gVar, "onNext is null");
        fm.a.e(gVar2, "onError is null");
        fm.a.e(aVar, "onComplete is null");
        fm.a.e(gVar3, "onSubscribe is null");
        LambdaObserver lambdaObserver = new LambdaObserver(gVar, gVar2, aVar, gVar3);
        subscribe(lambdaObserver);
        return lambdaObserver;
    }

    @Override // xl.p
    public final void subscribe(r<? super T> rVar) {
        fm.a.e(rVar, "observer is null");
        try {
            r<? super T> rVarY = tm.a.y(this, rVar);
            fm.a.e(rVarY, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(rVarY);
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

    public abstract void subscribeActual(r<? super T> rVar);

    public final k<T> subscribeOn(s sVar) {
        fm.a.e(sVar, "scheduler is null");
        return tm.a.o(new ObservableSubscribeOn(this, sVar));
    }

    public final <E extends r<? super T>> E subscribeWith(E e10) {
        subscribe(e10);
        return e10;
    }

    public final k<T> switchIfEmpty(p<? extends T> pVar) {
        fm.a.e(pVar, "other is null");
        return tm.a.o(new n1(this, pVar));
    }

    public final <R> k<R> switchMap(dm.o<? super T, ? extends p<? extends R>> oVar) {
        return switchMap(oVar, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> k<R> switchMap(dm.o<? super T, ? extends p<? extends R>> oVar, int i10) {
        fm.a.e(oVar, "mapper is null");
        fm.a.f(i10, "bufferSize");
        if (!(this instanceof gm.f)) {
            return tm.a.o(new ObservableSwitchMap(this, oVar, i10, false));
        }
        Object objCall = ((gm.f) this).call();
        return objCall == null ? empty() : ObservableScalarXMap.a(objCall, oVar);
    }

    public final xl.a switchMapCompletable(dm.o<? super T, ? extends c> oVar) {
        fm.a.e(oVar, "mapper is null");
        return tm.a.l(new ObservableSwitchMapCompletable(this, oVar, false));
    }

    public final xl.a switchMapCompletableDelayError(dm.o<? super T, ? extends c> oVar) {
        fm.a.e(oVar, "mapper is null");
        return tm.a.l(new ObservableSwitchMapCompletable(this, oVar, true));
    }

    public final <R> k<R> switchMapDelayError(dm.o<? super T, ? extends p<? extends R>> oVar) {
        return switchMapDelayError(oVar, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> k<R> switchMapDelayError(dm.o<? super T, ? extends p<? extends R>> oVar, int i10) {
        fm.a.e(oVar, "mapper is null");
        fm.a.f(i10, "bufferSize");
        if (!(this instanceof gm.f)) {
            return tm.a.o(new ObservableSwitchMap(this, oVar, i10, true));
        }
        Object objCall = ((gm.f) this).call();
        return objCall == null ? empty() : ObservableScalarXMap.a(objCall, oVar);
    }

    public final <R> k<R> switchMapMaybe(dm.o<? super T, ? extends i<? extends R>> oVar) {
        fm.a.e(oVar, "mapper is null");
        return tm.a.o(new ObservableSwitchMapMaybe(this, oVar, false));
    }

    public final <R> k<R> switchMapMaybeDelayError(dm.o<? super T, ? extends i<? extends R>> oVar) {
        fm.a.e(oVar, "mapper is null");
        return tm.a.o(new ObservableSwitchMapMaybe(this, oVar, true));
    }

    public final <R> k<R> switchMapSingle(dm.o<? super T, ? extends v<? extends R>> oVar) {
        fm.a.e(oVar, "mapper is null");
        return tm.a.o(new ObservableSwitchMapSingle(this, oVar, false));
    }

    public final <R> k<R> switchMapSingleDelayError(dm.o<? super T, ? extends v<? extends R>> oVar) {
        fm.a.e(oVar, "mapper is null");
        return tm.a.o(new ObservableSwitchMapSingle(this, oVar, true));
    }

    public final k<T> take(long j10) {
        if (j10 >= 0) {
            return tm.a.o(new o1(this, j10));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j10);
    }

    public final k<T> take(long j10, TimeUnit timeUnit) {
        return takeUntil(timer(j10, timeUnit));
    }

    public final k<T> take(long j10, TimeUnit timeUnit, s sVar) {
        return takeUntil(timer(j10, timeUnit, sVar));
    }

    public final k<T> takeLast(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? tm.a.o(new q0(this)) : i10 == 1 ? tm.a.o(new p1(this)) : tm.a.o(new ObservableTakeLast(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    public final k<T> takeLast(long j10, long j11, TimeUnit timeUnit) {
        return takeLast(j10, j11, timeUnit, vm.a.c(), false, bufferSize());
    }

    public final k<T> takeLast(long j10, long j11, TimeUnit timeUnit, s sVar) {
        return takeLast(j10, j11, timeUnit, sVar, false, bufferSize());
    }

    public final k<T> takeLast(long j10, long j11, TimeUnit timeUnit, s sVar, boolean z10, int i10) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        fm.a.f(i10, "bufferSize");
        if (j10 >= 0) {
            return tm.a.o(new ObservableTakeLastTimed(this, j10, j11, timeUnit, sVar, i10, z10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + j10);
    }

    public final k<T> takeLast(long j10, TimeUnit timeUnit) {
        return takeLast(j10, timeUnit, vm.a.c(), false, bufferSize());
    }

    public final k<T> takeLast(long j10, TimeUnit timeUnit, s sVar) {
        return takeLast(j10, timeUnit, sVar, false, bufferSize());
    }

    public final k<T> takeLast(long j10, TimeUnit timeUnit, s sVar, boolean z10) {
        return takeLast(j10, timeUnit, sVar, z10, bufferSize());
    }

    public final k<T> takeLast(long j10, TimeUnit timeUnit, s sVar, boolean z10, int i10) {
        return takeLast(Long.MAX_VALUE, j10, timeUnit, sVar, z10, i10);
    }

    public final k<T> takeLast(long j10, TimeUnit timeUnit, boolean z10) {
        return takeLast(j10, timeUnit, vm.a.c(), z10, bufferSize());
    }

    public final k<T> takeUntil(dm.q<? super T> qVar) {
        fm.a.e(qVar, "predicate is null");
        return tm.a.o(new q1(this, qVar));
    }

    public final <U> k<T> takeUntil(p<U> pVar) {
        fm.a.e(pVar, "other is null");
        return tm.a.o(new ObservableTakeUntil(this, pVar));
    }

    public final k<T> takeWhile(dm.q<? super T> qVar) {
        fm.a.e(qVar, "predicate is null");
        return tm.a.o(new r1(this, qVar));
    }

    public final TestObserver<T> test() {
        TestObserver<T> testObserver = new TestObserver<>();
        subscribe(testObserver);
        return testObserver;
    }

    public final TestObserver<T> test(boolean z10) {
        TestObserver<T> testObserver = new TestObserver<>();
        if (z10) {
            testObserver.dispose();
        }
        subscribe(testObserver);
        return testObserver;
    }

    public final k<T> throttleFirst(long j10, TimeUnit timeUnit) {
        return throttleFirst(j10, timeUnit, vm.a.a());
    }

    public final k<T> throttleFirst(long j10, TimeUnit timeUnit, s sVar) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return tm.a.o(new ObservableThrottleFirstTimed(this, j10, timeUnit, sVar));
    }

    public final k<T> throttleLast(long j10, TimeUnit timeUnit) {
        return sample(j10, timeUnit);
    }

    public final k<T> throttleLast(long j10, TimeUnit timeUnit, s sVar) {
        return sample(j10, timeUnit, sVar);
    }

    public final k<T> throttleLatest(long j10, TimeUnit timeUnit) {
        return throttleLatest(j10, timeUnit, vm.a.a(), false);
    }

    public final k<T> throttleLatest(long j10, TimeUnit timeUnit, s sVar) {
        return throttleLatest(j10, timeUnit, sVar, false);
    }

    public final k<T> throttleLatest(long j10, TimeUnit timeUnit, s sVar, boolean z10) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return tm.a.o(new ObservableThrottleLatest(this, j10, timeUnit, sVar, z10));
    }

    public final k<T> throttleLatest(long j10, TimeUnit timeUnit, boolean z10) {
        return throttleLatest(j10, timeUnit, vm.a.a(), z10);
    }

    public final k<T> throttleWithTimeout(long j10, TimeUnit timeUnit) {
        return debounce(j10, timeUnit);
    }

    public final k<T> throttleWithTimeout(long j10, TimeUnit timeUnit, s sVar) {
        return debounce(j10, timeUnit, sVar);
    }

    public final k<vm.b<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, vm.a.a());
    }

    public final k<vm.b<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, vm.a.a());
    }

    public final k<vm.b<T>> timeInterval(TimeUnit timeUnit, s sVar) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return tm.a.o(new s1(this, timeUnit, sVar));
    }

    public final k<vm.b<T>> timeInterval(s sVar) {
        return timeInterval(TimeUnit.MILLISECONDS, sVar);
    }

    public final k<T> timeout(long j10, TimeUnit timeUnit) {
        return timeout0(j10, timeUnit, null, vm.a.a());
    }

    public final k<T> timeout(long j10, TimeUnit timeUnit, p<? extends T> pVar) {
        fm.a.e(pVar, "other is null");
        return timeout0(j10, timeUnit, pVar, vm.a.a());
    }

    public final k<T> timeout(long j10, TimeUnit timeUnit, s sVar) {
        return timeout0(j10, timeUnit, null, sVar);
    }

    public final k<T> timeout(long j10, TimeUnit timeUnit, s sVar, p<? extends T> pVar) {
        fm.a.e(pVar, "other is null");
        return timeout0(j10, timeUnit, pVar, sVar);
    }

    public final <V> k<T> timeout(dm.o<? super T, ? extends p<V>> oVar) {
        return timeout0(null, oVar, null);
    }

    public final <V> k<T> timeout(dm.o<? super T, ? extends p<V>> oVar, p<? extends T> pVar) {
        fm.a.e(pVar, "other is null");
        return timeout0(null, oVar, pVar);
    }

    public final <U, V> k<T> timeout(p<U> pVar, dm.o<? super T, ? extends p<V>> oVar) {
        fm.a.e(pVar, "firstTimeoutIndicator is null");
        return timeout0(pVar, oVar, null);
    }

    public final <U, V> k<T> timeout(p<U> pVar, dm.o<? super T, ? extends p<V>> oVar, p<? extends T> pVar2) {
        fm.a.e(pVar, "firstTimeoutIndicator is null");
        fm.a.e(pVar2, "other is null");
        return timeout0(pVar, oVar, pVar2);
    }

    public final k<vm.b<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, vm.a.a());
    }

    public final k<vm.b<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, vm.a.a());
    }

    public final k<vm.b<T>> timestamp(TimeUnit timeUnit, s sVar) {
        fm.a.e(timeUnit, "unit is null");
        fm.a.e(sVar, "scheduler is null");
        return (k<vm.b<T>>) map(Functions.u(timeUnit, sVar));
    }

    public final k<vm.b<T>> timestamp(s sVar) {
        return timestamp(TimeUnit.MILLISECONDS, sVar);
    }

    public final <R> R to(dm.o<? super k<T>, R> oVar) {
        try {
            return (R) ((dm.o) fm.a.e(oVar, "converter is null")).apply(this);
        } catch (Throwable th2) {
            cm.a.b(th2);
            throw ExceptionHelper.d(th2);
        }
    }

    public final e<T> toFlowable(BackpressureStrategy backpressureStrategy) {
        jm.d dVar = new jm.d(this);
        int i10 = a.f86986a[backpressureStrategy.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? dVar.h() : tm.a.m(new FlowableOnBackpressureError(dVar)) : dVar : dVar.k() : dVar.j();
    }

    public final Future<T> toFuture() {
        return (Future) subscribeWith(new hm.h());
    }

    public final t<List<T>> toList() {
        return toList(16);
    }

    public final t<List<T>> toList(int i10) {
        fm.a.f(i10, "capacityHint");
        return tm.a.p(new u1(this, i10));
    }

    public final <U extends Collection<? super T>> t<U> toList(Callable<U> callable) {
        fm.a.e(callable, "collectionSupplier is null");
        return tm.a.p(new u1(this, callable));
    }

    public final <K> t<Map<K, T>> toMap(dm.o<? super T, ? extends K> oVar) {
        fm.a.e(oVar, "keySelector is null");
        return (t<Map<K, T>>) collect(HashMapSupplier.asCallable(), Functions.D(oVar));
    }

    public final <K, V> t<Map<K, V>> toMap(dm.o<? super T, ? extends K> oVar, dm.o<? super T, ? extends V> oVar2) {
        fm.a.e(oVar, "keySelector is null");
        fm.a.e(oVar2, "valueSelector is null");
        return (t<Map<K, V>>) collect(HashMapSupplier.asCallable(), Functions.E(oVar, oVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> t<Map<K, V>> toMap(dm.o<? super T, ? extends K> oVar, dm.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, V>> callable) {
        fm.a.e(oVar, "keySelector is null");
        fm.a.e(oVar2, "valueSelector is null");
        fm.a.e(callable, "mapSupplier is null");
        return (t<Map<K, V>>) collect(callable, Functions.E(oVar, oVar2));
    }

    public final <K> t<Map<K, Collection<T>>> toMultimap(dm.o<? super T, ? extends K> oVar) {
        return (t<Map<K, Collection<T>>>) toMultimap(oVar, Functions.i(), HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    public final <K, V> t<Map<K, Collection<V>>> toMultimap(dm.o<? super T, ? extends K> oVar, dm.o<? super T, ? extends V> oVar2) {
        return toMultimap(oVar, oVar2, HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    public final <K, V> t<Map<K, Collection<V>>> toMultimap(dm.o<? super T, ? extends K> oVar, dm.o<? super T, ? extends V> oVar2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(oVar, oVar2, callable, ArrayListSupplier.asFunction());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> t<Map<K, Collection<V>>> toMultimap(dm.o<? super T, ? extends K> oVar, dm.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, Collection<V>>> callable, dm.o<? super K, ? extends Collection<? super V>> oVar3) {
        fm.a.e(oVar, "keySelector is null");
        fm.a.e(oVar2, "valueSelector is null");
        fm.a.e(callable, "mapSupplier is null");
        fm.a.e(oVar3, "collectionFactory is null");
        return (t<Map<K, Collection<V>>>) collect(callable, Functions.F(oVar, oVar2, oVar3));
    }

    public final t<List<T>> toSortedList() {
        return toSortedList(Functions.o());
    }

    public final t<List<T>> toSortedList(int i10) {
        return toSortedList(Functions.o(), i10);
    }

    public final t<List<T>> toSortedList(Comparator<? super T> comparator) {
        fm.a.e(comparator, "comparator is null");
        return (t<List<T>>) toList().h(Functions.m(comparator));
    }

    public final t<List<T>> toSortedList(Comparator<? super T> comparator, int i10) {
        fm.a.e(comparator, "comparator is null");
        return (t<List<T>>) toList(i10).h(Functions.m(comparator));
    }

    public final k<T> unsubscribeOn(s sVar) {
        fm.a.e(sVar, "scheduler is null");
        return tm.a.o(new ObservableUnsubscribeOn(this, sVar));
    }

    public final k<k<T>> window(long j10) {
        return window(j10, j10, bufferSize());
    }

    public final k<k<T>> window(long j10, long j11) {
        return window(j10, j11, bufferSize());
    }

    public final k<k<T>> window(long j10, long j11, int i10) {
        fm.a.g(j10, "count");
        fm.a.g(j11, "skip");
        fm.a.f(i10, "bufferSize");
        return tm.a.o(new ObservableWindow(this, j10, j11, i10));
    }

    public final k<k<T>> window(long j10, long j11, TimeUnit timeUnit) {
        return window(j10, j11, timeUnit, vm.a.a(), bufferSize());
    }

    public final k<k<T>> window(long j10, long j11, TimeUnit timeUnit, s sVar) {
        return window(j10, j11, timeUnit, sVar, bufferSize());
    }

    public final k<k<T>> window(long j10, long j11, TimeUnit timeUnit, s sVar, int i10) {
        fm.a.g(j10, "timespan");
        fm.a.g(j11, "timeskip");
        fm.a.f(i10, "bufferSize");
        fm.a.e(sVar, "scheduler is null");
        fm.a.e(timeUnit, "unit is null");
        return tm.a.o(new w1(this, j10, j11, timeUnit, sVar, Long.MAX_VALUE, i10, false));
    }

    public final k<k<T>> window(long j10, TimeUnit timeUnit) {
        return window(j10, timeUnit, vm.a.a(), Long.MAX_VALUE, false);
    }

    public final k<k<T>> window(long j10, TimeUnit timeUnit, long j11) {
        return window(j10, timeUnit, vm.a.a(), j11, false);
    }

    public final k<k<T>> window(long j10, TimeUnit timeUnit, long j11, boolean z10) {
        return window(j10, timeUnit, vm.a.a(), j11, z10);
    }

    public final k<k<T>> window(long j10, TimeUnit timeUnit, s sVar) {
        return window(j10, timeUnit, sVar, Long.MAX_VALUE, false);
    }

    public final k<k<T>> window(long j10, TimeUnit timeUnit, s sVar, long j11) {
        return window(j10, timeUnit, sVar, j11, false);
    }

    public final k<k<T>> window(long j10, TimeUnit timeUnit, s sVar, long j11, boolean z10) {
        return window(j10, timeUnit, sVar, j11, z10, bufferSize());
    }

    public final k<k<T>> window(long j10, TimeUnit timeUnit, s sVar, long j11, boolean z10, int i10) {
        fm.a.f(i10, "bufferSize");
        fm.a.e(sVar, "scheduler is null");
        fm.a.e(timeUnit, "unit is null");
        fm.a.g(j11, "count");
        return tm.a.o(new w1(this, j10, j10, timeUnit, sVar, j11, i10, z10));
    }

    public final <B> k<k<T>> window(Callable<? extends p<B>> callable) {
        return window(callable, bufferSize());
    }

    public final <B> k<k<T>> window(Callable<? extends p<B>> callable, int i10) {
        fm.a.e(callable, "boundary is null");
        fm.a.f(i10, "bufferSize");
        return tm.a.o(new ObservableWindowBoundarySupplier(this, callable, i10));
    }

    public final <B> k<k<T>> window(p<B> pVar) {
        return window(pVar, bufferSize());
    }

    public final <B> k<k<T>> window(p<B> pVar, int i10) {
        fm.a.e(pVar, "boundary is null");
        fm.a.f(i10, "bufferSize");
        return tm.a.o(new ObservableWindowBoundary(this, pVar, i10));
    }

    public final <U, V> k<k<T>> window(p<U> pVar, dm.o<? super U, ? extends p<V>> oVar) {
        return window(pVar, oVar, bufferSize());
    }

    public final <U, V> k<k<T>> window(p<U> pVar, dm.o<? super U, ? extends p<V>> oVar, int i10) {
        fm.a.e(pVar, "openingIndicator is null");
        fm.a.e(oVar, "closingIndicator is null");
        fm.a.f(i10, "bufferSize");
        return tm.a.o(new v1(this, pVar, oVar, i10));
    }

    public final <R> k<R> withLatestFrom(Iterable<? extends p<?>> iterable, dm.o<? super Object[], R> oVar) {
        fm.a.e(iterable, "others is null");
        fm.a.e(oVar, "combiner is null");
        return tm.a.o(new ObservableWithLatestFromMany(this, iterable, oVar));
    }

    public final <U, R> k<R> withLatestFrom(p<? extends U> pVar, dm.c<? super T, ? super U, ? extends R> cVar) {
        fm.a.e(pVar, "other is null");
        fm.a.e(cVar, "combiner is null");
        return tm.a.o(new ObservableWithLatestFrom(this, cVar, pVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, R> k<R> withLatestFrom(p<T1> pVar, p<T2> pVar2, dm.h<? super T, ? super T1, ? super T2, R> hVar) {
        fm.a.e(pVar, "o1 is null");
        fm.a.e(pVar2, "o2 is null");
        fm.a.e(hVar, "combiner is null");
        return withLatestFrom((p<?>[]) new p[]{pVar, pVar2}, Functions.w(hVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, T3, R> k<R> withLatestFrom(p<T1> pVar, p<T2> pVar2, p<T3> pVar3, dm.i<? super T, ? super T1, ? super T2, ? super T3, R> iVar) {
        fm.a.e(pVar, "o1 is null");
        fm.a.e(pVar2, "o2 is null");
        fm.a.e(pVar3, "o3 is null");
        fm.a.e(iVar, "combiner is null");
        return withLatestFrom((p<?>[]) new p[]{pVar, pVar2, pVar3}, Functions.x(iVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, T3, T4, R> k<R> withLatestFrom(p<T1> pVar, p<T2> pVar2, p<T3> pVar3, p<T4> pVar4, dm.j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> jVar) {
        fm.a.e(pVar, "o1 is null");
        fm.a.e(pVar2, "o2 is null");
        fm.a.e(pVar3, "o3 is null");
        fm.a.e(pVar4, "o4 is null");
        fm.a.e(jVar, "combiner is null");
        return withLatestFrom((p<?>[]) new p[]{pVar, pVar2, pVar3, pVar4}, Functions.y(jVar));
    }

    public final <R> k<R> withLatestFrom(p<?>[] pVarArr, dm.o<? super Object[], R> oVar) {
        fm.a.e(pVarArr, "others is null");
        fm.a.e(oVar, "combiner is null");
        return tm.a.o(new ObservableWithLatestFromMany(this, pVarArr, oVar));
    }

    public final <U, R> k<R> zipWith(Iterable<U> iterable, dm.c<? super T, ? super U, ? extends R> cVar) {
        fm.a.e(iterable, "other is null");
        fm.a.e(cVar, "zipper is null");
        return tm.a.o(new x1(this, iterable, cVar));
    }

    public final <U, R> k<R> zipWith(p<? extends U> pVar, dm.c<? super T, ? super U, ? extends R> cVar) {
        fm.a.e(pVar, "other is null");
        return zip(this, pVar, cVar);
    }

    public final <U, R> k<R> zipWith(p<? extends U> pVar, dm.c<? super T, ? super U, ? extends R> cVar, boolean z10) {
        return zip(this, pVar, cVar, z10);
    }

    public final <U, R> k<R> zipWith(p<? extends U> pVar, dm.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10) {
        return zip(this, pVar, cVar, z10, i10);
    }
}
