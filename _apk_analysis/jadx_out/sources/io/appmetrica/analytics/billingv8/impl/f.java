package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements ProductDetailsResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f64614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f64615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sn.a f64616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f64617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f64618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f64619g;

    public f(String str, BillingClient billingClient, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f64613a = str;
        this.f64614b = billingClient;
        this.f64615c = utilsProvider;
        this.f64616d = hVar;
        this.f64617e = list;
        this.f64618f = dVar;
        this.f64619g = nVar;
    }

    public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        this.f64615c.getWorkerExecutor().execute(new e(this, billingResult, queryProductDetailsResult));
    }
}
