package com.mbridge.msdk.config.component.inner.model;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: InnerStoreModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f36025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f36028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f36029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, Object> f36030f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public Context a() {
        return this.f36025a;
    }

    public void a(Context context) {
        this.f36025a = context;
    }

    public void a(String str) {
        this.f36029e = str;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("type");
            if (obj != null) {
                d(String.valueOf(obj));
            }
            Object obj2 = map.get("url");
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get("store_info");
            if (obj3 instanceof Map) {
                Map<String, Object> map2 = (Map) obj3;
                b(map2);
                if (map2 != null && !map2.isEmpty()) {
                    c(String.valueOf(map2.get("target_name")));
                }
            }
            Object obj4 = map.get("action");
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
        }
    }

    public Map<String, Object> b() {
        return this.f36030f;
    }

    public void b(String str) {
        this.f36027c = str;
    }

    public void b(Map<String, Object> map) {
        this.f36030f = map;
    }

    public String c() {
        return this.f36029e;
    }

    public void c(String str) {
        this.f36028d = str;
    }

    public String d() {
        return this.f36027c;
    }

    public void d(String str) {
        this.f36026b = str;
    }

    public String e() {
        return this.f36028d;
    }

    public String f() {
        return this.f36026b;
    }
}
