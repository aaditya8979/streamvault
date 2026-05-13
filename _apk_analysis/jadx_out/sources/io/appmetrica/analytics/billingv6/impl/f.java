package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements ProductDetailsResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f64561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f64562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sn.a f64563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f64564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f64565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f64566g;

    public f(String str, BillingClient billingClient, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f64560a = str;
        this.f64561b = billingClient;
        this.f64562c = utilsProvider;
        this.f64563d = hVar;
        this.f64564e = list;
        this.f64565f = dVar;
        this.f64566g = nVar;
    }

    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        this.f64562c.getWorkerExecutor().execute(new e(this, billingResult, list));
    }
}
