package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.impl.j;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import java.util.List;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements BillingInfoSender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceComponentModuleReporter f64462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f64463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f64464c;

    public j(@NotNull ServiceComponentModuleReporter serviceComponentModuleReporter, @NotNull Executor executor, @NotNull o oVar) {
        this.f64462a = serviceComponentModuleReporter;
        this.f64463b = executor;
        this.f64464c = oVar;
    }

    public /* synthetic */ j(ServiceComponentModuleReporter serviceComponentModuleReporter, Executor executor, o oVar, int i10, tn.i iVar) {
        this(serviceComponentModuleReporter, executor, (i10 & 4) != 0 ? new o() : oVar);
    }

    public static final void a(j jVar, ProductInfo productInfo) {
        ServiceComponentModuleReporter serviceComponentModuleReporter = jVar.f64462a;
        ServiceModuleCounterReport.Builder builderWithType = ServiceModuleCounterReport.INSTANCE.newBuilder().withType(40976);
        jVar.f64464c.getClass();
        serviceComponentModuleReporter.handleReport(builderWithType.withValueBytes(o.a(productInfo)).build());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(@NotNull List<? extends ProductInfo> list) {
        for (final ProductInfo productInfo : list) {
            this.f64463b.execute(new Runnable() { // from class: kh.a
                @Override // java.lang.Runnable
                public final void run() {
                    j.a(this.f73149b, productInfo);
                }
            });
        }
    }
}
