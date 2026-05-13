package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4737dj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f66616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f66618d;

    public C4737dj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public C4737dj(String str, String str2, List list, Map map) {
        this.f66615a = str;
        this.f66616b = list;
        this.f66617c = str2;
        this.f66618d = map;
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f66615a + "', categoriesPath=" + this.f66616b + ", searchQuery='" + this.f66617c + "', payload=" + this.f66618d + '}';
    }
}
