package io.reactivex.internal.operators.observable;

import bm.b;
import dm.o;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes6.dex */
public final class ObservableTimeout<T, U, V> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<U> f71618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o<? super T, ? extends p<V>> f71619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<? extends T> f71620e;

    public static final class TimeoutConsumer extends AtomicReference<b> implements r<Object>, b {
        private static final long serialVersionUID = 8708641127342403073L;
        public final long idx;
        public final a parent;

        public TimeoutConsumer(long j10, a aVar) {
            this.idx = j10;
            this.parent = aVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // xl.r
        public void onComplete() {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper) {
                lazySet(disposableHelper);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj == disposableHelper) {
                tm.a.s(th2);
            } else {
                lazySet(disposableHelper);
                this.parent.onTimeoutError(this.idx, th2);
            }
        }

        @Override // xl.r
        public void onNext(Object obj) {
            b bVar = (b) get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper) {
                bVar.dispose();
                lazySet(disposableHelper);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public static final class TimeoutFallbackObserver<T> extends AtomicReference<b> implements r<T>, b, a {
        private static final long serialVersionUID = -7508389464265974549L;
        public final r<? super T> downstream;
        public p<? extends T> fallback;
        public final o<? super T, ? extends p<?>> itemTimeoutIndicator;
        public final SequentialDisposable task = new SequentialDisposable();
        public final AtomicLong index = new AtomicLong();
        public final AtomicReference<b> upstream = new AtomicReference<>();

        public TimeoutFallbackObserver(r<? super T> rVar, o<? super T, ? extends p<?>> oVar, p<? extends T> pVar) {
            this.downstream = rVar;
            this.itemTimeoutIndicator = oVar;
            this.fallback = pVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // xl.r
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.task.dispose();
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                tm.a.s(th2);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th2);
            this.task.dispose();
        }

        @Override // xl.r
        public void onNext(T t10) {
            long j10 = this.index.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.index.compareAndSet(j10, j11)) {
                    b bVar = this.task.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.downstream.onNext(t10);
                    try {
                        p pVar = (p) fm.a.e(this.itemTimeoutIndicator.apply(t10), "The itemTimeoutIndicator returned a null ObservableSource.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j11, this);
                        if (this.task.replace(timeoutConsumer)) {
                            pVar.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th2) {
                        cm.a.b(th2);
                        this.upstream.get().dispose();
                        this.index.getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th2);
                    }
                }
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.upstream, bVar);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void onTimeout(long j10) {
            if (this.index.compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                p<? extends T> pVar = this.fallback;
                this.fallback = null;
                pVar.subscribe(new ObservableTimeoutTimed.a(this.downstream, this));
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.a
        public void onTimeoutError(long j10, Throwable th2) {
            if (!this.index.compareAndSet(j10, Long.MAX_VALUE)) {
                tm.a.s(th2);
            } else {
                DisposableHelper.dispose(this);
                this.downstream.onError(th2);
            }
        }

        public void startFirstTimeout(p<?> pVar) {
            if (pVar != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, this);
                if (this.task.replace(timeoutConsumer)) {
                    pVar.subscribe(timeoutConsumer);
                }
            }
        }
    }

    public static final class TimeoutObserver<T> extends AtomicLong implements r<T>, b, a {
        private static final long serialVersionUID = 3764492702657003550L;
        public final r<? super T> downstream;
        public final o<? super T, ? extends p<?>> itemTimeoutIndicator;
        public final SequentialDisposable task = new SequentialDisposable();
        public final AtomicReference<b> upstream = new AtomicReference<>();

        public TimeoutObserver(r<? super T> rVar, o<? super T, ? extends p<?>> oVar) {
            this.downstream = rVar;
            this.itemTimeoutIndicator = oVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            this.task.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // xl.r
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                tm.a.s(th2);
            } else {
                this.task.dispose();
                this.downstream.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    b bVar = this.task.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.downstream.onNext(t10);
                    try {
                        p pVar = (p) fm.a.e(this.itemTimeoutIndicator.apply(t10), "The itemTimeoutIndicator returned a null ObservableSource.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j11, this);
                        if (this.task.replace(timeoutConsumer)) {
                            pVar.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th2) {
                        cm.a.b(th2);
                        this.upstream.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th2);
                    }
                }
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.upstream, bVar);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void onTimeout(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                this.downstream.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.a
        public void onTimeoutError(long j10, Throwable th2) {
            if (!compareAndSet(j10, Long.MAX_VALUE)) {
                tm.a.s(th2);
            } else {
                DisposableHelper.dispose(this.upstream);
                this.downstream.onError(th2);
            }
        }

        public void startFirstTimeout(p<?> pVar) {
            if (pVar != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, this);
                if (this.task.replace(timeoutConsumer)) {
                    pVar.subscribe(timeoutConsumer);
                }
            }
        }
    }

    public interface a extends ObservableTimeoutTimed.b {
        void onTimeoutError(long j10, Throwable th2);
    }

    public ObservableTimeout(k<T> kVar, p<U> pVar, o<? super T, ? extends p<V>> oVar, p<? extends T> pVar2) {
        super(kVar);
        this.f71618c = pVar;
        this.f71619d = oVar;
        this.f71620e = pVar2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        if (this.f71620e == null) {
            TimeoutObserver timeoutObserver = new TimeoutObserver(rVar, this.f71619d);
            rVar.onSubscribe(timeoutObserver);
            timeoutObserver.startFirstTimeout(this.f71618c);
            this.f74327b.subscribe(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(rVar, this.f71619d, this.f71620e);
        rVar.onSubscribe(timeoutFallbackObserver);
        timeoutFallbackObserver.startFirstTimeout(this.f71618c);
        this.f74327b.subscribe(timeoutFallbackObserver);
    }
}
