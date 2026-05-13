package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ECommerceProduct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f64815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f64816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f64817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f64818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ECommercePrice f64819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ECommercePrice f64820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f64821g;

    public ECommerceProduct(@NonNull String str) {
        this.f64815a = str;
    }

    @Nullable
    public ECommercePrice getActualPrice() {
        return this.f64819e;
    }

    @Nullable
    public List<String> getCategoriesPath() {
        return this.f64817c;
    }

    @Nullable
    public String getName() {
        return this.f64816b;
    }

    @Nullable
    public ECommercePrice getOriginalPrice() {
        return this.f64820f;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f64818d;
    }

    @Nullable
    public List<String> getPromocodes() {
        return this.f64821g;
    }

    @NonNull
    public String getSku() {
        return this.f64815a;
    }

    @NonNull
    public ECommerceProduct setActualPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f64819e = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setCategoriesPath(@Nullable List<String> list) {
        this.f64817c = list;
        return this;
    }

    @NonNull
    public ECommerceProduct setName(@Nullable String str) {
        this.f64816b = str;
        return this;
    }

    @NonNull
    public ECommerceProduct setOriginalPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f64820f = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setPayload(@Nullable Map<String, String> map) {
        this.f64818d = map;
        return this;
    }

    @NonNull
    public ECommerceProduct setPromocodes(@Nullable List<String> list) {
        this.f64821g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f64815a + "', name='" + this.f64816b + "', categoriesPath=" + this.f64817c + ", payload=" + this.f64818d + ", actualPrice=" + this.f64819e + ", originalPrice=" + this.f64820f + ", promocodes=" + this.f64821g + '}';
    }
}
