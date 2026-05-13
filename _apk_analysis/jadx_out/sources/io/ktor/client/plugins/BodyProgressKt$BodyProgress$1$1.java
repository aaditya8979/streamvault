package io.ktor.client.plugins;

import bn.r;
import io.ktor.client.content.ObservableContent;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.q;

/* JADX INFO: compiled from: BodyProgress.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$1", f = "BodyProgress.kt", l = {}, m = "invokeSuspend")
public final class BodyProgressKt$BodyProgress$1$1 extends SuspendLambda implements q<cl.d, jl.c, hn.c<? super jl.c>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public BodyProgressKt$BodyProgress$1$1(hn.c<? super BodyProgressKt$BodyProgress$1$1> cVar) {
        super(3, cVar);
    }

    @Override // sn.q
    public final Object invoke(cl.d dVar, jl.c cVar, hn.c<? super jl.c> cVar2) {
        BodyProgressKt$BodyProgress$1$1 bodyProgressKt$BodyProgress$1$1 = new BodyProgressKt$BodyProgress$1$1(cVar2);
        bodyProgressKt$BodyProgress$1$1.L$0 = dVar;
        bodyProgressKt$BodyProgress$1$1.L$1 = cVar;
        return bodyProgressKt$BodyProgress$1$1.invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        cl.d dVar = (cl.d) this.L$0;
        jl.c cVar = (jl.c) this.L$1;
        wk.a aVar = (wk.a) dVar.c().e(BodyProgressKt.f71084a);
        if (aVar == null) {
            return null;
        }
        return new ObservableContent(cVar, dVar.g(), aVar);
    }
}
