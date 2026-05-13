package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f65193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f65194b;

    public Ec(Object obj) {
        this(new HashMap(), obj);
    }

    public Ec(HashMap map, Object obj) {
        this.f65193a = map;
        this.f65194b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.f65193a.get(obj);
        return obj2 == null ? this.f65194b : obj2;
    }

    public final void a(Object obj, Object obj2) {
        this.f65193a.put(obj, obj2);
    }
}
