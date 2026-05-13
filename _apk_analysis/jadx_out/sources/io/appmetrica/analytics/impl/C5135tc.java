package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5135tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f67731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5241xi f67732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cd f67733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N9 f67734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E8 f67735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Gh f67736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4771f2 f67737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5104s6 f67738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C5048q f67739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ke f67740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Sn f67741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Fg f67742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C5204w6 f67743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C4718d0 f67744n;

    public C5135tc(Context context, Cf cf2, C5241xi c5241xi, Pl pl2) {
        this.f67731a = context;
        this.f67732b = c5241xi;
        this.f67733c = new Cd(cf2);
        N9 n92 = new N9(context);
        this.f67734d = n92;
        E8 e82 = new E8(new C5119sl(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.f67735e = e82;
        this.f67736f = new Gh(cf2, new CounterConfiguration(CounterConfigurationReporterType.MAIN), e82);
        this.f67737g = new C4771f2();
        this.f67738h = C4696c4.l().n();
        this.f67739i = new C5048q();
        this.f67740j = new Ke(n92);
        this.f67741k = new Sn();
        this.f67742l = new Fg();
        this.f67743m = new C5204w6();
        this.f67744n = new C4718d0();
    }

    public final C4718d0 a() {
        return this.f67744n;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        publicLogger.info("Update config with value " + appMetricaConfig.toJson(), new Object[0]);
        this.f67736f.f65350b.applyFromConfig(appMetricaConfig);
        Gh gh2 = this.f67736f;
        String str = appMetricaConfig.userProfileID;
        synchronized (gh2) {
            gh2.f65286f = str;
        }
        Gh gh3 = this.f67736f;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        gh3.f65284d = new C5188vf(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb2 = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb2.append(num.intValue());
        publicLogger.info(sb2.toString(), new Object[0]);
    }

    public final Context b() {
        return this.f67731a;
    }

    public final C5204w6 c() {
        return this.f67743m;
    }

    public final N9 d() {
        return this.f67734d;
    }

    public final Ke e() {
        return this.f67740j;
    }

    public final C5104s6 f() {
        return this.f67738h;
    }

    public final Fg g() {
        return this.f67742l;
    }

    public final Gh h() {
        return this.f67736f;
    }

    public final C5241xi i() {
        return this.f67732b;
    }

    public final Sn j() {
        return this.f67741k;
    }
}
