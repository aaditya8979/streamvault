package com.moloco.sdk.internal.publisher;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@VisibleForTesting
public final class d0 implements w0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f46631f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f46632g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final AdLoad.Listener f46633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.h0 f46634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.e f46635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AdFormatType f46636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f46637e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public d0(@Nullable AdLoad.Listener listener, @NotNull com.moloco.sdk.internal.h0 h0Var, @NotNull com.moloco.sdk.acm.e eVar, @NotNull AdFormatType adFormatType, @NotNull com.moloco.sdk.acm.recorder.a aVar) {
        tn.p.k(h0Var, "sdkEventUrlTracker");
        tn.p.k(eVar, "acmLoadTimerEvent");
        tn.p.k(adFormatType, "adFormatType");
        tn.p.k(aVar, "metricsRecorder");
        this.f46633a = listener;
        this.f46634b = h0Var;
        this.f46635c = eVar;
        this.f46636d = adFormatType;
        this.f46637e = aVar;
    }

    @Override // com.moloco.sdk.internal.publisher.w0
    public void a(@NotNull MolocoAd molocoAd, @Nullable A a10) {
        String strF;
        tn.p.k(molocoAd, "molocoAd");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdLoadListenerTrackerImpl", "onAdLoadSuccess: " + molocoAd, null, false, 12, null);
        if (a10 != null && (strF = a10.f()) != null) {
            h0.a.a(this.f46634b, strF, System.currentTimeMillis(), null, 4, null);
        }
        com.moloco.sdk.acm.recorder.a aVar = this.f46637e;
        com.moloco.sdk.acm.e eVarF = this.f46635c.f(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "success");
        com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.f45970c;
        String strC = dVar.c();
        String strName = this.f46636d.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        tn.p.j(lowerCase, "toLowerCase(...)");
        aVar.a(eVarF.f(strC, lowerCase));
        com.moloco.sdk.acm.recorder.a aVar2 = this.f46637e;
        com.moloco.sdk.acm.b bVar = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45953l.c());
        String strC2 = dVar.c();
        String lowerCase2 = this.f46636d.name().toLowerCase(locale);
        tn.p.j(lowerCase2, "toLowerCase(...)");
        aVar2.b(bVar.e(strC2, lowerCase2));
        AdLoad.Listener listener = this.f46633a;
        if (listener != null) {
            listener.onAdLoadSuccess(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.w0
    public void b(@NotNull MolocoAd molocoAd, long j10, @Nullable A a10) {
        String strE;
        tn.p.k(molocoAd, "molocoAd");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdLoadListenerTrackerImpl", "onAdLoadStarted: " + molocoAd + ", " + j10, null, false, 12, null);
        if (a10 == null || (strE = a10.e()) == null) {
            return;
        }
        h0.a.a(this.f46634b, strE, j10, null, 4, null);
    }

    @Override // com.moloco.sdk.internal.publisher.w0
    public void c(@NotNull com.moloco.sdk.internal.c0 c0Var, @Nullable A a10) {
        String strD;
        tn.p.k(c0Var, "internalError");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdLoadListenerTrackerImpl", "onAdLoadFailed: " + c0Var, null, false, 12, null);
        if (a10 != null && (strD = a10.d()) != null) {
            this.f46634b.a(strD, System.currentTimeMillis(), c0Var);
        }
        com.moloco.sdk.acm.recorder.a aVar = this.f46637e;
        com.moloco.sdk.acm.e eVarF = this.f46635c.f(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "failure");
        com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.f45969b;
        com.moloco.sdk.acm.e eVarF2 = eVarF.f(dVar.c(), c0Var.b().a());
        com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.f45970c;
        String strC = dVar2.c();
        String strName = this.f46636d.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        tn.p.j(lowerCase, "toLowerCase(...)");
        aVar.a(eVarF2.f(strC, lowerCase));
        com.moloco.sdk.acm.recorder.a aVar2 = this.f46637e;
        com.moloco.sdk.acm.b bVarE = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45954m.c()).e("network", c0Var.a().getNetworkName()).e(dVar.c(), c0Var.b().a());
        String strC2 = dVar2.c();
        String lowerCase2 = this.f46636d.name().toLowerCase(locale);
        tn.p.j(lowerCase2, "toLowerCase(...)");
        aVar2.b(bVarE.e(strC2, lowerCase2));
        AdLoad.Listener listener = this.f46633a;
        if (listener != null) {
            listener.onAdLoadFailed(c0Var.a());
        }
    }
}
