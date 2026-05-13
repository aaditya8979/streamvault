package io.appmetrica.analytics.billingv8.impl;

import androidx.annotation.WorkerThread;
import cn.f0;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements BillingInfoManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingInfoStorage f64605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f64606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f64607c;

    public c(@NotNull BillingInfoStorage billingInfoStorage) {
        this.f64605a = billingInfoStorage;
        this.f64606b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f64607c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    @Nullable
    public final BillingInfo get(@NotNull String str) {
        return (BillingInfo) this.f64607c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final boolean isFirstInappCheckOccurred() {
        return this.f64606b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final void markFirstInappCheckOccurred() {
        if (this.f64606b) {
            return;
        }
        this.f64606b = true;
        this.f64605a.saveInfo(f0.g1(this.f64607c.values()), this.f64606b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final void update(@NotNull Map<String, ? extends BillingInfo> map) {
        for (BillingInfo billingInfo : map.values()) {
            this.f64607c.put(billingInfo.productId, billingInfo);
        }
        this.f64605a.saveInfo(f0.g1(this.f64607c.values()), this.f64606b);
    }
}
