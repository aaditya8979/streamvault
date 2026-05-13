package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ECommerceOrder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f64810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f64811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f64812c;

    public ECommerceOrder(@NonNull String str, @NonNull List<ECommerceCartItem> list) {
        this.f64810a = str;
        this.f64811b = list;
    }

    @NonNull
    public List<ECommerceCartItem> getCartItems() {
        return this.f64811b;
    }

    @NonNull
    public String getIdentifier() {
        return this.f64810a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f64812c;
    }

    public ECommerceOrder setPayload(@Nullable Map<String, String> map) {
        this.f64812c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f64810a + "', cartItems=" + this.f64811b + ", payload=" + this.f64812c + '}';
    }
}
