package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class C0 implements Da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ca f65065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final We f65066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pl f65067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4914kg f65068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Cf f65069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4916ki f65070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5241xi f65071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final E7 f65072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Xk f65073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile C4910kc f65074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C4949m0 f65075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f65076m;

    @WorkerThread
    public C0(@NotNull Context context, @NotNull Ca ca2) {
        this.f65064a = context;
        this.f65065b = ca2;
        We weB = C4696c4.l().b(context);
        this.f65066c = weB;
        ArrayList arrayListA = C5136td.a();
        C4696c4 c4696c4L = C4696c4.l();
        c4696c4L.m().a(new L3(context));
        D0.a(context).a(arrayListA);
        Cf cfA = D0.a(context, D0.a(ca2.b(), this));
        this.f65069f = cfA;
        E7 e7J = c4696c4L.j();
        this.f65072i = e7J;
        C5241xi c5241xiA = D0.a(cfA, context, ca2.getDefaultExecutor());
        this.f65071h = c5241xiA;
        e7J.a(c5241xiA);
        Pl plA = D0.a(context, c5241xiA, weB, ca2.b());
        this.f65067d = plA;
        c5241xiA.a(plA);
        this.f65068e = D0.a(c5241xiA, weB, ca2.b());
        this.f65070g = D0.a(context, cfA, c5241xiA, ca2.b(), plA);
        this.f65073j = c4696c4L.o();
        this.f65075l = new C4949m0(weB);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ua
    public final Ta a() {
        return this.f65070g;
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.B6
    @AnyThread
    public final void a(int i10, @NotNull Bundle bundle) {
        this.f65067d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void a(@Nullable Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Da
    @WorkerThread
    public final void a(@NotNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        Boolean bool;
        C4949m0 c4949m0 = this.f65075l;
        C5198w0 c5198w0 = c4949m0.f67251b;
        c5198w0.getClass();
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
        if (c5198w0.f67870a.b() && tn.p.f(c5198w0.f67871b.f66595a, Boolean.TRUE)) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(true);
        }
        Boolean bool2 = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        builderNewConfigBuilder.withAdvIdentifiersTracking(bool2.booleanValue());
        AppMetricaConfig appMetricaConfigBuild = builderNewConfigBuilder.build();
        AppMetricaConfig.Builder builderF = c4949m0.f67250a.f();
        if (builderF != null) {
            if (builderF.build().advIdentifiersTracking == null && (bool = appMetricaConfigBuild.advIdentifiersTracking) != null) {
                builderF.withAdvIdentifiersTracking(bool.booleanValue());
            }
            appMetricaConfigBuild = builderF.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, appMetricaConfigBuild, new B0(this, appMetricaConfigBuild, mainPublicOrAnonymousLogger), false)) {
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Da
    @WorkerThread
    public final void a(@NotNull DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f65068e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Da
    @WorkerThread
    public final void a(@NotNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f65068e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Da
    @WorkerThread
    public final void a(@NotNull ReporterConfig reporterConfig) {
        this.f65070g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Da
    @WorkerThread
    public final void a(@NotNull StartupParamsCallback startupParamsCallback, @NotNull List<String> list) {
        this.f65067d.a(startupParamsCallback, list, AbstractC4832hb.c(this.f65069f.f65118a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final void a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, boolean z10) {
        Boolean bool = appMetricaConfig.logs;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(false);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue()) {
            this.f65065b.d().a(this.f65064a, appMetricaConfig, this);
            this.f65065b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.f65065b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.f65073j.a();
        } else {
            Xk xk2 = this.f65073j;
            synchronized (xk2) {
                if (xk2.f66188g) {
                    xk2.f66182a.unregisterListener(xk2.f66184c, ActivityEvent.RESUMED);
                    xk2.f66182a.unregisterListener(xk2.f66185d, ActivityEvent.PAUSED);
                    xk2.f66188g = false;
                }
            }
        }
        this.f65069f.d(appMetricaConfig);
        Pl pl2 = this.f65067d;
        pl2.f65768e = publicLogger;
        pl2.b(appMetricaConfig.customHosts);
        Pl pl3 = this.f65067d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        pl3.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f65067d.a(str);
        if (str != null) {
            this.f65067d.b("api");
        }
        this.f65071h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking, Boolean.valueOf(z10));
        this.f65067d.i();
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void a(@NotNull String str) {
        j().a(str);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void a(@NotNull String str, @NotNull String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void a(boolean z10) {
        j().a(z10);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void a(boolean z10, boolean z11) {
        j().a(z10, z11);
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, InterfaceC5235xc interfaceC5235xc, boolean z10) {
        if (this.f65074k != null) {
            interfaceC5235xc.a();
            return false;
        }
        a(publicLogger, appMetricaConfig, z10);
        this.f65068e.a();
        C4859ic c4859icA = interfaceC5235xc.a();
        C5280z7 c5280z7 = new C5280z7(c4859icA);
        C4910kc c4910kc = new C4910kc(c4859icA, c5280z7);
        this.f65065b.c().a(c5280z7);
        this.f65074k = c4910kc;
        C4979n5 c4979n5 = this.f65073j.f66183b;
        synchronized (c4979n5) {
            c4979n5.f67325a = c4859icA;
            Iterator it = c4979n5.f67326b.iterator();
            while (it.hasNext()) {
                ((InterfaceC4680be) it.next()).consume(c4859icA);
            }
            c4979n5.f67326b.clear();
        }
        return true;
    }

    @Override // io.appmetrica.analytics.impl.Da
    @WorkerThread
    public final void b(@NotNull AppMetricaConfig appMetricaConfig) {
        boolean z10;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean zA = a(orCreateMainPublicLogger, appMetricaConfig, new A0(this, appMetricaConfig, orCreateMainPublicLogger), true);
        if (zA || this.f65076m) {
            z10 = false;
        } else {
            a(orCreateMainPublicLogger, appMetricaConfig, true);
            z10 = true;
        }
        if (zA || z10) {
            this.f65066c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (zA) {
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z10) {
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.f65076m = true;
    }

    @Override // io.appmetrica.analytics.impl.Da
    @WorkerThread
    @NotNull
    public final Sa c(@NotNull ReporterConfig reporterConfig) {
        return this.f65070g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Da
    @AnyThread
    @NotNull
    public final Y9 d() {
        return this.f65067d.e();
    }

    @Override // io.appmetrica.analytics.impl.Da
    @AnyThread
    @Nullable
    public final String e() {
        return this.f65067d.d();
    }

    @Override // io.appmetrica.analytics.impl.Da
    @AnyThread
    @Nullable
    public final Map<String, String> g() {
        return this.f65067d.b();
    }

    @Override // io.appmetrica.analytics.impl.Da
    @AnyThread
    @NotNull
    public final AdvIdentifiersResult h() {
        return this.f65067d.a();
    }

    @Override // io.appmetrica.analytics.impl.Da
    @AnyThread
    @Nullable
    public final C4910kc i() {
        return this.f65074k;
    }

    public final Ja j() {
        C4910kc c4910kc = this.f65074k;
        tn.p.h(c4910kc);
        return c4910kc.f67119a;
    }

    @AnyThread
    @NotNull
    public final C4916ki k() {
        return this.f65070g;
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void putAppEnvironmentValue(@NotNull String str, @NotNull String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void setDataSendingEnabled(boolean z10) {
        j().setDataSendingEnabled(z10);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    @WorkerThread
    public final void setUserProfileID(@Nullable String str) {
        j().setUserProfileID(str);
    }
}
