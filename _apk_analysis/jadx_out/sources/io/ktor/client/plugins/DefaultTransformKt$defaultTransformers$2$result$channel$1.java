package io.ktor.client.plugins;

import bn.r;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import java.util.concurrent.CancellationException;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sl.f;
import sl.s;
import sn.p;

/* JADX INFO: compiled from: DefaultTransform.kt */
/* JADX INFO: loaded from: classes3.dex */
@d(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1", f = "DefaultTransform.kt", l = {102}, m = "invokeSuspend")
public final class DefaultTransformKt$defaultTransformers$2$result$channel$1 extends SuspendLambda implements p<s, hn.c<? super r>, Object> {
    public final /* synthetic */ Object $body;
    public final /* synthetic */ dl.c $response;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformKt$defaultTransformers$2$result$channel$1(Object obj, dl.c cVar, hn.c<? super DefaultTransformKt$defaultTransformers$2$result$channel$1> cVar2) {
        super(2, cVar2);
        this.$body = obj;
        this.$response = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c<r> create(Object obj, hn.c<?> cVar) {
        DefaultTransformKt$defaultTransformers$2$result$channel$1 defaultTransformKt$defaultTransformers$2$result$channel$1 = new DefaultTransformKt$defaultTransformers$2$result$channel$1(this.$body, this.$response, cVar);
        defaultTransformKt$defaultTransformers$2$result$channel$1.L$0 = obj;
        return defaultTransformKt$defaultTransformers$2$result$channel$1;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(s sVar, hn.c<? super r> cVar) {
        return ((DefaultTransformKt$defaultTransformers$2$result$channel$1) create(sVar, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                s sVar = (s) this.L$0;
                io.ktor.utils.io.a aVar = (io.ktor.utils.io.a) this.$body;
                f fVarA = sVar.a();
                this.label = 1;
                obj = ByteReadChannelOperationsKt.c(aVar, fVarA, Long.MAX_VALUE, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            ((Number) obj).longValue();
            return r.f5635a;
        } catch (CancellationException e10) {
            kotlinx.coroutines.d.d(this.$response, e10);
            throw e10;
        } catch (Throwable th2) {
            kotlinx.coroutines.d.c(this.$response, "Receive failed", th2);
            throw th2;
        }
    }
}
