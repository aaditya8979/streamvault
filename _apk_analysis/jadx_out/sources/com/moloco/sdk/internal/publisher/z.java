package com.moloco.sdk.internal.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class z implements x0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final a f47064l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f47065m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final AdShowListener f47066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.r f47067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f47068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final sn.a<A> f47069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final sn.a<h0> f47070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.h0 f47071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.i f47072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final AdFormatType f47073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f47074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.client_metrics_data.a f47075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final sn.a<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> f47076k;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.InternalAdShowListenerImpl$onAdShowSuccess$2$1", f = "InternalAdShowListener.kt", l = {128}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47077a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f47079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h0 f47080d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, h0 h0Var, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f47079c = j10;
            this.f47080d = h0Var;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return z.this.new b(this.f47079c, this.f47080d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47077a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = z.this.f47068c;
                long j10 = this.f47079c;
                a.AbstractC0696a.e eVar = a.AbstractC0696a.e.f50958a;
                String strA = this.f47080d.a();
                this.f47077a = 1;
                obj = aVar.a(j10, eVar, strA, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            z.this.f47072g.a((String) obj);
            return bn.r.f5635a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(@Nullable AdShowListener adShowListener, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull sn.a<A> aVar2, @NotNull sn.a<h0> aVar3, @NotNull com.moloco.sdk.internal.h0 h0Var, @NotNull com.moloco.sdk.internal.i iVar, @NotNull AdFormatType adFormatType, @NotNull com.moloco.sdk.acm.recorder.a aVar4, @NotNull com.moloco.sdk.internal.client_metrics_data.a aVar5, @Nullable sn.a<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> aVar6) {
        tn.p.k(rVar, "appLifecycleTrackerService");
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(aVar2, "provideSdkEvents");
        tn.p.k(aVar3, "provideBUrlData");
        tn.p.k(h0Var, "sdkEventUrlTracker");
        tn.p.k(iVar, "bUrlTracker");
        tn.p.k(adFormatType, "adType");
        tn.p.k(aVar4, "metricsRecorder");
        tn.p.k(aVar5, "acmClickDeduper");
        this.f47066a = adShowListener;
        this.f47067b = rVar;
        this.f47068c = aVar;
        this.f47069d = aVar2;
        this.f47070e = aVar3;
        this.f47071f = h0Var;
        this.f47072g = iVar;
        this.f47073h = adFormatType;
        this.f47074i = aVar4;
        this.f47075j = aVar5;
        this.f47076k = aVar6;
    }

    @Override // com.moloco.sdk.internal.publisher.x0
    public void a() {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onCloseOrSkipButtonShown triggered in InternalAdShowListenerImpl", false, 4, null);
    }

    @Override // com.moloco.sdk.internal.publisher.x0
    public void a(@NotNull com.moloco.sdk.internal.c0 c0Var) {
        String strG;
        tn.p.k(c0Var, "internalError");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onAdShowFailed: " + c0Var, false, 4, null);
        A aInvoke = this.f47069d.invoke();
        if (aInvoke != null && (strG = aInvoke.g()) != null) {
            this.f47071f.a(strG, System.currentTimeMillis(), c0Var);
        }
        com.moloco.sdk.acm.recorder.a aVar = this.f47074i;
        com.moloco.sdk.acm.b bVar = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.C.c());
        String strC = com.moloco.sdk.internal.client_metrics_data.d.f45970c.c();
        String lowerCase = this.f47073h.name().toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "toLowerCase(...)");
        aVar.b(bVar.e(strC, lowerCase).e(com.moloco.sdk.internal.client_metrics_data.d.f45969b.c(), String.valueOf(c0Var.a().getErrorType())));
        AdShowListener adShowListener = this.f47066a;
        if (adShowListener != null) {
            adShowListener.onAdShowFailed(c0Var.a());
        }
    }

    @Override // com.moloco.sdk.internal.publisher.x0
    public void onAdClicked(@NotNull MolocoAd molocoAd) {
        String strA;
        tn.p.k(molocoAd, "molocoAd");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onAdClicked: " + molocoAd, false, 4, null);
        this.f47067b.b();
        A aInvoke = this.f47069d.invoke();
        if (aInvoke != null && (strA = aInvoke.a()) != null) {
            h0.a.a(this.f47071f, strA, System.currentTimeMillis(), null, 4, null);
        }
        com.moloco.sdk.acm.recorder.a aVar = this.f47074i;
        com.moloco.sdk.acm.b bVar = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.D.c());
        String strC = com.moloco.sdk.internal.client_metrics_data.d.f45970c.c();
        String lowerCase = this.f47073h.name().toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "toLowerCase(...)");
        aVar.b(bVar.e(strC, lowerCase));
        this.f47075j.b(this.f47073h);
        AdShowListener adShowListener = this.f47066a;
        if (adShowListener != null) {
            adShowListener.onAdClicked(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.x0
    public void onAdHidden(@NotNull MolocoAd molocoAd) {
        String strC;
        tn.p.k(molocoAd, "molocoAd");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onAdHidden: " + molocoAd, false, 4, null);
        A aInvoke = this.f47069d.invoke();
        if (aInvoke != null && (strC = aInvoke.c()) != null) {
            h0.a.a(this.f47071f, strC, System.currentTimeMillis(), null, 4, null);
        }
        AdShowListener adShowListener = this.f47066a;
        if (adShowListener != null) {
            adShowListener.onAdHidden(molocoAd);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    @Override // com.moloco.sdk.internal.publisher.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAdShowSuccess(@org.jetbrains.annotations.NotNull com.moloco.sdk.publisher.MolocoAd r13) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.z.onAdShowSuccess(com.moloco.sdk.publisher.MolocoAd):void");
    }
}
