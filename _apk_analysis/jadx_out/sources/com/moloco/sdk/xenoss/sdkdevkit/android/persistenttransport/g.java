package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.ktor.client.HttpClient;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@VisibleForTesting(otherwise = 2)
public final class g implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HttpClient f50990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l0 f50991c;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.NonPersistentHttpRequestImpl$send$1", f = "NonPersistentHttpRequest.kt", l = {46, 50}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50993b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f50995d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f50995d = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return g.this.new a(this.f50995d, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:28:0x0097). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = in.a.g()
                int r1 = r14.f50993b
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L1f
                if (r1 != r2) goto L17
                int r1 = r14.f50992a
                kotlin.c.b(r15)
                r15 = r14
                goto L97
            L17:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1f:
                int r1 = r14.f50992a
                kotlin.c.b(r15)
                r5 = r1
                r1 = r0
                r0 = r14
                goto L77
            L28:
                kotlin.c.b(r15)
                r15 = r14
                r1 = r3
            L2d:
                r5 = 5
                if (r1 >= r5) goto L99
                com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g r5 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.this
                r6 = 0
                android.content.Context r6 = com.moloco.sdk.internal.android_context.b.b(r6, r4, r6)
                boolean r5 = r5.c(r6)
                com.moloco.sdk.internal.MolocoLogger r6 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "Network available: "
                r7.append(r8)
                r7.append(r5)
                java.lang.String r8 = " for non persistent request"
                r7.append(r8)
                java.lang.String r8 = r7.toString()
                r9 = 0
                r10 = 0
                r11 = 12
                r12 = 0
                java.lang.String r7 = "NonPersistentRequest"
                com.moloco.sdk.internal.MolocoLogger.info$default(r6, r7, r8, r9, r10, r11, r12)
                if (r5 == 0) goto L7e
                com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g r5 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.this
                io.ktor.client.HttpClient r5 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.b(r5)
                java.lang.String r6 = r15.f50995d
                r15.f50992a = r1
                r15.f50993b = r4
                java.lang.Object r5 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a(r5, r6, r15)
                if (r5 != r0) goto L72
                return r0
            L72:
                r13 = r0
                r0 = r15
                r15 = r5
                r5 = r1
                r1 = r13
            L77:
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                goto L82
            L7e:
                r5 = r1
                r1 = r0
                r0 = r15
                r15 = r3
            L82:
                if (r15 == 0) goto L87
                bn.r r15 = bn.r.f5635a
                return r15
            L87:
                r0.f50992a = r5
                r0.f50993b = r2
                r6 = 10000(0x2710, double:4.9407E-320)
                java.lang.Object r15 = p000do.s0.a(r6, r0)
                if (r15 != r1) goto L94
                return r1
            L94:
                r15 = r0
                r0 = r1
                r1 = r5
            L97:
                int r1 = r1 + r4
                goto L2d
            L99:
                bn.r r15 = bn.r.f5635a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.NonPersistentHttpRequestImpl$sendPost$1", f = "NonPersistentHttpRequest.kt", l = {61, 65}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50997b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f50999d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ byte[] f51000e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ gl.f f51001f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, byte[] bArr, gl.f fVar, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f50999d = str;
            this.f51000e = bArr;
            this.f51001f = fVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return g.this.new b(this.f50999d, this.f51000e, this.f51001f, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009d -> B:28:0x00a0). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = in.a.g()
                int r1 = r14.f50997b
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L1f
                if (r1 != r2) goto L17
                int r1 = r14.f50996a
                kotlin.c.b(r15)
                r15 = r14
                goto La0
            L17:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1f:
                int r1 = r14.f50996a
                kotlin.c.b(r15)
                r5 = r1
                r1 = r0
                r0 = r14
                goto L80
            L28:
                kotlin.c.b(r15)
                r15 = r14
                r1 = r3
            L2d:
                r5 = 5
                if (r1 >= r5) goto La2
                com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g r5 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.this
                r6 = 0
                android.content.Context r6 = com.moloco.sdk.internal.android_context.b.b(r6, r4, r6)
                boolean r5 = r5.c(r6)
                com.moloco.sdk.internal.MolocoLogger r6 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "Network available: "
                r7.append(r8)
                r7.append(r5)
                java.lang.String r8 = " for non persistent request"
                r7.append(r8)
                java.lang.String r8 = r7.toString()
                r9 = 0
                r10 = 0
                r11 = 12
                r12 = 0
                java.lang.String r7 = "NonPersistentRequest"
                com.moloco.sdk.internal.MolocoLogger.info$default(r6, r7, r8, r9, r10, r11, r12)
                if (r5 == 0) goto L87
                com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g r5 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.this
                io.ktor.client.HttpClient r5 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.b(r5)
                java.lang.String r6 = r15.f50999d
                byte[] r7 = r15.f51000e
                gl.f r8 = r15.f51001f
                r15.f50996a = r1
                r15.f50997b = r4
                r9 = 0
                r11 = 8
                r12 = 0
                r10 = r15
                java.lang.Object r5 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.c(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r5 != r0) goto L7b
                return r0
            L7b:
                r13 = r0
                r0 = r15
                r15 = r5
                r5 = r1
                r1 = r13
            L80:
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                goto L8b
            L87:
                r5 = r1
                r1 = r0
                r0 = r15
                r15 = r3
            L8b:
                if (r15 == 0) goto L90
                bn.r r15 = bn.r.f5635a
                return r15
            L90:
                r0.f50996a = r5
                r0.f50997b = r2
                r6 = 10000(0x2710, double:4.9407E-320)
                java.lang.Object r15 = p000do.s0.a(r6, r0)
                if (r15 != r1) goto L9d
                return r1
            L9d:
                r15 = r0
                r0 = r1
                r1 = r5
            La0:
                int r1 = r1 + r4
                goto L2d
            La2:
                bn.r r15 = bn.r.f5635a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public g(@NotNull HttpClient httpClient) {
        tn.p.k(httpClient, "httpClient");
        this.f50990b = httpClient;
        this.f50991c = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getDefault());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f
    public void a(@NotNull String str) {
        tn.p.k(str, "url");
        p000do.i.d(this.f50991c, null, null, new a(str, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f
    public void a(@NotNull String str, @NotNull byte[] bArr, @NotNull gl.f fVar, @Nullable String str2) {
        tn.p.k(str, "url");
        tn.p.k(bArr, "body");
        tn.p.k(fVar, "contentType");
        p000do.i.d(this.f50991c, null, null, new b(str, bArr, fVar, null), 3, null);
    }

    @VisibleForTesting(otherwise = 2)
    public final boolean c(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        Object systemService = context.getSystemService("connectivity");
        tn.p.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return false;
        }
        return networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3);
    }
}
