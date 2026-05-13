package io.ktor.client.engine.android;

import bo.d0;
import cl.e;
import cn.w;
import gl.a0;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.utils.io.a;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import tn.p;
import zk.f0;
import zk.g0;

/* JADX INFO: compiled from: AndroidURLConnectionUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidURLConnectionUtilsKt {
    @NotNull
    public static final a a(@NotNull HttpURLConnection httpURLConnection, int i10, @NotNull d dVar) {
        a aVarA;
        p.k(httpURLConnection, "<this>");
        p.k(dVar, "callContext");
        a0.a aVar = a0.f62457d;
        if (w.p(Integer.valueOf(aVar.A().e0()), Integer.valueOf(aVar.v().e0())).contains(Integer.valueOf(i10))) {
            return a.f71266a.a();
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            bufferedInputStream = inputStream != null ? inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192) : null;
        } catch (IOException unused) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                bufferedInputStream = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
            }
        }
        return (bufferedInputStream == null || (aVarA = vl.a.a(bufferedInputStream, dVar, ll.a.a())) == null) ? a.f71266a.a() : aVarA;
    }

    public static final boolean b(Throwable th2) {
        if (!(th2 instanceof SocketTimeoutException)) {
            if (!(th2 instanceof ConnectException)) {
                return false;
            }
            String message = th2.getMessage();
            if (!(message != null ? d0.c0(message, "timed out", false, 2, null) : false)) {
                return false;
            }
        }
        return true;
    }

    public static final void c(HttpURLConnection httpURLConnection, g0 g0Var) {
        Long lC = g0Var.c();
        if (lC != null) {
            long jLongValue = lC.longValue();
            if (jLongValue != Long.MAX_VALUE) {
                if (httpURLConnection.getConnectTimeout() == 0 || httpURLConnection.getConnectTimeout() > jLongValue) {
                    httpURLConnection.setConnectTimeout(HttpTimeoutKt.l(jLongValue));
                }
            }
        }
    }

    public static final void d(@NotNull HttpURLConnection httpURLConnection, @NotNull e eVar) {
        p.k(httpURLConnection, "<this>");
        p.k(eVar, "requestData");
        g0 g0Var = (g0) eVar.c(f0.f98297a);
        if (g0Var != null) {
            Long lB = g0Var.b();
            if (lB != null) {
                httpURLConnection.setConnectTimeout(HttpTimeoutKt.l(lB.longValue()));
            }
            Long lD = g0Var.d();
            if (lD != null) {
                httpURLConnection.setReadTimeout(HttpTimeoutKt.l(lD.longValue()));
            }
            c(httpURLConnection, g0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(@org.jetbrains.annotations.NotNull java.net.HttpURLConnection r4, @org.jetbrains.annotations.NotNull cl.e r5, @org.jetbrains.annotations.NotNull sn.l<? super java.net.HttpURLConnection, ? extends T> r6, @org.jetbrains.annotations.NotNull hn.c<? super T> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1 r0 = (io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1 r0 = new io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r5 = r0.L$0
            cl.e r5 = (cl.e) r5
            kotlin.c.b(r7)
            goto L4f
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.c.b(r7)
            java.lang.Object r4 = r6.invoke(r4)     // Catch: java.lang.Throwable -> L41
            return r4
        L41:
            r4 = move-exception
            r0.L$0 = r5
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r6 = p000do.u2.a(r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            boolean r6 = b(r4)
            if (r6 == 0) goto L59
            io.ktor.client.network.sockets.ConnectTimeoutException r4 = io.ktor.client.plugins.HttpTimeoutKt.c(r5, r4)
        L59:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.e(java.net.HttpURLConnection, cl.e, sn.l, hn.c):java.lang.Object");
    }
}
