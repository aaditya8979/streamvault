package io.ktor.client.plugins;

import bn.r;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.w;
import sn.q;

/* JADX INFO: compiled from: DefaultTransform.kt */
/* JADX INFO: loaded from: classes3.dex */
@d(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", f = "DefaultTransform.kt", l = {72, 76, 76, 81, 81, 85, 92, 116, 121, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "invokeSuspend")
public final class DefaultTransformKt$defaultTransformers$2 extends SuspendLambda implements q<ql.c<dl.d, HttpClientCall>, dl.d, hn.c<? super r>, Object> {
    public final /* synthetic */ HttpClient $this_defaultTransformers;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformKt$defaultTransformers$2(HttpClient httpClient, hn.c<? super DefaultTransformKt$defaultTransformers$2> cVar) {
        super(3, cVar);
        this.$this_defaultTransformers = httpClient;
    }

    public static final r e(w wVar, Throwable th2) {
        wVar.complete();
        return r.f5635a;
    }

    @Override // sn.q
    public final Object invoke(ql.c<dl.d, HttpClientCall> cVar, dl.d dVar, hn.c<? super r> cVar2) {
        DefaultTransformKt$defaultTransformers$2 defaultTransformKt$defaultTransformers$2 = new DefaultTransformKt$defaultTransformers$2(this.$this_defaultTransformers, cVar2);
        defaultTransformKt$defaultTransformers$2.L$0 = cVar;
        defaultTransformKt$defaultTransformers$2.L$1 = dVar;
        return defaultTransformKt$defaultTransformers$2.invokeSuspend(r.f5635a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0337 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0340  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
