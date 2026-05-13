package io.ktor.client.plugins;

import al.i;
import bn.r;
import cl.d;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.plugins.HttpRequestRetryKt;
import io.ktor.client.plugins.api.Send;
import io.ktor.utils.io.a;
import java.net.SocketTimeoutException;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import p000do.w;
import sn.l;
import sn.p;
import sn.q;
import tn.t;
import zk.b0;
import zk.c0;
import zk.d0;
import zk.e0;

/* JADX INFO: compiled from: HttpRequestRetry.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class HttpRequestRetryKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final rs.c f71133a = pl.a.a("io.ktor.client.plugins.HttpRequestRetry");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final fl.a<c0> f71134b = new fl.a<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final al.b<HttpRequestRetryConfig> f71135c = i.b("RetryFeature", HttpRequestRetryKt$HttpRequestRetry$1.INSTANCE, new l() { // from class: zk.z
        @Override // sn.l
        public final Object invoke(Object obj) {
            return HttpRequestRetryKt.c((al.d) obj);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final kl.a<Integer> f71136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final kl.a<q<e0, cl.b, dl.c, Boolean>> f71137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final kl.a<q<e0, d, Throwable, Boolean>> f71138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final kl.a<p<d0, d, r>> f71139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final kl.a<p<b0, Integer, Long>> f71140h;

    static {
        KType kTypeM;
        KType kTypeP;
        KType kTypeP2;
        KType kTypeP3;
        KClass kClassB = t.b(Integer.class);
        KType kTypeP4 = null;
        try {
            kTypeM = t.m(Integer.TYPE);
        } catch (Throwable unused) {
            kTypeM = null;
        }
        f71136d = new kl.a<>("MaxRetriesPerRequestAttributeKey", new rl.a(kClassB, kTypeM));
        KClass kClassB2 = t.b(q.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.Companion;
            kTypeP = t.p(q.class, companion.invariant(t.m(e0.class)), companion.invariant(t.m(cl.b.class)), companion.invariant(t.m(dl.c.class)), companion.invariant(t.m(Boolean.TYPE)));
        } catch (Throwable unused2) {
            kTypeP = null;
        }
        f71137e = new kl.a<>("ShouldRetryPerRequestAttributeKey", new rl.a(kClassB2, kTypeP));
        KClass kClassB3 = t.b(q.class);
        try {
            KTypeProjection.Companion companion2 = KTypeProjection.Companion;
            kTypeP2 = t.p(q.class, companion2.invariant(t.m(e0.class)), companion2.invariant(t.m(d.class)), companion2.invariant(t.m(Throwable.class)), companion2.invariant(t.m(Boolean.TYPE)));
        } catch (Throwable unused3) {
            kTypeP2 = null;
        }
        f71138f = new kl.a<>("ShouldRetryOnExceptionPerRequestAttributeKey", new rl.a(kClassB3, kTypeP2));
        KClass kClassB4 = t.b(p.class);
        try {
            KTypeProjection.Companion companion3 = KTypeProjection.Companion;
            kTypeP3 = t.p(p.class, companion3.invariant(t.m(d0.class)), companion3.invariant(t.m(d.class)), companion3.invariant(t.m(r.class)));
        } catch (Throwable unused4) {
            kTypeP3 = null;
        }
        f71139g = new kl.a<>("ModifyRequestPerRequestAttributeKey", new rl.a(kClassB4, kTypeP3));
        KClass kClassB5 = t.b(p.class);
        try {
            KTypeProjection.Companion companion4 = KTypeProjection.Companion;
            kTypeP4 = t.p(p.class, companion4.invariant(t.m(b0.class)), companion4.invariant(t.m(Integer.TYPE)), companion4.invariant(t.m(Long.TYPE)));
        } catch (Throwable unused5) {
        }
        f71140h = new kl.a<>("RetryDelayPerRequestAttributeKey", new rl.a(kClassB5, kTypeP4));
    }

    public static final r c(al.d dVar) {
        tn.p.k(dVar, "$this$createClientPlugin");
        q<e0, cl.b, dl.c, Boolean> qVarP = ((HttpRequestRetryConfig) dVar.e()).p();
        q<e0, d, Throwable, Boolean> qVarQ = ((HttpRequestRetryConfig) dVar.e()).q();
        p<b0, Integer, Long> pVarM = ((HttpRequestRetryConfig) dVar.e()).m();
        p<Long, hn.c<? super r>, Object> pVarL = ((HttpRequestRetryConfig) dVar.e()).l();
        dVar.f(Send.f71163a, new HttpRequestRetryKt$HttpRequestRetry$2$1(qVarP, qVarQ, ((HttpRequestRetryConfig) dVar.e()).n(), pVarM, ((HttpRequestRetryConfig) dVar.e()).o(), dVar, pVarL, null));
        return r.f5635a;
    }

    public static final d d(d dVar) {
        final d dVarP = new d().p(dVar);
        dVar.g().f(new l() { // from class: zk.a0
            @Override // sn.l
            public final Object invoke(Object obj) {
                return HttpRequestRetryKt.e(dVarP, (Throwable) obj);
            }
        });
        return dVarP;
    }

    public static final r e(d dVar, Throwable th2) {
        g gVarG = dVar.g();
        tn.p.i(gVarG, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        w wVar = (w) gVarG;
        if (th2 == null) {
            wVar.complete();
        } else {
            wVar.b(th2);
        }
        return r.f5635a;
    }

    public static final boolean f(int i10, int i11, q<? super e0, ? super cl.b, ? super dl.c, Boolean> qVar, HttpClientCall httpClientCall) {
        return i10 < i11 && qVar.invoke(new e0(i10 + 1), httpClientCall.d(), httpClientCall.e()).booleanValue();
    }

    public static final boolean g(int i10, int i11, q<? super e0, ? super d, ? super Throwable, Boolean> qVar, d dVar, Throwable th2) {
        return i10 < i11 && qVar.invoke(new e0(i10 + 1), dVar, th2).booleanValue();
    }

    @NotNull
    public static final al.b<HttpRequestRetryConfig> s() {
        return f71135c;
    }

    @NotNull
    public static final fl.a<c0> t() {
        return f71134b;
    }

    public static final boolean u(Throwable th2) {
        Throwable thA = el.c.a(th2);
        return (thA instanceof HttpRequestTimeoutException) || (thA instanceof ConnectTimeoutException) || (thA instanceof SocketTimeoutException);
    }

    public static final void v(@NotNull d dVar, @NotNull l<? super HttpRequestRetryConfig, r> lVar) {
        tn.p.k(dVar, "<this>");
        tn.p.k(lVar, "block");
        HttpRequestRetryConfig httpRequestRetryConfig = new HttpRequestRetryConfig();
        lVar.invoke(httpRequestRetryConfig);
        dVar.c().f(f71137e, httpRequestRetryConfig.p());
        dVar.c().f(f71138f, httpRequestRetryConfig.q());
        dVar.c().f(f71140h, httpRequestRetryConfig.m());
        dVar.c().f(f71136d, Integer.valueOf(httpRequestRetryConfig.n()));
        dVar.c().f(f71139g, httpRequestRetryConfig.o());
    }

    public static final Object w(dl.c cVar, hn.c<? super Boolean> cVar2) {
        return DoubleReceivePluginKt.l(cVar) ? a.b.a(cVar.a(), 0, cVar2, 1, null) : jn.a.a(false);
    }
}
