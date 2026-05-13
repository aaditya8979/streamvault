package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class If {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f65362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f65363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Af f65364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Af f65365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f65366g;

    public If(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new Af(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new Af(eCommerceProduct.getOriginalPrice()), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public If(String str, String str2, List list, Map map, Af af2, Af af3, List list2) {
        this.f65360a = str;
        this.f65361b = str2;
        this.f65362c = list;
        this.f65363d = map;
        this.f65364e = af2;
        this.f65365f = af3;
        this.f65366g = list2;
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f65360a + "', name='" + this.f65361b + "', categoriesPath=" + this.f65362c + ", payload=" + this.f65363d + ", actualPrice=" + this.f65364e + ", originalPrice=" + this.f65365f + ", promocodes=" + this.f65366g + '}';
    }
}
