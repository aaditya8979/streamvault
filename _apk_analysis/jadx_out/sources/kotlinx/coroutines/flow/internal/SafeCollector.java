package kotlinx.coroutines.flow.internal;

import bn.r;
import bo.t;
import go.e;
import hn.c;
import ho.f;
import ho.k;
import in.a;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.t1;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SafeCollector<T> extends ContinuationImpl implements e<T> {

    @NotNull
    public final d collectContext;
    public final int collectContextSize;

    @NotNull
    public final e<T> collector;

    @Nullable
    private c<? super r> completion_;

    @Nullable
    private d lastEmissionContext;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(@NotNull e<? super T> eVar, @NotNull d dVar) {
        super(k.f63560b, EmptyCoroutineContext.INSTANCE);
        this.collector = eVar;
        this.collectContext = dVar;
        this.collectContextSize = ((Number) dVar.fold(0, new p() { // from class: ho.n
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return Integer.valueOf(SafeCollector.f(((Integer) obj).intValue(), (d.b) obj2));
            }
        })).intValue();
    }

    public static final int f(int i10, d.b bVar) {
        return i10 + 1;
    }

    public final void e(d dVar, d dVar2, T t10) {
        if (dVar2 instanceof f) {
            k((f) dVar2, t10);
        }
        ho.p.b(this, dVar);
    }

    @Override // go.e
    @Nullable
    public Object emit(T t10, @NotNull c<? super r> cVar) {
        try {
            Object objJ = j(cVar, t10);
            if (objJ == a.g()) {
                jn.f.c(cVar);
            }
            return objJ == a.g() ? objJ : r.f5635a;
        } catch (Throwable th2) {
            this.lastEmissionContext = new f(th2, cVar.getContext());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, jn.c
    @Nullable
    public jn.c getCallerFrame() {
        c<? super r> cVar = this.completion_;
        if (cVar instanceof jn.c) {
            return (jn.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl, hn.c
    @NotNull
    public d getContext() {
        d dVar = this.lastEmissionContext;
        return dVar == null ? EmptyCoroutineContext.INSTANCE : dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public Object invokeSuspend(@NotNull Object obj) {
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(obj);
        if (thM7537exceptionOrNullimpl != null) {
            this.lastEmissionContext = new f(thM7537exceptionOrNullimpl, getContext());
        }
        c<? super r> cVar = this.completion_;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return a.g();
    }

    public final Object j(c<? super r> cVar, T t10) {
        d context = cVar.getContext();
        t1.k(context);
        d dVar = this.lastEmissionContext;
        if (dVar != context) {
            e(context, dVar, t10);
            this.lastEmissionContext = context;
        }
        this.completion_ = cVar;
        q qVar = SafeCollectorKt.f73412a;
        e<T> eVar = this.collector;
        tn.p.i(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        tn.p.i(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = qVar.invoke(eVar, t10, this);
        if (!tn.p.f(objInvoke, a.g())) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    public final void k(f fVar, Object obj) {
        throw new IllegalStateException(t.j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + fVar.f63559c + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
