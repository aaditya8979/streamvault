package io.ktor.client.statement;

import cl.b;
import dl.c;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: HttpResponse.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class HttpResponseKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull dl.c r5, @org.jetbrains.annotations.NotNull hn.c<? super io.ktor.utils.io.a> r6) {
        /*
            java.lang.Class<io.ktor.utils.io.a> r0 = io.ktor.utils.io.a.class
            boolean r1 = r6 instanceof io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1
            if (r1 == 0) goto L15
            r1 = r6
            io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1 r1 = (io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1 r1 = new io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1
            r1.<init>(r6)
        L1a:
            java.lang.Object r6 = r1.result
            java.lang.Object r2 = in.a.g()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            kotlin.c.b(r6)
            goto L52
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.c.b(r6)
            io.ktor.client.call.HttpClientCall r5 = r5.L()
            kotlin.reflect.KClass r6 = tn.t.b(r0)
            kotlin.reflect.KType r0 = tn.t.m(r0)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r0 = 0
        L44:
            rl.a r3 = new rl.a
            r3.<init>(r6, r0)
            r1.label = r4
            java.lang.Object r6 = r5.a(r3, r1)
            if (r6 != r2) goto L52
            return r2
        L52:
            if (r6 == 0) goto L57
            io.ktor.utils.io.a r6 = (io.ktor.utils.io.a) r6
            return r6
        L57:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpResponseKt.a(dl.c, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull dl.c r6, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r7, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.String> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.client.statement.HttpResponseKt$bodyAsText$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.statement.HttpResponseKt$bodyAsText$1 r0 = (io.ktor.client.statement.HttpResponseKt$bodyAsText$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpResponseKt$bodyAsText$1 r0 = new io.ktor.client.statement.HttpResponseKt$bodyAsText$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r6 = r0.L$0
            java.nio.charset.CharsetDecoder r6 = (java.nio.charset.CharsetDecoder) r6
            kotlin.c.b(r8)
            goto L68
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.c.b(r8)
            java.nio.charset.Charset r8 = gl.w.a(r6)
            if (r8 != 0) goto L40
            goto L41
        L40:
            r7 = r8
        L41:
            java.nio.charset.CharsetDecoder r7 = r7.newDecoder()
            io.ktor.client.call.HttpClientCall r6 = r6.L()
            java.lang.Class<no.r> r8 = no.r.class
            kotlin.reflect.KClass r8 = tn.t.b(r8)
            java.lang.Class<no.r> r2 = no.r.class
            kotlin.reflect.KType r2 = tn.t.m(r2)     // Catch: java.lang.Throwable -> L56
            goto L57
        L56:
            r2 = r3
        L57:
            rl.a r5 = new rl.a
            r5.<init>(r8, r2)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r6.a(r5, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            r6 = r7
        L68:
            if (r8 == 0) goto L76
            no.r r8 = (no.r) r8
            tn.p.h(r6)
            r7 = 0
            r0 = 2
            java.lang.String r6 = tl.b.b(r6, r8, r7, r0, r3)
            return r6
        L76:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlinx.io.Source"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpResponseKt.b(dl.c, java.nio.charset.Charset, hn.c):java.lang.Object");
    }

    public static /* synthetic */ Object c(c cVar, Charset charset, hn.c cVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = bo.c.f5639b;
        }
        return b(cVar, charset, cVar2);
    }

    @NotNull
    public static final b d(@NotNull c cVar) {
        p.k(cVar, "<this>");
        return cVar.L().d();
    }
}
