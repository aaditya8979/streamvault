package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f64557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f64558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f64559c;

    public e(f fVar, BillingResult billingResult, List list) {
        this.f64557a = fVar;
        this.f64558b = billingResult;
        this.f64559c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f64557a;
        BillingResult billingResult = this.f64558b;
        List list = this.f64559c;
        fVar.getClass();
        if (billingResult.getResponseCode() != 0 || list.isEmpty()) {
            fVar.f64566g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f64562c;
            sn.a aVar = fVar.f64563d;
            List list2 = fVar.f64564e;
            d dVar = fVar.f64565f;
            k kVar = new k(utilsProvider, aVar, list2, list, dVar, fVar.f64566g);
            dVar.f64556b.add(kVar);
            if (fVar.f64561b.isReady()) {
                fVar.f64561b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(fVar.f64560a).build(), kVar);
            } else {
                fVar.f64565f.a(kVar);
                fVar.f64566g.onUpdateFinished();
            }
        }
        f fVar2 = this.f64557a;
        fVar2.f64565f.a(fVar2);
    }
}
