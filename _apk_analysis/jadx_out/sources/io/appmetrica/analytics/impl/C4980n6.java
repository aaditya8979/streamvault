package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4980n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5241xi f67327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gh f67328b;

    public C4980n6(Cf cf2, E8 e82, C5241xi c5241xi, AppMetricaConfig appMetricaConfig) {
        this.f67327a = c5241xi;
        this.f67328b = new Gh(cf2, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), e82, appMetricaConfig.userProfileID);
    }

    public final Gh a() {
        return this.f67328b;
    }
}
