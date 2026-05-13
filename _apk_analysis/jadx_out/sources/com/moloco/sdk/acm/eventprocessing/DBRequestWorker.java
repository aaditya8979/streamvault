package com.moloco.sdk.acm.eventprocessing;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import bn.r;
import com.ironsource.Q6;
import com.moloco.sdk.acm.db.MetricsDb;
import gl.n;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
public final class DBRequestWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f45781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.db.d f45782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f45783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f45784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final l<n, r> f45785f;

    @jn.d(c = "com.moloco.sdk.acm.eventprocessing.DBRequestWorker", f = "DBWorkRequest.kt", l = {110}, m = "doWork")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f45786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f45787b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f45789d;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45787b = obj;
            this.f45789d |= Integer.MIN_VALUE;
            return DBRequestWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBRequestWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(workerParameters, "params");
        this.f45781b = "DBRequestWorker";
        this.f45782c = MetricsDb.f45744a.b(context).c();
        this.f45783d = getInputData().getString("url");
        Map mapM = kotlin.collections.a.m(bn.h.a("AppKey", getInputData().getString("AppKey")), bn.h.a("AppBundle", getInputData().getString("AppBundle")), bn.h.a("AppVersion", getInputData().getString("AppVersion")), bn.h.a("OS", getInputData().getString("OS")), bn.h.a(Q6.G, getInputData().getString(Q6.G)), bn.h.a("SdkVersion", getInputData().getString("SdkVersion")), bn.h.a("Mediator", getInputData().getString("Mediator")));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f45784e = linkedHashMap;
        this.f45785f = new com.moloco.sdk.acm.http.b().b((String) linkedHashMap.get("SdkVersion"), (String) linkedHashMap.get(Q6.G), (String) linkedHashMap.get("AppKey"), (String) linkedHashMap.get("AppBundle"), (String) linkedHashMap.get("AppVersion"), (String) linkedHashMap.get("Mediator"));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull hn.c<? super androidx.work.ListenableWorker.Result> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.moloco.sdk.acm.eventprocessing.DBRequestWorker.a
            if (r0 == 0) goto L13
            r0 = r10
            com.moloco.sdk.acm.eventprocessing.DBRequestWorker$a r0 = (com.moloco.sdk.acm.eventprocessing.DBRequestWorker.a) r0
            int r1 = r0.f45789d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45789d = r1
            goto L18
        L13:
            com.moloco.sdk.acm.eventprocessing.DBRequestWorker$a r0 = new com.moloco.sdk.acm.eventprocessing.DBRequestWorker$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f45787b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f45789d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r0 = r0.f45786a
            com.moloco.sdk.acm.eventprocessing.DBRequestWorker r0 = (com.moloco.sdk.acm.eventprocessing.DBRequestWorker) r0
            kotlin.c.b(r10)     // Catch: java.lang.Exception -> L32
            kotlin.Result r10 = (kotlin.Result) r10     // Catch: java.lang.Exception -> L32
            r10.m7542unboximpl()     // Catch: java.lang.Exception -> L32
            goto L73
        L32:
            r10 = move-exception
            goto L7a
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3c:
            kotlin.c.b(r10)
            java.lang.String r10 = r9.f45783d     // Catch: java.lang.Exception -> L78
            if (r10 == 0) goto L72
            com.moloco.sdk.acm.http.d r10 = com.moloco.sdk.acm.http.d.f45858a     // Catch: java.lang.Exception -> L78
            io.ktor.client.HttpClient r2 = com.moloco.sdk.acm.http.h.d()     // Catch: java.lang.Exception -> L78
            java.lang.String r4 = r9.f45783d     // Catch: java.lang.Exception -> L78
            r10.b(r2, r4)     // Catch: java.lang.Exception -> L78
            com.moloco.sdk.acm.eventprocessing.k r2 = new com.moloco.sdk.acm.eventprocessing.k     // Catch: java.lang.Exception -> L78
            com.moloco.sdk.acm.http.j r10 = r10.a()     // Catch: java.lang.Exception -> L78
            com.moloco.sdk.acm.db.d r4 = r9.f45782c     // Catch: java.lang.Exception -> L78
            com.moloco.sdk.acm.eventprocessing.e r5 = new com.moloco.sdk.acm.eventprocessing.e     // Catch: java.lang.Exception -> L78
            com.moloco.sdk.acm.services.g r6 = new com.moloco.sdk.acm.services.g     // Catch: java.lang.Exception -> L78
            r6.<init>()     // Catch: java.lang.Exception -> L78
            r7 = 720(0x2d0, double:3.557E-321)
            r5.<init>(r6, r7)     // Catch: java.lang.Exception -> L78
            sn.l<gl.n, bn.r> r6 = r9.f45785f     // Catch: java.lang.Exception -> L78
            r2.<init>(r10, r4, r5, r6)     // Catch: java.lang.Exception -> L78
            r0.f45786a = r9     // Catch: java.lang.Exception -> L78
            r0.f45789d = r3     // Catch: java.lang.Exception -> L78
            java.lang.Object r10 = r2.a(r0)     // Catch: java.lang.Exception -> L78
            if (r10 != r1) goto L72
            return r1
        L72:
            r0 = r9
        L73:
            androidx.work.ListenableWorker$Result r10 = androidx.work.ListenableWorker.Result.success()     // Catch: java.lang.Exception -> L32
            goto L9f
        L78:
            r10 = move-exception
            r0 = r9
        L7a:
            com.moloco.sdk.acm.services.e r1 = com.moloco.sdk.acm.services.e.f45892a
            java.lang.String r2 = r0.f45781b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Work Manager failure: "
            r0.append(r3)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r3 = r0.toString()
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            com.moloco.sdk.acm.services.e.e(r1, r2, r3, r4, r5, r6, r7)
            androidx.work.ListenableWorker$Result r10 = androidx.work.ListenableWorker.Result.failure()
        L9f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.DBRequestWorker.doWork(hn.c):java.lang.Object");
    }
}
