package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements PurchaseHistoryResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f64573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f64574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f64575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f64576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f64577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f64578f;

    public i(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f64573a = billingConfig;
        this.f64574b = billingClient;
        this.f64575c = utilsProvider;
        this.f64576d = str;
        this.f64577e = dVar;
        this.f64578f = nVar;
    }

    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        this.f64575c.getWorkerExecutor().execute(new g(this, billingResult, list));
    }
}
