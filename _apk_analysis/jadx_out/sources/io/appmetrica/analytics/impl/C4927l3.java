package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4927l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final If f67177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f67178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Af f67179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5264yg f67180d;

    public C4927l3(ECommerceCartItem eCommerceCartItem) {
        this(new If(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Af(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C5264yg(eCommerceCartItem.getReferrer()));
    }

    public C4927l3(If r12, BigDecimal bigDecimal, Af af2, C5264yg c5264yg) {
        this.f67177a = r12;
        this.f67178b = bigDecimal;
        this.f67179c = af2;
        this.f67180d = c5264yg;
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f67177a + ", quantity=" + this.f67178b + ", revenue=" + this.f67179c + ", referrer=" + this.f67180d + '}';
    }
}
