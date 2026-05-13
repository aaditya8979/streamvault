package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements PurchasesResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UtilsProvider f64582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sn.a f64583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f64584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f64585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f64586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f64587f;

    public k(UtilsProvider utilsProvider, sn.a aVar, List list, List list2, d dVar, n nVar) {
        this.f64582a = utilsProvider;
        this.f64583b = aVar;
        this.f64584c = list;
        this.f64585d = list2;
        this.f64586e = dVar;
        this.f64587f = nVar;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f64582a.getWorkerExecutor().execute(new j(this, billingResult, list));
    }
}
