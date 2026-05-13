package io.ktor.client.plugins;

import bn.r;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.Send;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.p;
import sn.q;
import zk.b0;
import zk.d0;
import zk.e0;

/* JADX INFO: compiled from: HttpRequestRetry.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1", f = "HttpRequestRetry.kt", l = {352, 355, 371}, m = "invokeSuspend")
public final class HttpRequestRetryKt$HttpRequestRetry$2$1 extends SuspendLambda implements q<Send.a, cl.d, hn.c<? super HttpClientCall>, Object> {
    public final /* synthetic */ p<Long, hn.c<? super r>, Object> $delay;
    public final /* synthetic */ p<b0, Integer, Long> $delayMillis;
    public final /* synthetic */ int $maxRetries;
    public final /* synthetic */ p<d0, cl.d, r> $modifyRequest;
    public final /* synthetic */ q<e0, cl.b, dl.c, Boolean> $shouldRetry;
    public final /* synthetic */ q<e0, cl.d, Throwable, Boolean> $shouldRetryOnException;
    public final /* synthetic */ al.d<HttpRequestRetryConfig> $this_createClientPlugin;
    public int I$0;
    public int I$1;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequestRetryKt$HttpRequestRetry$2$1(q<? super e0, ? super cl.b, ? super dl.c, Boolean> qVar, q<? super e0, ? super cl.d, ? super Throwable, Boolean> qVar2, int i10, p<? super b0, ? super Integer, Long> pVar, p<? super d0, ? super cl.d, r> pVar2, al.d<HttpRequestRetryConfig> dVar, p<? super Long, ? super hn.c<? super r>, ? extends Object> pVar3, hn.c<? super HttpRequestRetryKt$HttpRequestRetry$2$1> cVar) {
        super(3, cVar);
        this.$shouldRetry = qVar;
        this.$shouldRetryOnException = qVar2;
        this.$maxRetries = i10;
        this.$delayMillis = pVar;
        this.$modifyRequest = pVar2;
        this.$this_createClientPlugin = dVar;
        this.$delay = pVar3;
    }

    @Override // sn.q
    public final Object invoke(Send.a aVar, cl.d dVar, hn.c<? super HttpClientCall> cVar) {
        HttpRequestRetryKt$HttpRequestRetry$2$1 httpRequestRetryKt$HttpRequestRetry$2$1 = new HttpRequestRetryKt$HttpRequestRetry$2$1(this.$shouldRetry, this.$shouldRetryOnException, this.$maxRetries, this.$delayMillis, this.$modifyRequest, this.$this_createClientPlugin, this.$delay, cVar);
        httpRequestRetryKt$HttpRequestRetry$2$1.L$0 = aVar;
        httpRequestRetryKt$HttpRequestRetry$2$1.L$1 = dVar;
        return httpRequestRetryKt$HttpRequestRetry$2$1.invokeSuspend(r.f5635a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:76|37|78|38) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ae, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016f A[Catch: all -> 0x01ab, TRY_LEAVE, TryCatch #2 {all -> 0x01ab, blocks: (B:46:0x0167, B:48:0x016f), top: B:74:0x0167 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0212 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11, types: [io.ktor.client.plugins.api.Send$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [hn.c, io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [hn.c, io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
