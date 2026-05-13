package kotlinx.coroutines.flow;

import bn.r;
import go.f;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes2.dex */
@d(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {46}, m = "invokeSuspend")
public final class FlowKt__CollectKt$launchIn$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ go.d<T> $this_launchIn;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$launchIn$1(go.d<? extends T> dVar, c<? super FlowKt__CollectKt$launchIn$1> cVar) {
        super(2, cVar);
        this.$this_launchIn = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new FlowKt__CollectKt$launchIn$1(this.$this_launchIn, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(l0 l0Var, c<? super r> cVar) {
        return ((FlowKt__CollectKt$launchIn$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            go.d<T> dVar = this.$this_launchIn;
            this.label = 1;
            if (f.k(dVar, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return r.f5635a;
    }
}
