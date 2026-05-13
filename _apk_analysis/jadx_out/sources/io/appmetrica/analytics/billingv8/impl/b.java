package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor$updateBilling$1;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements BillingClientStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f64600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f64601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f64602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f64603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f64604e;

    public b(BillingConfig billingConfig, BillingClient billingClient, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.f64600a = billingConfig;
        this.f64601b = billingClient;
        this.f64602c = billingLibraryMonitor$updateBilling$1;
        this.f64603d = dVar;
        this.f64604e = nVar;
    }

    public final void onBillingServiceDisconnected() {
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        this.f64602c.getWorkerExecutor().execute(new a(this, billingResult));
    }
}
