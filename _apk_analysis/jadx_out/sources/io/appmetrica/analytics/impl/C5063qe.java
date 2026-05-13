package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5063qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f67582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f67583d;

    public C5063qe(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    public C5063qe(String str, String str2, ArrayList arrayList, Map map) {
        this.f67580a = str;
        this.f67581b = str2;
        this.f67582c = arrayList;
        this.f67583d = map;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C4927l3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f67580a + "', identifier='" + this.f67581b + "', cartItems=" + this.f67582c + ", payload=" + this.f67583d + '}';
    }
}
