package io.ktor.client.plugins.api;

import bn.r;
import hn.c;
import in.a;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.Send;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.q;
import zk.l0;

/* JADX INFO: compiled from: CommonHooks.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "io.ktor.client.plugins.api.Send$install$1", f = "CommonHooks.kt", l = {52}, m = "invokeSuspend")
public final class Send$install$1 extends SuspendLambda implements q<l0, cl.d, c<? super HttpClientCall>, Object> {
    public final /* synthetic */ HttpClient $client;
    public final /* synthetic */ q<Send.a, cl.d, c<? super HttpClientCall>, Object> $handler;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Send$install$1(q<? super Send.a, ? super cl.d, ? super c<? super HttpClientCall>, ? extends Object> qVar, HttpClient httpClient, c<? super Send$install$1> cVar) {
        super(3, cVar);
        this.$handler = qVar;
        this.$client = httpClient;
    }

    @Override // sn.q
    public final Object invoke(l0 l0Var, cl.d dVar, c<? super HttpClientCall> cVar) {
        Send$install$1 send$install$1 = new Send$install$1(this.$handler, this.$client, cVar);
        send$install$1.L$0 = l0Var;
        send$install$1.L$1 = dVar;
        return send$install$1.invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            l0 l0Var = (l0) this.L$0;
            cl.d dVar = (cl.d) this.L$1;
            q<Send.a, cl.d, c<? super HttpClientCall>, Object> qVar = this.$handler;
            Send.a aVar = new Send.a(l0Var, this.$client.getCoroutineContext());
            this.L$0 = null;
            this.label = 1;
            obj = qVar.invoke(aVar, dVar, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return obj;
    }
}
