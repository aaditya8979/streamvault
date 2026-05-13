package io.ktor.client.plugins;

import bn.r;
import jn.d;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import p000do.j2;
import p000do.w;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: HttpRequestLifecycle.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "io.ktor.client.plugins.HttpRequestLifecycleKt$HttpRequestLifecycle$1$1", f = "HttpRequestLifecycle.kt", l = {29}, m = "invokeSuspend")
public final class HttpRequestLifecycleKt$HttpRequestLifecycle$1$1 extends SuspendLambda implements q<cl.d, l<? super hn.c<? super r>, ? extends Object>, hn.c<? super r>, Object> {
    public final /* synthetic */ al.d<r> $this_createClientPlugin;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(al.d<r> dVar, hn.c<? super HttpRequestLifecycleKt$HttpRequestLifecycle$1$1> cVar) {
        super(3, cVar);
        this.$this_createClientPlugin = dVar;
    }

    @Override // sn.q
    public final Object invoke(cl.d dVar, l<? super hn.c<? super r>, ? extends Object> lVar, hn.c<? super r> cVar) {
        HttpRequestLifecycleKt$HttpRequestLifecycle$1$1 httpRequestLifecycleKt$HttpRequestLifecycle$1$1 = new HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(this.$this_createClientPlugin, cVar);
        httpRequestLifecycleKt$HttpRequestLifecycle$1$1.L$0 = dVar;
        httpRequestLifecycleKt$HttpRequestLifecycle$1$1.L$1 = lVar;
        return httpRequestLifecycleKt$HttpRequestLifecycle$1$1.invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        w wVar;
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = (w) this.L$0;
            try {
                kotlin.c.b(obj);
                wVar.complete();
                return r.f5635a;
            } catch (Throwable th2) {
                th = th2;
                try {
                    wVar.b(th);
                    throw th;
                } catch (Throwable th3) {
                    wVar.complete();
                    throw th3;
                }
            }
        }
        kotlin.c.b(obj);
        cl.d dVar = (cl.d) this.L$0;
        l lVar = (l) this.L$1;
        w wVarA = j2.a(dVar.g());
        d.b bVar = this.$this_createClientPlugin.b().getCoroutineContext().get(g.H8);
        p.h(bVar);
        HttpRequestLifecycleKt.f(wVarA, (g) bVar);
        try {
            dVar.n(wVarA);
            this.L$0 = wVarA;
            this.label = 1;
            if (lVar.invoke(this) == objG) {
                return objG;
            }
            wVar = wVarA;
            wVar.complete();
            return r.f5635a;
        } catch (Throwable th4) {
            th = th4;
            wVar = wVarA;
            wVar.b(th);
            throw th;
        }
    }
}
