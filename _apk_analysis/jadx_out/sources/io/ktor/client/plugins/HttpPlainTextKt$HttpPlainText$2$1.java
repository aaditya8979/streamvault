package io.ktor.client.plugins;

import bn.r;
import gl.f;
import gl.w;
import java.nio.charset.Charset;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: HttpPlainText.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1", f = "HttpPlainText.kt", l = {}, m = "invokeSuspend")
public final class HttpPlainTextKt$HttpPlainText$2$1 extends SuspendLambda implements q<cl.d, Object, hn.c<? super jl.c>, Object> {
    public final /* synthetic */ String $acceptCharsetHeader;
    public final /* synthetic */ Charset $requestCharset;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainTextKt$HttpPlainText$2$1(String str, Charset charset, hn.c<? super HttpPlainTextKt$HttpPlainText$2$1> cVar) {
        super(3, cVar);
        this.$acceptCharsetHeader = str;
        this.$requestCharset = charset;
    }

    @Override // sn.q
    public final Object invoke(cl.d dVar, Object obj, hn.c<? super jl.c> cVar) {
        HttpPlainTextKt$HttpPlainText$2$1 httpPlainTextKt$HttpPlainText$2$1 = new HttpPlainTextKt$HttpPlainText$2$1(this.$acceptCharsetHeader, this.$requestCharset, cVar);
        httpPlainTextKt$HttpPlainText$2$1.L$0 = dVar;
        httpPlainTextKt$HttpPlainText$2$1.L$1 = obj;
        return httpPlainTextKt$HttpPlainText$2$1.invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        cl.d dVar = (cl.d) this.L$0;
        Object obj2 = this.L$1;
        HttpPlainTextKt.c(this.$acceptCharsetHeader, dVar);
        if (!(obj2 instanceof String)) {
            return null;
        }
        f fVarD = w.d(dVar);
        if (fVarD == null || p.f(fVarD.e(), f.d.f62534a.a().e())) {
            return HttpPlainTextKt.e(this.$requestCharset, dVar, (String) obj2, fVarD);
        }
        return null;
    }
}
