package kotlin.coroutines.jvm.internal;

import bn.r;
import hn.c;
import in.a;
import java.io.Serializable;
import jn.e;
import jn.f;
import kotlin.Result;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseContinuationImpl implements c<Object>, jn.c, Serializable {

    @Nullable
    private final c<Object> completion;

    public BaseContinuationImpl(@Nullable c<Object> cVar) {
        this.completion = cVar;
    }

    @NotNull
    public c<r> create(@NotNull c<?> cVar) {
        p.k(cVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @NotNull
    public c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        p.k(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // jn.c
    @Nullable
    public jn.c getCallerFrame() {
        c<Object> cVar = this.completion;
        if (cVar instanceof jn.c) {
            return (jn.c) cVar;
        }
        return null;
    }

    @Nullable
    public final c<Object> getCompletion() {
        return this.completion;
    }

    @Override // hn.c
    @NotNull
    public abstract /* synthetic */ d getContext();

    @Nullable
    public StackTraceElement getStackTraceElement() {
        return e.d(this);
    }

    @Nullable
    public abstract Object invokeSuspend(@NotNull Object obj);

    public void releaseIntercepted() {
    }

    @Override // hn.c
    public final void resumeWith(@NotNull Object obj) {
        Object objInvokeSuspend;
        c<Object> cVar = this;
        while (true) {
            f.b(cVar);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) cVar;
            c<Object> cVar2 = baseContinuationImpl.completion;
            p.h(cVar2);
            try {
                objInvokeSuspend = baseContinuationImpl.invokeSuspend(obj);
            } catch (Throwable th2) {
                Result.a aVar = Result.Companion;
                obj = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            if (objInvokeSuspend == a.g()) {
                return;
            }
            obj = Result.m7534constructorimpl(objInvokeSuspend);
            baseContinuationImpl.releaseIntercepted();
            if (!(cVar2 instanceof BaseContinuationImpl)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }
}
