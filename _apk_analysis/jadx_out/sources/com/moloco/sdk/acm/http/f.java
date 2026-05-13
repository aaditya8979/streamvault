package com.moloco.sdk.acm.http;

import bn.r;
import com.moloco.sdk.b1;
import io.ktor.client.HttpClient;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import zk.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HttpClient f45862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f45863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f45864c;

    @jn.d(c = "com.moloco.sdk.acm.http.PostMetricsRequestImpl", f = "PostMetricsRequest.kt", l = {54}, m = "execute-0E7RQCE")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f45865a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45867c;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45865a = obj;
            this.f45867c |= Integer.MIN_VALUE;
            Object objA = f.this.a(null, null, this);
            return objA == in.a.g() ? objA : Result.m7533boximpl(objA);
        }
    }

    @jn.d(c = "com.moloco.sdk.acm.http.PostMetricsRequestImpl", f = "PostMetricsRequest.kt", l = {145, 82}, m = "makeMetricsRequest-BWLJW6A")
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f45868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f45869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f45870c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45872e;

        public b(hn.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45870c = obj;
            this.f45872e |= Integer.MIN_VALUE;
            Object objC = f.this.c(0L, null, null, this);
            return objC == in.a.g() ? objC : Result.m7533boximpl(objC);
        }
    }

    public f(@NotNull HttpClient httpClient, @NotNull String str) {
        p.k(httpClient, "httpClient");
        p.k(str, "apiUrl");
        this.f45862a = httpClient;
        this.f45863b = str;
        this.f45864c = "PostMetricsRequest";
    }

    public static final r b(long j10, g0 g0Var) {
        p.k(g0Var, "$this$timeout");
        g0Var.f(Long.valueOf(j10));
        return r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.acm.http.j
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull com.moloco.sdk.acm.http.i r8, @org.jetbrains.annotations.NotNull sn.l<? super gl.n, bn.r> r9, @org.jetbrains.annotations.NotNull hn.c<? super kotlin.Result<java.lang.String>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.moloco.sdk.acm.http.f.a
            if (r0 == 0) goto L13
            r0 = r10
            com.moloco.sdk.acm.http.f$a r0 = (com.moloco.sdk.acm.http.f.a) r0
            int r1 = r0.f45867c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45867c = r1
            goto L18
        L13:
            com.moloco.sdk.acm.http.f$a r0 = new com.moloco.sdk.acm.http.f$a
            r0.<init>(r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.f45865a
            java.lang.Object r0 = in.a.g()
            int r1 = r6.f45867c
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            kotlin.c.b(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r8 = r10.m7542unboximpl()
            goto L49
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.c.b(r10)
            r6.f45867c = r2
            r2 = 5000(0x1388, double:2.4703E-320)
            r1 = r7
            r4 = r8
            r5 = r9
            java.lang.Object r8 = r1.c(r2, r4, r5, r6)
            if (r8 != r0) goto L49
            return r0
        L49:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.http.f.a(com.moloco.sdk.acm.http.i, sn.l, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5 A[Catch: Exception -> 0x0038, TryCatch #4 {Exception -> 0x0038, blocks: (B:13:0x0033, B:47:0x00e7, B:49:0x00f5, B:50:0x0115), top: B:67:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115 A[Catch: Exception -> 0x0038, TRY_LEAVE, TryCatch #4 {Exception -> 0x0038, blocks: (B:13:0x0033, B:47:0x00e7, B:49:0x00f5, B:50:0x0115), top: B:67:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(final long r11, com.moloco.sdk.acm.http.i r13, sn.l<? super gl.n, bn.r> r14, hn.c<? super kotlin.Result<java.lang.String>> r15) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.http.f.c(long, com.moloco.sdk.acm.http.i, sn.l, hn.c):java.lang.Object");
    }

    public final byte[] e(i iVar) {
        b1 b1VarBuild = b1.h().a(iVar.a()).b(iVar.b()).build();
        p.j(b1VarBuild, "build(...)");
        byte[] byteArray = b1VarBuild.toByteArray();
        p.j(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
