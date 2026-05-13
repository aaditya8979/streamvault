package io.ktor.client.plugins;

import bn.r;
import cl.d;
import cl.g;
import com.ironsource.Q6;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;
import tn.i;
import tn.p;
import tn.t;
import zk.l;
import zk.l0;

/* JADX INFO: compiled from: HttpSend.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class HttpSend {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Plugin f71141c = new Plugin(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final kl.a<HttpSend> f71142d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f71143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<q<l0, d, hn.c<? super HttpClientCall>, Object>> f71144b;

    /* JADX INFO: compiled from: HttpSend.kt */
    public static final class DefaultSender implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f71145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final HttpClient f71146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f71147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public HttpClientCall f71148d;

        public DefaultSender(int i10, @NotNull HttpClient httpClient) {
            p.k(httpClient, "client");
            this.f71145a = i10;
            this.f71146b = httpClient;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // zk.l0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@org.jetbrains.annotations.NotNull cl.d r6, @org.jetbrains.annotations.NotNull hn.c<? super io.ktor.client.call.HttpClientCall> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof io.ktor.client.plugins.HttpSend$DefaultSender$execute$1
                if (r0 == 0) goto L13
                r0 = r7
                io.ktor.client.plugins.HttpSend$DefaultSender$execute$1 r0 = (io.ktor.client.plugins.HttpSend$DefaultSender$execute$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                io.ktor.client.plugins.HttpSend$DefaultSender$execute$1 r0 = new io.ktor.client.plugins.HttpSend$DefaultSender$execute$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = in.a.g()
                int r2 = r0.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L32
                if (r2 != r4) goto L2a
                kotlin.c.b(r7)
                goto L58
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                kotlin.c.b(r7)
                io.ktor.client.call.HttpClientCall r7 = r5.f71148d
                if (r7 == 0) goto L3c
                kotlinx.coroutines.d.e(r7, r3, r4, r3)
            L3c:
                int r7 = r5.f71147c
                int r2 = r5.f71145a
                if (r7 >= r2) goto L7f
                int r7 = r7 + r4
                r5.f71147c = r7
                io.ktor.client.HttpClient r7 = r5.f71146b
                cl.i r7 = r7.t()
                java.lang.Object r2 = r6.d()
                r0.label = r4
                java.lang.Object r7 = r7.d(r6, r2, r0)
                if (r7 != r1) goto L58
                return r1
            L58:
                boolean r6 = r7 instanceof io.ktor.client.call.HttpClientCall
                if (r6 == 0) goto L5f
                r3 = r7
                io.ktor.client.call.HttpClientCall r3 = (io.ktor.client.call.HttpClientCall) r3
            L5f:
                if (r3 == 0) goto L64
                r5.f71148d = r3
                return r3
            L64:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to execute send pipeline. Expected [HttpClientCall], but received "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            L7f:
                io.ktor.client.plugins.SendCountExceedException r6 = new io.ktor.client.plugins.SendCountExceedException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Max send count "
                r7.append(r0)
                int r0 = r5.f71145a
                r7.append(r0)
                java.lang.String r0 = " exceeded. Consider increasing the property maxSendCount if more is required."
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpSend.DefaultSender.a(cl.d, hn.c):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: HttpSend.kt */
    public static final class Plugin implements l<a, HttpSend> {
        public Plugin() {
        }

        public /* synthetic */ Plugin(i iVar) {
            this();
        }

        @Override // zk.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(@NotNull HttpSend httpSend, @NotNull HttpClient httpClient) {
            p.k(httpSend, Q6.L);
            p.k(httpClient, "scope");
            httpClient.n().l(g.f6705h.c(), new HttpSend$Plugin$install$1(httpSend, httpClient, null));
        }

        @Override // zk.l
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public HttpSend b(@NotNull sn.l<? super a, r> lVar) {
            p.k(lVar, "block");
            a aVar = new a();
            lVar.invoke(aVar);
            return new HttpSend(aVar.a(), null);
        }

        @Override // zk.l
        @NotNull
        public kl.a<HttpSend> getKey() {
            return HttpSend.f71142d;
        }
    }

    /* JADX INFO: compiled from: HttpSend.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f71149a = 20;

        public final int a() {
            return this.f71149a;
        }
    }

    /* JADX INFO: compiled from: HttpSend.kt */
    public static final class b implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final q<l0, d, hn.c<? super HttpClientCall>, Object> f71150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final l0 f71151b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull q<? super l0, ? super d, ? super hn.c<? super HttpClientCall>, ? extends Object> qVar, @NotNull l0 l0Var) {
            p.k(qVar, "interceptor");
            p.k(l0Var, "nextSender");
            this.f71150a = qVar;
            this.f71151b = l0Var;
        }

        @Override // zk.l0
        @Nullable
        public Object a(@NotNull d dVar, @NotNull hn.c<? super HttpClientCall> cVar) {
            return this.f71150a.invoke(this.f71151b, dVar, cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        KType kTypeM = null;
        KClass kClassB = t.b(HttpSend.class);
        try {
            kTypeM = t.m(HttpSend.class);
        } catch (Throwable unused) {
        }
        f71142d = new kl.a<>("HttpSend", new rl.a(kClassB, kTypeM));
    }

    public HttpSend(int i10) {
        this.f71143a = i10;
        this.f71144b = new ArrayList();
    }

    public /* synthetic */ HttpSend(int i10, i iVar) {
        this(i10);
    }

    public final void d(@NotNull q<? super l0, ? super d, ? super hn.c<? super HttpClientCall>, ? extends Object> qVar) {
        p.k(qVar, "block");
        this.f71144b.add(qVar);
    }
}
