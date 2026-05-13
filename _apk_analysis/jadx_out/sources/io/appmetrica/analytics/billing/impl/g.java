package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s fromModel(@NotNull BillingConfig billingConfig) {
        s sVar = new s();
        sVar.f64478a = billingConfig.getSendFrequencySeconds();
        sVar.f64479b = billingConfig.getFirstCollectingInappMaxAgeSeconds();
        return sVar;
    }

    @NotNull
    public final BillingConfig a(@NotNull s sVar) {
        return new BillingConfig(sVar.f64478a, sVar.f64479b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        s sVar = (s) obj;
        return new BillingConfig(sVar.f64478a, sVar.f64479b);
    }
}
