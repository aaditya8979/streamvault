package io.appmetrica.analytics.billingv8.impl;

import cn.w;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f64598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f64599b;

    public a(b bVar, BillingResult billingResult) {
        this.f64598a = bVar;
        this.f64599b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f64598a;
        BillingResult billingResult = this.f64599b;
        bVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            bVar.f64604e.onUpdateFinished();
            return;
        }
        if (!bVar.f64601b.isReady()) {
            bVar.f64604e.onUpdateFinished();
            return;
        }
        for (String str : w.p("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f64600a;
            BillingClient billingClient = bVar.f64601b;
            UtilsProvider utilsProvider = bVar.f64602c;
            d dVar = bVar.f64603d;
            i iVar = new i(billingConfig, billingClient, utilsProvider, str, dVar, bVar.f64604e);
            dVar.f64609b.add(iVar);
            bVar.f64601b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(str).build(), iVar);
        }
    }
}
