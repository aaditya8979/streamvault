package io.ktor.client.engine;

import cl.e;
import cl.h;
import cl.i;
import cn.w0;
import hn.c;
import io.ktor.client.HttpClient;
import java.io.Closeable;
import java.util.Set;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import tn.p;
import xk.d;
import xk.f;

/* JADX INFO: compiled from: HttpClientEngine.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface HttpClientEngine extends l0, Closeable {

    /* JADX INFO: compiled from: HttpClientEngine.kt */
    public static final class DefaultImpls {
        public static void d(HttpClientEngine httpClientEngine, e eVar) {
            for (d<?> dVar : eVar.g()) {
                if (!httpClientEngine.u().contains(dVar)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + dVar).toString());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object e(io.ktor.client.engine.HttpClientEngine r10, cl.e r11, hn.c<? super cl.h> r12) {
            /*
                boolean r0 = r12 instanceof io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1
                if (r0 == 0) goto L13
                r0 = r12
                io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1 r0 = (io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1 r0 = new io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.result
                java.lang.Object r1 = in.a.g()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L41
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.c.b(r12)
                goto L7b
            L2c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L34:
                java.lang.Object r10 = r0.L$1
                r11 = r10
                cl.e r11 = (cl.e) r11
                java.lang.Object r10 = r0.L$0
                io.ktor.client.engine.HttpClientEngine r10 = (io.ktor.client.engine.HttpClientEngine) r10
                kotlin.c.b(r12)
                goto L55
            L41:
                kotlin.c.b(r12)
                kotlinx.coroutines.g r12 = r11.d()
                r0.L$0 = r10
                r0.L$1 = r11
                r0.label = r4
                java.lang.Object r12 = xk.h.b(r10, r12, r0)
                if (r12 != r1) goto L55
                return r1
            L55:
                r4 = r10
                kotlin.coroutines.d r12 = (kotlin.coroutines.d) r12
                xk.i r10 = new xk.i
                r10.<init>(r12)
                kotlin.coroutines.d r5 = r12.plus(r10)
                r6 = 0
                io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2 r7 = new io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2
                r10 = 0
                r7.<init>(r4, r11, r10)
                r8 = 2
                r9 = 0
                do.p0 r11 = p000do.g.b(r4, r5, r6, r7, r8, r9)
                r0.L$0 = r10
                r0.L$1 = r10
                r0.label = r3
                java.lang.Object r12 = r11.N(r0)
                if (r12 != r1) goto L7b
                return r1
            L7b:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.HttpClientEngine.DefaultImpls.e(io.ktor.client.engine.HttpClientEngine, cl.e, hn.c):java.lang.Object");
        }

        public static boolean f(HttpClientEngine httpClientEngine) {
            return !(((g) httpClientEngine.getCoroutineContext().get(g.H8)) != null ? r1.isActive() : false);
        }

        @NotNull
        public static Set<d<?>> g(@NotNull HttpClientEngine httpClientEngine) {
            return w0.f();
        }

        public static void h(@NotNull HttpClientEngine httpClientEngine, @NotNull HttpClient httpClient) {
            p.k(httpClient, "client");
            httpClient.t().l(i.f6719h.a(), new HttpClientEngine$install$1(httpClient, httpClientEngine, null));
        }
    }

    @Nullable
    Object g(@NotNull e eVar, @NotNull c<? super h> cVar);

    @NotNull
    f getConfig();

    @NotNull
    Set<d<?>> u();

    void z(@NotNull HttpClient httpClient);
}
