package io.ktor.client.plugins;

import al.l;
import bn.r;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import java.nio.charset.Charset;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.s;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: HttpPlainText.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2", f = "HttpPlainText.kt", l = {147}, m = "invokeSuspend")
public final class HttpPlainTextKt$HttpPlainText$2$2 extends SuspendLambda implements s<l, dl.c, io.ktor.utils.io.a, rl.a, hn.c<? super Object>, Object> {
    public final /* synthetic */ Charset $responseCharsetFallback;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainTextKt$HttpPlainText$2$2(Charset charset, hn.c<? super HttpPlainTextKt$HttpPlainText$2$2> cVar) {
        super(5, cVar);
        this.$responseCharsetFallback = charset;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(l lVar, dl.c cVar, io.ktor.utils.io.a aVar, rl.a aVar2, hn.c<Object> cVar2) {
        HttpPlainTextKt$HttpPlainText$2$2 httpPlainTextKt$HttpPlainText$2$2 = new HttpPlainTextKt$HttpPlainText$2$2(this.$responseCharsetFallback, cVar2);
        httpPlainTextKt$HttpPlainText$2$2.L$0 = cVar;
        httpPlainTextKt$HttpPlainText$2$2.L$1 = aVar;
        httpPlainTextKt$HttpPlainText$2$2.L$2 = aVar2;
        return httpPlainTextKt$HttpPlainText$2$2.invokeSuspend(r.f5635a);
    }

    @Override // sn.s
    public /* bridge */ /* synthetic */ Object invoke(l lVar, dl.c cVar, io.ktor.utils.io.a aVar, rl.a aVar2, hn.c<? super Object> cVar2) {
        return invoke2(lVar, cVar, aVar, aVar2, (hn.c<Object>) cVar2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dl.c cVar;
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            dl.c cVar2 = (dl.c) this.L$0;
            io.ktor.utils.io.a aVar = (io.ktor.utils.io.a) this.L$1;
            if (!p.f(((rl.a) this.L$2).getType(), t.b(String.class))) {
                return null;
            }
            this.L$0 = cVar2;
            this.L$1 = null;
            this.label = 1;
            Object objL = ByteReadChannelOperationsKt.l(aVar, this);
            if (objL == objG) {
                return objG;
            }
            cVar = cVar2;
            obj = objL;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (dl.c) this.L$0;
            kotlin.c.b(obj);
        }
        return HttpPlainTextKt.d(this.$responseCharsetFallback, cVar.L(), (no.r) obj);
    }
}
