package com.moloco.sdk.internal.services;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.net.ConnectivityManagerCompat;
import com.moloco.sdk.internal.MolocoLogger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import p000do.s0;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class v implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f47557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f47558b;

    @d(c = "com.moloco.sdk.internal.services.ConnectivityServiceImpl", f = "ConnectivityService.kt", l = {40}, m = "waitForNetwork")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f47559a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47561c;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47559a = obj;
            this.f47561c |= Integer.MIN_VALUE;
            return v.this.a(0L, this);
        }
    }

    @d(c = "com.moloco.sdk.internal.services.ConnectivityServiceImpl$waitForNetwork$hasConnectivity$1", f = "ConnectivityService.kt", l = {46}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47562a;

        public b(hn.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super Boolean> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return v.this.new b(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47562a;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            while (!v.this.d()) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, v.this.f47558b, "waiting because of no network connection", null, false, 12, null);
                this.f47562a = 1;
                if (s0.a(100L, this) == objG) {
                    return objG;
                }
            }
            return jn.a.a(true);
        }
    }

    public v(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f47557a = context;
        this.f47558b = "ConnectivityServiceImpl";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.g0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r5, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.Boolean> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.moloco.sdk.internal.services.v.a
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.internal.services.v$a r0 = (com.moloco.sdk.internal.services.v.a) r0
            int r1 = r0.f47561c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47561c = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.v$a r0 = new com.moloco.sdk.internal.services.v$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f47559a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f47561c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.c.b(r7)
            com.moloco.sdk.internal.services.v$b r7 = new com.moloco.sdk.internal.services.v$b
            r2 = 0
            r7.<init>(r2)
            r0.f47561c = r3
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.e(r5, r7, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L4c
            boolean r5 = r7.booleanValue()
            goto L4d
        L4c:
            r5 = 0
        L4d:
            java.lang.Boolean r5 = jn.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.v.a(long, hn.c):java.lang.Object");
    }

    public final ConnectivityManager b(Context context) {
        Object systemService = context.getSystemService("connectivity");
        tn.p.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }

    @Override // com.moloco.sdk.internal.services.g0
    public boolean b() {
        try {
            return ConnectivityManagerCompat.isActiveNetworkMetered(b(this.f47557a));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "isNetworkMetered", e10.toString(), e10, false, 8, null);
            return false;
        }
    }

    public boolean d() {
        NetworkCapabilities networkCapabilities;
        Object systemService = this.f47557a.getSystemService("connectivity");
        tn.p.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
    }
}
