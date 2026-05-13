package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n;
import gl.x;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpRequestRetryConfig;
import io.ktor.client.plugins.HttpRequestRetryKt;
import io.ktor.client.statement.HttpStatement;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import zk.b0;
import zk.d0;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g0 f48188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.error.b f48189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final HttpClient f48190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f48191d;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.LegacyMediaDownloader$downloadMedia$2", f = "LegacyMediaDownloader.kt", l = {42, 52, 63, 63}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<l0, hn.c<? super n.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f48193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48194c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ File f48197f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, File file, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f48196e = str;
            this.f48197f = file;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super n.a> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return d.this.new a(this.f48196e, this.f48197f, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x0155 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x016c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x016d  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01fb  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x021f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 584
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d(@NotNull g0 g0Var, @NotNull com.moloco.sdk.internal.error.b bVar, @NotNull HttpClient httpClient) {
        tn.p.k(g0Var, "connectivityService");
        tn.p.k(bVar, "errorReportingService");
        tn.p.k(httpClient, "httpClient");
        this.f48188a = g0Var;
        this.f48189b = bVar;
        this.f48190c = httpClient;
        this.f48191d = "LegacyMediaDownloader";
    }

    public static final long a(b0 b0Var, int i10) {
        tn.p.k(b0Var, "$this$delayMillis");
        return 100L;
    }

    public static final bn.r b(final d dVar, HttpRequestRetryConfig httpRequestRetryConfig) {
        tn.p.k(httpRequestRetryConfig, "$this$retry");
        httpRequestRetryConfig.D(10);
        HttpRequestRetryConfig.g(httpRequestRetryConfig, false, new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return Long.valueOf(d.a((b0) obj, ((Integer) obj2).intValue()));
            }
        }, 1, null);
        httpRequestRetryConfig.v(10, true);
        httpRequestRetryConfig.A(10);
        httpRequestRetryConfig.r(new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return d.c(this.f48242b, (d0) obj, (cl.d) obj2);
            }
        });
        return bn.r.f5635a;
    }

    public static final bn.r c(d dVar, d0 d0Var, cl.d dVar2) {
        tn.p.k(d0Var, "$this$modifyRequest");
        tn.p.k(dVar2, "it");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, dVar.f48191d, "Retry attempt #" + d0Var.b() + " for " + d0Var.a().i(), null, false, 12, null);
        return bn.r.f5635a;
    }

    public final Object f(String str, hn.c<? super dl.c> cVar) {
        HttpClient httpClient = this.f48190c;
        cl.d dVar = new cl.d();
        cl.f.c(dVar, str);
        HttpRequestRetryKt.v(dVar, new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h
            @Override // sn.l
            public final Object invoke(Object obj) {
                return d.b(this.f48203b, (HttpRequestRetryConfig) obj);
            }
        });
        dVar.o(x.f62623b.b());
        return new HttpStatement(dVar, httpClient).b(cVar);
    }

    @Nullable
    public Object g(@NotNull String str, @NotNull File file, @NotNull hn.c<? super n.a> cVar) {
        return p000do.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new a(str, file, null), cVar);
    }

    public final String i(boolean z10) {
        return z10 ? "HTTP_REQUEST_COMPLETE_TIMEOUT" : "HTTP_REQUEST_NOT_COMPLETE_TIMEOUT";
    }
}
