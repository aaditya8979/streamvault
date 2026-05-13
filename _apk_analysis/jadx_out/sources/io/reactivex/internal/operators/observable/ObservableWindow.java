package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableWindow<T> extends mm.a<T, k<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f71639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f71640e;

    public static final class WindowExactObserver<T> extends AtomicInteger implements r<T>, b, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;
        public volatile boolean cancelled;
        public final int capacityHint;
        public final long count;
        public final r<? super k<T>> downstream;
        public long size;
        public b upstream;
        public UnicastSubject<T> window;

        public WindowExactObserver(r<? super k<T>> rVar, long j10, int i10) {
            this.downstream = rVar;
            this.count = j10;
            this.capacityHint = i10;
        }

        @Override // bm.b
        public void dispose() {
            this.cancelled = true;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // xl.r
        public void onComplete() {
            UnicastSubject<T> unicastSubject = this.window;
            if (unicastSubject != null) {
                this.window = null;
                unicastSubject.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            UnicastSubject<T> unicastSubject = this.window;
            if (unicastSubject != null) {
                this.window = null;
                unicastSubject.onError(th2);
            }
            this.downstream.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            UnicastSubject<T> unicastSubjectE = this.window;
            if (unicastSubjectE == null && !this.cancelled) {
                unicastSubjectE = UnicastSubject.e(this.capacityHint, this);
                this.window = unicastSubjectE;
                this.downstream.onNext(unicastSubjectE);
            }
            if (unicastSubjectE != null) {
                unicastSubjectE.onNext(t10);
                long j10 = this.size + 1;
                this.size = j10;
                if (j10 >= this.count) {
                    this.size = 0L;
                    this.window = null;
                    unicastSubjectE.onComplete();
                    if (this.cancelled) {
                        this.upstream.dispose();
                    }
                }
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.upstream.dispose();
            }
        }
    }

    public static final class WindowSkipObserver<T> extends AtomicBoolean implements r<T>, b, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;
        public volatile boolean cancelled;
        public final int capacityHint;
        public final long count;
        public final r<? super k<T>> downstream;
        public long firstEmission;
        public long index;
        public final long skip;
        public b upstream;
        public final AtomicInteger wip = new AtomicInteger();
        public final ArrayDeque<UnicastSubject<T>> windows = new ArrayDeque<>();

        public WindowSkipObserver(r<? super k<T>> rVar, long j10, long j11, int i10) {
            this.downstream = rVar;
            this.count = j10;
            this.skip = j11;
            this.capacityHint = i10;
        }

        @Override // bm.b
        public void dispose() {
            this.cancelled = true;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // xl.r
        public void onComplete() {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th2);
            }
            this.downstream.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
            long j10 = this.index;
            long j11 = this.skip;
            if (j10 % j11 == 0 && !this.cancelled) {
                this.wip.getAndIncrement();
                UnicastSubject<T> unicastSubjectE = UnicastSubject.e(this.capacityHint, this);
                arrayDeque.offer(unicastSubjectE);
                this.downstream.onNext(unicastSubjectE);
            }
            long j12 = this.firstEmission + 1;
            Iterator<UnicastSubject<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t10);
            }
            if (j12 >= this.count) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.cancelled) {
                    this.upstream.dispose();
                    return;
                }
                this.firstEmission = j12 - j11;
            } else {
                this.firstEmission = j12;
            }
            this.index = j10 + 1;
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.decrementAndGet() == 0 && this.cancelled) {
                this.upstream.dispose();
            }
        }
    }

    public ObservableWindow(p<T> pVar, long j10, long j11, int i10) {
        super(pVar);
        this.f71638c = j10;
        this.f71639d = j11;
        this.f71640e = i10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super k<T>> rVar) {
        if (this.f71638c == this.f71639d) {
            this.f74327b.subscribe(new WindowExactObserver(rVar, this.f71638c, this.f71640e));
        } else {
            this.f74327b.subscribe(new WindowSkipObserver(rVar, this.f71638c, this.f71639d, this.f71640e));
        }
    }
}
