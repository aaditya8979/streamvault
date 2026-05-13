package io.appmetrica.analytics.billingv6.impl;

import cn.f0;
import cn.x;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
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

/* JADX INFO: loaded from: classes2.dex */
public final class g extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f64567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f64568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f64569c;

    public g(i iVar, BillingResult billingResult, List list) {
        this.f64567a = iVar;
        this.f64568b = billingResult;
        this.f64569c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f64567a;
        BillingResult billingResult = this.f64568b;
        List<PurchaseHistoryRecord> list = this.f64569c;
        iVar.getClass();
        if (billingResult.getResponseCode() != 0 || list == null) {
            iVar.f64578f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                for (String str : purchaseHistoryRecord.getProducts()) {
                    String str2 = iVar.f64576d;
                    BillingInfo billingInfo = new BillingInfo(p.f(str2, "inapp") ? ProductType.INAPP : p.f(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f64575c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f64573a, linkedHashMap, iVar.f64575c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f64576d, iVar.f64575c.getBillingInfoManager());
                iVar.f64578f.onUpdateFinished();
            } else {
                List listG1 = f0.g1(billingInfoToUpdate.keySet());
                n nVar = iVar.f64578f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f64576d;
                BillingClient billingClient = iVar.f64574b;
                UtilsProvider utilsProvider = iVar.f64575c;
                d dVar = iVar.f64577e;
                f fVar = new f(str3, billingClient, utilsProvider, hVar, list, dVar, nVar);
                dVar.f64556b.add(fVar);
                if (iVar.f64574b.isReady()) {
                    BillingClient billingClient2 = iVar.f64574b;
                    QueryProductDetailsParams.Builder builderNewBuilder = QueryProductDetailsParams.newBuilder();
                    ArrayList arrayList = new ArrayList(x.x(listG1, 10));
                    Iterator it = listG1.iterator();
                    while (it.hasNext()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(iVar.f64576d).build());
                    }
                    billingClient2.queryProductDetailsAsync(builderNewBuilder.setProductList(arrayList).build(), fVar);
                } else {
                    iVar.f64577e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f64567a;
        iVar2.f64577e.a(iVar2);
    }
}
