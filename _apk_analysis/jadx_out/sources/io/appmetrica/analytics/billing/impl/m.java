package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements ServiceModuleReporterComponentLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f64468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B f64469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BillingMonitor f64470c;

    public m(@NotNull ServiceContext serviceContext, @Nullable B b10) {
        this.f64468a = serviceContext;
        this.f64469b = b10;
    }

    public static final void a(m mVar, ApplicationState applicationState) {
        mVar.getClass();
        if (applicationState == ApplicationState.VISIBLE) {
            try {
                BillingMonitor billingMonitor = mVar.f64470c;
                if (billingMonitor != null) {
                    billingMonitor.onSessionResumed();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(@Nullable B b10) {
        BillingConfig billingConfig;
        BillingMonitor billingMonitor = this.f64470c;
        if (billingMonitor != null) {
            if (b10 != null) {
                A a10 = b10.f64445b;
                billingConfig = new BillingConfig(a10.f64442a, a10.f64443b);
            } else {
                billingConfig = null;
            }
            billingMonitor.onBillingConfigChanged(billingConfig);
        }
        this.f64469b = b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMainReporterCreated(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext r19) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.billing.impl.m.onMainReporterCreated(io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext):void");
    }
}
