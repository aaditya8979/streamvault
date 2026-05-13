package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements PurchasesResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UtilsProvider f64635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sn.a f64636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f64637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f64638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f64639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f64640f;

    public k(UtilsProvider utilsProvider, sn.a aVar, List list, List list2, d dVar, n nVar) {
        this.f64635a = utilsProvider;
        this.f64636b = aVar;
        this.f64637c = list;
        this.f64638d = list2;
        this.f64639e = dVar;
        this.f64640f = nVar;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f64635a.getWorkerExecutor().execute(new j(this, billingResult, list));
    }
}
