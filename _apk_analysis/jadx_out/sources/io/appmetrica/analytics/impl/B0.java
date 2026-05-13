package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class B0 implements InterfaceC5235xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0 f64987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f64988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f64989c;

    public B0(C0 c02, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f64987a = c02;
        this.f64988b = appMetricaConfig;
        this.f64989c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5235xc
    @NotNull
    public final C4859ic a() {
        C0 c02 = this.f64987a;
        C4916ki c4916ki = c02.f65070g;
        AppMetricaConfig appMetricaConfig = this.f64988b;
        PublicLogger publicLogger = this.f64989c;
        E7 e72 = c02.f65072i;
        return c4916ki.b(appMetricaConfig, publicLogger, new C4924l0(e72.f65185j, e72.f65183h));
    }
}
