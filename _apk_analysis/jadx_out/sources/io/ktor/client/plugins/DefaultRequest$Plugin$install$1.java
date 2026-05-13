package io.ktor.client.plugins;

import bn.r;
import gl.m;
import gl.s;
import io.ktor.client.plugins.DefaultRequest;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn.d;
import kl.y;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: DefaultRequest.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "io.ktor.client.plugins.DefaultRequest$Plugin$install$1", f = "DefaultRequest.kt", l = {}, m = "invokeSuspend")
public final class DefaultRequest$Plugin$install$1 extends SuspendLambda implements q<ql.c<Object, cl.d>, Object, hn.c<? super r>, Object> {
    public final /* synthetic */ DefaultRequest $plugin;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultRequest$Plugin$install$1(DefaultRequest defaultRequest, hn.c<? super DefaultRequest$Plugin$install$1> cVar) {
        super(3, cVar);
        this.$plugin = defaultRequest;
    }

    @Override // sn.q
    public final Object invoke(ql.c<Object, cl.d> cVar, Object obj, hn.c<? super r> cVar2) {
        DefaultRequest$Plugin$install$1 defaultRequest$Plugin$install$1 = new DefaultRequest$Plugin$install$1(this.$plugin, cVar2);
        defaultRequest$Plugin$install$1.L$0 = cVar;
        return defaultRequest$Plugin$install$1.invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        ql.c cVar = (ql.c) this.L$0;
        String string = ((cl.d) cVar.getContext()).i().toString();
        DefaultRequest.a aVar = new DefaultRequest.a();
        DefaultRequest defaultRequest = this.$plugin;
        y.c(aVar.getHeaders(), ((cl.d) cVar.getContext()).getHeaders());
        m mVarP = aVar.getHeaders().p();
        defaultRequest.f71089a.invoke(aVar);
        Iterator<T> it = mVarP.entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            List<String> listA = aVar.getHeaders().a(str);
            if (listA == null) {
                aVar.getHeaders().c(str, list);
            } else if (!p.f(listA, list) && !p.f(str, s.f62569a.j())) {
                aVar.getHeaders().l(str);
                aVar.getHeaders().c(str, list);
                aVar.getHeaders().h(str, listA);
            }
        }
        DefaultRequest.f71087b.f(aVar.b().b(), ((cl.d) cVar.getContext()).i());
        for (kl.a<?> aVar2 : aVar.a().d()) {
            if (!((cl.d) cVar.getContext()).c().g(aVar2)) {
                kl.b bVarC = ((cl.d) cVar.getContext()).c();
                p.i(aVar2, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                bVarC.f(aVar2, aVar.a().a(aVar2));
            }
        }
        ((cl.d) cVar.getContext()).getHeaders().clear();
        ((cl.d) cVar.getContext()).getHeaders().d(aVar.getHeaders().p());
        a.f71161a.trace("Applied DefaultRequest to " + string + ". New url: " + ((cl.d) cVar.getContext()).i());
        return r.f5635a;
    }
}
