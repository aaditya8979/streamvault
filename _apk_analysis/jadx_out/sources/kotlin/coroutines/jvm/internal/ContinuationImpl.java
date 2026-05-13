package kotlin.coroutines.jvm.internal;

import hn.c;
import jn.b;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {

    @Nullable
    private final d _context;

    @Nullable
    private transient c<Object> intercepted;

    public ContinuationImpl(@Nullable c<Object> cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }

    public ContinuationImpl(@Nullable c<Object> cVar, @Nullable d dVar) {
        super(cVar);
        this._context = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, hn.c
    @NotNull
    public d getContext() {
        d dVar = this._context;
        p.h(dVar);
        return dVar;
    }

    @NotNull
    public final c<Object> intercepted() {
        c<Object> cVarInterceptContinuation = this.intercepted;
        if (cVarInterceptContinuation == null) {
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) getContext().get(kotlin.coroutines.c.G8);
            if (cVar == null || (cVarInterceptContinuation = cVar.interceptContinuation(this)) == null) {
                cVarInterceptContinuation = this;
            }
            this.intercepted = cVarInterceptContinuation;
        }
        return cVarInterceptContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        c<?> cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            d.b bVar = getContext().get(kotlin.coroutines.c.G8);
            p.h(bVar);
            ((kotlin.coroutines.c) bVar).releaseInterceptedContinuation(cVar);
        }
        this.intercepted = b.f72505b;
    }
}
