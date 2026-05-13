package io.appmetrica.analytics.billingv6.impl;

import cn.w;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f64545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f64546b;

    public a(b bVar, BillingResult billingResult) {
        this.f64545a = bVar;
        this.f64546b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f64545a;
        BillingResult billingResult = this.f64546b;
        bVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            bVar.f64551e.onUpdateFinished();
            return;
        }
        for (String str : w.p("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f64547a;
            BillingClient billingClient = bVar.f64548b;
            UtilsProvider utilsProvider = bVar.f64549c;
            d dVar = bVar.f64550d;
            i iVar = new i(billingConfig, billingClient, utilsProvider, str, dVar, bVar.f64551e);
            dVar.f64556b.add(iVar);
            if (bVar.f64548b.isReady()) {
                bVar.f64548b.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType(str).build(), iVar);
            } else {
                bVar.f64550d.a(iVar);
                bVar.f64551e.onUpdateFinished();
            }
        }
    }
}
