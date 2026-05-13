package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements BillingInfoStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f64465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4635a f64466b;

    public k(@NotNull ProtobufStateStorage<C4635a> protobufStateStorage) {
        this.f64465a = protobufStateStorage;
        this.f64466b = protobufStateStorage.read();
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    @NotNull
    public final List<BillingInfo> getBillingInfo() {
        return this.f64466b.f64446a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f64466b.f64447b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(@NotNull List<? extends BillingInfo> list, boolean z10) {
        for (BillingInfo billingInfo : list) {
        }
        C4635a c4635a = new C4635a(list, z10);
        this.f64466b = c4635a;
        this.f64465a.save(c4635a);
    }
}
