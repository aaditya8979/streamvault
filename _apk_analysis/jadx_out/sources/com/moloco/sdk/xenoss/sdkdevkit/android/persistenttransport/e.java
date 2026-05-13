package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.util.Patterns;
import bn.r;
import bo.d0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e;
import gl.a0;
import gl.s;
import gl.w;
import gl.x;
import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpStatement;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import tn.t;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.HttpRequestClientKt", f = "HttpRequestClient.kt", l = {36}, m = "sendGetRequest")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f50977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50978b;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f50977a = obj;
            this.f50978b |= Integer.MIN_VALUE;
            return e.a(null, null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.HttpRequestClientKt$sendGetRequest$2", f = "HttpRequestClient.kt", l = {80}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HttpClient f50980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f50981c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HttpClient httpClient, String str, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f50980b = httpClient;
            this.f50981c = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super Boolean> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new b(this.f50980b, this.f50981c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50979a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                HttpClient httpClient = this.f50980b;
                String str = this.f50981c;
                cl.d dVar = new cl.d();
                cl.f.c(dVar, str);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.c.b(dVar, 5000L);
                dVar.o(x.f62623b.b());
                HttpStatement httpStatement = new HttpStatement(dVar, httpClient);
                this.f50979a = 1;
                obj = httpStatement.b(this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            a0 a0VarD = ((dl.c) obj).d();
            a0.a aVar = a0.f62457d;
            return jn.a.a(a0VarD.compareTo(aVar.B()) >= 0 && a0VarD.compareTo(aVar.d()) < 0);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.HttpRequestClientKt", f = "HttpRequestClient.kt", l = {52}, m = "sendPostRequest")
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f50982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50983b;

        public c(hn.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f50982a = obj;
            this.f50983b |= Integer.MIN_VALUE;
            return e.b(null, null, null, null, null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.HttpRequestClientKt$sendPostRequest$2", f = "HttpRequestClient.kt", l = {106}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<l0, hn.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HttpClient f50985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f50986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f50987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ byte[] f50988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ gl.f f50989f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HttpClient httpClient, String str, String str2, byte[] bArr, gl.f fVar, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f50985b = httpClient;
            this.f50986c = str;
            this.f50987d = str2;
            this.f50988e = bArr;
            this.f50989f = fVar;
        }

        public static final r a(String str, gl.n nVar) {
            nVar.e(s.f62569a.f(), str);
            return r.f5635a;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super Boolean> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new d(this.f50985b, this.f50986c, this.f50987d, this.f50988e, this.f50989f, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50984a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                HttpClient httpClient = this.f50985b;
                String str = this.f50986c;
                final String str2 = this.f50987d;
                byte[] bArr = this.f50988e;
                gl.f fVar = this.f50989f;
                cl.d dVar = new cl.d();
                dVar.o(x.f62623b.e());
                cl.f.c(dVar, str);
                if (str2 != null && (!d0.u0(str2))) {
                    cl.f.b(dVar, new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h
                        @Override // sn.l
                        public final Object invoke(Object obj2) {
                            return e.d.a(str2, (gl.n) obj2);
                        }
                    });
                }
                KType kTypeM = null;
                if (bArr == null) {
                    dVar.j(jl.b.f72484a);
                    KClass kClassB = t.b(byte[].class);
                    try {
                        kTypeM = t.m(byte[].class);
                    } catch (Throwable unused) {
                    }
                    dVar.k(new rl.a(kClassB, kTypeM));
                } else if (bArr instanceof jl.c) {
                    dVar.j(bArr);
                    dVar.k(null);
                } else {
                    dVar.j(bArr);
                    KClass kClassB2 = t.b(byte[].class);
                    try {
                        kTypeM = t.m(byte[].class);
                    } catch (Throwable unused2) {
                    }
                    dVar.k(new rl.a(kClassB2, kTypeM));
                }
                w.e(dVar, fVar);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.c.b(dVar, 5000L);
                dVar.o(x.f62623b.e());
                HttpStatement httpStatement = new HttpStatement(dVar, httpClient);
                this.f50984a = 1;
                obj = httpStatement.b(this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            a0 a0VarD = ((dl.c) obj).d();
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "HttpClient", "Response status: " + a0VarD + " for url: " + this.f50986c, false, 4, null);
            a0.a aVar = a0.f62457d;
            return jn.a.a(a0VarD.compareTo(aVar.B()) >= 0 && a0VarD.compareTo(aVar.d()) < 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull io.ktor.client.HttpClient r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a) r0
            int r1 = r0.f50978b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50978b = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f50977a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f50978b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r7)     // Catch: java.lang.Exception -> L52
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.c.b(r7)
            com.moloco.sdk.internal.scheduling.a r7 = com.moloco.sdk.internal.scheduling.c.a()     // Catch: java.lang.Exception -> L52
            kotlin.coroutines.d r7 = r7.getIo()     // Catch: java.lang.Exception -> L52
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e$b r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e$b     // Catch: java.lang.Exception -> L52
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L52
            r0.f50978b = r3     // Catch: java.lang.Exception -> L52
            java.lang.Object r7 = p000do.g.g(r7, r2, r0)     // Catch: java.lang.Exception -> L52
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L52
            boolean r5 = r7.booleanValue()     // Catch: java.lang.Exception -> L52
            goto L53
        L52:
            r5 = 0
        L53:
            java.lang.Boolean r5 = jn.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a(io.ktor.client.HttpClient, java.lang.String, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull io.ktor.client.HttpClient r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull byte[] r14, @org.jetbrains.annotations.NotNull gl.f r15, @org.jetbrains.annotations.Nullable java.lang.String r16, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.Boolean> r17) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.c
            if (r1 == 0) goto L15
            r1 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e$c r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.c) r1
            int r2 = r1.f50983b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f50983b = r2
            goto L1a
        L15:
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e$c r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e$c
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f50982a
            java.lang.Object r2 = in.a.g()
            int r3 = r1.f50983b
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            kotlin.c.b(r0)     // Catch: java.lang.Exception -> L5b
            goto L54
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            kotlin.c.b(r0)
            com.moloco.sdk.internal.scheduling.a r0 = com.moloco.sdk.internal.scheduling.c.a()     // Catch: java.lang.Exception -> L5b
            kotlin.coroutines.d r0 = r0.getIo()     // Catch: java.lang.Exception -> L5b
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e$d r3 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e$d     // Catch: java.lang.Exception -> L5b
            r11 = 0
            r5 = r3
            r6 = r12
            r7 = r13
            r8 = r16
            r9 = r14
            r10 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L5b
            r1.f50983b = r4     // Catch: java.lang.Exception -> L5b
            java.lang.Object r0 = p000do.g.g(r0, r3, r1)     // Catch: java.lang.Exception -> L5b
            if (r0 != r2) goto L54
            return r2
        L54:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L5b
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L5b
            goto L5c
        L5b:
            r0 = 0
        L5c:
            java.lang.Boolean r0 = jn.a.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.b(io.ktor.client.HttpClient, java.lang.String, byte[], gl.f, java.lang.String, hn.c):java.lang.Object");
    }

    public static /* synthetic */ Object c(HttpClient httpClient, String str, byte[] bArr, gl.f fVar, String str2, hn.c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return b(httpClient, str, bArr, fVar, str2, cVar);
    }

    public static final boolean d(@NotNull String str) {
        tn.p.k(str, "<this>");
        boolean zMatches = Patterns.WEB_URL.matcher(str).matches();
        if (!zMatches) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "HttpRequestClient", "URL is invalid. " + str, null, false, 12, null);
        }
        return zMatches;
    }
}
