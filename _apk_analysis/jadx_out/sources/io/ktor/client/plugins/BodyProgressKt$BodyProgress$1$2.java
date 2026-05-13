package io.ktor.client.plugins;

import bn.r;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.p;

/* JADX INFO: compiled from: BodyProgress.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2", f = "BodyProgress.kt", l = {}, m = "invokeSuspend")
public final class BodyProgressKt$BodyProgress$1$2 extends SuspendLambda implements p<dl.c, hn.c<? super dl.c>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public BodyProgressKt$BodyProgress$1$2(hn.c<? super BodyProgressKt$BodyProgress$1$2> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c<r> create(Object obj, hn.c<?> cVar) {
        BodyProgressKt$BodyProgress$1$2 bodyProgressKt$BodyProgress$1$2 = new BodyProgressKt$BodyProgress$1$2(cVar);
        bodyProgressKt$BodyProgress$1$2.L$0 = obj;
        return bodyProgressKt$BodyProgress$1$2;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(dl.c cVar, hn.c<? super dl.c> cVar2) {
        return ((BodyProgressKt$BodyProgress$1$2) create(cVar, cVar2)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        dl.c cVar = (dl.c) this.L$0;
        wk.a aVar = (wk.a) cVar.L().d().getAttributes().e(BodyProgressKt.f71085b);
        if (aVar == null) {
            return null;
        }
        return BodyProgressKt.g(cVar, aVar);
    }
}
