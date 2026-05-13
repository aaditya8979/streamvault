package io.appmetrica.analytics.idsync.impl;

import cn.p0;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModulePreferences f64868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f64869b = new A();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64870c = "request_state";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f64871d = kotlin.collections.a.C(a());

    public B(ModulePreferences modulePreferences) {
        this.f64868a = modulePreferences;
    }

    public final LinkedHashMap a() {
        List<z> listA = this.f64869b.toModel(this.f64868a.getString(this.f64870c, null));
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(p0.f(cn.x.x(listA, 10)), 16));
        for (Object obj : listA) {
            linkedHashMap.put(((z) obj).f64940a, obj);
        }
        return linkedHashMap;
    }
}
