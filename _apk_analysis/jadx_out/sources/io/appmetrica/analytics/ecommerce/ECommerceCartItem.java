package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.mo;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes11.dex */
public class ECommerceCartItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECommerceProduct f64806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BigDecimal f64807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ECommercePrice f64808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ECommerceReferrer f64809d;

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, double d10) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(mo.a(d10)));
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, long j10) {
        this(eCommerceProduct, eCommercePrice, mo.a(j10));
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, @NonNull BigDecimal bigDecimal) {
        this.f64806a = eCommerceProduct;
        this.f64807b = bigDecimal;
        this.f64808c = eCommercePrice;
    }

    @NonNull
    public ECommerceProduct getProduct() {
        return this.f64806a;
    }

    @NonNull
    public BigDecimal getQuantity() {
        return this.f64807b;
    }

    @Nullable
    public ECommerceReferrer getReferrer() {
        return this.f64809d;
    }

    @NonNull
    public ECommercePrice getRevenue() {
        return this.f64808c;
    }

    @NonNull
    public ECommerceCartItem setReferrer(@Nullable ECommerceReferrer eCommerceReferrer) {
        this.f64809d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f64806a + ", quantity=" + this.f64807b + ", revenue=" + this.f64808c + ", referrer=" + this.f64809d + '}';
    }
}
