package com.mbridge.msdk.config.component.info.model;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DeviceModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f35973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f35974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<String> f35975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35976e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35977f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35978g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.a f35979h;

    public a(Map<String, Object> map) {
        a(map);
        f();
    }

    private String a(String str) {
        return this.f35979h.a(str);
    }

    private void f() {
        com.mbridge.msdk.config.component.info.provider.a aVar = new com.mbridge.msdk.config.component.info.provider.a(this.f35976e, this.f35977f, this.f35978g);
        this.f35979h = aVar;
        aVar.c();
        this.f35979h.a();
        this.f35979h.b();
    }

    public List<String> a() {
        return this.f35975d;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("field");
            if (obj != null) {
                this.f35972a = String.valueOf(obj);
            }
            Object obj2 = map.get("target_list");
            if (obj2 instanceof List) {
                this.f35973b = (List) obj2;
            }
            Object obj3 = map.get("cid_list");
            if (obj3 instanceof List) {
                this.f35974c = (List) obj3;
            }
            Object obj4 = map.get("activate_type_list");
            if (obj4 instanceof List) {
                this.f35975d = (List) obj4;
            }
            Object obj5 = map.get("allow_dev_id");
            if (obj5 != null) {
                this.f35976e = Integer.parseInt(String.valueOf(obj5));
            }
            Object obj6 = map.get("allow_normal_info");
            if (obj6 != null) {
                this.f35977f = Integer.parseInt(String.valueOf(obj6));
            }
            Object obj7 = map.get("allow_other_info");
            if (obj7 != null) {
                this.f35978g = Integer.parseInt(String.valueOf(obj7));
            }
        }
    }

    public Object b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(str);
    }

    public List<String> b() {
        return this.f35974c;
    }

    public Map<String, Object> c() {
        Map<String, Object> mapA = this.f35979h.a();
        Map<String, Object> mapB = this.f35979h.b();
        HashMap map = new HashMap();
        map.putAll(mapA);
        map.putAll(mapB);
        return map;
    }

    public List<String> d() {
        return this.f35973b;
    }

    public String e() {
        return this.f35972a;
    }
}
