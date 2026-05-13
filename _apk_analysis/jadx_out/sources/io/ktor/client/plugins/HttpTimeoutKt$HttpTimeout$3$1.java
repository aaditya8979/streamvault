package io.ktor.client.plugins;

import bn.r;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.Send;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.q;
import zk.f0;
import zk.g0;

/* JADX INFO: compiled from: HttpTimeout.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$3$1", f = "HttpTimeout.kt", l = {168}, m = "invokeSuspend")
public final class HttpTimeoutKt$HttpTimeout$3$1 extends SuspendLambda implements q<Send.a, cl.d, hn.c<? super HttpClientCall>, Object> {
    public final /* synthetic */ Long $connectTimeoutMillis;
    public final /* synthetic */ Long $requestTimeoutMillis;
    public final /* synthetic */ Long $socketTimeoutMillis;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTimeoutKt$HttpTimeout$3$1(Long l10, Long l11, Long l12, hn.c<? super HttpTimeoutKt$HttpTimeout$3$1> cVar) {
        super(3, cVar);
        this.$requestTimeoutMillis = l10;
        this.$connectTimeoutMillis = l11;
        this.$socketTimeoutMillis = l12;
    }

    @Override // sn.q
    public final Object invoke(Send.a aVar, cl.d dVar, hn.c<? super HttpClientCall> cVar) {
        HttpTimeoutKt$HttpTimeout$3$1 httpTimeoutKt$HttpTimeout$3$1 = new HttpTimeoutKt$HttpTimeout$3$1(this.$requestTimeoutMillis, this.$connectTimeoutMillis, this.$socketTimeoutMillis, cVar);
        httpTimeoutKt$HttpTimeout$3$1.L$0 = aVar;
        httpTimeoutKt$HttpTimeout$3$1.L$1 = dVar;
        return httpTimeoutKt$HttpTimeout$3$1.invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            Send.a aVar = (Send.a) this.L$0;
            cl.d dVar = (cl.d) this.L$1;
            boolean zN = HttpTimeoutKt.n(dVar);
            f0 f0Var = f0.f98297a;
            g0 g0Var = (g0) dVar.f(f0Var);
            if (g0Var == null && HttpTimeoutKt.e(this.$requestTimeoutMillis, this.$connectTimeoutMillis, this.$socketTimeoutMillis, zN)) {
                g0Var = new g0(null, null, null, 7, null);
                dVar.l(f0Var, g0Var);
            }
            if (g0Var != null) {
                Long l10 = this.$connectTimeoutMillis;
                Long l11 = this.$socketTimeoutMillis;
                Long l12 = this.$requestTimeoutMillis;
                Long lB = g0Var.b();
                if (lB != null) {
                    l10 = lB;
                }
                g0Var.e(l10);
                Long lD = g0Var.d();
                if (lD != null) {
                    l11 = lD;
                }
                g0Var.g(l11);
                if (zN) {
                    Long lC = g0Var.c();
                    if (lC != null) {
                        l12 = lC;
                    }
                    g0Var.f(l12);
                    HttpTimeoutKt.j(aVar, dVar, g0Var.c());
                }
            }
            this.L$0 = null;
            this.label = 1;
            obj = aVar.a(dVar, this);
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
