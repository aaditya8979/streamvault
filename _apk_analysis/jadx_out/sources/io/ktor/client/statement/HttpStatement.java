package io.ktor.client.statement;

import cl.d;
import hn.c;
import io.ktor.client.HttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: HttpStatement.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class HttpStatement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f71170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HttpClient f71171b;

    public HttpStatement(@NotNull d dVar, @NotNull HttpClient httpClient) {
        p.k(dVar, "builder");
        p.k(httpClient, "client");
        this.f71170a = dVar;
        this.f71171b = httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull dl.c r5, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.statement.HttpStatement$cleanup$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.statement.HttpStatement$cleanup$1 r0 = (io.ktor.client.statement.HttpStatement$cleanup$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpStatement$cleanup$1 r0 = new io.ktor.client.statement.HttpStatement$cleanup$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            do.w r5 = (p000do.w) r5
            kotlin.c.b(r6)
            goto L5c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.c.b(r6)
            kotlin.coroutines.d r6 = r5.getCoroutineContext()
            kotlinx.coroutines.g$b r2 = kotlinx.coroutines.g.H8
            kotlin.coroutines.d$b r6 = r6.get(r2)
            tn.p.h(r6)
            do.w r6 = (p000do.w) r6
            r6.complete()
            io.ktor.utils.io.a r5 = r5.a()     // Catch: java.lang.Throwable -> L51
            sl.c.a(r5)     // Catch: java.lang.Throwable -> L51
        L51:
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = r6.C(r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            bn.r r5 = bn.r.f5635a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpStatement.a(dl.c, hn.c):java.lang.Object");
    }

    @Nullable
    public final Object b(@NotNull c<? super dl.c> cVar) {
        return c(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull hn.c<? super dl.c> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.client.statement.HttpStatement$fetchResponse$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.statement.HttpStatement$fetchResponse$1 r0 = (io.ktor.client.statement.HttpStatement$fetchResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpStatement$fetchResponse$1 r0 = new io.ktor.client.statement.HttpStatement$fetchResponse$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.L$0
            dl.c r0 = (dl.c) r0
            kotlin.c.b(r7)     // Catch: java.util.concurrent.CancellationException -> L85
            goto L84
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3b:
            java.lang.Object r2 = r0.L$0
            io.ktor.client.call.HttpClientCall r2 = (io.ktor.client.call.HttpClientCall) r2
            kotlin.c.b(r7)     // Catch: java.util.concurrent.CancellationException -> L85
            goto L6e
        L43:
            kotlin.c.b(r7)     // Catch: java.util.concurrent.CancellationException -> L85
            goto L60
        L47:
            kotlin.c.b(r7)
            cl.d r7 = new cl.d     // Catch: java.util.concurrent.CancellationException -> L85
            r7.<init>()     // Catch: java.util.concurrent.CancellationException -> L85
            cl.d r2 = r6.f71170a     // Catch: java.util.concurrent.CancellationException -> L85
            cl.d r7 = r7.q(r2)     // Catch: java.util.concurrent.CancellationException -> L85
            io.ktor.client.HttpClient r2 = r6.f71171b     // Catch: java.util.concurrent.CancellationException -> L85
            r0.label = r5     // Catch: java.util.concurrent.CancellationException -> L85
            java.lang.Object r7 = r2.d(r7, r0)     // Catch: java.util.concurrent.CancellationException -> L85
            if (r7 != r1) goto L60
            return r1
        L60:
            r2 = r7
            io.ktor.client.call.HttpClientCall r2 = (io.ktor.client.call.HttpClientCall) r2     // Catch: java.util.concurrent.CancellationException -> L85
            r0.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L85
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L85
            java.lang.Object r7 = io.ktor.client.call.SavedCallKt.a(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L85
            if (r7 != r1) goto L6e
            return r1
        L6e:
            io.ktor.client.call.HttpClientCall r7 = (io.ktor.client.call.HttpClientCall) r7     // Catch: java.util.concurrent.CancellationException -> L85
            dl.c r7 = r7.e()     // Catch: java.util.concurrent.CancellationException -> L85
            dl.c r2 = r2.e()     // Catch: java.util.concurrent.CancellationException -> L85
            r0.L$0 = r7     // Catch: java.util.concurrent.CancellationException -> L85
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L85
            java.lang.Object r0 = r6.a(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L85
            if (r0 != r1) goto L83
            return r1
        L83:
            r0 = r7
        L84:
            return r0
        L85:
            r7 = move-exception
            java.lang.Throwable r7 = el.c.a(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpStatement.c(hn.c):java.lang.Object");
    }

    @NotNull
    public String toString() {
        return "HttpStatement[" + this.f71170a.i() + ']';
    }
}
