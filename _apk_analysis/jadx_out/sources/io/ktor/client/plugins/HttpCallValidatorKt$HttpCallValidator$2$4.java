package io.ktor.client.plugins;

import bn.r;
import java.util.List;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.q;
import zk.i;

/* JADX INFO: compiled from: HttpCallValidator.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$4", f = "HttpCallValidator.kt", l = {141}, m = "invokeSuspend")
public final class HttpCallValidatorKt$HttpCallValidator$2$4 extends SuspendLambda implements q<cl.b, Throwable, hn.c<? super Throwable>, Object> {
    public final /* synthetic */ List<i> $callExceptionHandlers;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HttpCallValidatorKt$HttpCallValidator$2$4(List<? extends i> list, hn.c<? super HttpCallValidatorKt$HttpCallValidator$2$4> cVar) {
        super(3, cVar);
        this.$callExceptionHandlers = list;
    }

    @Override // sn.q
    public final Object invoke(cl.b bVar, Throwable th2, hn.c<? super Throwable> cVar) {
        HttpCallValidatorKt$HttpCallValidator$2$4 httpCallValidatorKt$HttpCallValidator$2$4 = new HttpCallValidatorKt$HttpCallValidator$2$4(this.$callExceptionHandlers, cVar);
        httpCallValidatorKt$HttpCallValidator$2$4.L$0 = bVar;
        httpCallValidatorKt$HttpCallValidator$2$4.L$1 = th2;
        return httpCallValidatorKt$HttpCallValidator$2$4.invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable th2 = (Throwable) this.L$0;
            kotlin.c.b(obj);
            return th2;
        }
        kotlin.c.b(obj);
        cl.b bVar = (cl.b) this.L$0;
        Throwable thA = el.c.a((Throwable) this.L$1);
        List<i> list = this.$callExceptionHandlers;
        this.L$0 = thA;
        this.label = 1;
        return HttpCallValidatorKt.c(list, thA, bVar, this) == objG ? objG : thA;
    }
}
