package io.reactivex.internal.operators.observable;

import io.reactivex.internal.observers.BasicIntQueueDisposable;
import xl.k;
import xl.r;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableRangeLong extends k<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f71527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71528c;

    public static final class RangeDisposable extends BasicIntQueueDisposable<Long> {
        private static final long serialVersionUID = 396518478098735504L;
        public final r<? super Long> downstream;
        public final long end;
        public boolean fused;
        public long index;

        public RangeDisposable(r<? super Long> rVar, long j10, long j11) {
            this.downstream = rVar;
            this.index = j10;
            this.end = j11;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.h
        public void clear() {
            this.index = this.end;
            lazySet(1);
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, bm.b
        public void dispose() {
            set(1);
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, bm.b
        public boolean isDisposed() {
            return get() != 0;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.h
        public boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.h
        public Long poll() throws Exception {
            long j10 = this.index;
            if (j10 != this.end) {
                this.index = 1 + j10;
                return Long.valueOf(j10);
            }
            lazySet(1);
            return null;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.d
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.fused = true;
            return 1;
        }

        public void run() {
            if (this.fused) {
                return;
            }
            r<? super Long> rVar = this.downstream;
            long j10 = this.end;
            for (long j11 = this.index; j11 != j10 && get() == 0; j11++) {
                rVar.onNext(Long.valueOf(j11));
            }
            if (get() == 0) {
                lazySet(1);
                rVar.onComplete();
            }
        }
    }

    public ObservableRangeLong(long j10, long j11) {
        this.f71527b = j10;
        this.f71528c = j11;
    }

    @Override // xl.k
    public void subscribeActual(r<? super Long> rVar) {
        long j10 = this.f71527b;
        RangeDisposable rangeDisposable = new RangeDisposable(rVar, j10, j10 + this.f71528c);
        rVar.onSubscribe(rangeDisposable);
        rangeDisposable.run();
    }
}
