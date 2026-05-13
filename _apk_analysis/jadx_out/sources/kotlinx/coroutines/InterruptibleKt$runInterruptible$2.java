package kotlinx.coroutines;

import bn.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.l0;
import sn.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes12.dex */
@jn.d(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
public final class InterruptibleKt$runInterruptible$2<T> extends SuspendLambda implements p<l0, hn.c<? super T>, Object> {
    public final /* synthetic */ sn.a<T> $block;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InterruptibleKt$runInterruptible$2(sn.a<? extends T> aVar, hn.c<? super InterruptibleKt$runInterruptible$2> cVar) {
        super(2, cVar);
        this.$block = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c<r> create(Object obj, hn.c<?> cVar) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.$block, cVar);
        interruptibleKt$runInterruptible$2.L$0 = obj;
        return interruptibleKt$runInterruptible$2;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Object mo2invoke(l0 l0Var, hn.c<? super T> cVar) {
        return ((InterruptibleKt$runInterruptible$2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        return InterruptibleKt.d(((l0) this.L$0).getCoroutineContext(), this.$block);
    }
}
