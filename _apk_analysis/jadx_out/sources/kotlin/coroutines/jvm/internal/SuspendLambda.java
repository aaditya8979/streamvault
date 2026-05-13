package kotlin.coroutines.jvm.internal;

import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.m;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class SuspendLambda extends ContinuationImpl implements m<Object> {
    private final int arity;

    public SuspendLambda(int i10) {
        this(i10, null);
    }

    public SuspendLambda(int i10, @Nullable c<Object> cVar) {
        super(cVar);
        this.arity = i10;
    }

    @Override // tn.m
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strK = t.k(this);
        p.j(strK, "renderLambdaToString(...)");
        return strK;
    }
}
