package io.ktor.client.engine;

import bn.r;
import cl.e;
import cl.h;
import hn.c;
import io.ktor.client.engine.HttpClientEngine;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: HttpClientEngine.kt */
/* JADX INFO: loaded from: classes9.dex */
@d(c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", f = "HttpClientEngine.kt", l = {183}, m = "invokeSuspend")
public final class HttpClientEngine$executeWithinCallContext$2 extends SuspendLambda implements p<l0, c<? super h>, Object> {
    public final /* synthetic */ e $requestData;
    public int label;
    public final /* synthetic */ HttpClientEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientEngine$executeWithinCallContext$2(HttpClientEngine httpClientEngine, e eVar, c<? super HttpClientEngine$executeWithinCallContext$2> cVar) {
        super(2, cVar);
        this.this$0 = httpClientEngine;
        this.$requestData = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new HttpClientEngine$executeWithinCallContext$2(this.this$0, this.$requestData, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(l0 l0Var, c<? super h> cVar) {
        return ((HttpClientEngine$executeWithinCallContext$2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            if (HttpClientEngine.DefaultImpls.f(this.this$0)) {
                throw new ClientEngineClosedException(null, 1, null);
            }
            HttpClientEngine httpClientEngine = this.this$0;
            e eVar = this.$requestData;
            this.label = 1;
            obj = httpClientEngine.g(eVar, this);
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
