package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import pm.g;
import xl.k;
import xl.r;
import xl.s;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservableInterval extends k<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f71492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f71494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeUnit f71495e;

    public static final class IntervalObserver extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        public long count;
        public final r<? super Long> downstream;

        public IntervalObserver(r<? super Long> rVar) {
            this.downstream = rVar;
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
            if (get() != DisposableHelper.DISPOSED) {
                r<? super Long> rVar = this.downstream;
                long j10 = this.count;
                this.count = 1 + j10;
                rVar.onNext(Long.valueOf(j10));
            }
        }

        public void setResource(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public ObservableInterval(long j10, long j11, TimeUnit timeUnit, s sVar) {
        this.f71493c = j10;
        this.f71494d = j11;
        this.f71495e = timeUnit;
        this.f71492b = sVar;
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
        IntervalObserver intervalObserver = new IntervalObserver(rVar);
        rVar.onSubscribe(intervalObserver);
        s sVar = this.f71492b;
        if (!(sVar instanceof g)) {
            intervalObserver.setResource(sVar.e(intervalObserver, this.f71493c, this.f71494d, this.f71495e));
            return;
        }
        s.c cVarA = sVar.a();
        intervalObserver.setResource(cVarA);
        cVarA.d(intervalObserver, this.f71493c, this.f71494d, this.f71495e);
    }
}
