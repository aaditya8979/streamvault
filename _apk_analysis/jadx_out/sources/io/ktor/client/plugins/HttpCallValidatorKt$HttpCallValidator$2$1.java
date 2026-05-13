package io.ktor.client.plugins;

import bn.r;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.p;

/* JADX INFO: compiled from: HttpCallValidator.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1", f = "HttpCallValidator.kt", l = {}, m = "invokeSuspend")
public final class HttpCallValidatorKt$HttpCallValidator$2$1 extends SuspendLambda implements p<cl.d, hn.c<? super r>, Object> {
    public final /* synthetic */ boolean $expectSuccess;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallValidatorKt$HttpCallValidator$2$1(boolean z10, hn.c<? super HttpCallValidatorKt$HttpCallValidator$2$1> cVar) {
        super(2, cVar);
        this.$expectSuccess = z10;
    }

    public static final boolean e(boolean z10) {
        return z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c<r> create(Object obj, hn.c<?> cVar) {
        HttpCallValidatorKt$HttpCallValidator$2$1 httpCallValidatorKt$HttpCallValidator$2$1 = new HttpCallValidatorKt$HttpCallValidator$2$1(this.$expectSuccess, cVar);
        httpCallValidatorKt$HttpCallValidator$2$1.L$0 = obj;
        return httpCallValidatorKt$HttpCallValidator$2$1;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(cl.d dVar, hn.c<? super r> cVar) {
        return ((HttpCallValidatorKt$HttpCallValidator$2$1) create(dVar, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        kl.b bVarC = ((cl.d) this.L$0).c();
        kl.a<Boolean> aVarJ = HttpCallValidatorKt.j();
        final boolean z10 = this.$expectSuccess;
        bVarC.c(aVarJ, new sn.a() { // from class: io.ktor.client.plugins.c
            @Override // sn.a
            public final Object invoke() {
                return Boolean.valueOf(HttpCallValidatorKt$HttpCallValidator$2$1.e(z10));
            }
        });
        return r.f5635a;
    }
}
