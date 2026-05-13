package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c fromModel(@NotNull BillingInfo billingInfo) {
        c cVar = new c();
        int i10 = h.f64461a[billingInfo.type.ordinal()];
        cVar.f64450a = i10 != 1 ? i10 != 2 ? 1 : 3 : 2;
        cVar.f64451b = billingInfo.productId;
        cVar.f64452c = billingInfo.purchaseToken;
        cVar.f64453d = billingInfo.purchaseTime;
        cVar.f64454e = billingInfo.sendTime;
        return cVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final BillingInfo toModel(@NotNull c cVar) {
        int i10 = cVar.f64450a;
        return new BillingInfo(i10 != 2 ? i10 != 3 ? ProductType.UNKNOWN : ProductType.SUBS : ProductType.INAPP, cVar.f64451b, cVar.f64452c, cVar.f64453d, cVar.f64454e);
    }
}
