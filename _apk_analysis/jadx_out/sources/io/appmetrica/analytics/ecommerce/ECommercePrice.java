package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ECommercePrice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECommerceAmount f64813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f64814b;

    public ECommercePrice(@NonNull ECommerceAmount eCommerceAmount) {
        this.f64813a = eCommerceAmount;
    }

    @NonNull
    public ECommerceAmount getFiat() {
        return this.f64813a;
    }

    @Nullable
    public List<ECommerceAmount> getInternalComponents() {
        return this.f64814b;
    }

    public ECommercePrice setInternalComponents(@Nullable List<ECommerceAmount> list) {
        this.f64814b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f64813a + ", internalComponents=" + this.f64814b + '}';
    }
}
