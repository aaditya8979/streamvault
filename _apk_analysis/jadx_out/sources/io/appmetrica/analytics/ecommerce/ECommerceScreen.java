package io.appmetrica.analytics.ecommerce;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ECommerceScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f64826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f64827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f64828d;

    @Nullable
    public List<String> getCategoriesPath() {
        return this.f64826b;
    }

    @Nullable
    public String getName() {
        return this.f64825a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f64828d;
    }

    @Nullable
    public String getSearchQuery() {
        return this.f64827c;
    }

    public ECommerceScreen setCategoriesPath(@Nullable List<String> list) {
        this.f64826b = list;
        return this;
    }

    public ECommerceScreen setName(@Nullable String str) {
        this.f64825a = str;
        return this;
    }

    public ECommerceScreen setPayload(@Nullable Map<String, String> map) {
        this.f64828d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(@Nullable String str) {
        this.f64827c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f64825a + "', categoriesPath=" + this.f64826b + ", searchQuery='" + this.f64827c + "', payload=" + this.f64828d + '}';
    }
}
