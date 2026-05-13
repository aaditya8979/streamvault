package io.ktor.client.plugins;

import al.k;
import cl.l;
import gl.s;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.r;

/* JADX INFO: compiled from: UserAgent.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "io.ktor.client.plugins.UserAgentKt$UserAgent$3$1", f = "UserAgent.kt", l = {}, m = "invokeSuspend")
public final class UserAgentKt$UserAgent$3$1 extends SuspendLambda implements r<k, cl.d, Object, hn.c<? super bn.r>, Object> {
    public final /* synthetic */ String $agent;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentKt$UserAgent$3$1(String str, hn.c<? super UserAgentKt$UserAgent$3$1> cVar) {
        super(4, cVar);
        this.$agent = str;
    }

    @Override // sn.r
    public final Object invoke(k kVar, cl.d dVar, Object obj, hn.c<? super bn.r> cVar) {
        UserAgentKt$UserAgent$3$1 userAgentKt$UserAgent$3$1 = new UserAgentKt$UserAgent$3$1(this.$agent, cVar);
        userAgentKt$UserAgent$3$1.L$0 = dVar;
        return userAgentKt$UserAgent$3$1.invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        cl.d dVar = (cl.d) this.L$0;
        UserAgentKt.f71159a.trace("Adding User-Agent header: agent for " + dVar.i());
        l.a(dVar, s.f62569a.x(), this.$agent);
        return bn.r.f5635a;
    }
}
