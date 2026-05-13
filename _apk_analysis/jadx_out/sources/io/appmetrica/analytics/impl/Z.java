package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes11.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f66275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66276b;

    public Z(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public Z(BigDecimal bigDecimal, String str) {
        this.f66275a = bigDecimal;
        this.f66276b = str;
    }

    public final String toString() {
        return "AmountWrapper{amount=" + this.f66275a + ", unit='" + this.f66276b + "'}";
    }
}
