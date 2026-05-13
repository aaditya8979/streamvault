package io.appmetrica.analytics.billingv8.impl;

import cn.f0;
import cn.x;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsParams;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f64620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f64621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f64622c;

    public g(i iVar, BillingResult billingResult, List list) {
        this.f64620a = iVar;
        this.f64621b = billingResult;
        this.f64622c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f64620a;
        BillingResult billingResult = this.f64621b;
        List<Purchase> list = this.f64622c;
        iVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            iVar.f64631f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                for (String str : purchase.getProducts()) {
                    String str2 = iVar.f64629d;
                    BillingInfo billingInfo = new BillingInfo(p.f(str2, "inapp") ? ProductType.INAPP : p.f(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchase.getPurchaseToken(), purchase.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f64628c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f64626a, linkedHashMap, iVar.f64628c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f64629d, iVar.f64628c.getBillingInfoManager());
                iVar.f64631f.onUpdateFinished();
            } else {
                List listG1 = f0.g1(billingInfoToUpdate.keySet());
                n nVar = iVar.f64631f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f64629d;
                BillingClient billingClient = iVar.f64627b;
                UtilsProvider utilsProvider = iVar.f64628c;
                d dVar = iVar.f64630e;
                f fVar = new f(str3, billingClient, utilsProvider, hVar, list, dVar, nVar);
                dVar.f64609b.add(fVar);
                if (iVar.f64627b.isReady()) {
                    BillingClient billingClient2 = iVar.f64627b;
                    QueryProductDetailsParams.Builder builderNewBuilder = QueryProductDetailsParams.newBuilder();
                    ArrayList arrayList = new ArrayList(x.x(listG1, 10));
                    Iterator it = listG1.iterator();
                    while (it.hasNext()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(iVar.f64629d).build());
                    }
                    billingClient2.queryProductDetailsAsync(builderNewBuilder.setProductList(arrayList).build(), fVar);
                } else {
                    iVar.f64630e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f64620a;
        iVar2.f64630e.a(iVar2);
    }
}
