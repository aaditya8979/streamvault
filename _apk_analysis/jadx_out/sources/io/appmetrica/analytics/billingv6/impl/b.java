package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements BillingClientStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f64547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f64548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f64549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f64550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f64551e;

    public b(BillingConfig billingConfig, BillingClient billingClient, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.f64547a = billingConfig;
        this.f64548b = billingClient;
        this.f64549c = billingLibraryMonitor$updateBilling$1;
        this.f64550d = dVar;
        this.f64551e = nVar;
    }

    public final void onBillingServiceDisconnected() {
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        this.f64549c.getWorkerExecutor().execute(new a(this, billingResult));
    }
}
