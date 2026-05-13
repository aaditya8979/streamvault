package io.ktor.client.plugins;

import bn.r;
import bo.t;
import cn.f0;
import gl.v;
import gl.w;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpSend;
import java.util.Iterator;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import sn.q;
import zk.l0;

/* JADX INFO: compiled from: HttpSend.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", l = {98, 99}, m = "invokeSuspend")
public final class HttpSend$Plugin$install$1 extends SuspendLambda implements q<ql.c<Object, cl.d>, Object, hn.c<? super r>, Object> {
    public final /* synthetic */ HttpSend $plugin;
    public final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpSend$Plugin$install$1(HttpSend httpSend, HttpClient httpClient, hn.c<? super HttpSend$Plugin$install$1> cVar) {
        super(3, cVar);
        this.$plugin = httpSend;
        this.$scope = httpClient;
    }

    @Override // sn.q
    public final Object invoke(ql.c<Object, cl.d> cVar, Object obj, hn.c<? super r> cVar2) {
        HttpSend$Plugin$install$1 httpSend$Plugin$install$1 = new HttpSend$Plugin$install$1(this.$plugin, this.$scope, cVar2);
        httpSend$Plugin$install$1.L$0 = cVar;
        httpSend$Plugin$install$1.L$1 = obj;
        return httpSend$Plugin$install$1.invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KType kTypeM;
        ql.c cVar;
        KType kTypeM2;
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            ql.c cVar2 = (ql.c) this.L$0;
            Object obj2 = this.L$1;
            if (!(obj2 instanceof jl.c)) {
                throw new IllegalStateException(t.l("\n|Fail to prepare request body for sending. \n|The body type is: " + tn.t.b(obj2.getClass()) + ", with Content-Type: " + w.d((v) cVar2.getContext()) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.", null, 1, null).toString());
            }
            cl.d dVar = (cl.d) cVar2.getContext();
            if (obj2 == null) {
                dVar.j(jl.b.f72484a);
                KClass kClassB = tn.t.b(jl.c.class);
                try {
                    kTypeM2 = tn.t.m(jl.c.class);
                } catch (Throwable unused) {
                    kTypeM2 = null;
                }
                dVar.k(new rl.a(kClassB, kTypeM2));
            } else if (obj2 instanceof jl.c) {
                dVar.j(obj2);
                dVar.k(null);
            } else {
                dVar.j(obj2);
                KClass kClassB2 = tn.t.b(jl.c.class);
                try {
                    kTypeM = tn.t.m(jl.c.class);
                } catch (Throwable unused2) {
                    kTypeM = null;
                }
                dVar.k(new rl.a(kClassB2, kTypeM));
            }
            l0 defaultSender = new HttpSend.DefaultSender(this.$plugin.f71143a, this.$scope);
            Iterator it = f0.R0(this.$plugin.f71144b).iterator();
            while (it.hasNext()) {
                defaultSender = new HttpSend.b((q) it.next(), defaultSender);
            }
            cl.d dVar2 = (cl.d) cVar2.getContext();
            this.L$0 = cVar2;
            this.label = 1;
            Object objA = defaultSender.a(dVar2, this);
            if (objA == objG) {
                return objG;
            }
            cVar = cVar2;
            obj = objA;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return r.f5635a;
            }
            cVar = (ql.c) this.L$0;
            kotlin.c.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (cVar.d((HttpClientCall) obj, this) == objG) {
            return objG;
        }
        return r.f5635a;
    }
}
