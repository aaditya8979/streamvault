package io.ktor.client.plugins;

import bn.r;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import p000do.l0;
import p000do.s0;
import p000do.t1;
import sn.p;

/* JADX INFO: compiled from: HttpTimeout.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "io.ktor.client.plugins.HttpTimeoutKt$applyRequestTimeout$killer$1", f = "HttpTimeout.kt", l = {184}, m = "invokeSuspend")
public final class HttpTimeoutKt$applyRequestTimeout$killer$1 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
    public final /* synthetic */ g $executionContext;
    public final /* synthetic */ cl.d $request;
    public final /* synthetic */ Long $requestTimeout;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTimeoutKt$applyRequestTimeout$killer$1(Long l10, cl.d dVar, g gVar, hn.c<? super HttpTimeoutKt$applyRequestTimeout$killer$1> cVar) {
        super(2, cVar);
        this.$requestTimeout = l10;
        this.$request = dVar;
        this.$executionContext = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c<r> create(Object obj, hn.c<?> cVar) {
        return new HttpTimeoutKt$applyRequestTimeout$killer$1(this.$requestTimeout, this.$request, this.$executionContext, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
        return ((HttpTimeoutKt$applyRequestTimeout$killer$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            long jLongValue = this.$requestTimeout.longValue();
            this.label = 1;
            if (s0.a(jLongValue, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(this.$request);
        rs.c cVar = HttpTimeoutKt.f71152a;
        cl.d dVar = this.$request;
        if (pl.b.a(cVar)) {
            cVar.trace("Request timeout: " + dVar.i());
        }
        g gVar = this.$executionContext;
        String message = httpRequestTimeoutException.getMessage();
        tn.p.h(message);
        t1.d(gVar, message, httpRequestTimeoutException);
        return r.f5635a;
    }
}
