package io.ktor.client;

import bn.r;
import cl.g;
import cl.i;
import dl.b;
import dl.e;
import in.a;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.plugins.BodyProgressKt;
import io.ktor.client.plugins.DefaultResponseValidationKt;
import io.ktor.client.plugins.DefaultTransformKt;
import io.ktor.client.plugins.DoubleReceivePluginKt;
import io.ktor.client.plugins.HttpCallValidatorKt;
import io.ktor.client.plugins.HttpPlainTextKt;
import io.ktor.client.plugins.HttpRedirectKt;
import io.ktor.client.plugins.HttpRequestLifecycleKt;
import io.ktor.client.plugins.HttpSend;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import p000do.l0;
import p000do.t1;
import p000do.w;
import ql.c;
import sn.l;
import sn.q;
import tn.p;
import tn.t;
import uk.h;
import xk.f;
import zk.m;

/* JADX INFO: compiled from: HttpClient.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class HttpClient implements l0, Closeable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f71047o = AtomicIntegerFieldUpdater.newUpdater(HttpClient.class, "closed");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HttpClientEngine f71048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h<? extends f> f71049c;

    @NotNull
    private volatile /* synthetic */ int closed;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f71050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final w f71051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final d f71052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final g f71053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final e f71054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final i f71055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final b f71056j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final kl.b f71057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final f f71058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final fl.b f71059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final h<f> f71060n;

    /* JADX INFO: renamed from: io.ktor.client.HttpClient$2, reason: invalid class name */
    /* JADX INFO: compiled from: HttpClient.kt */
    @jn.d(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", l = {1370, 1372}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements q<c<Object, cl.d>, Object, hn.c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass2(hn.c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        @Override // sn.q
        public final Object invoke(c<Object, cl.d> cVar, Object obj, hn.c<? super r> cVar2) {
            AnonymousClass2 anonymousClass2 = HttpClient.this.new AnonymousClass2(cVar2);
            anonymousClass2.L$0 = cVar;
            anonymousClass2.L$1 = obj;
            return anonymousClass2.invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            c cVar;
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                c cVar2 = (c) this.L$0;
                obj2 = this.L$1;
                if (!(obj2 instanceof HttpClientCall)) {
                    throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + t.b(obj2.getClass()) + ").").toString());
                }
                b bVarM = HttpClient.this.m();
                r rVar = r.f5635a;
                dl.c cVarE = ((HttpClientCall) obj2).e();
                this.L$0 = cVar2;
                this.L$1 = obj2;
                this.label = 1;
                Object objD = bVarM.d(rVar, cVarE, this);
                if (objD == objG) {
                    return objG;
                }
                cVar = cVar2;
                obj = objD;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    return r.f5635a;
                }
                obj2 = this.L$1;
                cVar = (c) this.L$0;
                kotlin.c.b(obj);
            }
            ((HttpClientCall) obj2).l((dl.c) obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (cVar.d(obj2, this) == objG) {
                return objG;
            }
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.HttpClient$4, reason: invalid class name */
    /* JADX INFO: compiled from: HttpClient.kt */
    @jn.d(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", l = {1404}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends SuspendLambda implements q<c<dl.d, HttpClientCall>, dl.d, hn.c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass4(hn.c<? super AnonymousClass4> cVar) {
            super(3, cVar);
        }

        @Override // sn.q
        public final Object invoke(c<dl.d, HttpClientCall> cVar, dl.d dVar, hn.c<? super r> cVar2) {
            AnonymousClass4 anonymousClass4 = HttpClient.this.new AnonymousClass4(cVar2);
            anonymousClass4.L$0 = cVar;
            return anonymousClass4.invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            c cVar;
            Throwable th2;
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                c cVar2 = (c) this.L$0;
                try {
                    this.L$0 = cVar2;
                    this.label = 1;
                    Object objC = cVar2.c(this);
                    if (objC == objG) {
                        return objG;
                    }
                    cVar = cVar2;
                    obj = objC;
                } catch (Throwable th3) {
                    cVar = cVar2;
                    th2 = th3;
                    HttpClient.this.l().a(el.a.d(), new el.e(((HttpClientCall) cVar.getContext()).e(), th2));
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) this.L$0;
                try {
                    kotlin.c.b(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    HttpClient.this.l().a(el.a.d(), new el.e(((HttpClientCall) cVar.getContext()).e(), th2));
                    throw th2;
                }
            }
            return r.f5635a;
        }
    }

    public HttpClient(@NotNull HttpClientEngine httpClientEngine, @NotNull h<? extends f> hVar) {
        p.k(httpClientEngine, "engine");
        p.k(hVar, "userConfig");
        this.f71048b = httpClientEngine;
        this.f71049c = hVar;
        boolean z10 = false;
        this.closed = 0;
        w wVarA = t1.a((kotlinx.coroutines.g) httpClientEngine.getCoroutineContext().get(kotlinx.coroutines.g.H8));
        this.f71051e = wVarA;
        this.f71052f = httpClientEngine.getCoroutineContext().plus(wVarA);
        int i10 = 1;
        tn.i iVar = null;
        this.f71053g = new g(z10, i10, iVar);
        e eVar = new e(z10, i10, iVar);
        this.f71054h = eVar;
        i iVar2 = new i(z10, i10, iVar);
        this.f71055i = iVar2;
        this.f71056j = new b(z10, i10, iVar);
        this.f71057k = kl.d.a(true);
        this.f71058l = httpClientEngine.getConfig();
        this.f71059m = new fl.b();
        h<f> hVar2 = new h<>();
        this.f71060n = hVar2;
        if (this.f71050d) {
            wVarA.f(new l() { // from class: uk.a
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return HttpClient.c(this.f85712b, (Throwable) obj);
                }
            });
        }
        httpClientEngine.z(this);
        iVar2.l(i.f6719h.b(), new AnonymousClass2(null));
        h.n(hVar2, HttpRequestLifecycleKt.i(), null, 2, null);
        h.n(hVar2, BodyProgressKt.f(), null, 2, null);
        h.n(hVar2, DoubleReceivePluginKt.k(), null, 2, null);
        if (hVar.j()) {
            hVar2.l("DefaultTransformers", new l() { // from class: uk.b
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return HttpClient.w((HttpClient) obj);
                }
            });
        }
        h.n(hVar2, HttpSend.f71141c, null, 2, null);
        h.n(hVar2, HttpCallValidatorKt.k(), null, 2, null);
        if (hVar.i()) {
            h.n(hVar2, HttpRedirectKt.f(), null, 2, null);
        }
        hVar2.s(hVar);
        if (hVar.j()) {
            h.n(hVar2, HttpPlainTextKt.i(), null, 2, null);
        }
        DefaultResponseValidationKt.d(hVar2);
        hVar2.k(this);
        eVar.l(e.f59815h.b(), new AnonymousClass4(null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpClient(@NotNull HttpClientEngine httpClientEngine, @NotNull h<? extends f> hVar, boolean z10) {
        this(httpClientEngine, hVar);
        p.k(httpClientEngine, "engine");
        p.k(hVar, "userConfig");
        this.f71050d = z10;
    }

    public static final r c(HttpClient httpClient, Throwable th2) {
        if (th2 != null) {
            kotlinx.coroutines.d.e(httpClient.f71048b, null, 1, null);
        }
        return r.f5635a;
    }

    public static final r w(HttpClient httpClient) {
        p.k(httpClient, "$this$install");
        DefaultTransformKt.b(httpClient);
        return r.f5635a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        if (f71047o.compareAndSet(this, 0, 1)) {
            kl.b bVar = (kl.b) this.f71057k.a(m.a());
            Iterator<T> it = bVar.d().iterator();
            while (it.hasNext()) {
                kl.a aVar = (kl.a) it.next();
                p.i(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object objA = bVar.a(aVar);
                if (objA instanceof AutoCloseable) {
                    ((AutoCloseable) objA).close();
                }
            }
            this.f71051e.complete();
            if (this.f71050d) {
                this.f71048b.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull cl.d r5, @org.jetbrains.annotations.NotNull hn.c<? super io.ktor.client.call.HttpClientCall> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.HttpClient$execute$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.HttpClient$execute$1 r0 = (io.ktor.client.HttpClient$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.HttpClient$execute$1 r0 = new io.ktor.client.HttpClient$execute$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.c.b(r6)
            fl.b r6 = r4.f71059m
            fl.a r2 = el.a.a()
            r6.a(r2, r5)
            cl.g r6 = r4.f71053g
            java.lang.Object r2 = r5.d()
            r0.label = r3
            java.lang.Object r6 = r6.d(r5, r2, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.lang.String r5 = "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall"
            tn.p.i(r6, r5)
            io.ktor.client.call.HttpClientCall r6 = (io.ktor.client.call.HttpClientCall) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.HttpClient.d(cl.d, hn.c):java.lang.Object");
    }

    @NotNull
    public final kl.b getAttributes() {
        return this.f71057k;
    }

    @Override // p000do.l0
    @NotNull
    public d getCoroutineContext() {
        return this.f71052f;
    }

    @NotNull
    public final h<f> k() {
        return this.f71060n;
    }

    @NotNull
    public final fl.b l() {
        return this.f71059m;
    }

    @NotNull
    public final b m() {
        return this.f71056j;
    }

    @NotNull
    public final g n() {
        return this.f71053g;
    }

    @NotNull
    public final e o() {
        return this.f71054h;
    }

    @NotNull
    public final i t() {
        return this.f71055i;
    }

    @NotNull
    public String toString() {
        return "HttpClient[" + this.f71048b + ']';
    }
}
