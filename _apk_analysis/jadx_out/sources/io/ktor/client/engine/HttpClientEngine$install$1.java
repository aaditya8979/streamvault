package io.ktor.client.engine;

import bn.r;
import cl.e;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.engine.HttpClientEngine;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.g;
import p000do.t1;
import ql.c;
import sn.l;
import sn.q;
import tn.t;
import xk.h;

/* JADX INFO: compiled from: HttpClientEngine.kt */
/* JADX INFO: loaded from: classes9.dex */
@d(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", l = {154, 166}, m = "invokeSuspend")
public final class HttpClientEngine$install$1 extends SuspendLambda implements q<c<Object, cl.d>, Object, hn.c<? super r>, Object> {
    public final /* synthetic */ HttpClient $client;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ HttpClientEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientEngine$install$1(HttpClient httpClient, HttpClientEngine httpClientEngine, hn.c<? super HttpClientEngine$install$1> cVar) {
        super(3, cVar);
        this.$client = httpClient;
        this.this$0 = httpClientEngine;
    }

    public static final r e(HttpClient httpClient, dl.c cVar, Throwable th2) {
        if (th2 != null) {
            httpClient.l().a(el.a.c(), cVar);
        }
        return r.f5635a;
    }

    @Override // sn.q
    public final Object invoke(c<Object, cl.d> cVar, Object obj, hn.c<? super r> cVar2) {
        HttpClientEngine$install$1 httpClientEngine$install$1 = new HttpClientEngine$install$1(this.$client, this.this$0, cVar2);
        httpClientEngine$install$1.L$0 = cVar;
        httpClientEngine$install$1.L$1 = obj;
        return httpClientEngine$install$1.invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        KType kTypeM;
        e eVarB;
        KType kTypeM2;
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            cVar = (c) this.L$0;
            Object obj2 = this.L$1;
            cl.d dVar = new cl.d();
            dVar.q((cl.d) cVar.getContext());
            if (obj2 == null) {
                dVar.j(jl.b.f72484a);
                KClass kClassB = t.b(Object.class);
                try {
                    kTypeM2 = t.m(Object.class);
                } catch (Throwable unused) {
                    kTypeM2 = null;
                }
                dVar.k(new rl.a(kClassB, kTypeM2));
            } else if (obj2 instanceof jl.c) {
                dVar.j(obj2);
                dVar.k(null);
            } else {
                dVar.j(obj2);
                KClass kClassB2 = t.b(Object.class);
                try {
                    kTypeM = t.m(Object.class);
                } catch (Throwable unused2) {
                    kTypeM = null;
                }
                dVar.k(new rl.a(kClassB2, kTypeM));
            }
            this.$client.l().a(el.a.b(), dVar);
            eVarB = dVar.b();
            eVarB.a().f(h.c(), this.$client.k());
            h.d(eVarB);
            HttpClientEngine.DefaultImpls.d(this.this$0, eVarB);
            HttpClientEngine httpClientEngine = this.this$0;
            this.L$0 = cVar;
            this.L$1 = eVarB;
            this.label = 1;
            obj = HttpClientEngine.DefaultImpls.e(httpClientEngine, eVarB, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return r.f5635a;
            }
            eVarB = (e) this.L$1;
            cVar = (c) this.L$0;
            kotlin.c.b(obj);
        }
        HttpClientCall httpClientCall = new HttpClientCall(this.$client, eVarB, (cl.h) obj);
        final dl.c cVarE = httpClientCall.e();
        this.$client.l().a(el.a.e(), cVarE);
        g gVarM = t1.m(cVarE.getCoroutineContext());
        final HttpClient httpClient = this.$client;
        gVarM.f(new l() { // from class: io.ktor.client.engine.a
            @Override // sn.l
            public final Object invoke(Object obj3) {
                return HttpClientEngine$install$1.e(httpClient, cVarE, (Throwable) obj3);
            }
        });
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (cVar.d(httpClientCall, this) == objG) {
            return objG;
        }
        return r.f5635a;
    }
}
