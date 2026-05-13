package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import pm.g;
import xl.k;
import xl.r;
import xl.s;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableIntervalRange extends k<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f71496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f71498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f71499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f71500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeUnit f71501g;

    public static final class IntervalRangeObserver extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        public long count;
        public final r<? super Long> downstream;
        public final long end;

        public IntervalRangeObserver(r<? super Long> rVar, long j10, long j11) {
            this.downstream = rVar;
            this.count = j10;
            this.end = j11;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            long j10 = this.count;
            this.downstream.onNext(Long.valueOf(j10));
            if (j10 != this.end) {
                this.count = j10 + 1;
            } else {
                DisposableHelper.dispose(this);
                this.downstream.onComplete();
            }
        }

        public void setResource(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public ObservableIntervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit, s sVar) {
        this.f71499e = j12;
        this.f71500f = j13;
        this.f71501g = timeUnit;
        this.f71496b = sVar;
        this.f71497c = j10;
        this.f71498d = j11;
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
    public void subscribeActual(r<? super Long> rVar) {
        IntervalRangeObserver intervalRangeObserver = new IntervalRangeObserver(rVar, this.f71497c, this.f71498d);
        rVar.onSubscribe(intervalRangeObserver);
        s sVar = this.f71496b;
        if (!(sVar instanceof g)) {
            intervalRangeObserver.setResource(sVar.e(intervalRangeObserver, this.f71499e, this.f71500f, this.f71501g));
            return;
        }
        s.c cVarA = sVar.a();
        intervalRangeObserver.setResource(cVarA);
        cVarA.d(intervalRangeObserver, this.f71499e, this.f71500f, this.f71501g);
    }
}
