package io.ktor.client.plugins;

import bn.r;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.Send;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.q;
import zk.p;

/* JADX INFO: compiled from: HttpRedirect.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1", f = "HttpRedirect.kt", l = {103, 108}, m = "invokeSuspend")
public final class HttpRedirectKt$HttpRedirect$2$1 extends SuspendLambda implements q<Send.a, cl.d, hn.c<? super HttpClientCall>, Object> {
    public final /* synthetic */ boolean $allowHttpsDowngrade;
    public final /* synthetic */ boolean $checkHttpMethod;
    public final /* synthetic */ al.d<p> $this_createClientPlugin;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRedirectKt$HttpRedirect$2$1(boolean z10, boolean z11, al.d<p> dVar, hn.c<? super HttpRedirectKt$HttpRedirect$2$1> cVar) {
        super(3, cVar);
        this.$checkHttpMethod = z10;
        this.$allowHttpsDowngrade = z11;
        this.$this_createClientPlugin = dVar;
    }

    @Override // sn.q
    public final Object invoke(Send.a aVar, cl.d dVar, hn.c<? super HttpClientCall> cVar) {
        HttpRedirectKt$HttpRedirect$2$1 httpRedirectKt$HttpRedirect$2$1 = new HttpRedirectKt$HttpRedirect$2$1(this.$checkHttpMethod, this.$allowHttpsDowngrade, this.$this_createClientPlugin, cVar);
        httpRedirectKt$HttpRedirect$2$1.L$0 = aVar;
        httpRedirectKt$HttpRedirect$2$1.L$1 = dVar;
        return httpRedirectKt$HttpRedirect$2$1.invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cl.d dVar;
        Send.a aVar;
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            Send.a aVar2 = (Send.a) this.L$0;
            cl.d dVar2 = (cl.d) this.L$1;
            this.L$0 = aVar2;
            this.L$1 = dVar2;
            this.label = 1;
            Object objA = aVar2.a(dVar2, this);
            if (objA == objG) {
                return objG;
            }
            dVar = dVar2;
            aVar = aVar2;
            obj = objA;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    kotlin.c.b(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cl.d dVar3 = (cl.d) this.L$1;
            aVar = (Send.a) this.L$0;
            kotlin.c.b(obj);
            dVar = dVar3;
        }
        HttpClientCall httpClientCall = (HttpClientCall) obj;
        if (this.$checkHttpMethod && !HttpRedirectKt.f71121a.contains(httpClientCall.d().getMethod())) {
            return httpClientCall;
        }
        boolean z10 = this.$allowHttpsDowngrade;
        HttpClient httpClientB = this.$this_createClientPlugin.b();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = HttpRedirectKt.c(aVar, dVar, httpClientCall, z10, httpClientB, this);
        return obj == objG ? objG : obj;
    }
}
