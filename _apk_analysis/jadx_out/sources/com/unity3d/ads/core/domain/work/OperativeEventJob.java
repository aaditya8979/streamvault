package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import bn.g;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import hn.c;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import jn.d;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: OperativeEventJob.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class OperativeEventJob extends UniversalRequestJob {

    @NotNull
    private final g getOperativeRequestPolicy$delegate;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1, reason: invalid class name */
    /* JADX INFO: compiled from: OperativeEventJob.kt */
    @d(c = "com.unity3d.ads.core.domain.work.OperativeEventJob", f = "OperativeEventJob.kt", l = {20}, m = "doWork")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperativeEventJob.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventJob(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(workerParameters, "workerParams");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = ServiceProvider.NAMED_OPERATIVE_REQ;
        this.getOperativeRequestPolicy$delegate = b.a(lazyThreadSafetyMode, new a<GetRequestPolicy>() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetRequestPolicy, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final GetRequestPolicy invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, t.b(GetRequestPolicy.class));
            }
        });
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy) this.getOperativeRequestPolicy$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull hn.c<? super androidx.work.ListenableWorker.Result> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.domain.work.OperativeEventJob.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1 r0 = (com.unity3d.ads.core.domain.work.OperativeEventJob.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1 r0 = new com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.work.OperativeEventJob r0 = (com.unity3d.ads.core.domain.work.OperativeEventJob) r0
            kotlin.c.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L56
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.c.b(r5)
            com.unity3d.ads.core.domain.GetRequestPolicy r5 = r4.getGetOperativeRequestPolicy()     // Catch: java.lang.Throwable -> L54
            com.unity3d.ads.gatewayclient.RequestPolicy r5 = r5.invoke()     // Catch: java.lang.Throwable -> L54
            r4.setRequestPolicy(r5)     // Catch: java.lang.Throwable -> L54
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L54
            r0.label = r3     // Catch: java.lang.Throwable -> L54
            java.lang.Object r5 = super.doWork(r0)     // Catch: java.lang.Throwable -> L54
            if (r5 != r1) goto L50
            return r1
        L50:
            r0 = r4
        L51:
            androidx.work.ListenableWorker$Result r5 = (androidx.work.ListenableWorker.Result) r5     // Catch: java.lang.Throwable -> L2d
            return r5
        L54:
            r5 = move-exception
            r0 = r4
        L56:
            com.unity3d.ads.core.log.Logger r0 = r0.getLogger()
            java.lang.String r1 = "OperativeEventJob failed to process work"
            r0.trace(r1, r5)
            androidx.work.ListenableWorker$Result r5 = androidx.work.ListenableWorker.Result.retry()
            java.lang.String r0 = "retry()"
            tn.p.j(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.OperativeEventJob.doWork(hn.c):java.lang.Object");
    }
}
