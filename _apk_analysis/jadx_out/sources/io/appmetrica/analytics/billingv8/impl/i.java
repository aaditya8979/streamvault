package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements PurchasesResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f64626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f64627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f64628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f64629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f64630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f64631f;

    public i(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f64626a = billingConfig;
        this.f64627b = billingClient;
        this.f64628c = utilsProvider;
        this.f64629d = str;
        this.f64630e = dVar;
        this.f64631f = nVar;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f64628c.getWorkerExecutor().execute(new g(this, billingResult, list));
    }
}
