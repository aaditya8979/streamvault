package io.ktor.client.plugins;

import bn.r;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.Send;
import java.util.List;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: HttpCallValidator.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$2", f = "HttpCallValidator.kt", l = {128, 129}, m = "invokeSuspend")
public final class HttpCallValidatorKt$HttpCallValidator$2$2 extends SuspendLambda implements q<Send.a, cl.d, hn.c<? super HttpClientCall>, Object> {
    public final /* synthetic */ List<p<dl.c, hn.c<? super r>, Object>> $responseValidators;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HttpCallValidatorKt$HttpCallValidator$2$2(List<? extends p<? super dl.c, ? super hn.c<? super r>, ? extends Object>> list, hn.c<? super HttpCallValidatorKt$HttpCallValidator$2$2> cVar) {
        super(3, cVar);
        this.$responseValidators = list;
    }

    @Override // sn.q
    public final Object invoke(Send.a aVar, cl.d dVar, hn.c<? super HttpClientCall> cVar) {
        HttpCallValidatorKt$HttpCallValidator$2$2 httpCallValidatorKt$HttpCallValidator$2$2 = new HttpCallValidatorKt$HttpCallValidator$2$2(this.$responseValidators, cVar);
        httpCallValidatorKt$HttpCallValidator$2$2.L$0 = aVar;
        httpCallValidatorKt$HttpCallValidator$2$2.L$1 = dVar;
        return httpCallValidatorKt$HttpCallValidator$2$2.invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            Send.a aVar = (Send.a) this.L$0;
            cl.d dVar = (cl.d) this.L$1;
            this.L$0 = null;
            this.label = 1;
            obj = aVar.a(dVar, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                HttpClientCall httpClientCall = (HttpClientCall) this.L$0;
                kotlin.c.b(obj);
                return httpClientCall;
            }
            kotlin.c.b(obj);
        }
        HttpClientCall httpClientCall2 = (HttpClientCall) obj;
        List<p<dl.c, hn.c<? super r>, Object>> list = this.$responseValidators;
        dl.c cVarE = httpClientCall2.e();
        this.L$0 = httpClientCall2;
        this.label = 2;
        return HttpCallValidatorKt.d(list, cVarE, this) == objG ? objG : httpClientCall2;
    }
}
