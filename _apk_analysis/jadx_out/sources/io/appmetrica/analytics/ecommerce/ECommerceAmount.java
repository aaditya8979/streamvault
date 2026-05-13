package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.mo;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes10.dex */
public class ECommerceAmount {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BigDecimal f64804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f64805b;

    public ECommerceAmount(double d10, @NonNull String str) {
        this(new BigDecimal(mo.a(d10)), str);
    }

    public ECommerceAmount(long j10, @NonNull String str) {
        this(mo.a(j10), str);
    }

    public ECommerceAmount(@NonNull BigDecimal bigDecimal, @NonNull String str) {
        this.f64804a = bigDecimal;
        this.f64805b = str;
    }

    @NonNull
    public BigDecimal getAmount() {
        return this.f64804a;
    }

    @NonNull
    public String getUnit() {
        return this.f64805b;
    }

    @NonNull
    public String toString() {
        return "ECommerceAmount{amount=" + this.f64804a + ", unit='" + this.f64805b + "'}";
    }
}
