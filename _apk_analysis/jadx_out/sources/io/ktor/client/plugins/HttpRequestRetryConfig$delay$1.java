package io.ktor.client.plugins;

import bn.r;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.s0;
import sn.p;

/* JADX INFO: compiled from: HttpRequestRetry.kt */
/* JADX INFO: loaded from: classes9.dex */
@d(c = "io.ktor.client.plugins.HttpRequestRetryConfig$delay$1", f = "HttpRequestRetry.kt", l = {42}, m = "invokeSuspend")
public final class HttpRequestRetryConfig$delay$1 extends SuspendLambda implements p<Long, hn.c<? super r>, Object> {
    public /* synthetic */ long J$0;
    public int label;

    public HttpRequestRetryConfig$delay$1(hn.c<? super HttpRequestRetryConfig$delay$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c<r> create(Object obj, hn.c<?> cVar) {
        HttpRequestRetryConfig$delay$1 httpRequestRetryConfig$delay$1 = new HttpRequestRetryConfig$delay$1(cVar);
        httpRequestRetryConfig$delay$1.J$0 = ((Number) obj).longValue();
        return httpRequestRetryConfig$delay$1;
    }

    public final Object invoke(long j10, hn.c<? super r> cVar) {
        return ((HttpRequestRetryConfig$delay$1) create(Long.valueOf(j10), cVar)).invokeSuspend(r.f5635a);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo2invoke(Long l10, hn.c<? super r> cVar) {
        return invoke(l10.longValue(), cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            long j10 = this.J$0;
            this.label = 1;
            if (s0.a(j10, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return r.f5635a;
    }
}
