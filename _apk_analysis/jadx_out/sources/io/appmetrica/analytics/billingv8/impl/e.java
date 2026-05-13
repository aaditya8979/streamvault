package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f64610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f64611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryProductDetailsResult f64612c;

    public e(f fVar, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        this.f64610a = fVar;
        this.f64611b = billingResult;
        this.f64612c = queryProductDetailsResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f64610a;
        BillingResult billingResult = this.f64611b;
        List productDetailsList = this.f64612c.getProductDetailsList();
        fVar.getClass();
        if (billingResult.getResponseCode() != 0 || productDetailsList.isEmpty()) {
            fVar.f64619g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f64615c;
            sn.a aVar = fVar.f64616d;
            List list = fVar.f64617e;
            d dVar = fVar.f64618f;
            k kVar = new k(utilsProvider, aVar, list, productDetailsList, dVar, fVar.f64619g);
            dVar.f64609b.add(kVar);
            if (fVar.f64614b.isReady()) {
                fVar.f64614b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(fVar.f64613a).build(), kVar);
            } else {
                fVar.f64618f.a(kVar);
                fVar.f64619g.onUpdateFinished();
            }
        }
        f fVar2 = this.f64610a;
        fVar2.f64618f.a(fVar2);
    }
}
